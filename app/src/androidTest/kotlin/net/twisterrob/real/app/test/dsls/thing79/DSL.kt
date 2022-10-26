package net.twisterrob.real.app.test.dsls.thing79

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

fun User.LaunchesActions.thing79sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing79s(block: Thing79sVerifications.() -> Unit) =
	block(Thing79sVerifications())

@DSL
class Thing79sVerifications {
	@CheckResult
	private fun insideThing79s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing79s(withId(R.id.repo_view)).checkText(it) }

	fun thing79(atPosition: Int, block: Thing79Verifications.() -> Unit) =
		block(Thing79Verifications(atPosition))

	@DSL
	class Thing79Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing79Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing79Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing79s(block: Thing79sActions.() -> Unit) =
	block(Thing79sActions())

@DSL
class Thing79sActions {
	@CheckResult
	private fun insideThing79s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing79s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing79s(withId(R.id.repo_view)).click() }

	fun thing79(atPosition: Int, block: Thing79Actions.() -> Unit) =
		block(Thing79Actions(atPosition))

	@DSL
	class Thing79Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing79Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing79Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing79Item(withId(R.id.repo_view)).click() }
	}
}
