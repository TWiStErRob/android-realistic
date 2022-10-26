package net.twisterrob.real.app.test.dsls.thing64

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

fun User.LaunchesActions.thing64sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing64s(block: Thing64sVerifications.() -> Unit) =
	block(Thing64sVerifications())

@DSL
class Thing64sVerifications {
	@CheckResult
	private fun insideThing64s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing64s(withId(R.id.repo_view)).checkText(it) }

	fun thing64(atPosition: Int, block: Thing64Verifications.() -> Unit) =
		block(Thing64Verifications(atPosition))

	@DSL
	class Thing64Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing64Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing64Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing64s(block: Thing64sActions.() -> Unit) =
	block(Thing64sActions())

@DSL
class Thing64sActions {
	@CheckResult
	private fun insideThing64s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing64s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing64s(withId(R.id.repo_view)).click() }

	fun thing64(atPosition: Int, block: Thing64Actions.() -> Unit) =
		block(Thing64Actions(atPosition))

	@DSL
	class Thing64Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing64Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing64Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing64Item(withId(R.id.repo_view)).click() }
	}
}
