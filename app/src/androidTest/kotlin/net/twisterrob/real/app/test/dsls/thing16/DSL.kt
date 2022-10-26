package net.twisterrob.real.app.test.dsls.thing16

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

fun User.LaunchesActions.thing16sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing16s(block: Thing16sVerifications.() -> Unit) =
	block(Thing16sVerifications())

@DSL
class Thing16sVerifications {
	@CheckResult
	private fun insideThing16s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing16s(withId(R.id.repo_view)).checkText(it) }

	fun thing16(atPosition: Int, block: Thing16Verifications.() -> Unit) =
		block(Thing16Verifications(atPosition))

	@DSL
	class Thing16Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing16Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing16Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing16s(block: Thing16sActions.() -> Unit) =
	block(Thing16sActions())

@DSL
class Thing16sActions {
	@CheckResult
	private fun insideThing16s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing16s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing16s(withId(R.id.repo_view)).click() }

	fun thing16(atPosition: Int, block: Thing16Actions.() -> Unit) =
		block(Thing16Actions(atPosition))

	@DSL
	class Thing16Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing16Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing16Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing16Item(withId(R.id.repo_view)).click() }
	}
}
