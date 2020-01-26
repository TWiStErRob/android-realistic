package net.twisterrob.real.test

import androidx.annotation.MainThread
import androidx.test.espresso.IdlingResource
import okhttp3.Dispatcher
import okhttp3.OkHttpClient

class OkHttpIdlingResource(
	private val okHttpClient: OkHttpClient
) : IdlingResource {

	private var callback: IdlingResource.ResourceCallback? = null

	override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback) {
		this.callback = callback
	}

	/**
	 * Include the [OkHttpClient]'s [hashCode] to make sure multiple clients can be idled.
	 *
	 * If the same client is registered with twice, the name will be the same and trigger duplicate behavior.
	 * @see androidx.test.espresso.base.IdlingResourceRegistry.logDuplicateRegistrationError
	 */
	override fun getName(): String =
		"${OkHttpIdlingResource::class.java.simpleName}@${okHttpClient.hashCode()}"

	@MainThread
	override fun isIdleNow(): Boolean {
		val dispatcher = okHttpClient.dispatcher()
		val idle = dispatcher.isIdle()
		if (!idle) {
			dispatcher.setIdleCallback {
				dispatcher.setIdleCallback(null)
				callback?.onTransitionToIdle()
			}
		}
		return idle
	}

	private fun Dispatcher.isIdle() = runningCallsCount() == 0
}
