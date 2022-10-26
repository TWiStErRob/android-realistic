package net.twisterrob.real.app.test.dsls.thing39

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

fun User.LaunchesActions.thing39sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing39s(block: Thing39sVerifications.() -> Unit) =
	block(Thing39sVerifications())

@DSL
class Thing39sVerifications {
	@CheckResult
	private fun insideThing39s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing39s(withId(R.id.repo_view)).checkText(it) }

	fun thing39(atPosition: Int, block: Thing39Verifications.() -> Unit) =
		block(Thing39Verifications(atPosition))

	@DSL
	class Thing39Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing39Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing39Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing39s(block: Thing39sActions.() -> Unit) =
	block(Thing39sActions())

@DSL
class Thing39sActions {
	@CheckResult
	private fun insideThing39s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing39s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing39s(withId(R.id.repo_view)).click() }

	fun thing39(atPosition: Int, block: Thing39Actions.() -> Unit) =
		block(Thing39Actions(atPosition))

	@DSL
	class Thing39Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing39Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing39Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing39Item(withId(R.id.repo_view)).click() }
	}
}
