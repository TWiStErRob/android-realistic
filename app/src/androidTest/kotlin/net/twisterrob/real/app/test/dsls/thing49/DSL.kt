package net.twisterrob.real.app.test.dsls.thing49

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

fun User.LaunchesActions.thing49sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing49s(block: Thing49sVerifications.() -> Unit) =
	block(Thing49sVerifications())

@DSL
class Thing49sVerifications {
	@CheckResult
	private fun insideThing49s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing49s(withId(R.id.repo_view)).checkText(it) }

	fun thing49(atPosition: Int, block: Thing49Verifications.() -> Unit) =
		block(Thing49Verifications(atPosition))

	@DSL
	class Thing49Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing49Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing49Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing49s(block: Thing49sActions.() -> Unit) =
	block(Thing49sActions())

@DSL
class Thing49sActions {
	@CheckResult
	private fun insideThing49s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing49s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing49s(withId(R.id.repo_view)).click() }

	fun thing49(atPosition: Int, block: Thing49Actions.() -> Unit) =
		block(Thing49Actions(atPosition))

	@DSL
	class Thing49Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing49Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing49Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing49Item(withId(R.id.repo_view)).click() }
	}
}