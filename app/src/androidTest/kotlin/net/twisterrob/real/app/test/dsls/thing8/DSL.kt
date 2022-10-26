package net.twisterrob.real.app.test.dsls.thing8

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

fun User.LaunchesActions.thing8sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing8s(block: Thing8sVerifications.() -> Unit) =
	block(Thing8sVerifications())

@DSL
class Thing8sVerifications {
	@CheckResult
	private fun insideThing8s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing8s(withId(R.id.repo_view)).checkText(it) }

	fun thing8(atPosition: Int, block: Thing8Verifications.() -> Unit) =
		block(Thing8Verifications(atPosition))

	@DSL
	class Thing8Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing8Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing8Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing8s(block: Thing8sActions.() -> Unit) =
	block(Thing8sActions())

@DSL
class Thing8sActions {
	@CheckResult
	private fun insideThing8s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing8s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing8s(withId(R.id.repo_view)).click() }

	fun thing8(atPosition: Int, block: Thing8Actions.() -> Unit) =
		block(Thing8Actions(atPosition))

	@DSL
	class Thing8Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing8Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing8Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing8Item(withId(R.id.repo_view)).click() }
	}
}
