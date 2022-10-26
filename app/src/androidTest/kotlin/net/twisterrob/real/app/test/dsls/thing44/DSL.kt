package net.twisterrob.real.app.test.dsls.thing44

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

fun User.LaunchesActions.thing44sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing44s(block: Thing44sVerifications.() -> Unit) =
	block(Thing44sVerifications())

@DSL
class Thing44sVerifications {
	@CheckResult
	private fun insideThing44s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing44s(withId(R.id.repo_view)).checkText(it) }

	fun thing44(atPosition: Int, block: Thing44Verifications.() -> Unit) =
		block(Thing44Verifications(atPosition))

	@DSL
	class Thing44Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing44Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing44Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing44s(block: Thing44sActions.() -> Unit) =
	block(Thing44sActions())

@DSL
class Thing44sActions {
	@CheckResult
	private fun insideThing44s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing44s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing44s(withId(R.id.repo_view)).click() }

	fun thing44(atPosition: Int, block: Thing44Actions.() -> Unit) =
		block(Thing44Actions(atPosition))

	@DSL
	class Thing44Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing44Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing44Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing44Item(withId(R.id.repo_view)).click() }
	}
}
