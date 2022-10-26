package net.twisterrob.real.app.test.dsls.thing97

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

fun User.LaunchesActions.thing97sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing97s(block: Thing97sVerifications.() -> Unit) =
	block(Thing97sVerifications())

@DSL
class Thing97sVerifications {
	@CheckResult
	private fun insideThing97s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing97s(withId(R.id.repo_view)).checkText(it) }

	fun thing97(atPosition: Int, block: Thing97Verifications.() -> Unit) =
		block(Thing97Verifications(atPosition))

	@DSL
	class Thing97Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing97Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing97Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing97s(block: Thing97sActions.() -> Unit) =
	block(Thing97sActions())

@DSL
class Thing97sActions {
	@CheckResult
	private fun insideThing97s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing97s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing97s(withId(R.id.repo_view)).click() }

	fun thing97(atPosition: Int, block: Thing97Actions.() -> Unit) =
		block(Thing97Actions(atPosition))

	@DSL
	class Thing97Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing97Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing97Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing97Item(withId(R.id.repo_view)).click() }
	}
}
