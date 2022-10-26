package net.twisterrob.real.app.test.dsls.thing55

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

fun User.LaunchesActions.thing55sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing55s(block: Thing55sVerifications.() -> Unit) =
	block(Thing55sVerifications())

@DSL
class Thing55sVerifications {
	@CheckResult
	private fun insideThing55s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing55s(withId(R.id.repo_view)).checkText(it) }

	fun thing55(atPosition: Int, block: Thing55Verifications.() -> Unit) =
		block(Thing55Verifications(atPosition))

	@DSL
	class Thing55Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing55Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing55Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing55s(block: Thing55sActions.() -> Unit) =
	block(Thing55sActions())

@DSL
class Thing55sActions {
	@CheckResult
	private fun insideThing55s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing55s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing55s(withId(R.id.repo_view)).click() }

	fun thing55(atPosition: Int, block: Thing55Actions.() -> Unit) =
		block(Thing55Actions(atPosition))

	@DSL
	class Thing55Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing55Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing55Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing55Item(withId(R.id.repo_view)).click() }
	}
}