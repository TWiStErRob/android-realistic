package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing85.thing85s
import net.twisterrob.real.app.test.dsls.thing85.thing85sScreen
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

/**
 * @see net.twisterrob.real.repos.ui.ReposActivity
 */
@LargeTest
class Thing85Test : UiTest() {

	@Test
	fun testThing85_1() = gwen {
		given {
			server stubs {
				get("/thing85") with json(testR.raw.repos)
			}
			user launches { thing85sScreen("thing85") }
		}

		whenever {
			user selects {
				thing85s {
					action1()
					action2()
					action3()
					thing85(atPosition = 4) {
						action4()
					}
					action5()
					thing85(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing85(atPosition = 7) {
						action7()
						action4()
						action7()
					}
					action8()
				}
			}
		}

		then {
			user sees {
				thing85s {
					text1 = "thing85 1"
					text2 = "thing85 2"
					text3 = "thing85 3"
					thing85(atPosition = 4) {
						text4 = "thing85 4"
					}
					text5 = "thing85 5"
					thing85(atPosition = 6) {
						text6 = "thing85 6"
						text6 = "thing85 6"
						text6 = "thing85 6"
					}
					thing85(atPosition = 7) {
						text7 = "thing85 7"
						text4 = "thing85 4"
						text7 = "thing85 7"
					}
					text8 = "thing85 8"
				}
			}
		}
	}

	@Test
	fun testThing85_2() = gwen {
		given {
			server stubs {
				get("/thing85") with json(testR.raw.repos)
			}
			user launches { thing85sScreen("thing85") }
		}

		whenever {
			user selects {
				thing85s {
					action1()
					action2()
					action3()
					thing85(atPosition = 4) {
						action4()
					}
					action5()
					thing85(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing85(atPosition = 7) {
						action7()
						action4()
						action7()
					}
					action8()
				}
			}
		}

		then {
			user sees {
				thing85s {
					text1 = "thing85 1"
					text2 = "thing85 2"
					text3 = "thing85 3"
					thing85(atPosition = 4) {
						text4 = "thing85 4"
					}
					text5 = "thing85 5"
					thing85(atPosition = 6) {
						text6 = "thing85 6"
						text6 = "thing85 6"
						text6 = "thing85 6"
					}
					thing85(atPosition = 7) {
						text7 = "thing85 7"
						text4 = "thing85 4"
						text7 = "thing85 7"
					}
					text8 = "thing85 8"
				}
			}
		}
	}

	@Test
	fun testThing85_3() = gwen {
		given {
			server stubs {
				get("/thing85") with json(testR.raw.repos)
			}
			user launches { thing85sScreen("thing85") }
		}

		whenever {
			user selects {
				thing85s {
					action1()
					action2()
					action3()
					thing85(atPosition = 4) {
						action4()
					}
					action5()
					thing85(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing85(atPosition = 7) {
						action7()
						action4()
						action7()
					}
					action8()
				}
			}
		}

		then {
			user sees {
				thing85s {
					text1 = "thing85 1"
					text2 = "thing85 2"
					text3 = "thing85 3"
					thing85(atPosition = 4) {
						text4 = "thing85 4"
					}
					text5 = "thing85 5"
					thing85(atPosition = 6) {
						text6 = "thing85 6"
						text6 = "thing85 6"
						text6 = "thing85 6"
					}
					thing85(atPosition = 7) {
						text7 = "thing85 7"
						text4 = "thing85 4"
						text7 = "thing85 7"
					}
					text8 = "thing85 8"
				}
			}
		}
	}

	@Test
	fun testThing85_4() = gwen {
		given {
			server stubs {
				get("/thing85") with json(testR.raw.repos)
			}
			user launches { thing85sScreen("thing85") }
		}

		whenever {
			user selects {
				thing85s {
					action1()
					action2()
					action3()
					thing85(atPosition = 4) {
						action4()
					}
					action5()
					thing85(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing85(atPosition = 7) {
						action7()
						action4()
						action7()
					}
					action8()
				}
			}
		}

		then {
			user sees {
				thing85s {
					text1 = "thing85 1"
					text2 = "thing85 2"
					text3 = "thing85 3"
					thing85(atPosition = 4) {
						text4 = "thing85 4"
					}
					text5 = "thing85 5"
					thing85(atPosition = 6) {
						text6 = "thing85 6"
						text6 = "thing85 6"
						text6 = "thing85 6"
					}
					thing85(atPosition = 7) {
						text7 = "thing85 7"
						text4 = "thing85 4"
						text7 = "thing85 7"
					}
					text8 = "thing85 8"
				}
			}
		}
	}

	@Test
	fun testThing85_5() = gwen {
		given {
			server stubs {
				get("/thing85") with json(testR.raw.repos)
			}
			user launches { thing85sScreen("thing85") }
		}

		whenever {
			user selects {
				thing85s {
					action1()
					action2()
					action3()
					thing85(atPosition = 4) {
						action4()
					}
					action5()
					thing85(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing85(atPosition = 7) {
						action7()
						action4()
						action7()
					}
					action8()
				}
			}
		}

		then {
			user sees {
				thing85s {
					text1 = "thing85 1"
					text2 = "thing85 2"
					text3 = "thing85 3"
					thing85(atPosition = 4) {
						text4 = "thing85 4"
					}
					text5 = "thing85 5"
					thing85(atPosition = 6) {
						text6 = "thing85 6"
						text6 = "thing85 6"
						text6 = "thing85 6"
					}
					thing85(atPosition = 7) {
						text7 = "thing85 7"
						text4 = "thing85 4"
						text7 = "thing85 7"
					}
					text8 = "thing85 8"
				}
			}
		}
	}
}
