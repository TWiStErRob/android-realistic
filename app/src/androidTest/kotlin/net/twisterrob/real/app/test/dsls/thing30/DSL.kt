package net.twisterrob.real.app.test.dsls.thing30

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

fun User.LaunchesActions.thing30sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing30s(block: Thing30sVerifications.() -> Unit) =
	block(Thing30sVerifications())

@DSL
class Thing30sVerifications {
	@CheckResult
	private fun insideThing30s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing30s(withId(R.id.repo_view)).checkText(it) }

	fun thing30(atPosition: Int, block: Thing30Verifications.() -> Unit) =
		block(Thing30Verifications(atPosition))

	@DSL
	class Thing30Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing30Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing30Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing30s(block: Thing30sActions.() -> Unit) =
	block(Thing30sActions())

@DSL
class Thing30sActions {
	@CheckResult
	private fun insideThing30s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing30s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing30s(withId(R.id.repo_view)).click() }

	fun thing30(atPosition: Int, block: Thing30Actions.() -> Unit) =
		block(Thing30Actions(atPosition))

	@DSL
	class Thing30Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing30Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing30Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing30Item(withId(R.id.repo_view)).click() }
	}
}
