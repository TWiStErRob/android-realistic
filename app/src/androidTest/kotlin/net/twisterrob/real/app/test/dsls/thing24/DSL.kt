package net.twisterrob.real.app.test.dsls.thing24

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

fun User.LaunchesActions.thing24sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing24s(block: Thing24sVerifications.() -> Unit) =
	block(Thing24sVerifications())

@DSL
class Thing24sVerifications {
	@CheckResult
	private fun insideThing24s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing24s(withId(R.id.repo_view)).checkText(it) }

	fun thing24(atPosition: Int, block: Thing24Verifications.() -> Unit) =
		block(Thing24Verifications(atPosition))

	@DSL
	class Thing24Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing24Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing24Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing24s(block: Thing24sActions.() -> Unit) =
	block(Thing24sActions())

@DSL
class Thing24sActions {
	@CheckResult
	private fun insideThing24s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing24s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing24s(withId(R.id.repo_view)).click() }

	fun thing24(atPosition: Int, block: Thing24Actions.() -> Unit) =
		block(Thing24Actions(atPosition))

	@DSL
	class Thing24Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing24Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing24Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing24Item(withId(R.id.repo_view)).click() }
	}
}
