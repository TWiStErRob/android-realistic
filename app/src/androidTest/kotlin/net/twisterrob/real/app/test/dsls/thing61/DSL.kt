package net.twisterrob.real.app.test.dsls.thing61

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

fun User.LaunchesActions.thing61sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing61s(block: Thing61sVerifications.() -> Unit) =
	block(Thing61sVerifications())

@DSL
class Thing61sVerifications {
	@CheckResult
	private fun insideThing61s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing61s(withId(R.id.repo_view)).checkText(it) }

	fun thing61(atPosition: Int, block: Thing61Verifications.() -> Unit) =
		block(Thing61Verifications(atPosition))

	@DSL
	class Thing61Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing61Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing61Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing61s(block: Thing61sActions.() -> Unit) =
	block(Thing61sActions())

@DSL
class Thing61sActions {
	@CheckResult
	private fun insideThing61s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing61s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing61s(withId(R.id.repo_view)).click() }

	fun thing61(atPosition: Int, block: Thing61Actions.() -> Unit) =
		block(Thing61Actions(atPosition))

	@DSL
	class Thing61Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing61Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing61Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing61Item(withId(R.id.repo_view)).click() }
	}
}
