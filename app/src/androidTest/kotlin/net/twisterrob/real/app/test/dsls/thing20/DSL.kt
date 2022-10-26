package net.twisterrob.real.app.test.dsls.thing20

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

fun User.LaunchesActions.thing20sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing20s(block: Thing20sVerifications.() -> Unit) =
	block(Thing20sVerifications())

@DSL
class Thing20sVerifications {
	@CheckResult
	private fun insideThing20s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing20s(withId(R.id.repo_view)).checkText(it) }

	fun thing20(atPosition: Int, block: Thing20Verifications.() -> Unit) =
		block(Thing20Verifications(atPosition))

	@DSL
	class Thing20Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing20Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing20Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing20s(block: Thing20sActions.() -> Unit) =
	block(Thing20sActions())

@DSL
class Thing20sActions {
	@CheckResult
	private fun insideThing20s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing20s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing20s(withId(R.id.repo_view)).click() }

	fun thing20(atPosition: Int, block: Thing20Actions.() -> Unit) =
		block(Thing20Actions(atPosition))

	@DSL
	class Thing20Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing20Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing20Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing20Item(withId(R.id.repo_view)).click() }
	}
}
