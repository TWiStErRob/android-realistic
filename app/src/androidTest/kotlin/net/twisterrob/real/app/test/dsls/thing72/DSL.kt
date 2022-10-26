package net.twisterrob.real.app.test.dsls.thing72

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

fun User.LaunchesActions.thing72sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing72s(block: Thing72sVerifications.() -> Unit) =
	block(Thing72sVerifications())

@DSL
class Thing72sVerifications {
	@CheckResult
	private fun insideThing72s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing72s(withId(R.id.repo_view)).checkText(it) }

	fun thing72(atPosition: Int, block: Thing72Verifications.() -> Unit) =
		block(Thing72Verifications(atPosition))

	@DSL
	class Thing72Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing72Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing72Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing72s(block: Thing72sActions.() -> Unit) =
	block(Thing72sActions())

@DSL
class Thing72sActions {
	@CheckResult
	private fun insideThing72s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing72s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing72s(withId(R.id.repo_view)).click() }

	fun thing72(atPosition: Int, block: Thing72Actions.() -> Unit) =
		block(Thing72Actions(atPosition))

	@DSL
	class Thing72Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing72Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing72Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing72Item(withId(R.id.repo_view)).click() }
	}
}
