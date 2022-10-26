package net.twisterrob.real.app.test.dsls.thing7

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

fun User.LaunchesActions.thing7sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing7s(block: Thing7sVerifications.() -> Unit) =
	block(Thing7sVerifications())

@DSL
class Thing7sVerifications {
	@CheckResult
	private fun insideThing7s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing7s(withId(R.id.repo_view)).checkText(it) }

	fun thing7(atPosition: Int, block: Thing7Verifications.() -> Unit) =
		block(Thing7Verifications(atPosition))

	@DSL
	class Thing7Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing7Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing7Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing7s(block: Thing7sActions.() -> Unit) =
	block(Thing7sActions())

@DSL
class Thing7sActions {
	@CheckResult
	private fun insideThing7s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing7s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing7s(withId(R.id.repo_view)).click() }

	fun thing7(atPosition: Int, block: Thing7Actions.() -> Unit) =
		block(Thing7Actions(atPosition))

	@DSL
	class Thing7Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing7Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing7Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing7Item(withId(R.id.repo_view)).click() }
	}
}
