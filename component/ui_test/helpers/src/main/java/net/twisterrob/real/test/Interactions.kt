package net.twisterrob.real.test

import android.support.annotation.CheckResult
import android.support.annotation.IdRes
import android.support.annotation.IntRange
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.scrollTo
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import org.hamcrest.Matcher
import org.hamcrest.Matchers.any
import org.hamcrest.Matchers.not

@CheckResult
fun onView(@IdRes id: Int): ViewInteraction =
	onView(withId(id))

@CheckResult
fun onItemView(
	@IdRes recyclerViewId: Int,
	@IntRange(from = 0) position: Int,
	itemMatcher: Matcher<View> = any(View::class.java)
): ViewInteraction {
	// scroll to position so that position will observe the bound ViewHolder
	onView(withId(recyclerViewId))
		.perform(scrollToPosition<ViewHolder>(position))
	return onView(atPosition(withId(recyclerViewId), position, itemMatcher))
		// make sure the view inside the item is visible (in case the item is very tall)
		.perform(scrollToInsidePosition(position))
}

fun seesView(matcher: Matcher<View>): ViewInteraction {
	return onView(matcher)
		.perform(scrollTo())
		.check(matches(isDisplayed()))
}

fun doesNotSeeView(matcher: Matcher<View>): ViewInteraction {
	// Scroll anyway, because we don't want false positives:
	// where the view is just under the fold and that's why it's not displayed.
	// It will ignore if the view is non-existent or not visible.
	onView(matcher).withFailureHandler { _, _ -> Unit }.perform(scrollTo())
	return onView(matcher).check(matches(not(isDisplayed())))
}
