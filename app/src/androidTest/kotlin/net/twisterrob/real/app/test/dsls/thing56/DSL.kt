package net.twisterrob.real.app.test.dsls.thing56

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

fun User.LaunchesActions.thing56sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing56s(block: Thing56sVerifications.() -> Unit) =
	block(Thing56sVerifications())

@DSL
class Thing56sVerifications {
	@CheckResult
	private fun insideThing56s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing56s(withId(R.id.repo_view)).checkText(it) }

	fun thing56(atPosition: Int, block: Thing56Verifications.() -> Unit) =
		block(Thing56Verifications(atPosition))

	@DSL
	class Thing56Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing56Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing56Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing56s(block: Thing56sActions.() -> Unit) =
	block(Thing56sActions())

@DSL
class Thing56sActions {
	@CheckResult
	private fun insideThing56s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing56s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing56s(withId(R.id.repo_view)).click() }

	fun thing56(atPosition: Int, block: Thing56Actions.() -> Unit) =
		block(Thing56Actions(atPosition))

	@DSL
	class Thing56Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing56Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing56Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing56Item(withId(R.id.repo_view)).click() }
	}
}
