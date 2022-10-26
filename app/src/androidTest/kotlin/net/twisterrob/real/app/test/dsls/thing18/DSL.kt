package net.twisterrob.real.app.test.dsls.thing18

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

fun User.LaunchesActions.thing18sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing18s(block: Thing18sVerifications.() -> Unit) =
	block(Thing18sVerifications())

@DSL
class Thing18sVerifications {
	@CheckResult
	private fun insideThing18s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing18s(withId(R.id.repo_view)).checkText(it) }

	fun thing18(atPosition: Int, block: Thing18Verifications.() -> Unit) =
		block(Thing18Verifications(atPosition))

	@DSL
	class Thing18Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing18Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing18Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing18s(block: Thing18sActions.() -> Unit) =
	block(Thing18sActions())

@DSL
class Thing18sActions {
	@CheckResult
	private fun insideThing18s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing18s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing18s(withId(R.id.repo_view)).click() }

	fun thing18(atPosition: Int, block: Thing18Actions.() -> Unit) =
		block(Thing18Actions(atPosition))

	@DSL
	class Thing18Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing18Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing18Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing18Item(withId(R.id.repo_view)).click() }
	}
}