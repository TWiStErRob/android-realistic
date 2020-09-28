package net.twisterrob.real.test.collaborator.server

import android.content.res.Resources
import androidx.annotation.RawRes
import androidx.test.platform.app.InstrumentationRegistry
import net.twisterrob.real.test.collaborator.Server
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import okio.Buffer
import org.hamcrest.Matcher
import java.net.HttpURLConnection

abstract class ResponseConfiguration(
	open val server: Server,
	open val headers: Map<String, String> = mapOf()
) {

	open fun buildResponse(): MockResponse {
		val response = MockResponse()
		headers.forEach { (key, value) -> response.addHeader(key, value) }
		return response
	}

	/**
	 * Glue for `server returns { json(testR.raw.foo_response) to post(Endpoints.foo) }` syntax.
	 * @see Server.returns
	 */
	// member function to get precedence over kotlin Tuples.kt's `to(): Pair`
	infix fun to(matcher: Matcher<RecordedRequest>) = matcher with this
}

/**
 * Glue for `server stubs { post(Endpoints.foo) with json(testR.raw.foo_response)` syntax.
 * @see Server.stubs
 */
infix fun Matcher<RecordedRequest>.with(config: ResponseConfiguration) {
	config.server.addStub(this@with, config.buildResponse())
}

fun Server.Setup.error(httpStatus: Int = HttpURLConnection.HTTP_INTERNAL_ERROR): ResponseConfiguration =
	object : ResponseConfiguration(this.server) {
		override fun buildResponse(): MockResponse = super.buildResponse().setResponseCode(httpStatus)
	}

fun Server.Setup.json(@RawRes resId: Int) =
	RawResponseConfiguration(
		server,
		InstrumentationRegistry.getInstrumentation().context.resources,
		resId
	)

interface FormatArg {
	fun formatForPlaceholder(): String
}

data class RawResponseConfiguration(
	override val server: Server,
	private val testResources: Resources,
	@RawRes private val resId: Int,
	private val httpStatus: Int = 200,
	private val replacements: Collection<Pair<String, FormatArg>> = emptyList()
) : ResponseConfiguration(server) {

	fun with(vararg replacements: Pair<String, FormatArg>): RawResponseConfiguration =
		copy(replacements = replacements.toList())

	fun with(replacements: () -> List<Pair<String, FormatArg>>): RawResponseConfiguration =
		copy(replacements = replacements())

	fun with(httpStatus: Int): RawResponseConfiguration = copy(httpStatus = httpStatus)

	override fun buildResponse(): MockResponse {
		val template = testResources.getStringFromRaw(resId)
		val fileName = testResources.getResourceEntryName(resId)
		val replaced = TemplateReplacer(
			"$fileName.json",
			template
		).replace(replacements)
		return super.buildResponse().setResponseCode(httpStatus).setBody(replaced)
	}

	private fun Resources.getStringFromRaw(@RawRes resId: Int): String =
		openRawResource(resId).bufferedReader().use { it.readText() }

	private class TemplateReplacer(
		private val source: String,
		private val template: String
	) {

		fun replace(replacements: Iterable<Pair<String, FormatArg>>): String {
			val replaced = replacements.fold(template) { body, (key, formatArg) ->
				replacePlaceholder(body, key, formatArg)
			}
			val remainingPlaceholders = PLACEHOLDER_PATTERN.findAll(replaced).map { it.value }
			if (remainingPlaceholders.any()) {
				error("Missing args for the following placeholders: ${remainingPlaceholders.joinToString()}")
			}
			return replaced
		}

		private fun replacePlaceholder(template: String, key: String, formatArg: FormatArg): String {
			val placeholder = "{{$key}}"
			assertHasPlaceholder(template, placeholder)
			return template.replace(placeholder, formatArg.formatForPlaceholder())
		}

		private fun assertHasPlaceholder(template: String, placeholder: String) {
			if (!template.contains(placeholder)) {
				error("$source does not include placeholder $placeholder")
			}
		}

		companion object {
			@Suppress("RegExpRedundantEscape")
			val PLACEHOLDER_PATTERN = Regex("""\{\{.+?\}\}""")
		}
	}
}

fun Server.Setup.generated(
	headers: Map<String, String> = mapOf(),
	generator: () -> ByteArray
): ResponseConfiguration =
	GeneratedResponseConfiguration(server, headers, generator)

private data class GeneratedResponseConfiguration(
	override val server: Server,
	override val headers: Map<String, String> = mapOf(),
	private val generator: () -> ByteArray
) : ResponseConfiguration(server) {

	override fun buildResponse(): MockResponse = super.buildResponse().setBody(Buffer().write(generator()))
}

fun rawString(value: String) = object : FormatArg {
	override fun formatForPlaceholder() = value
}
