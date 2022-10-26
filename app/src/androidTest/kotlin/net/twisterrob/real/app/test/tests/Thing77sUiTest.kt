package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing77.thing77s
import net.twisterrob.real.app.test.dsls.thing77.thing77sScreen
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
class Thing77Test : UiTest() {

	@Test
	fun testThing77_1() = gwen {
		given {
			server stubs {
				get("/thing77") with json(testR.raw.repos)
			}
			user launches { thing77sScreen("thing77") }
		}

		whenever {
			user selects {
				thing77s {
					action1()
					action2()
					action3()
					thing77(atPosition = 4) {
						action4()
					}
					action5()
					thing77(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing77(atPosition = 7) {
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
				thing77s {
					text1 = "thing77 1"
					text2 = "thing77 2"
					text3 = "thing77 3"
					thing77(atPosition = 4) {
						text4 = "thing77 4"
					}
					text5 = "thing77 5"
					thing77(atPosition = 6) {
						text6 = "thing77 6"
						text6 = "thing77 6"
						text6 = "thing77 6"
					}
					thing77(atPosition = 7) {
						text7 = "thing77 7"
						text4 = "thing77 4"
						text7 = "thing77 7"
					}
					text8 = "thing77 8"
				}
			}
		}
	}

	@Test
	fun testThing77_2() = gwen {
		given {
			server stubs {
				get("/thing77") with json(testR.raw.repos)
			}
			user launches { thing77sScreen("thing77") }
		}

		whenever {
			user selects {
				thing77s {
					action1()
					action2()
					action3()
					thing77(atPosition = 4) {
						action4()
					}
					action5()
					thing77(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing77(atPosition = 7) {
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
				thing77s {
					text1 = "thing77 1"
					text2 = "thing77 2"
					text3 = "thing77 3"
					thing77(atPosition = 4) {
						text4 = "thing77 4"
					}
					text5 = "thing77 5"
					thing77(atPosition = 6) {
						text6 = "thing77 6"
						text6 = "thing77 6"
						text6 = "thing77 6"
					}
					thing77(atPosition = 7) {
						text7 = "thing77 7"
						text4 = "thing77 4"
						text7 = "thing77 7"
					}
					text8 = "thing77 8"
				}
			}
		}
	}

	@Test
	fun testThing77_3() = gwen {
		given {
			server stubs {
				get("/thing77") with json(testR.raw.repos)
			}
			user launches { thing77sScreen("thing77") }
		}

		whenever {
			user selects {
				thing77s {
					action1()
					action2()
					action3()
					thing77(atPosition = 4) {
						action4()
					}
					action5()
					thing77(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing77(atPosition = 7) {
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
				thing77s {
					text1 = "thing77 1"
					text2 = "thing77 2"
					text3 = "thing77 3"
					thing77(atPosition = 4) {
						text4 = "thing77 4"
					}
					text5 = "thing77 5"
					thing77(atPosition = 6) {
						text6 = "thing77 6"
						text6 = "thing77 6"
						text6 = "thing77 6"
					}
					thing77(atPosition = 7) {
						text7 = "thing77 7"
						text4 = "thing77 4"
						text7 = "thing77 7"
					}
					text8 = "thing77 8"
				}
			}
		}
	}

	@Test
	fun testThing77_4() = gwen {
		given {
			server stubs {
				get("/thing77") with json(testR.raw.repos)
			}
			user launches { thing77sScreen("thing77") }
		}

		whenever {
			user selects {
				thing77s {
					action1()
					action2()
					action3()
					thing77(atPosition = 4) {
						action4()
					}
					action5()
					thing77(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing77(atPosition = 7) {
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
				thing77s {
					text1 = "thing77 1"
					text2 = "thing77 2"
					text3 = "thing77 3"
					thing77(atPosition = 4) {
						text4 = "thing77 4"
					}
					text5 = "thing77 5"
					thing77(atPosition = 6) {
						text6 = "thing77 6"
						text6 = "thing77 6"
						text6 = "thing77 6"
					}
					thing77(atPosition = 7) {
						text7 = "thing77 7"
						text4 = "thing77 4"
						text7 = "thing77 7"
					}
					text8 = "thing77 8"
				}
			}
		}
	}

	@Test
	fun testThing77_5() = gwen {
		given {
			server stubs {
				get("/thing77") with json(testR.raw.repos)
			}
			user launches { thing77sScreen("thing77") }
		}

		whenever {
			user selects {
				thing77s {
					action1()
					action2()
					action3()
					thing77(atPosition = 4) {
						action4()
					}
					action5()
					thing77(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing77(atPosition = 7) {
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
				thing77s {
					text1 = "thing77 1"
					text2 = "thing77 2"
					text3 = "thing77 3"
					thing77(atPosition = 4) {
						text4 = "thing77 4"
					}
					text5 = "thing77 5"
					thing77(atPosition = 6) {
						text6 = "thing77 6"
						text6 = "thing77 6"
						text6 = "thing77 6"
					}
					thing77(atPosition = 7) {
						text7 = "thing77 7"
						text4 = "thing77 4"
						text7 = "thing77 7"
					}
					text8 = "thing77 8"
				}
			}
		}
	}
}
