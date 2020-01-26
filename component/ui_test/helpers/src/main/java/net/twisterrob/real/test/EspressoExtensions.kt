package net.twisterrob.real.test

import android.view.View
import androidx.annotation.IntRange
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matcher

fun ViewInteraction.check(viewMatcher: Matcher<View>): ViewInteraction =
	check(matches(viewMatcher))

fun ViewInteraction.click(): ViewInteraction =
	perform(ViewActions.click())

fun ViewInteraction.checkText(text: String): ViewInteraction =
	check(withText(text))

fun ViewInteraction.enterText(text: String): ViewInteraction =
	perform(replaceText(text), closeSoftKeyboard())

fun ViewInteraction.clickItem(@IntRange(from = 0) position: Int): ViewInteraction =
	perform(actionOnItemAtPosition<ViewHolder>(position, ViewActions.click()))
