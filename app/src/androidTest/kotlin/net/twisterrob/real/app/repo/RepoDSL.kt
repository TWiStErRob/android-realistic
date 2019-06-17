package net.twisterrob.real.app.repo

import net.twisterrob.real.repo.RepoScreenFactoryImpl
import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.appContext
import net.twisterrob.real.test.assertActivityTitle
import net.twisterrob.real.test.collaborator.User
import net.twisterrob.real.test.launchIntent
import net.twisterrob.real.test.setOnly
import org.hamcrest.Matchers.equalTo

interface RepoDSL {

	fun User.LaunchesActions.repoScreen(repository: String) {
		launchIntent(RepoScreenFactoryImpl(appContext).launch(repository))
	}

	fun User.SeesAssertions.repo(block: RepoVerifications.() -> Unit) =
		block(RepoVerifications())

	@DSL
	class RepoVerifications {

		var title: CharSequence by setOnly {
			assertActivityTitle(equalTo(it))
		}
	}
}
