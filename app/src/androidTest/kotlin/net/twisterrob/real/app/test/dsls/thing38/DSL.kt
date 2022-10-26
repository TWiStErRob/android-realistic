package net.twisterrob.real.app.test.dsls.thing38

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

fun User.LaunchesActions.thing38sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing38s(block: Thing38sVerifications.() -> Unit) =
	block(Thing38sVerifications())

@DSL
class Thing38sVerifications {
	@CheckResult
	private fun insideThing38s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing38s(withId(R.id.repo_view)).checkText(it) }

	fun thing38(atPosition: Int, block: Thing38Verifications.() -> Unit) =
		block(Thing38Verifications(atPosition))

	@DSL
	class Thing38Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing38Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing38Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing38s(block: Thing38sActions.() -> Unit) =
	block(Thing38sActions())

@DSL
class Thing38sActions {
	@CheckResult
	private fun insideThing38s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing38s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing38s(withId(R.id.repo_view)).click() }

	fun thing38(atPosition: Int, block: Thing38Actions.() -> Unit) =
		block(Thing38Actions(atPosition))

	@DSL
	class Thing38Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing38Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing38Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing38Item(withId(R.id.repo_view)).click() }
	}
}
