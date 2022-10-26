package net.twisterrob.real.app.test.dsls.thing62

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

fun User.LaunchesActions.thing62sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing62s(block: Thing62sVerifications.() -> Unit) =
	block(Thing62sVerifications())

@DSL
class Thing62sVerifications {
	@CheckResult
	private fun insideThing62s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing62s(withId(R.id.repo_view)).checkText(it) }

	fun thing62(atPosition: Int, block: Thing62Verifications.() -> Unit) =
		block(Thing62Verifications(atPosition))

	@DSL
	class Thing62Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing62Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing62Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing62s(block: Thing62sActions.() -> Unit) =
	block(Thing62sActions())

@DSL
class Thing62sActions {
	@CheckResult
	private fun insideThing62s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing62s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing62s(withId(R.id.repo_view)).click() }

	fun thing62(atPosition: Int, block: Thing62Actions.() -> Unit) =
		block(Thing62Actions(atPosition))

	@DSL
	class Thing62Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing62Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing62Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing62Item(withId(R.id.repo_view)).click() }
	}
}