package net.twisterrob.real.app.test.dsls.thing96

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

fun User.LaunchesActions.thing96sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing96s(block: Thing96sVerifications.() -> Unit) =
	block(Thing96sVerifications())

@DSL
class Thing96sVerifications {
	@CheckResult
	private fun insideThing96s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing96s(withId(R.id.repo_view)).checkText(it) }

	fun thing96(atPosition: Int, block: Thing96Verifications.() -> Unit) =
		block(Thing96Verifications(atPosition))

	@DSL
	class Thing96Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing96Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing96Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing96s(block: Thing96sActions.() -> Unit) =
	block(Thing96sActions())

@DSL
class Thing96sActions {
	@CheckResult
	private fun insideThing96s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing96s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing96s(withId(R.id.repo_view)).click() }

	fun thing96(atPosition: Int, block: Thing96Actions.() -> Unit) =
		block(Thing96Actions(atPosition))

	@DSL
	class Thing96Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing96Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing96Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing96Item(withId(R.id.repo_view)).click() }
	}
}
