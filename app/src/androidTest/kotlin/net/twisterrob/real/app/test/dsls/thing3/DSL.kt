package net.twisterrob.real.app.test.dsls.thing3

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

fun User.LaunchesActions.thing3sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing3s(block: Thing3sVerifications.() -> Unit) =
	block(Thing3sVerifications())

@DSL
class Thing3sVerifications {
	@CheckResult
	private fun insideThing3s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing3s(withId(R.id.repo_view)).checkText(it) }

	fun thing3(atPosition: Int, block: Thing3Verifications.() -> Unit) =
		block(Thing3Verifications(atPosition))

	@DSL
	class Thing3Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing3Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing3Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing3s(block: Thing3sActions.() -> Unit) =
	block(Thing3sActions())

@DSL
class Thing3sActions {
	@CheckResult
	private fun insideThing3s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing3s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing3s(withId(R.id.repo_view)).click() }

	fun thing3(atPosition: Int, block: Thing3Actions.() -> Unit) =
		block(Thing3Actions(atPosition))

	@DSL
	class Thing3Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing3Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing3Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing3Item(withId(R.id.repo_view)).click() }
	}
}
