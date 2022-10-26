package net.twisterrob.real.test.instrumentation

import android.app.Application
import android.app.Instrumentation
import android.content.Context
import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import net.twisterrob.real.app.BuildConfig
import net.twisterrob.real.test.lifecycle.AppConfigurationApplicationLifecycleCallback
import net.twisterrob.real.test.lifecycle.IdlingResourcesApplicationLifecycleCallback
import net.twisterrob.real.test.lifecycle.Rx1ApplicationLifecycleCallback
import net.twisterrob.real.test.lifecycle.TestButlerApplicationLifecycleCallback

@Suppress("unused") // build.gradle: android.buildConfig.testInstrumentationRunner
class AndroidJUnitRunner : AndroidJUnitRunner() {

	private lateinit var app: TestApplication

	private val lifecycleCallback: ApplicationLifecycleCallback = CompositeApplicationLifecycleCallback(
		Rx1ApplicationLifecycleCallback(),
		IdlingResourcesApplicationLifecycleCallback(),
		*conditional(BuildConfig.USE_TEST_BUTLER) { TestButlerApplicationLifecycleCallback() }, // [test-butler]
		AppConfigurationApplicationLifecycleCallback()
	)

	override fun newApplication(cl: ClassLoader, className: String, context: Context): Application {
		// src/androidTest/AndroidManifest.xml: <application name="appClass" />
		val appClass = (this as Instrumentation).context.applicationInfo.className
		return super.newApplication(cl, appClass, context)
	}

	override fun callApplicationOnCreate(app: Application) {
		this.app = app as TestApplication

		lifecycleCallback.onApplicationPreCreate(app)

		app.appComponentInitialisationListener = { component ->
			lifecycleCallback.onAppComponentReady(app, component)
		}
		super.callApplicationOnCreate(app)

		lifecycleCallback.onApplicationCreated(app)
	}

	override fun onStart() {
		lifecycleCallback.onApplicationStart(app)
		super.onStart()
		// there's no "started" state, because finish() is called in super
	}

	override fun finish(resultCode: Int, results: Bundle?) {
		lifecycleCallback.onApplicationDestroyed(app)
		super.finish(resultCode, results)
	}
}

private fun conditional(
	condition: Boolean,
	creator: () -> ApplicationLifecycleCallback
): Array<ApplicationLifecycleCallback> {
	return if (condition) arrayOf(creator()) else emptyArray()
}
