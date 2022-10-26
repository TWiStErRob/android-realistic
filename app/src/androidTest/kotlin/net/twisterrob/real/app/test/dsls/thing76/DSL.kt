package net.twisterrob.real.app.test.dsls.thing76

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

fun User.LaunchesActions.thing76sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing76s(block: Thing76sVerifications.() -> Unit) =
	block(Thing76sVerifications())

@DSL
class Thing76sVerifications {
	@CheckResult
	private fun insideThing76s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing76s(withId(R.id.repo_view)).checkText(it) }

	fun thing76(atPosition: Int, block: Thing76Verifications.() -> Unit) =
		block(Thing76Verifications(atPosition))

	@DSL
	class Thing76Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing76Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing76Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing76s(block: Thing76sActions.() -> Unit) =
	block(Thing76sActions())

@DSL
class Thing76sActions {
	@CheckResult
	private fun insideThing76s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing76s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing76s(withId(R.id.repo_view)).click() }

	fun thing76(atPosition: Int, block: Thing76Actions.() -> Unit) =
		block(Thing76Actions(atPosition))

	@DSL
	class Thing76Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing76Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing76Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing76Item(withId(R.id.repo_view)).click() }
	}
}
