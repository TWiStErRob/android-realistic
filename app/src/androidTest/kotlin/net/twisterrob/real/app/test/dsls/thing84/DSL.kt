package net.twisterrob.real.app.test.dsls.thing84

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

fun User.LaunchesActions.thing84sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing84s(block: Thing84sVerifications.() -> Unit) =
	block(Thing84sVerifications())

@DSL
class Thing84sVerifications {
	@CheckResult
	private fun insideThing84s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing84s(withId(R.id.repo_view)).checkText(it) }

	fun thing84(atPosition: Int, block: Thing84Verifications.() -> Unit) =
		block(Thing84Verifications(atPosition))

	@DSL
	class Thing84Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing84Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing84Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing84s(block: Thing84sActions.() -> Unit) =
	block(Thing84sActions())

@DSL
class Thing84sActions {
	@CheckResult
	private fun insideThing84s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing84s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing84s(withId(R.id.repo_view)).click() }

	fun thing84(atPosition: Int, block: Thing84Actions.() -> Unit) =
		block(Thing84Actions(atPosition))

	@DSL
	class Thing84Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing84Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing84Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing84Item(withId(R.id.repo_view)).click() }
	}
}
