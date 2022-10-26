package net.twisterrob.real.app.test.dsls.thing83

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

fun User.LaunchesActions.thing83sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing83s(block: Thing83sVerifications.() -> Unit) =
	block(Thing83sVerifications())

@DSL
class Thing83sVerifications {
	@CheckResult
	private fun insideThing83s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing83s(withId(R.id.repo_view)).checkText(it) }

	fun thing83(atPosition: Int, block: Thing83Verifications.() -> Unit) =
		block(Thing83Verifications(atPosition))

	@DSL
	class Thing83Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing83Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing83Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing83s(block: Thing83sActions.() -> Unit) =
	block(Thing83sActions())

@DSL
class Thing83sActions {
	@CheckResult
	private fun insideThing83s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing83s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing83s(withId(R.id.repo_view)).click() }

	fun thing83(atPosition: Int, block: Thing83Actions.() -> Unit) =
		block(Thing83Actions(atPosition))

	@DSL
	class Thing83Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing83Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing83Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing83Item(withId(R.id.repo_view)).click() }
	}
}
