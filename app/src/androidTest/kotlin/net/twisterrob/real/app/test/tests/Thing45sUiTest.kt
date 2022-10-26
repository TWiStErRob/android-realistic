package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing45.thing45s
import net.twisterrob.real.app.test.dsls.thing45.thing45sScreen
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
class Thing45Test : UiTest() {

	@Test
	fun testThing45_1() = gwen {
		given {
			server stubs {
				get("/thing45") with json(testR.raw.repos)
			}
			user launches { thing45sScreen("thing45") }
		}

		whenever {
			user selects {
				thing45s {
					action1()
					action2()
					action3()
					thing45(atPosition = 4) {
						action4()
					}
					action5()
					thing45(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing45(atPosition = 7) {
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
				thing45s {
					text1 = "thing45 1"
					text2 = "thing45 2"
					text3 = "thing45 3"
					thing45(atPosition = 4) {
						text4 = "thing45 4"
					}
					text5 = "thing45 5"
					thing45(atPosition = 6) {
						text6 = "thing45 6"
						text6 = "thing45 6"
						text6 = "thing45 6"
					}
					thing45(atPosition = 7) {
						text7 = "thing45 7"
						text4 = "thing45 4"
						text7 = "thing45 7"
					}
					text8 = "thing45 8"
				}
			}
		}
	}

	@Test
	fun testThing45_2() = gwen {
		given {
			server stubs {
				get("/thing45") with json(testR.raw.repos)
			}
			user launches { thing45sScreen("thing45") }
		}

		whenever {
			user selects {
				thing45s {
					action1()
					action2()
					action3()
					thing45(atPosition = 4) {
						action4()
					}
					action5()
					thing45(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing45(atPosition = 7) {
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
				thing45s {
					text1 = "thing45 1"
					text2 = "thing45 2"
					text3 = "thing45 3"
					thing45(atPosition = 4) {
						text4 = "thing45 4"
					}
					text5 = "thing45 5"
					thing45(atPosition = 6) {
						text6 = "thing45 6"
						text6 = "thing45 6"
						text6 = "thing45 6"
					}
					thing45(atPosition = 7) {
						text7 = "thing45 7"
						text4 = "thing45 4"
						text7 = "thing45 7"
					}
					text8 = "thing45 8"
				}
			}
		}
	}

	@Test
	fun testThing45_3() = gwen {
		given {
			server stubs {
				get("/thing45") with json(testR.raw.repos)
			}
			user launches { thing45sScreen("thing45") }
		}

		whenever {
			user selects {
				thing45s {
					action1()
					action2()
					action3()
					thing45(atPosition = 4) {
						action4()
					}
					action5()
					thing45(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing45(atPosition = 7) {
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
				thing45s {
					text1 = "thing45 1"
					text2 = "thing45 2"
					text3 = "thing45 3"
					thing45(atPosition = 4) {
						text4 = "thing45 4"
					}
					text5 = "thing45 5"
					thing45(atPosition = 6) {
						text6 = "thing45 6"
						text6 = "thing45 6"
						text6 = "thing45 6"
					}
					thing45(atPosition = 7) {
						text7 = "thing45 7"
						text4 = "thing45 4"
						text7 = "thing45 7"
					}
					text8 = "thing45 8"
				}
			}
		}
	}

	@Test
	fun testThing45_4() = gwen {
		given {
			server stubs {
				get("/thing45") with json(testR.raw.repos)
			}
			user launches { thing45sScreen("thing45") }
		}

		whenever {
			user selects {
				thing45s {
					action1()
					action2()
					action3()
					thing45(atPosition = 4) {
						action4()
					}
					action5()
					thing45(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing45(atPosition = 7) {
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
				thing45s {
					text1 = "thing45 1"
					text2 = "thing45 2"
					text3 = "thing45 3"
					thing45(atPosition = 4) {
						text4 = "thing45 4"
					}
					text5 = "thing45 5"
					thing45(atPosition = 6) {
						text6 = "thing45 6"
						text6 = "thing45 6"
						text6 = "thing45 6"
					}
					thing45(atPosition = 7) {
						text7 = "thing45 7"
						text4 = "thing45 4"
						text7 = "thing45 7"
					}
					text8 = "thing45 8"
				}
			}
		}
	}

	@Test
	fun testThing45_5() = gwen {
		given {
			server stubs {
				get("/thing45") with json(testR.raw.repos)
			}
			user launches { thing45sScreen("thing45") }
		}

		whenever {
			user selects {
				thing45s {
					action1()
					action2()
					action3()
					thing45(atPosition = 4) {
						action4()
					}
					action5()
					thing45(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing45(atPosition = 7) {
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
				thing45s {
					text1 = "thing45 1"
					text2 = "thing45 2"
					text3 = "thing45 3"
					thing45(atPosition = 4) {
						text4 = "thing45 4"
					}
					text5 = "thing45 5"
					thing45(atPosition = 6) {
						text6 = "thing45 6"
						text6 = "thing45 6"
						text6 = "thing45 6"
					}
					thing45(atPosition = 7) {
						text7 = "thing45 7"
						text4 = "thing45 4"
						text7 = "thing45 7"
					}
					text8 = "thing45 8"
				}
			}
		}
	}
}
