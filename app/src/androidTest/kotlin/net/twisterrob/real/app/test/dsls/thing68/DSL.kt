package net.twisterrob.real.app.test.dsls.thing68

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

fun User.LaunchesActions.thing68sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing68s(block: Thing68sVerifications.() -> Unit) =
	block(Thing68sVerifications())

@DSL
class Thing68sVerifications {
	@CheckResult
	private fun insideThing68s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing68s(withId(R.id.repo_view)).checkText(it) }

	fun thing68(atPosition: Int, block: Thing68Verifications.() -> Unit) =
		block(Thing68Verifications(atPosition))

	@DSL
	class Thing68Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing68Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing68Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing68s(block: Thing68sActions.() -> Unit) =
	block(Thing68sActions())

@DSL
class Thing68sActions {
	@CheckResult
	private fun insideThing68s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing68s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing68s(withId(R.id.repo_view)).click() }

	fun thing68(atPosition: Int, block: Thing68Actions.() -> Unit) =
		block(Thing68Actions(atPosition))

	@DSL
	class Thing68Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing68Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing68Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing68Item(withId(R.id.repo_view)).click() }
	}
}
