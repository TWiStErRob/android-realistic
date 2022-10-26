package net.twisterrob.real.app.test.dsls.thing89

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

fun User.LaunchesActions.thing89sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing89s(block: Thing89sVerifications.() -> Unit) =
	block(Thing89sVerifications())

@DSL
class Thing89sVerifications {
	@CheckResult
	private fun insideThing89s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing89s(withId(R.id.repo_view)).checkText(it) }

	fun thing89(atPosition: Int, block: Thing89Verifications.() -> Unit) =
		block(Thing89Verifications(atPosition))

	@DSL
	class Thing89Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing89Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing89Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing89s(block: Thing89sActions.() -> Unit) =
	block(Thing89sActions())

@DSL
class Thing89sActions {
	@CheckResult
	private fun insideThing89s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing89s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing89s(withId(R.id.repo_view)).click() }

	fun thing89(atPosition: Int, block: Thing89Actions.() -> Unit) =
		block(Thing89Actions(atPosition))

	@DSL
	class Thing89Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing89Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing89Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing89Item(withId(R.id.repo_view)).click() }
	}
}
