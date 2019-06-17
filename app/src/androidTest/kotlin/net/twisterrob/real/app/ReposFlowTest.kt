package net.twisterrob.real.app

import android.support.test.filters.LargeTest
import net.twisterrob.real.app.repo.RepoDSL
import net.twisterrob.real.app.repos.RepoEndpoints
import net.twisterrob.real.app.repos.ReposDSL
import net.twisterrob.real.test.UiTest
import net.twisterrob.real.test.collaborator.server
import net.twisterrob.real.test.collaborator.server.get
import net.twisterrob.real.test.collaborator.server.json
import net.twisterrob.real.test.collaborator.server.with
import net.twisterrob.real.test.collaborator.user
import net.twisterrob.real.test.gwen.given
import net.twisterrob.real.test.gwen.gwen
import net.twisterrob.real.test.gwen.then
import net.twisterrob.real.test.gwen.whenever
import org.junit.Test
import net.twisterrob.real.test.R as testR

@LargeTest
class ReposFlowTest : UiTest(), ReposDSL, RepoDSL {

	@Test
	fun testRepositoryOpenNavigation() = gwen {
		given {
			server stubs {
				get(RepoEndpoints.repos("twisterrob")) with json(testR.raw.repos)
			}
			user launches { reposScreen() }
		}

		whenever {
			user selects {
				repos {
					search {
						query = "twisterrob"
						submit()
					}
					repo(atPosition = 2)
				}
			}
		}

		then {
			user sees {
				repo {
					title = "android-realistic"
				}
			}
		}
	}
}
