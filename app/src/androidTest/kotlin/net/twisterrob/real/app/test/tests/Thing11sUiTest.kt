package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing11.thing11s
import net.twisterrob.real.app.test.dsls.thing11.thing11sScreen
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
class Thing11Test : UiTest() {

	@Test
	fun testThing11_1() = gwen {
		given {
			server stubs {
				get("/thing11") with json(testR.raw.repos)
			}
			user launches { thing11sScreen("thing11") }
		}

		whenever {
			user selects {
				thing11s {
					action1()
					action2()
					action3()
					thing11(atPosition = 4) {
						action4()
					}
					action5()
					thing11(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing11(atPosition = 7) {
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
				thing11s {
					text1 = "thing11 1"
					text2 = "thing11 2"
					text3 = "thing11 3"
					thing11(atPosition = 4) {
						text4 = "thing11 4"
					}
					text5 = "thing11 5"
					thing11(atPosition = 6) {
						text6 = "thing11 6"
						text6 = "thing11 6"
						text6 = "thing11 6"
					}
					thing11(atPosition = 7) {
						text7 = "thing11 7"
						text4 = "thing11 4"
						text7 = "thing11 7"
					}
					text8 = "thing11 8"
				}
			}
		}
	}

	@Test
	fun testThing11_2() = gwen {
		given {
			server stubs {
				get("/thing11") with json(testR.raw.repos)
			}
			user launches { thing11sScreen("thing11") }
		}

		whenever {
			user selects {
				thing11s {
					action1()
					action2()
					action3()
					thing11(atPosition = 4) {
						action4()
					}
					action5()
					thing11(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing11(atPosition = 7) {
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
				thing11s {
					text1 = "thing11 1"
					text2 = "thing11 2"
					text3 = "thing11 3"
					thing11(atPosition = 4) {
						text4 = "thing11 4"
					}
					text5 = "thing11 5"
					thing11(atPosition = 6) {
						text6 = "thing11 6"
						text6 = "thing11 6"
						text6 = "thing11 6"
					}
					thing11(atPosition = 7) {
						text7 = "thing11 7"
						text4 = "thing11 4"
						text7 = "thing11 7"
					}
					text8 = "thing11 8"
				}
			}
		}
	}

	@Test
	fun testThing11_3() = gwen {
		given {
			server stubs {
				get("/thing11") with json(testR.raw.repos)
			}
			user launches { thing11sScreen("thing11") }
		}

		whenever {
			user selects {
				thing11s {
					action1()
					action2()
					action3()
					thing11(atPosition = 4) {
						action4()
					}
					action5()
					thing11(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing11(atPosition = 7) {
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
				thing11s {
					text1 = "thing11 1"
					text2 = "thing11 2"
					text3 = "thing11 3"
					thing11(atPosition = 4) {
						text4 = "thing11 4"
					}
					text5 = "thing11 5"
					thing11(atPosition = 6) {
						text6 = "thing11 6"
						text6 = "thing11 6"
						text6 = "thing11 6"
					}
					thing11(atPosition = 7) {
						text7 = "thing11 7"
						text4 = "thing11 4"
						text7 = "thing11 7"
					}
					text8 = "thing11 8"
				}
			}
		}
	}

	@Test
	fun testThing11_4() = gwen {
		given {
			server stubs {
				get("/thing11") with json(testR.raw.repos)
			}
			user launches { thing11sScreen("thing11") }
		}

		whenever {
			user selects {
				thing11s {
					action1()
					action2()
					action3()
					thing11(atPosition = 4) {
						action4()
					}
					action5()
					thing11(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing11(atPosition = 7) {
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
				thing11s {
					text1 = "thing11 1"
					text2 = "thing11 2"
					text3 = "thing11 3"
					thing11(atPosition = 4) {
						text4 = "thing11 4"
					}
					text5 = "thing11 5"
					thing11(atPosition = 6) {
						text6 = "thing11 6"
						text6 = "thing11 6"
						text6 = "thing11 6"
					}
					thing11(atPosition = 7) {
						text7 = "thing11 7"
						text4 = "thing11 4"
						text7 = "thing11 7"
					}
					text8 = "thing11 8"
				}
			}
		}
	}

	@Test
	fun testThing11_5() = gwen {
		given {
			server stubs {
				get("/thing11") with json(testR.raw.repos)
			}
			user launches { thing11sScreen("thing11") }
		}

		whenever {
			user selects {
				thing11s {
					action1()
					action2()
					action3()
					thing11(atPosition = 4) {
						action4()
					}
					action5()
					thing11(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing11(atPosition = 7) {
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
				thing11s {
					text1 = "thing11 1"
					text2 = "thing11 2"
					text3 = "thing11 3"
					thing11(atPosition = 4) {
						text4 = "thing11 4"
					}
					text5 = "thing11 5"
					thing11(atPosition = 6) {
						text6 = "thing11 6"
						text6 = "thing11 6"
						text6 = "thing11 6"
					}
					thing11(atPosition = 7) {
						text7 = "thing11 7"
						text4 = "thing11 4"
						text7 = "thing11 7"
					}
					text8 = "thing11 8"
				}
			}
		}
	}
}
