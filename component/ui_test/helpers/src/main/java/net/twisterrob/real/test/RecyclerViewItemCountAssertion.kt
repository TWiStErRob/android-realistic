package net.twisterrob.real.test

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.equalTo
import org.hamcrest.TypeSafeDiagnosingMatcher

fun hasAdapterSize(count: Int): Matcher<View> = hasAdapterSize(equalTo(count))

@Suppress("UNCHECKED_CAST") // TypeSafeDiagnosingMatcher should be <in T>
fun hasAdapterSize(countMatcher: Matcher<Int>): Matcher<View> =
	object : TypeSafeDiagnosingMatcher<RecyclerView>() {
		override fun describeTo(description: Description) {
			description.appendText("RecyclerView with adapter count ").appendDescriptionOf(countMatcher)
		}

		override fun matchesSafely(item: RecyclerView, mismatchDescription: Description): Boolean {
			val adapter = item.adapter
			if (adapter == null) {
				mismatchDescription.appendText("RecyclerView doesn't have an adapter")
				return false
			}
			val count = adapter.itemCount
			if (!countMatcher.matches(count)) {
				countMatcher.describeMismatch(count, mismatchDescription)
				return false
			}
			return true
		}
	} as Matcher<View>
