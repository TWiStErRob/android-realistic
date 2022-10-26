package net.twisterrob.real.app.test.dsls.thing90

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

fun User.LaunchesActions.thing90sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing90s(block: Thing90sVerifications.() -> Unit) =
	block(Thing90sVerifications())

@DSL
class Thing90sVerifications {
	@CheckResult
	private fun insideThing90s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing90s(withId(R.id.repo_view)).checkText(it) }

	fun thing90(atPosition: Int, block: Thing90Verifications.() -> Unit) =
		block(Thing90Verifications(atPosition))

	@DSL
	class Thing90Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing90Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing90Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing90s(block: Thing90sActions.() -> Unit) =
	block(Thing90sActions())

@DSL
class Thing90sActions {
	@CheckResult
	private fun insideThing90s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing90s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing90s(withId(R.id.repo_view)).click() }

	fun thing90(atPosition: Int, block: Thing90Actions.() -> Unit) =
		block(Thing90Actions(atPosition))

	@DSL
	class Thing90Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing90Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing90Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing90Item(withId(R.id.repo_view)).click() }
	}
}
