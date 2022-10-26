package net.twisterrob.real.app.test.dsls.thing26

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

fun User.LaunchesActions.thing26sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing26s(block: Thing26sVerifications.() -> Unit) =
	block(Thing26sVerifications())

@DSL
class Thing26sVerifications {
	@CheckResult
	private fun insideThing26s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing26s(withId(R.id.repo_view)).checkText(it) }

	fun thing26(atPosition: Int, block: Thing26Verifications.() -> Unit) =
		block(Thing26Verifications(atPosition))

	@DSL
	class Thing26Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing26Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing26Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing26s(block: Thing26sActions.() -> Unit) =
	block(Thing26sActions())

@DSL
class Thing26sActions {
	@CheckResult
	private fun insideThing26s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing26s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing26s(withId(R.id.repo_view)).click() }

	fun thing26(atPosition: Int, block: Thing26Actions.() -> Unit) =
		block(Thing26Actions(atPosition))

	@DSL
	class Thing26Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing26Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing26Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing26Item(withId(R.id.repo_view)).click() }
	}
}
