package net.twisterrob.real.app.test.dsls.thing75

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

fun User.LaunchesActions.thing75sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing75s(block: Thing75sVerifications.() -> Unit) =
	block(Thing75sVerifications())

@DSL
class Thing75sVerifications {
	@CheckResult
	private fun insideThing75s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing75s(withId(R.id.repo_view)).checkText(it) }

	fun thing75(atPosition: Int, block: Thing75Verifications.() -> Unit) =
		block(Thing75Verifications(atPosition))

	@DSL
	class Thing75Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing75Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing75Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing75s(block: Thing75sActions.() -> Unit) =
	block(Thing75sActions())

@DSL
class Thing75sActions {
	@CheckResult
	private fun insideThing75s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing75s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing75s(withId(R.id.repo_view)).click() }

	fun thing75(atPosition: Int, block: Thing75Actions.() -> Unit) =
		block(Thing75Actions(atPosition))

	@DSL
	class Thing75Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing75Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing75Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing75Item(withId(R.id.repo_view)).click() }
	}
}
