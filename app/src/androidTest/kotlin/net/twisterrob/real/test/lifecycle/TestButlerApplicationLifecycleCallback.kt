package net.twisterrob.real.test.lifecycle

import android.content.Context
import com.linkedin.android.testbutler.TestButler
import net.twisterrob.real.test.appContext
import net.twisterrob.real.test.instrumentation.ApplicationLifecycleCallback
import net.twisterrob.real.test.instrumentation.TestApplication

class TestButlerApplicationLifecycleCallback(
	private val targetContext: Context = appContext
) : ApplicationLifecycleCallback {

	override fun onApplicationStart(app: TestApplication) {
		TestButler.setup(targetContext)
	}

	override fun onApplicationDestroyed(app: TestApplication) {
		TestButler.teardown(targetContext)
	}
}
