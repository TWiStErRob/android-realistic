package net.twisterrob.real.app.test.dsls.thing46

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

fun User.LaunchesActions.thing46sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing46s(block: Thing46sVerifications.() -> Unit) =
	block(Thing46sVerifications())

@DSL
class Thing46sVerifications {
	@CheckResult
	private fun insideThing46s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing46s(withId(R.id.repo_view)).checkText(it) }

	fun thing46(atPosition: Int, block: Thing46Verifications.() -> Unit) =
		block(Thing46Verifications(atPosition))

	@DSL
	class Thing46Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing46Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing46Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing46s(block: Thing46sActions.() -> Unit) =
	block(Thing46sActions())

@DSL
class Thing46sActions {
	@CheckResult
	private fun insideThing46s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing46s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing46s(withId(R.id.repo_view)).click() }

	fun thing46(atPosition: Int, block: Thing46Actions.() -> Unit) =
		block(Thing46Actions(atPosition))

	@DSL
	class Thing46Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing46Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing46Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing46Item(withId(R.id.repo_view)).click() }
	}
}
