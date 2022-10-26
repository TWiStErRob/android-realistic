package net.twisterrob.real.app.test.dsls.thing45

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

fun User.LaunchesActions.thing45sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing45s(block: Thing45sVerifications.() -> Unit) =
	block(Thing45sVerifications())

@DSL
class Thing45sVerifications {
	@CheckResult
	private fun insideThing45s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing45s(withId(R.id.repo_view)).checkText(it) }

	fun thing45(atPosition: Int, block: Thing45Verifications.() -> Unit) =
		block(Thing45Verifications(atPosition))

	@DSL
	class Thing45Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing45Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing45Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing45s(block: Thing45sActions.() -> Unit) =
	block(Thing45sActions())

@DSL
class Thing45sActions {
	@CheckResult
	private fun insideThing45s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing45s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing45s(withId(R.id.repo_view)).click() }

	fun thing45(atPosition: Int, block: Thing45Actions.() -> Unit) =
		block(Thing45Actions(atPosition))

	@DSL
	class Thing45Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing45Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing45Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing45Item(withId(R.id.repo_view)).click() }
	}
}
