package net.twisterrob.real.app.test.dsls.thing14

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

fun User.LaunchesActions.thing14sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing14s(block: Thing14sVerifications.() -> Unit) =
	block(Thing14sVerifications())

@DSL
class Thing14sVerifications {
	@CheckResult
	private fun insideThing14s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing14s(withId(R.id.repo_view)).checkText(it) }

	fun thing14(atPosition: Int, block: Thing14Verifications.() -> Unit) =
		block(Thing14Verifications(atPosition))

	@DSL
	class Thing14Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing14Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing14Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing14s(block: Thing14sActions.() -> Unit) =
	block(Thing14sActions())

@DSL
class Thing14sActions {
	@CheckResult
	private fun insideThing14s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing14s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing14s(withId(R.id.repo_view)).click() }

	fun thing14(atPosition: Int, block: Thing14Actions.() -> Unit) =
		block(Thing14Actions(atPosition))

	@DSL
	class Thing14Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing14Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing14Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing14Item(withId(R.id.repo_view)).click() }
	}
}
