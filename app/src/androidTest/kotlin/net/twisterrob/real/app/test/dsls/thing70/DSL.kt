package net.twisterrob.real.app.test.dsls.thing70

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

fun User.LaunchesActions.thing70sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing70s(block: Thing70sVerifications.() -> Unit) =
	block(Thing70sVerifications())

@DSL
class Thing70sVerifications {
	@CheckResult
	private fun insideThing70s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing70s(withId(R.id.repo_view)).checkText(it) }

	fun thing70(atPosition: Int, block: Thing70Verifications.() -> Unit) =
		block(Thing70Verifications(atPosition))

	@DSL
	class Thing70Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing70Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing70Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing70s(block: Thing70sActions.() -> Unit) =
	block(Thing70sActions())

@DSL
class Thing70sActions {
	@CheckResult
	private fun insideThing70s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing70s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing70s(withId(R.id.repo_view)).click() }

	fun thing70(atPosition: Int, block: Thing70Actions.() -> Unit) =
		block(Thing70Actions(atPosition))

	@DSL
	class Thing70Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing70Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing70Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing70Item(withId(R.id.repo_view)).click() }
	}
}
