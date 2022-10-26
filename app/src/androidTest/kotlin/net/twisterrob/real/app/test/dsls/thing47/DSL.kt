package net.twisterrob.real.app.test.dsls.thing47

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

fun User.LaunchesActions.thing47sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing47s(block: Thing47sVerifications.() -> Unit) =
	block(Thing47sVerifications())

@DSL
class Thing47sVerifications {
	@CheckResult
	private fun insideThing47s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing47s(withId(R.id.repo_view)).checkText(it) }

	fun thing47(atPosition: Int, block: Thing47Verifications.() -> Unit) =
		block(Thing47Verifications(atPosition))

	@DSL
	class Thing47Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing47Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing47Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing47s(block: Thing47sActions.() -> Unit) =
	block(Thing47sActions())

@DSL
class Thing47sActions {
	@CheckResult
	private fun insideThing47s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing47s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing47s(withId(R.id.repo_view)).click() }

	fun thing47(atPosition: Int, block: Thing47Actions.() -> Unit) =
		block(Thing47Actions(atPosition))

	@DSL
	class Thing47Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing47Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing47Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing47Item(withId(R.id.repo_view)).click() }
	}
}
