package net.twisterrob.real.app.test.dsls.thing100

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

fun User.LaunchesActions.thing100sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing100s(block: Thing100sVerifications.() -> Unit) =
	block(Thing100sVerifications())

@DSL
class Thing100sVerifications {
	@CheckResult
	private fun insideThing100s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing100s(withId(R.id.repo_view)).checkText(it) }

	fun thing100(atPosition: Int, block: Thing100Verifications.() -> Unit) =
		block(Thing100Verifications(atPosition))

	@DSL
	class Thing100Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing100Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing100Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing100s(block: Thing100sActions.() -> Unit) =
	block(Thing100sActions())

@DSL
class Thing100sActions {
	@CheckResult
	private fun insideThing100s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing100s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing100s(withId(R.id.repo_view)).click() }

	fun thing100(atPosition: Int, block: Thing100Actions.() -> Unit) =
		block(Thing100Actions(atPosition))

	@DSL
	class Thing100Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing100Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing100Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing100Item(withId(R.id.repo_view)).click() }
	}
}
