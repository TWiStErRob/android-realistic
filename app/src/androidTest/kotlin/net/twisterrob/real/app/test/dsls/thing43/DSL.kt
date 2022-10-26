package net.twisterrob.real.app.test.dsls.thing43

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

fun User.LaunchesActions.thing43sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing43s(block: Thing43sVerifications.() -> Unit) =
	block(Thing43sVerifications())

@DSL
class Thing43sVerifications {
	@CheckResult
	private fun insideThing43s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing43s(withId(R.id.repo_view)).checkText(it) }

	fun thing43(atPosition: Int, block: Thing43Verifications.() -> Unit) =
		block(Thing43Verifications(atPosition))

	@DSL
	class Thing43Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing43Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing43Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing43s(block: Thing43sActions.() -> Unit) =
	block(Thing43sActions())

@DSL
class Thing43sActions {
	@CheckResult
	private fun insideThing43s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing43s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing43s(withId(R.id.repo_view)).click() }

	fun thing43(atPosition: Int, block: Thing43Actions.() -> Unit) =
		block(Thing43Actions(atPosition))

	@DSL
	class Thing43Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing43Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing43Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing43Item(withId(R.id.repo_view)).click() }
	}
}
