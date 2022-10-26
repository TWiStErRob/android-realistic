package net.twisterrob.real.app.test.dsls.thing92

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

fun User.LaunchesActions.thing92sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing92s(block: Thing92sVerifications.() -> Unit) =
	block(Thing92sVerifications())

@DSL
class Thing92sVerifications {
	@CheckResult
	private fun insideThing92s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing92s(withId(R.id.repo_view)).checkText(it) }

	fun thing92(atPosition: Int, block: Thing92Verifications.() -> Unit) =
		block(Thing92Verifications(atPosition))

	@DSL
	class Thing92Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing92Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing92Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing92s(block: Thing92sActions.() -> Unit) =
	block(Thing92sActions())

@DSL
class Thing92sActions {
	@CheckResult
	private fun insideThing92s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing92s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing92s(withId(R.id.repo_view)).click() }

	fun thing92(atPosition: Int, block: Thing92Actions.() -> Unit) =
		block(Thing92Actions(atPosition))

	@DSL
	class Thing92Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing92Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing92Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing92Item(withId(R.id.repo_view)).click() }
	}
}
