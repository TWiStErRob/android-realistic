package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing30.thing30s
import net.twisterrob.real.app.test.dsls.thing30.thing30sScreen
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
class Thing30Test : UiTest() {

	@Test
	fun testThing30_1() = gwen {
		given {
			server stubs {
				get("/thing30") with json(testR.raw.repos)
			}
			user launches { thing30sScreen("thing30") }
		}

		whenever {
			user selects {
				thing30s {
					action1()
					action2()
					action3()
					thing30(atPosition = 4) {
						action4()
					}
					action5()
					thing30(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing30(atPosition = 7) {
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
				thing30s {
					text1 = "thing30 1"
					text2 = "thing30 2"
					text3 = "thing30 3"
					thing30(atPosition = 4) {
						text4 = "thing30 4"
					}
					text5 = "thing30 5"
					thing30(atPosition = 6) {
						text6 = "thing30 6"
						text6 = "thing30 6"
						text6 = "thing30 6"
					}
					thing30(atPosition = 7) {
						text7 = "thing30 7"
						text4 = "thing30 4"
						text7 = "thing30 7"
					}
					text8 = "thing30 8"
				}
			}
		}
	}

	@Test
	fun testThing30_2() = gwen {
		given {
			server stubs {
				get("/thing30") with json(testR.raw.repos)
			}
			user launches { thing30sScreen("thing30") }
		}

		whenever {
			user selects {
				thing30s {
					action1()
					action2()
					action3()
					thing30(atPosition = 4) {
						action4()
					}
					action5()
					thing30(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing30(atPosition = 7) {
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
				thing30s {
					text1 = "thing30 1"
					text2 = "thing30 2"
					text3 = "thing30 3"
					thing30(atPosition = 4) {
						text4 = "thing30 4"
					}
					text5 = "thing30 5"
					thing30(atPosition = 6) {
						text6 = "thing30 6"
						text6 = "thing30 6"
						text6 = "thing30 6"
					}
					thing30(atPosition = 7) {
						text7 = "thing30 7"
						text4 = "thing30 4"
						text7 = "thing30 7"
					}
					text8 = "thing30 8"
				}
			}
		}
	}

	@Test
	fun testThing30_3() = gwen {
		given {
			server stubs {
				get("/thing30") with json(testR.raw.repos)
			}
			user launches { thing30sScreen("thing30") }
		}

		whenever {
			user selects {
				thing30s {
					action1()
					action2()
					action3()
					thing30(atPosition = 4) {
						action4()
					}
					action5()
					thing30(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing30(atPosition = 7) {
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
				thing30s {
					text1 = "thing30 1"
					text2 = "thing30 2"
					text3 = "thing30 3"
					thing30(atPosition = 4) {
						text4 = "thing30 4"
					}
					text5 = "thing30 5"
					thing30(atPosition = 6) {
						text6 = "thing30 6"
						text6 = "thing30 6"
						text6 = "thing30 6"
					}
					thing30(atPosition = 7) {
						text7 = "thing30 7"
						text4 = "thing30 4"
						text7 = "thing30 7"
					}
					text8 = "thing30 8"
				}
			}
		}
	}

	@Test
	fun testThing30_4() = gwen {
		given {
			server stubs {
				get("/thing30") with json(testR.raw.repos)
			}
			user launches { thing30sScreen("thing30") }
		}

		whenever {
			user selects {
				thing30s {
					action1()
					action2()
					action3()
					thing30(atPosition = 4) {
						action4()
					}
					action5()
					thing30(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing30(atPosition = 7) {
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
				thing30s {
					text1 = "thing30 1"
					text2 = "thing30 2"
					text3 = "thing30 3"
					thing30(atPosition = 4) {
						text4 = "thing30 4"
					}
					text5 = "thing30 5"
					thing30(atPosition = 6) {
						text6 = "thing30 6"
						text6 = "thing30 6"
						text6 = "thing30 6"
					}
					thing30(atPosition = 7) {
						text7 = "thing30 7"
						text4 = "thing30 4"
						text7 = "thing30 7"
					}
					text8 = "thing30 8"
				}
			}
		}
	}

	@Test
	fun testThing30_5() = gwen {
		given {
			server stubs {
				get("/thing30") with json(testR.raw.repos)
			}
			user launches { thing30sScreen("thing30") }
		}

		whenever {
			user selects {
				thing30s {
					action1()
					action2()
					action3()
					thing30(atPosition = 4) {
						action4()
					}
					action5()
					thing30(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing30(atPosition = 7) {
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
				thing30s {
					text1 = "thing30 1"
					text2 = "thing30 2"
					text3 = "thing30 3"
					thing30(atPosition = 4) {
						text4 = "thing30 4"
					}
					text5 = "thing30 5"
					thing30(atPosition = 6) {
						text6 = "thing30 6"
						text6 = "thing30 6"
						text6 = "thing30 6"
					}
					thing30(atPosition = 7) {
						text7 = "thing30 7"
						text4 = "thing30 4"
						text7 = "thing30 7"
					}
					text8 = "thing30 8"
				}
			}
		}
	}
}
