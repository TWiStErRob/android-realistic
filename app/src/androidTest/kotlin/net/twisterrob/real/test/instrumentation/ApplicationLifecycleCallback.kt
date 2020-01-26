package net.twisterrob.real.test.instrumentation

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import net.twisterrob.real.app.AppComponent

/**
 * Callbacks are executed in the order they're declared.
 */
interface ApplicationLifecycleCallback {

	@MainThread
	fun onApplicationPreCreate(app: TestApplication) {
	}

	@MainThread
	fun onAppComponentReady(app: TestApplication, component: AppComponent) {
	}

	@MainThread
	fun onApplicationCreated(app: TestApplication) {
	}

	/**
	 * Called on the instrumentation thread.
	 */
	@WorkerThread
	fun onApplicationStart(app: TestApplication) {
	}

	/**
	 * Called on the instrumentation thread.
	 */
	@WorkerThread
	fun onApplicationDestroyed(app: TestApplication) {
	}
}
