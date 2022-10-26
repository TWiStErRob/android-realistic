package net.twisterrob.real.app.test.dsls.thing17

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

fun User.LaunchesActions.thing17sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing17s(block: Thing17sVerifications.() -> Unit) =
	block(Thing17sVerifications())

@DSL
class Thing17sVerifications {
	@CheckResult
	private fun insideThing17s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing17s(withId(R.id.repo_view)).checkText(it) }

	fun thing17(atPosition: Int, block: Thing17Verifications.() -> Unit) =
		block(Thing17Verifications(atPosition))

	@DSL
	class Thing17Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing17Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing17Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing17s(block: Thing17sActions.() -> Unit) =
	block(Thing17sActions())

@DSL
class Thing17sActions {
	@CheckResult
	private fun insideThing17s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing17s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing17s(withId(R.id.repo_view)).click() }

	fun thing17(atPosition: Int, block: Thing17Actions.() -> Unit) =
		block(Thing17Actions(atPosition))

	@DSL
	class Thing17Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing17Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing17Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing17Item(withId(R.id.repo_view)).click() }
	}
}
