package net.twisterrob.real.test.instrumentation

import net.twisterrob.real.app.AppComponent

class CompositeApplicationLifecycleCallback(
	private vararg val callbacks: ApplicationLifecycleCallback
) : ApplicationLifecycleCallback {

	override fun onApplicationPreCreate(app: TestApplication) {
		callbacks.forEach { it.onApplicationPreCreate(app) }
	}

	override fun onApplicationStart(app: TestApplication) {
		callbacks.forEach { it.onApplicationStart(app) }
	}

	override fun onAppComponentReady(app: TestApplication, component: AppComponent) {
		callbacks.forEach { it.onAppComponentReady(app, component) }
	}

	override fun onApplicationCreated(app: TestApplication) {
		callbacks.forEach { it.onApplicationCreated(app) }
	}

	override fun onApplicationDestroyed(app: TestApplication) {
		callbacks.forEach { it.onApplicationDestroyed(app) }
	}
}
