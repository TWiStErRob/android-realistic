package net.twisterrob.real.app.test.dsls.thing51

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

fun User.LaunchesActions.thing51sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing51s(block: Thing51sVerifications.() -> Unit) =
	block(Thing51sVerifications())

@DSL
class Thing51sVerifications {
	@CheckResult
	private fun insideThing51s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing51s(withId(R.id.repo_view)).checkText(it) }

	fun thing51(atPosition: Int, block: Thing51Verifications.() -> Unit) =
		block(Thing51Verifications(atPosition))

	@DSL
	class Thing51Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing51Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing51Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing51s(block: Thing51sActions.() -> Unit) =
	block(Thing51sActions())

@DSL
class Thing51sActions {
	@CheckResult
	private fun insideThing51s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing51s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing51s(withId(R.id.repo_view)).click() }

	fun thing51(atPosition: Int, block: Thing51Actions.() -> Unit) =
		block(Thing51Actions(atPosition))

	@DSL
	class Thing51Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing51Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing51Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing51Item(withId(R.id.repo_view)).click() }
	}
}
