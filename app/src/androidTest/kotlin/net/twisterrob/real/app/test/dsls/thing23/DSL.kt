package net.twisterrob.real.app.test.dsls.thing23

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

fun User.LaunchesActions.thing23sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing23s(block: Thing23sVerifications.() -> Unit) =
	block(Thing23sVerifications())

@DSL
class Thing23sVerifications {
	@CheckResult
	private fun insideThing23s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing23s(withId(R.id.repo_view)).checkText(it) }

	fun thing23(atPosition: Int, block: Thing23Verifications.() -> Unit) =
		block(Thing23Verifications(atPosition))

	@DSL
	class Thing23Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing23Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing23Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing23s(block: Thing23sActions.() -> Unit) =
	block(Thing23sActions())

@DSL
class Thing23sActions {
	@CheckResult
	private fun insideThing23s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing23s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing23s(withId(R.id.repo_view)).click() }

	fun thing23(atPosition: Int, block: Thing23Actions.() -> Unit) =
		block(Thing23Actions(atPosition))

	@DSL
	class Thing23Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing23Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing23Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing23Item(withId(R.id.repo_view)).click() }
	}
}
