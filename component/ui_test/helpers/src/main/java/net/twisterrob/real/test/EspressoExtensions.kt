package net.twisterrob.real.test

import android.support.annotation.IntRange
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
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
