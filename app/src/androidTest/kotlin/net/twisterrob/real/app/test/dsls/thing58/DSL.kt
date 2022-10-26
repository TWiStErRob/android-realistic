package net.twisterrob.real.app.test.dsls.thing58

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

fun User.LaunchesActions.thing58sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing58s(block: Thing58sVerifications.() -> Unit) =
	block(Thing58sVerifications())

@DSL
class Thing58sVerifications {
	@CheckResult
	private fun insideThing58s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing58s(withId(R.id.repo_view)).checkText(it) }

	fun thing58(atPosition: Int, block: Thing58Verifications.() -> Unit) =
		block(Thing58Verifications(atPosition))

	@DSL
	class Thing58Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing58Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing58Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing58s(block: Thing58sActions.() -> Unit) =
	block(Thing58sActions())

@DSL
class Thing58sActions {
	@CheckResult
	private fun insideThing58s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing58s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing58s(withId(R.id.repo_view)).click() }

	fun thing58(atPosition: Int, block: Thing58Actions.() -> Unit) =
		block(Thing58Actions(atPosition))

	@DSL
	class Thing58Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing58Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing58Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing58Item(withId(R.id.repo_view)).click() }
	}
}
