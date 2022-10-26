package net.twisterrob.real.app.test.dsls.thing27

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

fun User.LaunchesActions.thing27sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing27s(block: Thing27sVerifications.() -> Unit) =
	block(Thing27sVerifications())

@DSL
class Thing27sVerifications {
	@CheckResult
	private fun insideThing27s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing27s(withId(R.id.repo_view)).checkText(it) }

	fun thing27(atPosition: Int, block: Thing27Verifications.() -> Unit) =
		block(Thing27Verifications(atPosition))

	@DSL
	class Thing27Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing27Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing27Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing27s(block: Thing27sActions.() -> Unit) =
	block(Thing27sActions())

@DSL
class Thing27sActions {
	@CheckResult
	private fun insideThing27s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing27s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing27s(withId(R.id.repo_view)).click() }

	fun thing27(atPosition: Int, block: Thing27Actions.() -> Unit) =
		block(Thing27Actions(atPosition))

	@DSL
	class Thing27Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing27Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing27Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing27Item(withId(R.id.repo_view)).click() }
	}
}
