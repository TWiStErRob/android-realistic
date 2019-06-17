package net.twisterrob.real.app

import android.support.test.filters.LargeTest
import net.twisterrob.real.app.repo.RepoDSL
import net.twisterrob.real.test.UiTest
import net.twisterrob.real.test.collaborator.user
import net.twisterrob.real.test.gwen.gwen
import net.twisterrob.real.test.gwen.then
import net.twisterrob.real.test.gwen.whenever
import org.junit.Test
import net.twisterrob.real.test.R as testR

/**
 * @see net.twisterrob.real.repo.RepoActivity
 */
@LargeTest
class RepoActivityTest : UiTest(), RepoDSL {

	@Test
	fun testRepositoryTitle() = gwen {
		whenever {
			user launches { repoScreen("repository-name") }
		}

		then {
			user sees {
				repo {
					title = "repository-name"
				}
			}
		}
	}
}
