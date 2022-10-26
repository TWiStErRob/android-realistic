package net.twisterrob.real.app.test.dsls.thing77

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

fun User.LaunchesActions.thing77sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing77s(block: Thing77sVerifications.() -> Unit) =
	block(Thing77sVerifications())

@DSL
class Thing77sVerifications {
	@CheckResult
	private fun insideThing77s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing77s(withId(R.id.repo_view)).checkText(it) }

	fun thing77(atPosition: Int, block: Thing77Verifications.() -> Unit) =
		block(Thing77Verifications(atPosition))

	@DSL
	class Thing77Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing77Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing77Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing77s(block: Thing77sActions.() -> Unit) =
	block(Thing77sActions())

@DSL
class Thing77sActions {
	@CheckResult
	private fun insideThing77s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing77s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing77s(withId(R.id.repo_view)).click() }

	fun thing77(atPosition: Int, block: Thing77Actions.() -> Unit) =
		block(Thing77Actions(atPosition))

	@DSL
	class Thing77Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing77Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing77Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing77Item(withId(R.id.repo_view)).click() }
	}
}
