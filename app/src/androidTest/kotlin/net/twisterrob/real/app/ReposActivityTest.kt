package net.twisterrob.real.app

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.repos.RepoEndpoints
import net.twisterrob.real.app.repos.ReposDSL
import net.twisterrob.real.test.UiTest
import net.twisterrob.real.test.collaborator.device
import net.twisterrob.real.test.collaborator.server
import net.twisterrob.real.test.collaborator.server.get
import net.twisterrob.real.test.collaborator.server.json
import net.twisterrob.real.test.collaborator.server.with
import net.twisterrob.real.test.collaborator.user
import net.twisterrob.real.test.gwen.given
import net.twisterrob.real.test.gwen.gwen
import net.twisterrob.real.test.gwen.then
import net.twisterrob.real.test.gwen.whenever
import net.twisterrob.real.test.noOtherIntents
import net.twisterrob.real.test.urlInExternalBrowser
import net.twisterrob.real.test.urlsInExternalBrowser
import org.junit.Test
import net.twisterrob.real.test.R as testR

/**
 * @see net.twisterrob.real.repos.ui.ReposActivity
 */
@LargeTest
class ReposActivityTest : UiTest(), ReposDSL {

	@Test
	fun testRepositoryListing() = gwen {
		given {
			server stubs {
				get(RepoEndpoints.repos("twisterrob")) with json(testR.raw.repos)
			}
			user launches { reposScreen() }
		}

		whenever {
			user types { repos { search { query = "twisterrob" } } }
			user selects { repos { search { submit() } } }
		}

		then {
			user sees {
				repos {
					itemCount = 11
					repo(atPosition = 2) {
						title = "android-realistic"
						stars = 3
					}
					repo(atPosition = 7) {
						title = "net.twisterrob.gradle"
						stars = 5
					}
				}
			}
		}
	}

	@Test
	fun testOpenExternalLink() = gwen {
		given {
			server stubs {
				get(RepoEndpoints.repos("twisterrob")) with json(testR.raw.repos)
			}
			user launches { reposScreen() }
			user types { repos { search { query = "twisterrob"; submit() } } }
			device expects { urlsInExternalBrowser() }
		}

		whenever {
			user selects {
				repos {
					onRepo(atPosition = 4) {
						viewRepositoryInBrowser()
					}
				}
			}
		}

		then {
			device observes {
				urlInExternalBrowser("https://github.com/TWiStErRob/glide-support")
				noOtherIntents()
			}
		}
	}
}
