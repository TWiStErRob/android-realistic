package net.twisterrob.real.app.test.dsls.thing99

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

fun User.LaunchesActions.thing99sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing99s(block: Thing99sVerifications.() -> Unit) =
	block(Thing99sVerifications())

@DSL
class Thing99sVerifications {
	@CheckResult
	private fun insideThing99s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing99s(withId(R.id.repo_view)).checkText(it) }

	fun thing99(atPosition: Int, block: Thing99Verifications.() -> Unit) =
		block(Thing99Verifications(atPosition))

	@DSL
	class Thing99Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing99Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing99Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing99s(block: Thing99sActions.() -> Unit) =
	block(Thing99sActions())

@DSL
class Thing99sActions {
	@CheckResult
	private fun insideThing99s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing99s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing99s(withId(R.id.repo_view)).click() }

	fun thing99(atPosition: Int, block: Thing99Actions.() -> Unit) =
		block(Thing99Actions(atPosition))

	@DSL
	class Thing99Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing99Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing99Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing99Item(withId(R.id.repo_view)).click() }
	}
}
