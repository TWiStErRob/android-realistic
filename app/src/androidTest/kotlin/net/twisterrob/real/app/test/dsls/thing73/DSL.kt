package net.twisterrob.real.app.test.dsls.thing73

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

fun User.LaunchesActions.thing73sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing73s(block: Thing73sVerifications.() -> Unit) =
	block(Thing73sVerifications())

@DSL
class Thing73sVerifications {
	@CheckResult
	private fun insideThing73s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing73s(withId(R.id.repo_view)).checkText(it) }

	fun thing73(atPosition: Int, block: Thing73Verifications.() -> Unit) =
		block(Thing73Verifications(atPosition))

	@DSL
	class Thing73Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing73Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing73Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing73s(block: Thing73sActions.() -> Unit) =
	block(Thing73sActions())

@DSL
class Thing73sActions {
	@CheckResult
	private fun insideThing73s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing73s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing73s(withId(R.id.repo_view)).click() }

	fun thing73(atPosition: Int, block: Thing73Actions.() -> Unit) =
		block(Thing73Actions(atPosition))

	@DSL
	class Thing73Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing73Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing73Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing73Item(withId(R.id.repo_view)).click() }
	}
}
