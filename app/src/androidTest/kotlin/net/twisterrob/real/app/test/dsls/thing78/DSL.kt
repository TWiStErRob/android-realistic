package net.twisterrob.real.app.test.dsls.thing78

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

fun User.LaunchesActions.thing78sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.thing78s(block: Thing78sVerifications.() -> Unit) =
	block(Thing78sVerifications())

@DSL
class Thing78sVerifications {
	@CheckResult
	private fun insideThing78s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { insideThing78s(withId(R.id.repo_view)).checkText(it) }

	fun thing78(atPosition: Int, block: Thing78Verifications.() -> Unit) =
		block(Thing78Verifications(atPosition))

	@DSL
	class Thing78Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing78Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { insideThing78Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.thing78s(block: Thing78sActions.() -> Unit) =
	block(Thing78sActions())

@DSL
class Thing78sActions {
	@CheckResult
	private fun insideThing78s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action2() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action3() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action4() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action5() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action6() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action7() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action8() { insideThing78s(withId(R.id.repo_view)).click() }
	fun action9() { insideThing78s(withId(R.id.repo_view)).click() }

	fun thing78(atPosition: Int, block: Thing78Actions.() -> Unit) =
		block(Thing78Actions(atPosition))

	@DSL
	class Thing78Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun insideThing78Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action2() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action3() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action4() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action5() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action6() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action7() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action8() { insideThing78Item(withId(R.id.repo_view)).click() }
		fun action9() { insideThing78Item(withId(R.id.repo_view)).click() }
	}
}
