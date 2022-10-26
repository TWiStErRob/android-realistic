package net.twisterrob.real.app.test.dsls.thing57

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

fun User.LaunchesActions.thing57sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing57s(block: Thing57sVerifications.() -> Unit) =
	block(Thing57sVerifications())

@DSL
class Thing57sVerifications {
	@CheckResult
	private fun insideThing57s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing57s(withId(R.id.repo_view)).checkText(it) }

	fun thing57(atPosition: Int, block: Thing57Verifications.() -> Unit) =
		block(Thing57Verifications(atPosition))

	@DSL
	class Thing57Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing57Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing57Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing57s(block: Thing57sActions.() -> Unit) =
	block(Thing57sActions())

@DSL
class Thing57sActions {
	@CheckResult
	private fun insideThing57s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing57s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing57s(withId(R.id.repo_view)).click() }

	fun thing57(atPosition: Int, block: Thing57Actions.() -> Unit) =
		block(Thing57Actions(atPosition))

	@DSL
	class Thing57Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing57Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing57Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing57Item(withId(R.id.repo_view)).click() }
	}
}
