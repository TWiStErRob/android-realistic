package net.twisterrob.real.app.test.dsls.thing95

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

fun User.LaunchesActions.thing95sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing95s(block: Thing95sVerifications.() -> Unit) =
	block(Thing95sVerifications())

@DSL
class Thing95sVerifications {
	@CheckResult
	private fun insideThing95s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing95s(withId(R.id.repo_view)).checkText(it) }

	fun thing95(atPosition: Int, block: Thing95Verifications.() -> Unit) =
		block(Thing95Verifications(atPosition))

	@DSL
	class Thing95Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing95Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing95Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing95s(block: Thing95sActions.() -> Unit) =
	block(Thing95sActions())

@DSL
class Thing95sActions {
	@CheckResult
	private fun insideThing95s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing95s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing95s(withId(R.id.repo_view)).click() }

	fun thing95(atPosition: Int, block: Thing95Actions.() -> Unit) =
		block(Thing95Actions(atPosition))

	@DSL
	class Thing95Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing95Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing95Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing95Item(withId(R.id.repo_view)).click() }
	}
}
