package net.twisterrob.real.app.test.dsls.thing66

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

fun User.LaunchesActions.thing66sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing66s(block: Thing66sVerifications.() -> Unit) =
	block(Thing66sVerifications())

@DSL
class Thing66sVerifications {
	@CheckResult
	private fun insideThing66s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing66s(withId(R.id.repo_view)).checkText(it) }

	fun thing66(atPosition: Int, block: Thing66Verifications.() -> Unit) =
		block(Thing66Verifications(atPosition))

	@DSL
	class Thing66Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing66Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing66Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing66s(block: Thing66sActions.() -> Unit) =
	block(Thing66sActions())

@DSL
class Thing66sActions {
	@CheckResult
	private fun insideThing66s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing66s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing66s(withId(R.id.repo_view)).click() }

	fun thing66(atPosition: Int, block: Thing66Actions.() -> Unit) =
		block(Thing66Actions(atPosition))

	@DSL
	class Thing66Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing66Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing66Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing66Item(withId(R.id.repo_view)).click() }
	}
}
