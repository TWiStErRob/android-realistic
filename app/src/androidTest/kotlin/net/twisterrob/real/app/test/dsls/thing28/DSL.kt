package net.twisterrob.real.app.test.dsls.thing28

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

fun User.LaunchesActions.thing28sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing28s(block: Thing28sVerifications.() -> Unit) =
	block(Thing28sVerifications())

@DSL
class Thing28sVerifications {
	@CheckResult
	private fun insideThing28s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing28s(withId(R.id.repo_view)).checkText(it) }

	fun thing28(atPosition: Int, block: Thing28Verifications.() -> Unit) =
		block(Thing28Verifications(atPosition))

	@DSL
	class Thing28Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing28Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing28Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing28s(block: Thing28sActions.() -> Unit) =
	block(Thing28sActions())

@DSL
class Thing28sActions {
	@CheckResult
	private fun insideThing28s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing28s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing28s(withId(R.id.repo_view)).click() }

	fun thing28(atPosition: Int, block: Thing28Actions.() -> Unit) =
		block(Thing28Actions(atPosition))

	@DSL
	class Thing28Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing28Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing28Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing28Item(withId(R.id.repo_view)).click() }
	}
}
