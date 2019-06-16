package net.twisterrob.real.test.lifecycle

import android.os.AsyncTask
import com.squareup.rx.idler.RxIdler
import net.twisterrob.real.test.instrumentation.ApplicationLifecycleCallback
import net.twisterrob.real.test.instrumentation.TestApplication
import rx.Scheduler
import rx.plugins.RxJavaHooks
import rx.plugins.RxJavaPlugins
import rx.schedulers.Schedulers

// TODO doesn't work with .delay(2000, TimeUnit.MILLISECONDS) regardless of useRxIdler
class Rx1ApplicationLifecycleCallback(
	private val useRxIdler: Boolean = true
) : ApplicationLifecycleCallback {

	override fun onApplicationPreCreate(app: TestApplication) {
		if (useRxIdler) return
		/**
		 * Use Schedulers created from the AsyncTask executor, because it is synchronized by Espresso.
		 */
		val asyncTaskScheduler = { _: Scheduler ->
			Schedulers.from(AsyncTask.THREAD_POOL_EXECUTOR)
		}
		RxJavaHooks.setOnIOScheduler(asyncTaskScheduler)
		RxJavaHooks.setOnComputationScheduler(asyncTaskScheduler)
		RxJavaHooks.setOnNewThreadScheduler(asyncTaskScheduler)
	}

	override fun onApplicationStart(app: TestApplication) {
		if (useRxIdler) {
			@Suppress("DEPRECATION")
			RxJavaPlugins.getInstance().registerSchedulersHook(RxIdler.hooks())
		}
	}

	override fun onApplicationDestroyed(app: TestApplication) {
		if (useRxIdler) return
		RxJavaHooks.reset()
	}
}
