package net.twisterrob.real.app.test.dsls.thing10

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

fun User.LaunchesActions.thing10sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing10s(block: Thing10sVerifications.() -> Unit) =
	block(Thing10sVerifications())

@DSL
class Thing10sVerifications {
	@CheckResult
	private fun insideThing10s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing10s(withId(R.id.repo_view)).checkText(it) }

	fun thing10(atPosition: Int, block: Thing10Verifications.() -> Unit) =
		block(Thing10Verifications(atPosition))

	@DSL
	class Thing10Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing10Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing10Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing10s(block: Thing10sActions.() -> Unit) =
	block(Thing10sActions())

@DSL
class Thing10sActions {
	@CheckResult
	private fun insideThing10s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing10s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing10s(withId(R.id.repo_view)).click() }

	fun thing10(atPosition: Int, block: Thing10Actions.() -> Unit) =
		block(Thing10Actions(atPosition))

	@DSL
	class Thing10Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing10Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing10Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing10Item(withId(R.id.repo_view)).click() }
	}
}
