package net.twisterrob.real.app.test.dsls.thing6

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

fun User.LaunchesActions.thing6sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing6s(block: Thing6sVerifications.() -> Unit) =
	block(Thing6sVerifications())

@DSL
class Thing6sVerifications {
	@CheckResult
	private fun insideThing6s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing6s(withId(R.id.repo_view)).checkText(it) }

	fun thing6(atPosition: Int, block: Thing6Verifications.() -> Unit) =
		block(Thing6Verifications(atPosition))

	@DSL
	class Thing6Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing6Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing6Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing6s(block: Thing6sActions.() -> Unit) =
	block(Thing6sActions())

@DSL
class Thing6sActions {
	@CheckResult
	private fun insideThing6s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing6s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing6s(withId(R.id.repo_view)).click() }

	fun thing6(atPosition: Int, block: Thing6Actions.() -> Unit) =
		block(Thing6Actions(atPosition))

	@DSL
	class Thing6Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing6Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing6Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing6Item(withId(R.id.repo_view)).click() }
	}
}
