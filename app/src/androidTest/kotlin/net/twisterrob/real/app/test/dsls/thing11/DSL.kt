package net.twisterrob.real.app.test.dsls.thing11

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

fun User.LaunchesActions.thing11sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing11s(block: Thing11sVerifications.() -> Unit) =
	block(Thing11sVerifications())

@DSL
class Thing11sVerifications {
	@CheckResult
	private fun insideThing11s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing11s(withId(R.id.repo_view)).checkText(it) }

	fun thing11(atPosition: Int, block: Thing11Verifications.() -> Unit) =
		block(Thing11Verifications(atPosition))

	@DSL
	class Thing11Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing11Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing11Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing11s(block: Thing11sActions.() -> Unit) =
	block(Thing11sActions())

@DSL
class Thing11sActions {
	@CheckResult
	private fun insideThing11s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing11s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing11s(withId(R.id.repo_view)).click() }

	fun thing11(atPosition: Int, block: Thing11Actions.() -> Unit) =
		block(Thing11Actions(atPosition))

	@DSL
	class Thing11Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing11Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing11Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing11Item(withId(R.id.repo_view)).click() }
	}
}
