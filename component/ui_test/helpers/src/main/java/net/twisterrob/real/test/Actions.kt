package net.twisterrob.real.test

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
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
