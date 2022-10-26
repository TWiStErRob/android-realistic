package net.twisterrob.real.app.test.dsls.thing85

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

fun User.LaunchesActions.thing85sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing85s(block: Thing85sVerifications.() -> Unit) =
	block(Thing85sVerifications())

@DSL
class Thing85sVerifications {
	@CheckResult
	private fun insideThing85s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing85s(withId(R.id.repo_view)).checkText(it) }

	fun thing85(atPosition: Int, block: Thing85Verifications.() -> Unit) =
		block(Thing85Verifications(atPosition))

	@DSL
	class Thing85Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing85Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing85Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing85s(block: Thing85sActions.() -> Unit) =
	block(Thing85sActions())

@DSL
class Thing85sActions {
	@CheckResult
	private fun insideThing85s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing85s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing85s(withId(R.id.repo_view)).click() }

	fun thing85(atPosition: Int, block: Thing85Actions.() -> Unit) =
		block(Thing85Actions(atPosition))

	@DSL
	class Thing85Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing85Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing85Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing85Item(withId(R.id.repo_view)).click() }
	}
}
