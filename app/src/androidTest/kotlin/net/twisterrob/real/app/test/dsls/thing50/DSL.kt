package net.twisterrob.real.app.test.dsls.thing50

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

fun User.LaunchesActions.thing50sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing50s(block: Thing50sVerifications.() -> Unit) =
	block(Thing50sVerifications())

@DSL
class Thing50sVerifications {
	@CheckResult
	private fun insideThing50s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing50s(withId(R.id.repo_view)).checkText(it) }

	fun thing50(atPosition: Int, block: Thing50Verifications.() -> Unit) =
		block(Thing50Verifications(atPosition))

	@DSL
	class Thing50Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing50Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing50Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing50s(block: Thing50sActions.() -> Unit) =
	block(Thing50sActions())

@DSL
class Thing50sActions {
	@CheckResult
	private fun insideThing50s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing50s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing50s(withId(R.id.repo_view)).click() }

	fun thing50(atPosition: Int, block: Thing50Actions.() -> Unit) =
		block(Thing50Actions(atPosition))

	@DSL
	class Thing50Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing50Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing50Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing50Item(withId(R.id.repo_view)).click() }
	}
}
