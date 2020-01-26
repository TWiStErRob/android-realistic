package net.twisterrob.real.app.repos

import android.view.View
import androidx.annotation.CheckResult
import androidx.annotation.IntRange
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.anyIntent
import androidx.test.espresso.matcher.ViewMatchers.withId
import net.twisterrob.real.app.R
import net.twisterrob.real.repos.ReposScreenFactoryImpl
import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.appContext
import net.twisterrob.real.test.appResources
import net.twisterrob.real.test.check
import net.twisterrob.real.test.checkText
import net.twisterrob.real.test.click
import net.twisterrob.real.test.clickItem
import net.twisterrob.real.test.collaborator.User
import net.twisterrob.real.test.enterText
import net.twisterrob.real.test.hasAdapterSize
import net.twisterrob.real.test.idleOnRecyclerView
import net.twisterrob.real.test.launchIntent
import net.twisterrob.real.test.onItemView
import net.twisterrob.real.test.onView
import net.twisterrob.real.test.setOnly
import org.hamcrest.Matcher

interface ReposDSL {

	fun User.LaunchesActions.reposScreen() {
		val activity = launchIntent(ReposScreenFactoryImpl(appContext).launch())
		Intents.intended(anyIntent()) // verify just launched intent so assertNoUnverifiedIntents will work
		idleOnRecyclerView(activity.findViewById(R.id.repos_list))
	}

	fun User.TypesActions.repos(block: ReposActions.() -> Unit) =
		block(ReposActions())

	fun User.SelectsActions.repos(block: ReposActions.() -> Unit) =
		block(ReposActions())

	@DSL
	class ReposActions {

		fun search(block: RepoSearchActions.() -> Unit) =
			block(RepoSearchActions())

		fun repo(@IntRange(from = 0) atPosition: Int) {
			onView(R.id.repos_list).clickItem(atPosition)
		}

		fun onRepo(@IntRange(from = 0) atPosition: Int, block: RepoItemActions.() -> Unit) =
			block(RepoItemActions(atPosition))
	}

	@DSL
	class RepoSearchActions {

		var query: String by setOnly {
			onView(R.id.repos_username).enterText(it)
		}

		fun submit() {
			onView(R.id.repos_search).click()
		}
	}

	@DSL
	class RepoItemActions(
		@IntRange(from = 0)
		private val itemPosition: Int
	) {

		@CheckResult
		private fun insideRepoItem(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, itemPosition, matcher)

		fun viewRepositoryInBrowser() {
			insideRepoItem(withId(R.id.repo_view))
				.click()
		}
	}

	fun User.SeesAssertions.repos(block: ReposVerifications.() -> Unit) =
		block(ReposVerifications())

	@DSL
	class ReposVerifications {

		fun repo(@IntRange(from = 0) atPosition: Int, block: RepoItemVerifications.() -> Unit) =
			block(RepoItemVerifications(atPosition))

		var itemCount: Int by setOnly {
			onView(R.id.repos_list).check(hasAdapterSize(it))
		}
	}

	@DSL
	class RepoItemVerifications(
		@IntRange(from = 0)
		private val itemPosition: Int
	) {

		@CheckResult
		private fun insideRepoItem(matcher: Matcher<View>) =
			onItemView(R.id.repos_list, itemPosition, matcher)

		var title: String by setOnly {
			insideRepoItem(withId(R.id.repo_name))
				.checkText(it)
		}

		var stars: Int by setOnly {
			insideRepoItem(withId(R.id.repo_stars))
				.checkText(appResources.getString(R.string.repos_item_stars, it))
		}
	}
}
