package net.twisterrob.real.app.test.dsls.__name__

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

fun User.LaunchesActions.__name__sScreen(arg: String) {
	println(arg)
}

fun User.SeesAssertions.__name__s(block: __Name__sVerifications.() -> Unit) =
	block(__Name__sVerifications())

@DSL
class __Name__sVerifications {
	@CheckResult
	private fun inside__Name__s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	var text1: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text2: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text3: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text4: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text5: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text6: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text7: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text8: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }
	var text9: String by setOnly { inside__Name__s(withId(R.id.repo_view)).checkText(it) }

	fun __name__(atPosition: Int, block: __Name__Verifications.() -> Unit) =
		block(__Name__Verifications(atPosition))

	@DSL
	class __Name__Verifications(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun inside__Name__Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		var text1: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text2: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text3: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text4: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text5: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text6: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text7: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text8: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
		var text9: String by setOnly { inside__Name__Item(withId(R.id.repo_view)).checkText(it) }
	}
}

fun User.SelectsActions.__name__s(block: __Name__sActions.() -> Unit) =
	block(__Name__sActions())

@DSL
class __Name__sActions {
	@CheckResult
	private fun inside__Name__s(matcher: Matcher<View>) =
		seesView(allOf(isDescendantOfA(withId(R.id.repos_list)), matcher))

	fun action1() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action2() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action3() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action4() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action5() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action6() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action7() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action8() { inside__Name__s(withId(R.id.repo_view)).click() }
	fun action9() { inside__Name__s(withId(R.id.repo_view)).click() }

	fun __name__(atPosition: Int, block: __Name__Actions.() -> Unit) =
		block(__Name__Actions(atPosition))

	@DSL
	class __Name__Actions(
		@IntRange(from = 0)
		private val position: Int
	) {
		@CheckResult
		private fun inside__Name__Item(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, position, matcher)

		fun action1() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action2() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action3() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action4() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action5() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action6() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action7() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action8() { inside__Name__Item(withId(R.id.repo_view)).click() }
		fun action9() { inside__Name__Item(withId(R.id.repo_view)).click() }
	}
}
