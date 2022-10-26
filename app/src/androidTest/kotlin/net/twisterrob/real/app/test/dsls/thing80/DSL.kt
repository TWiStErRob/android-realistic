package net.twisterrob.real.app.test.dsls.thing80

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

fun User.LaunchesActions.thing80sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing80s(block: Thing80sVerifications.() -> Unit) =
	block(Thing80sVerifications())

@DSL
class Thing80sVerifications {
	@CheckResult
	private fun insideThing80s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing80s(withId(R.id.repo_view)).checkText(it) }

	fun thing80(atPosition: Int, block: Thing80Verifications.() -> Unit) =
		block(Thing80Verifications(atPosition))

	@DSL
	class Thing80Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing80Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing80Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing80s(block: Thing80sActions.() -> Unit) =
	block(Thing80sActions())

@DSL
class Thing80sActions {
	@CheckResult
	private fun insideThing80s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing80s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing80s(withId(R.id.repo_view)).click() }

	fun thing80(atPosition: Int, block: Thing80Actions.() -> Unit) =
		block(Thing80Actions(atPosition))

	@DSL
	class Thing80Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing80Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing80Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing80Item(withId(R.id.repo_view)).click() }
	}
}
