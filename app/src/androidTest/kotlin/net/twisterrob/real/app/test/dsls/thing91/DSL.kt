package net.twisterrob.real.app.test.dsls.thing91

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

fun User.LaunchesActions.thing91sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing91s(block: Thing91sVerifications.() -> Unit) =
	block(Thing91sVerifications())

@DSL
class Thing91sVerifications {
	@CheckResult
	private fun insideThing91s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing91s(withId(R.id.repo_view)).checkText(it) }

	fun thing91(atPosition: Int, block: Thing91Verifications.() -> Unit) =
		block(Thing91Verifications(atPosition))

	@DSL
	class Thing91Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing91Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing91Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing91s(block: Thing91sActions.() -> Unit) =
	block(Thing91sActions())

@DSL
class Thing91sActions {
	@CheckResult
	private fun insideThing91s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing91s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing91s(withId(R.id.repo_view)).click() }

	fun thing91(atPosition: Int, block: Thing91Actions.() -> Unit) =
		block(Thing91Actions(atPosition))

	@DSL
	class Thing91Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing91Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing91Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing91Item(withId(R.id.repo_view)).click() }
	}
}
