package net.twisterrob.real.app.test.dsls.thing15

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

fun User.LaunchesActions.thing15sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing15s(block: Thing15sVerifications.() -> Unit) =
	block(Thing15sVerifications())

@DSL
class Thing15sVerifications {
	@CheckResult
	private fun insideThing15s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing15s(withId(R.id.repo_view)).checkText(it) }

	fun thing15(atPosition: Int, block: Thing15Verifications.() -> Unit) =
		block(Thing15Verifications(atPosition))

	@DSL
	class Thing15Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing15Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing15Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing15s(block: Thing15sActions.() -> Unit) =
	block(Thing15sActions())

@DSL
class Thing15sActions {
	@CheckResult
	private fun insideThing15s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing15s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing15s(withId(R.id.repo_view)).click() }

	fun thing15(atPosition: Int, block: Thing15Actions.() -> Unit) =
		block(Thing15Actions(atPosition))

	@DSL
	class Thing15Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing15Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing15Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing15Item(withId(R.id.repo_view)).click() }
	}
}
