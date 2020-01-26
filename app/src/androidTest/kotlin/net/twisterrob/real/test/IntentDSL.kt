package net.twisterrob.real.test

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.net.Uri
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.matcher.IntentMatchers.hasData
import androidx.test.espresso.intent.matcher.IntentMatchers.isInternal
import net.twisterrob.real.test.collaborator.Device
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.Matcher
import org.hamcrest.Matchers.any
import org.hamcrest.Matchers.not

fun Device.ArrangeExpectations.urlsInExternalBrowser() {
	Intents.intending(external(hasAction(Intent.ACTION_VIEW), hasData(any(Uri::class.java))))
		.respondWith(ok())
}

fun Device.ObservationAssertions.urlInExternalBrowser(url: String) {
	Intents.intended(external(hasAction(Intent.ACTION_VIEW), hasData(url)))
}

fun Device.ObservationAssertions.noOtherIntents() {
	Intents.assertNoUnverifiedIntents()
}

private fun external(vararg matchers: Matcher<Intent>): Matcher<Intent> =
	allOf(*matchers, not(isInternal()))

private fun ok() =
	Instrumentation.ActivityResult(Activity.RESULT_OK, null)
