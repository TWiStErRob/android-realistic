package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing19.thing19s
import net.twisterrob.real.app.test.dsls.thing19.thing19sScreen
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
class Thing19Test : UiTest() {

	@Test
	fun testThing19_1() = gwen {
		given {
			server stubs {
				get("/thing19") with json(testR.raw.repos)
			}
			user launches { thing19sScreen("thing19") }
		}

		whenever {
			user selects {
				thing19s {
					action1()
					action2()
					action3()
					thing19(atPosition = 4) {
						action4()

					}
					action5()
					thing19(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing19(atPosition = 7) {
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
				thing19s {
					text1 = "thing19 1"
					text2 = "thing19 2"
					text3 = "thing19 3"
					thing19(atPosition = 4) {
						text4 = "thing19 4"
					}
					text5 = "thing19 5"
					thing19(atPosition = 6) {
						text6 = "thing19 6"
						text6 = "thing19 6"
						text6 = "thing19 6"
					}
					thing19(atPosition = 7) {
						text7 = "thing19 7"
						text4 = "thing19 4"
						text7 = "thing19 7"
					}
					text8 = "thing19 8"
				}
			}
		}
	}

	@Test
	fun testThing19_2() = gwen {
		given {
			server stubs {
				get("/thing19") with json(testR.raw.repos)
			}
			user launches { thing19sScreen("thing19") }
		}

		whenever {
			user selects {
				thing19s {
					action1()
					action2()
					action3()
					thing19(atPosition = 4) {
						action4()
					}
					action5()
					thing19(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing19(atPosition = 7) {
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
				thing19s {
					text1 = "thing19 1"
					text2 = "thing19 2"
					text3 = "thing19 3"
					thing19(atPosition = 4) {
						text4 = "thing19 4"
					}
					text5 = "thing19 5"
					thing19(atPosition = 6) {
						text6 = "thing19 6"
						text6 = "thing19 6"
						text6 = "thing19 6"
					}
					thing19(atPosition = 7) {
						text7 = "thing19 7"
						text4 = "thing19 4"
						text7 = "thing19 7"
					}
					text8 = "thing19 8"
				}
			}
		}
	}

	@Test
	fun testThing19_3() = gwen {
		given {
			server stubs {
				get("/thing19") with json(testR.raw.repos)
			}
			user launches { thing19sScreen("thing19") }
		}

		whenever {
			user selects {
				thing19s {
					action1()
					action2()
					action3()
					thing19(atPosition = 4) {
						action4()
					}
					action5()
					thing19(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing19(atPosition = 7) {
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
				thing19s {
					text1 = "thing19 1"
					text2 = "thing19 2"
					text3 = "thing19 3"
					thing19(atPosition = 4) {
						text4 = "thing19 4"
					}
					text5 = "thing19 5"
					thing19(atPosition = 6) {
						text6 = "thing19 6"
						text6 = "thing19 6"
						text6 = "thing19 6"
					}
					thing19(atPosition = 7) {
						text7 = "thing19 7"
						text4 = "thing19 4"
						text7 = "thing19 7"
					}
					text8 = "thing19 8"
				}
			}
		}
	}

	@Test
	fun testThing19_4() = gwen {
		given {
			server stubs {
				get("/thing19") with json(testR.raw.repos)
			}
			user launches { thing19sScreen("thing19") }
		}

		whenever {
			user selects {
				thing19s {
					action1()
					action2()
					action3()
					thing19(atPosition = 4) {
						action4()
					}
					action5()
					thing19(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing19(atPosition = 7) {
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
				thing19s {
					text1 = "thing19 1"
					text2 = "thing19 2"
					text3 = "thing19 3"
					thing19(atPosition = 4) {
						text4 = "thing19 4"
					}
					text5 = "thing19 5"
					thing19(atPosition = 6) {
						text6 = "thing19 6"
						text6 = "thing19 6"
						text6 = "thing19 6"
					}
					thing19(atPosition = 7) {
						text7 = "thing19 7"
						text4 = "thing19 4"
						text7 = "thing19 7"
					}
					text8 = "thing19 8"
				}
			}
		}
	}

	@Test
	fun testThing19_5() = gwen {
		given {
			server stubs {
				get("/thing19") with json(testR.raw.repos)
			}
			user launches { thing19sScreen("thing19") }
		}

		whenever {
			user selects {
				thing19s {
					action1()
					action2()
					action3()
					thing19(atPosition = 4) {
						action4()
					}
					action5()
					thing19(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing19(atPosition = 7) {
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
				thing19s {
					text1 = "thing19 1"
					text2 = "thing19 2"
					text3 = "thing19 3"
					thing19(atPosition = 4) {
						text4 = "thing19 4"
					}
					text5 = "thing19 5"
					thing19(atPosition = 6) {
						text6 = "thing19 6"
						text6 = "thing19 6"
						text6 = "thing19 6"
					}
					thing19(atPosition = 7) {
						text7 = "thing19 7"
						text4 = "thing19 4"
						text7 = "thing19 7"
					}
					text8 = "thing19 8"
				}
			}
		}
	}
}
