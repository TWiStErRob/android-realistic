package net.twisterrob.real.app.test.dsls.thing36

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

fun User.LaunchesActions.thing36sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing36s(block: Thing36sVerifications.() -> Unit) =
	block(Thing36sVerifications())

@DSL
class Thing36sVerifications {
	@CheckResult
	private fun insideThing36s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing36s(withId(R.id.repo_view)).checkText(it) }

	fun thing36(atPosition: Int, block: Thing36Verifications.() -> Unit) =
		block(Thing36Verifications(atPosition))

	@DSL
	class Thing36Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing36Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing36Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing36s(block: Thing36sActions.() -> Unit) =
	block(Thing36sActions())

@DSL
class Thing36sActions {
	@CheckResult
	private fun insideThing36s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing36s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing36s(withId(R.id.repo_view)).click() }

	fun thing36(atPosition: Int, block: Thing36Actions.() -> Unit) =
		block(Thing36Actions(atPosition))

	@DSL
	class Thing36Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing36Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing36Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing36Item(withId(R.id.repo_view)).click() }
	}
}
