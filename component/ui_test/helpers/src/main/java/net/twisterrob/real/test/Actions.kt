package net.twisterrob.real.test

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.IdlingRegistry
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import org.hamcrest.Matcher
import org.junit.Assert.fail

fun launchIntent(intent: Intent): Activity =
	instrumentation.startActivitySync(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))

fun idleOnRecyclerView(recyclerView: RecyclerView) {
	// unregistered by IdlingResourcesApplicationLifecycleCallback
	IdlingRegistry.getInstance().register(RecyclerViewScrollingIdlingResource(recyclerView))
}

fun assertActivityTitle(titleMatcher: Matcher<CharSequence>) {
	onView(isAssignableFrom(Toolbar::class.java))
		.check(matches(withToolbarTitle(titleMatcher)))
}

inline fun assertAppIsInstalled(packageName: String, errorMessage: () -> String = { "$packageName is not installed" }) {
	try {
		appContext.packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
	} catch (ignored: PackageManager.NameNotFoundException) {
		fail(errorMessage())
	}
}
