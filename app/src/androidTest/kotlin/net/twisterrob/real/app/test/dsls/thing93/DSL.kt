package net.twisterrob.real.app.test.dsls.thing93

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

fun User.LaunchesActions.thing93sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing93s(block: Thing93sVerifications.() -> Unit) =
	block(Thing93sVerifications())

@DSL
class Thing93sVerifications {
	@CheckResult
	private fun insideThing93s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing93s(withId(R.id.repo_view)).checkText(it) }

	fun thing93(atPosition: Int, block: Thing93Verifications.() -> Unit) =
		block(Thing93Verifications(atPosition))

	@DSL
	class Thing93Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing93Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing93Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing93s(block: Thing93sActions.() -> Unit) =
	block(Thing93sActions())

@DSL
class Thing93sActions {
	@CheckResult
	private fun insideThing93s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing93s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing93s(withId(R.id.repo_view)).click() }

	fun thing93(atPosition: Int, block: Thing93Actions.() -> Unit) =
		block(Thing93Actions(atPosition))

	@DSL
	class Thing93Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing93Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing93Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing93Item(withId(R.id.repo_view)).click() }
	}
}
