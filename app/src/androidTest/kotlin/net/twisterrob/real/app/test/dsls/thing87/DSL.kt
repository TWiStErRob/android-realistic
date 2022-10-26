package net.twisterrob.real.app.test.dsls.thing87

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

fun User.LaunchesActions.thing87sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing87s(block: Thing87sVerifications.() -> Unit) =
	block(Thing87sVerifications())

@DSL
class Thing87sVerifications {
	@CheckResult
	private fun insideThing87s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing87s(withId(R.id.repo_view)).checkText(it) }

	fun thing87(atPosition: Int, block: Thing87Verifications.() -> Unit) =
		block(Thing87Verifications(atPosition))

	@DSL
	class Thing87Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing87Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing87Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing87s(block: Thing87sActions.() -> Unit) =
	block(Thing87sActions())

@DSL
class Thing87sActions {
	@CheckResult
	private fun insideThing87s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing87s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing87s(withId(R.id.repo_view)).click() }

	fun thing87(atPosition: Int, block: Thing87Actions.() -> Unit) =
		block(Thing87Actions(atPosition))

	@DSL
	class Thing87Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing87Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing87Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing87Item(withId(R.id.repo_view)).click() }
	}
}
