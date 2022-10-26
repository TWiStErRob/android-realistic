package net.twisterrob.real.app.test.dsls.thing31

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

fun User.LaunchesActions.thing31sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing31s(block: Thing31sVerifications.() -> Unit) =
	block(Thing31sVerifications())

@DSL
class Thing31sVerifications {
	@CheckResult
	private fun insideThing31s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing31s(withId(R.id.repo_view)).checkText(it) }

	fun thing31(atPosition: Int, block: Thing31Verifications.() -> Unit) =
		block(Thing31Verifications(atPosition))

	@DSL
	class Thing31Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing31Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing31Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing31s(block: Thing31sActions.() -> Unit) =
	block(Thing31sActions())

@DSL
class Thing31sActions {
	@CheckResult
	private fun insideThing31s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing31s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing31s(withId(R.id.repo_view)).click() }

	fun thing31(atPosition: Int, block: Thing31Actions.() -> Unit) =
		block(Thing31Actions(atPosition))

	@DSL
	class Thing31Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing31Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing31Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing31Item(withId(R.id.repo_view)).click() }
	}
}
