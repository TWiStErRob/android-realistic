package net.twisterrob.real.test.lifecycle

import androidx.test.espresso.IdlingRegistry
import net.twisterrob.real.test.OkHttpIdlingResource
import net.twisterrob.real.test.instrumentation.ApplicationLifecycleCallback
import net.twisterrob.real.test.instrumentation.TestApplication

class IdlingResourcesApplicationLifecycleCallback(
	private val idlingRegistry: IdlingRegistry = IdlingRegistry.getInstance()
) : ApplicationLifecycleCallback {

	override fun onApplicationCreated(app: TestApplication) {
		idlingRegistry.register(
			OkHttpIdlingResource(app.appComponent.provideOkHttpClient())
		)
	}

	override fun onApplicationDestroyed(app: TestApplication) {
		idlingRegistry.unregister(*idlingRegistry.resources.toTypedArray())
	}
}
