package net.twisterrob.real.test.collaborator.server

import android.support.annotation.AnyThread
import android.support.annotation.MainThread
import android.support.annotation.WorkerThread
import android.util.Log
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.StringDescription
import java.net.HttpURLConnection
import java.util.concurrent.CountDownLatch

class ReusableMockServer {

	private val matchingDispatcher = MatchingDispatcher()
	private lateinit var mockWebServer: MockWebServer

	@MainThread
	fun start(port: Int) {
		mockWebServer = MockWebServer()
		runBlockingInBackground {
			mockWebServer.apply {
				dispatcher = matchingDispatcher
				//mockWebServer.useHttps(TlsUtil.localhost().sslSocketFactory(), false)
				start(port)
			}
		}
	}

	/**
	 * Ugly, but necessary threading hack to prevent [android.os.NetworkOnMainThreadException]
	 * while initializing the server in tests.
	 */
	@AnyThread
	private fun runBlockingInBackground(@WorkerThread block: () -> Unit) {
		val latch = CountDownLatch(1)
		Thread(Runnable {
			block()
			latch.countDown()
		}).start()
		latch.await()
	}

	@MainThread
	fun verify() {
		matchingDispatcher.verify()
	}

	@MainThread
	fun shutdown() {
		mockWebServer.shutdown()
		matchingDispatcher.clear()
	}

	@MainThread
	fun addStub(request: Matcher<RecordedRequest>, response: MockResponse) {
		matchingDispatcher.enqueue(request, response)
	}

	/**
	 * Square's default dispatcher enqueues and replays responses in order.
	 * This custom dispatcher allows setting up responses in arbitrary order by using [Matcher]s.
	 * If there's no match, an error response (404) will be returned detailing the mismatch.
	 */
	class MatchingDispatcher : Dispatcher() {

		private val requestToResponseMap: MutableMap<Matcher<RecordedRequest>, MockResponse> = mutableMapOf()

		private val unMatchedRequests: MutableList<RecordedRequest> = mutableListOf()

		fun enqueue(matcher: Matcher<RecordedRequest>, response: MockResponse) {
			requestToResponseMap[matcher] = response
		}

		fun verify() {
			if (requestToResponseMap.isNotEmpty() || unMatchedRequests.isNotEmpty()) {
				throw AssertionError("Unused stubbed Server responses: $requestToResponseMap\nExtra server requests: $unMatchedRequests")
			}
		}

		fun clear() {
			requestToResponseMap.clear()
			unMatchedRequests.clear()
		}

		override fun dispatch(request: RecordedRequest): MockResponse {
			val response = requestToResponseMap.entries.find { it.key.matches(request) }
			if (response != null) {
				requestToResponseMap.remove(response.key)
				return response.value
			} else {
				unMatchedRequests.add(request)
			}
			val mismatchMessage = buildMismatchMessage(request)
			val defaultResponse = defaultResponse(mismatchMessage)
			return defaultResponse
				.also { Log.e("Server", "$mismatchMessage\nResponding with $it") }
		}

		private fun buildMismatchMessage(request: RecordedRequest) =
			"Could not match request: ${request.requestLine}" +
					"\nagainst any of: ${descriptionsOf(requestToResponseMap.keys)}"

		companion object {
			private fun defaultResponse(message: String) = MockResponse().apply {
				setResponseCode(HttpURLConnection.HTTP_NOT_FOUND)
				setBody(message)
			}

			private fun descriptionsOf(matchers: Iterable<Matcher<RecordedRequest>>): Description =
				StringDescription().appendList("\n\t", "\n\t", "", matchers)
		}
	}
}
