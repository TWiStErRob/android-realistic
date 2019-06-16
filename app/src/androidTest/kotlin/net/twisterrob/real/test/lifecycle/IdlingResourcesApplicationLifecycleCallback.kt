package net.twisterrob.real.test.lifecycle

import android.support.test.espresso.IdlingRegistry
import net.twisterrob.real.test.instrumentation.ApplicationLifecycleCallback
import net.twisterrob.real.test.instrumentation.TestApplication

class IdlingResourcesApplicationLifecycleCallback(
	private val idlingRegistry: IdlingRegistry = IdlingRegistry.getInstance()
) : ApplicationLifecycleCallback {

	override fun onApplicationCreated(app: TestApplication) {
		idlingRegistry.register(
			// TODO idle OkHttp
		)
	}

	override fun onApplicationDestroyed(app: TestApplication) {
		idlingRegistry.unregister(*idlingRegistry.resources.toTypedArray())
	}
}
