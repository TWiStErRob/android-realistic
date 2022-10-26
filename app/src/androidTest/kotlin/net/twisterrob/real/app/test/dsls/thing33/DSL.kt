package net.twisterrob.real.app.test.dsls.thing33

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

fun User.LaunchesActions.thing33sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing33s(block: Thing33sVerifications.() -> Unit) =
	block(Thing33sVerifications())

@DSL
class Thing33sVerifications {
	@CheckResult
	private fun insideThing33s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing33s(withId(R.id.repo_view)).checkText(it) }

	fun thing33(atPosition: Int, block: Thing33Verifications.() -> Unit) =
		block(Thing33Verifications(atPosition))

	@DSL
	class Thing33Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing33Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing33Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing33s(block: Thing33sActions.() -> Unit) =
	block(Thing33sActions())

@DSL
class Thing33sActions {
	@CheckResult
	private fun insideThing33s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing33s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing33s(withId(R.id.repo_view)).click() }

	fun thing33(atPosition: Int, block: Thing33Actions.() -> Unit) =
		block(Thing33Actions(atPosition))

	@DSL
	class Thing33Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing33Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing33Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing33Item(withId(R.id.repo_view)).click() }
	}
}
