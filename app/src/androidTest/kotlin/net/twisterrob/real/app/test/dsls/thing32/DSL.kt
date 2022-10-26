package net.twisterrob.real.app.test.dsls.thing32

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

fun User.LaunchesActions.thing32sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing32s(block: Thing32sVerifications.() -> Unit) =
	block(Thing32sVerifications())

@DSL
class Thing32sVerifications {
	@CheckResult
	private fun insideThing32s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing32s(withId(R.id.repo_view)).checkText(it) }

	fun thing32(atPosition: Int, block: Thing32Verifications.() -> Unit) =
		block(Thing32Verifications(atPosition))

	@DSL
	class Thing32Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing32Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing32Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing32s(block: Thing32sActions.() -> Unit) =
	block(Thing32sActions())

@DSL
class Thing32sActions {
	@CheckResult
	private fun insideThing32s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing32s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing32s(withId(R.id.repo_view)).click() }

	fun thing32(atPosition: Int, block: Thing32Actions.() -> Unit) =
		block(Thing32Actions(atPosition))

	@DSL
	class Thing32Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing32Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing32Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing32Item(withId(R.id.repo_view)).click() }
	}
}
