package net.twisterrob.real.app.test.dsls.thing82

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

fun User.LaunchesActions.thing82sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing82s(block: Thing82sVerifications.() -> Unit) =
	block(Thing82sVerifications())

@DSL
class Thing82sVerifications {
	@CheckResult
	private fun insideThing82s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing82s(withId(R.id.repo_view)).checkText(it) }

	fun thing82(atPosition: Int, block: Thing82Verifications.() -> Unit) =
		block(Thing82Verifications(atPosition))

	@DSL
	class Thing82Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing82Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing82Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing82s(block: Thing82sActions.() -> Unit) =
	block(Thing82sActions())

@DSL
class Thing82sActions {
	@CheckResult
	private fun insideThing82s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing82s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing82s(withId(R.id.repo_view)).click() }

	fun thing82(atPosition: Int, block: Thing82Actions.() -> Unit) =
		block(Thing82Actions(atPosition))

	@DSL
	class Thing82Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing82Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing82Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing82Item(withId(R.id.repo_view)).click() }
	}
}
