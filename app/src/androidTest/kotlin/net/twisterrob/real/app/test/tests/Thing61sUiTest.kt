package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing61.thing61s
import net.twisterrob.real.app.test.dsls.thing61.thing61sScreen
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
class Thing61Test : UiTest() {

	@Test
	fun testThing61_1() = gwen {
		given {
			server stubs {
				get("/thing61") with json(testR.raw.repos)
			}
			user launches { thing61sScreen("thing61") }
		}

		whenever {
			user selects {
				thing61s {
					action1()
					action2()
					action3()
					thing61(atPosition = 4) {
						action4()
					}
					action5()
					thing61(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing61(atPosition = 7) {
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
				thing61s {
					text1 = "thing61 1"
					text2 = "thing61 2"
					text3 = "thing61 3"
					thing61(atPosition = 4) {
						text4 = "thing61 4"
					}
					text5 = "thing61 5"
					thing61(atPosition = 6) {
						text6 = "thing61 6"
						text6 = "thing61 6"
						text6 = "thing61 6"
					}
					thing61(atPosition = 7) {
						text7 = "thing61 7"
						text4 = "thing61 4"
						text7 = "thing61 7"
					}
					text8 = "thing61 8"
				}
			}
		}
	}

	@Test
	fun testThing61_2() = gwen {
		given {
			server stubs {
				get("/thing61") with json(testR.raw.repos)
			}
			user launches { thing61sScreen("thing61") }
		}

		whenever {
			user selects {
				thing61s {
					action1()
					action2()
					action3()
					thing61(atPosition = 4) {
						action4()
					}
					action5()
					thing61(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing61(atPosition = 7) {
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
				thing61s {
					text1 = "thing61 1"
					text2 = "thing61 2"
					text3 = "thing61 3"
					thing61(atPosition = 4) {
						text4 = "thing61 4"
					}
					text5 = "thing61 5"
					thing61(atPosition = 6) {
						text6 = "thing61 6"
						text6 = "thing61 6"
						text6 = "thing61 6"
					}
					thing61(atPosition = 7) {
						text7 = "thing61 7"
						text4 = "thing61 4"
						text7 = "thing61 7"
					}
					text8 = "thing61 8"
				}
			}
		}
	}

	@Test
	fun testThing61_3() = gwen {
		given {
			server stubs {
				get("/thing61") with json(testR.raw.repos)
			}
			user launches { thing61sScreen("thing61") }
		}

		whenever {
			user selects {
				thing61s {
					action1()
					action2()
					action3()
					thing61(atPosition = 4) {
						action4()
					}
					action5()
					thing61(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing61(atPosition = 7) {
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
				thing61s {
					text1 = "thing61 1"
					text2 = "thing61 2"
					text3 = "thing61 3"
					thing61(atPosition = 4) {
						text4 = "thing61 4"
					}
					text5 = "thing61 5"
					thing61(atPosition = 6) {
						text6 = "thing61 6"
						text6 = "thing61 6"
						text6 = "thing61 6"
					}
					thing61(atPosition = 7) {
						text7 = "thing61 7"
						text4 = "thing61 4"
						text7 = "thing61 7"
					}
					text8 = "thing61 8"
				}
			}
		}
	}

	@Test
	fun testThing61_4() = gwen {
		given {
			server stubs {
				get("/thing61") with json(testR.raw.repos)
			}
			user launches { thing61sScreen("thing61") }
		}

		whenever {
			user selects {
				thing61s {
					action1()
					action2()
					action3()
					thing61(atPosition = 4) {
						action4()
					}
					action5()
					thing61(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing61(atPosition = 7) {
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
				thing61s {
					text1 = "thing61 1"
					text2 = "thing61 2"
					text3 = "thing61 3"
					thing61(atPosition = 4) {
						text4 = "thing61 4"
					}
					text5 = "thing61 5"
					thing61(atPosition = 6) {
						text6 = "thing61 6"
						text6 = "thing61 6"
						text6 = "thing61 6"
					}
					thing61(atPosition = 7) {
						text7 = "thing61 7"
						text4 = "thing61 4"
						text7 = "thing61 7"
					}
					text8 = "thing61 8"
				}
			}
		}
	}

	@Test
	fun testThing61_5() = gwen {
		given {
			server stubs {
				get("/thing61") with json(testR.raw.repos)
			}
			user launches { thing61sScreen("thing61") }
		}

		whenever {
			user selects {
				thing61s {
					action1()
					action2()
					action3()
					thing61(atPosition = 4) {
						action4()
					}
					action5()
					thing61(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing61(atPosition = 7) {
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
				thing61s {
					text1 = "thing61 1"
					text2 = "thing61 2"
					text3 = "thing61 3"
					thing61(atPosition = 4) {
						text4 = "thing61 4"
					}
					text5 = "thing61 5"
					thing61(atPosition = 6) {
						text6 = "thing61 6"
						text6 = "thing61 6"
						text6 = "thing61 6"
					}
					thing61(atPosition = 7) {
						text7 = "thing61 7"
						text4 = "thing61 4"
						text7 = "thing61 7"
					}
					text8 = "thing61 8"
				}
			}
		}
	}
}
