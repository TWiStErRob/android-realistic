package net.twisterrob.real.test.collaborator

import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.collaborator.server.ReusableMockServer
import net.twisterrob.real.test.gwen.Arranger
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import org.hamcrest.Matcher
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

val Arranger.server inline get() = Server

@DSL
object Server : TestRule {

	private const val PORT = 8888
	const val URL: String = "http://localhost:$PORT"

	private val mockServer = ReusableMockServer()

	//inline operator fun invoke(block: Server.() -> Unit) = block(this)

	@DSL
	class Setup(
		val server: Server
	)

	inline infix fun returns(block: Setup.() -> Unit) =
		stubs(block)

	inline infix fun stubs(block: Setup.() -> Unit) =
		block(Setup(this))

	internal fun addStub(request: Matcher<RecordedRequest>, response: MockResponse) {
		mockServer.addStub(request, response)
	}

	override fun apply(base: Statement, description: Description) = object : Statement() {
		override fun evaluate() {
			mockServer.start(PORT)
			try {
				runTest()
				mockServer.verify()
			} finally {
				mockServer.shutdown()
			}
		}

		private fun runTest() {
			try {
				base.evaluate()
			} catch (ex: Throwable) {
				// if the tests fails, attach a cause in case the failure is caused by a mismatched server stub
				try {
					mockServer.verify()
				} catch (serverEx: Throwable) {
					generateSequence(ex) { it.cause }.last().initCause(serverEx)
				}
				throw ex
			}
		}
	}
}
