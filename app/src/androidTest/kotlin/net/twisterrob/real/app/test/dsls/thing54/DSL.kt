package net.twisterrob.real.app.test.dsls.thing54

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

fun User.LaunchesActions.thing54sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing54s(block: Thing54sVerifications.() -> Unit) =
	block(Thing54sVerifications())

@DSL
class Thing54sVerifications {
	@CheckResult
	private fun insideThing54s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing54s(withId(R.id.repo_view)).checkText(it) }

	fun thing54(atPosition: Int, block: Thing54Verifications.() -> Unit) =
		block(Thing54Verifications(atPosition))

	@DSL
	class Thing54Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing54Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing54Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing54s(block: Thing54sActions.() -> Unit) =
	block(Thing54sActions())

@DSL
class Thing54sActions {
	@CheckResult
	private fun insideThing54s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing54s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing54s(withId(R.id.repo_view)).click() }

	fun thing54(atPosition: Int, block: Thing54Actions.() -> Unit) =
		block(Thing54Actions(atPosition))

	@DSL
	class Thing54Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing54Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing54Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing54Item(withId(R.id.repo_view)).click() }
	}
}
