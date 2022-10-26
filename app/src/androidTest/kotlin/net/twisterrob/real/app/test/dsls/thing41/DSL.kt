package net.twisterrob.real.app.test.dsls.thing41

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

fun User.LaunchesActions.thing41sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing41s(block: Thing41sVerifications.() -> Unit) =
	block(Thing41sVerifications())

@DSL
class Thing41sVerifications {
	@CheckResult
	private fun insideThing41s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing41s(withId(R.id.repo_view)).checkText(it) }

	fun thing41(atPosition: Int, block: Thing41Verifications.() -> Unit) =
		block(Thing41Verifications(atPosition))

	@DSL
	class Thing41Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing41Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing41Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing41s(block: Thing41sActions.() -> Unit) =
	block(Thing41sActions())

@DSL
class Thing41sActions {
	@CheckResult
	private fun insideThing41s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing41s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing41s(withId(R.id.repo_view)).click() }

	fun thing41(atPosition: Int, block: Thing41Actions.() -> Unit) =
		block(Thing41Actions(atPosition))

	@DSL
	class Thing41Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing41Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing41Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing41Item(withId(R.id.repo_view)).click() }
	}
}
