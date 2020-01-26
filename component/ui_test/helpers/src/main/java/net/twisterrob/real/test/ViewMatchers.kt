package net.twisterrob.real.test

import android.view.View
import androidx.annotation.CheckResult
import androidx.annotation.IntRange
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Description
import org.hamcrest.FeatureMatcher
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeDiagnosingMatcher

@CheckResult
@Suppress("UNCHECKED_CAST") // FeatureMatcher should be <in T>
fun withToolbarTitle(textMatcher: Matcher<CharSequence>): Matcher<View> =
	object : FeatureMatcher<Toolbar, CharSequence>(textMatcher, "Toolbar title", "title") {
		override fun featureValueOf(actual: Toolbar): CharSequence = actual.title
	} as Matcher<View>

@CheckResult(suggest = "onItemView")
internal fun atPosition(
	listMatcher: Matcher<View>,
	@IntRange(from = 0) position: Int,
	itemMatcher: Matcher<View> = Matchers.any(View::class.java)
): Matcher<View> {
	val recyclerMatcher = allOf(ViewMatchers.isAssignableFrom(RecyclerView::class.java), listMatcher)
	return object : TypeSafeDiagnosingMatcher<View>(View::class.java) {
		override fun matchesSafely(view: View, mismatchDescription: Description): Boolean {
			val recyclerView = generateSequence(view.parent) { it.parent }
				.find { recyclerMatcher.matches(it) }

			if (recyclerView == null) {
				mismatchDescription
					.appendText("Cannot find parent list matching ")
					.appendDescriptionOf(recyclerMatcher)
				return false
			} else {
				recyclerView as RecyclerView // help Kotlin
			}
			val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)
			if (viewHolder == null) {
				mismatchDescription
					.appendText("Cannot find ViewHolder for position $position in ")
					.appendDescriptionOf(recyclerMatcher)
				return false
			}

			if (recyclerView.findContainingItemView(view) != viewHolder.itemView) {
				mismatchDescription
					.appendValue(view)
					.appendText(" is not a descendant of ViewHolder at position $position in ")
					.appendDescriptionOf(recyclerMatcher)
				return false
			}

			if (!itemMatcher.matches(view)) {
				itemMatcher.describeMismatch(view, mismatchDescription)
				return false
			}

			return true
		}

		override fun describeTo(description: Description) {
			description
				.appendText("RecyclerView ")
				.appendDescriptionOf(listMatcher)
				.appendText(" has item at position $position: ")
				.appendDescriptionOf(itemMatcher)
		}
	}
}
