package net.twisterrob.real.app.test.dsls.thing37

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

fun User.LaunchesActions.thing37sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing37s(block: Thing37sVerifications.() -> Unit) =
	block(Thing37sVerifications())

@DSL
class Thing37sVerifications {
	@CheckResult
	private fun insideThing37s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing37s(withId(R.id.repo_view)).checkText(it) }

	fun thing37(atPosition: Int, block: Thing37Verifications.() -> Unit) =
		block(Thing37Verifications(atPosition))

	@DSL
	class Thing37Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing37Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing37Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing37s(block: Thing37sActions.() -> Unit) =
	block(Thing37sActions())

@DSL
class Thing37sActions {
	@CheckResult
	private fun insideThing37s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing37s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing37s(withId(R.id.repo_view)).click() }

	fun thing37(atPosition: Int, block: Thing37Actions.() -> Unit) =
		block(Thing37Actions(atPosition))

	@DSL
	class Thing37Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing37Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing37Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing37Item(withId(R.id.repo_view)).click() }
	}
}
