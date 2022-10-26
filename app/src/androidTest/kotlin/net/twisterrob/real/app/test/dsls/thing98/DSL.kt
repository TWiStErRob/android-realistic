package net.twisterrob.real.app.test.dsls.thing98

import android.view.View
import androidx.annotation.CheckResult
import androidx.annotation.IntRange
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import net.twisterrob.real.app.R
import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.checkText
import net.twisterrob.real.test.click
import net.twisterrob.real.test.collaborator.User
import net.twisterrob.real.test.onItemView
import net.twisterrob.real.test.seesView
import net.twisterrob.real.test.setOnly
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

fun User.LaunchesActions.thing98sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing98s(block: Thing98sVerifications.() -> Unit) =
	block(Thing98sVerifications())

@DSL
class Thing98sVerifications {
	@CheckResult
	private fun insideThing98s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing98s(withId(R.id.repo_view)).checkText(it) }

	fun thing98(atPosition: Int, block: Thing98Verifications.() -> Unit) =
		block(Thing98Verifications(atPosition))

	@DSL
	class Thing98Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing98Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing98Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing98s(block: Thing98sActions.() -> Unit) =
	block(Thing98sActions())

@DSL
class Thing98sActions {
	@CheckResult
	private fun insideThing98s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing98s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing98s(withId(R.id.repo_view)).click() }

	fun thing98(atPosition: Int, block: Thing98Actions.() -> Unit) =
		block(Thing98Actions(atPosition))

	@DSL
	class Thing98Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing98Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing98Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing98Item(withId(R.id.repo_view)).click() }
	}
}
