package net.twisterrob.real.app.test.dsls.thing88

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

fun User.LaunchesActions.thing88sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing88s(block: Thing88sVerifications.() -> Unit) =
	block(Thing88sVerifications())

@DSL
class Thing88sVerifications {
	@CheckResult
	private fun insideThing88s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing88s(withId(R.id.repo_view)).checkText(it) }

	fun thing88(atPosition: Int, block: Thing88Verifications.() -> Unit) =
		block(Thing88Verifications(atPosition))

	@DSL
	class Thing88Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing88Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing88Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing88s(block: Thing88sActions.() -> Unit) =
	block(Thing88sActions())

@DSL
class Thing88sActions {
	@CheckResult
	private fun insideThing88s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing88s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing88s(withId(R.id.repo_view)).click() }

	fun thing88(atPosition: Int, block: Thing88Actions.() -> Unit) =
		block(Thing88Actions(atPosition))

	@DSL
	class Thing88Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing88Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing88Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing88Item(withId(R.id.repo_view)).click() }
	}
}
