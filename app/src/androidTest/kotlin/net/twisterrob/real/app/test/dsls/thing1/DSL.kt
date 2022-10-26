package net.twisterrob.real.app.test.dsls.thing1

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

fun User.LaunchesActions.thing1sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing1s(block: Thing1sVerifications.() -> Unit) =
	block(Thing1sVerifications())

@DSL
class Thing1sVerifications {
	@CheckResult
	private fun insideThing1s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing1s(withId(R.id.repo_view)).checkText(it) }

	fun thing1(atPosition: Int, block: Thing1Verifications.() -> Unit) =
		block(Thing1Verifications(atPosition))

	@DSL
	class Thing1Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing1Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing1Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing1s(block: Thing1sActions.() -> Unit) =
	block(Thing1sActions())

@DSL
class Thing1sActions {
	@CheckResult
	private fun insideThing1s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing1s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing1s(withId(R.id.repo_view)).click() }

	fun thing1(atPosition: Int, block: Thing1Actions.() -> Unit) =
		block(Thing1Actions(atPosition))

	@DSL
	class Thing1Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing1Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing1Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing1Item(withId(R.id.repo_view)).click() }
	}
}
