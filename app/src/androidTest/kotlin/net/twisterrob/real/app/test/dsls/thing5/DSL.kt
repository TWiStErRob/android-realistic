package net.twisterrob.real.app.test.dsls.thing5

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

fun User.LaunchesActions.thing5sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing5s(block: Thing5sVerifications.() -> Unit) =
	block(Thing5sVerifications())

@DSL
class Thing5sVerifications {
	@CheckResult
	private fun insideThing5s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing5s(withId(R.id.repo_view)).checkText(it) }

	fun thing5(atPosition: Int, block: Thing5Verifications.() -> Unit) =
		block(Thing5Verifications(atPosition))

	@DSL
	class Thing5Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing5Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing5Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing5s(block: Thing5sActions.() -> Unit) =
	block(Thing5sActions())

@DSL
class Thing5sActions {
	@CheckResult
	private fun insideThing5s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing5s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing5s(withId(R.id.repo_view)).click() }

	fun thing5(atPosition: Int, block: Thing5Actions.() -> Unit) =
		block(Thing5Actions(atPosition))

	@DSL
	class Thing5Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing5Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing5Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing5Item(withId(R.id.repo_view)).click() }
	}
}
