package net.twisterrob.real.app.test.dsls.thing35

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

fun User.LaunchesActions.thing35sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing35s(block: Thing35sVerifications.() -> Unit) =
	block(Thing35sVerifications())

@DSL
class Thing35sVerifications {
	@CheckResult
	private fun insideThing35s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing35s(withId(R.id.repo_view)).checkText(it) }

	fun thing35(atPosition: Int, block: Thing35Verifications.() -> Unit) =
		block(Thing35Verifications(atPosition))

	@DSL
	class Thing35Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing35Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing35Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing35s(block: Thing35sActions.() -> Unit) =
	block(Thing35sActions())

@DSL
class Thing35sActions {
	@CheckResult
	private fun insideThing35s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing35s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing35s(withId(R.id.repo_view)).click() }

	fun thing35(atPosition: Int, block: Thing35Actions.() -> Unit) =
		block(Thing35Actions(atPosition))

	@DSL
	class Thing35Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing35Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing35Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing35Item(withId(R.id.repo_view)).click() }
	}
}
