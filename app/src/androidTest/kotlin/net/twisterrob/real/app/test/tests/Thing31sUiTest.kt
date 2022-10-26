package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing31.thing31s
import net.twisterrob.real.app.test.dsls.thing31.thing31sScreen
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
class Thing31Test : UiTest() {

	@Test
	fun testThing31_1() = gwen {
		given {
			server stubs {
				get("/thing31") with json(testR.raw.repos)
			}
			user launches { thing31sScreen("thing31") }
		}

		whenever {
			user selects {
				thing31s {
					action1()
					action2()
					action3()
					thing31(atPosition = 4) {
						action4()
					}
					action5()
					thing31(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing31(atPosition = 7) {
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
				thing31s {
					text1 = "thing31 1"
					text2 = "thing31 2"
					text3 = "thing31 3"
					thing31(atPosition = 4) {
						text4 = "thing31 4"
					}
					text5 = "thing31 5"
					thing31(atPosition = 6) {
						text6 = "thing31 6"
						text6 = "thing31 6"
						text6 = "thing31 6"
					}
					thing31(atPosition = 7) {
						text7 = "thing31 7"
						text4 = "thing31 4"
						text7 = "thing31 7"
					}
					text8 = "thing31 8"
				}
			}
		}
	}

	@Test
	fun testThing31_2() = gwen {
		given {
			server stubs {
				get("/thing31") with json(testR.raw.repos)
			}
			user launches { thing31sScreen("thing31") }
		}

		whenever {
			user selects {
				thing31s {
					action1()
					action2()
					action3()
					thing31(atPosition = 4) {
						action4()
					}
					action5()
					thing31(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing31(atPosition = 7) {
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
				thing31s {
					text1 = "thing31 1"
					text2 = "thing31 2"
					text3 = "thing31 3"
					thing31(atPosition = 4) {
						text4 = "thing31 4"
					}
					text5 = "thing31 5"
					thing31(atPosition = 6) {
						text6 = "thing31 6"
						text6 = "thing31 6"
						text6 = "thing31 6"
					}
					thing31(atPosition = 7) {
						text7 = "thing31 7"
						text4 = "thing31 4"
						text7 = "thing31 7"
					}
					text8 = "thing31 8"
				}
			}
		}
	}

	@Test
	fun testThing31_3() = gwen {
		given {
			server stubs {
				get("/thing31") with json(testR.raw.repos)
			}
			user launches { thing31sScreen("thing31") }
		}

		whenever {
			user selects {
				thing31s {
					action1()
					action2()
					action3()
					thing31(atPosition = 4) {
						action4()
					}
					action5()
					thing31(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing31(atPosition = 7) {
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
				thing31s {
					text1 = "thing31 1"
					text2 = "thing31 2"
					text3 = "thing31 3"
					thing31(atPosition = 4) {
						text4 = "thing31 4"
					}
					text5 = "thing31 5"
					thing31(atPosition = 6) {
						text6 = "thing31 6"
						text6 = "thing31 6"
						text6 = "thing31 6"
					}
					thing31(atPosition = 7) {
						text7 = "thing31 7"
						text4 = "thing31 4"
						text7 = "thing31 7"
					}
					text8 = "thing31 8"
				}
			}
		}
	}

	@Test
	fun testThing31_4() = gwen {
		given {
			server stubs {
				get("/thing31") with json(testR.raw.repos)
			}
			user launches { thing31sScreen("thing31") }
		}

		whenever {
			user selects {
				thing31s {
					action1()
					action2()
					action3()
					thing31(atPosition = 4) {
						action4()
					}
					action5()
					thing31(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing31(atPosition = 7) {
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
				thing31s {
					text1 = "thing31 1"
					text2 = "thing31 2"
					text3 = "thing31 3"
					thing31(atPosition = 4) {
						text4 = "thing31 4"
					}
					text5 = "thing31 5"
					thing31(atPosition = 6) {
						text6 = "thing31 6"
						text6 = "thing31 6"
						text6 = "thing31 6"
					}
					thing31(atPosition = 7) {
						text7 = "thing31 7"
						text4 = "thing31 4"
						text7 = "thing31 7"
					}
					text8 = "thing31 8"
				}
			}
		}
	}

	@Test
	fun testThing31_5() = gwen {
		given {
			server stubs {
				get("/thing31") with json(testR.raw.repos)
			}
			user launches { thing31sScreen("thing31") }
		}

		whenever {
			user selects {
				thing31s {
					action1()
					action2()
					action3()
					thing31(atPosition = 4) {
						action4()
					}
					action5()
					thing31(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing31(atPosition = 7) {
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
				thing31s {
					text1 = "thing31 1"
					text2 = "thing31 2"
					text3 = "thing31 3"
					thing31(atPosition = 4) {
						text4 = "thing31 4"
					}
					text5 = "thing31 5"
					thing31(atPosition = 6) {
						text6 = "thing31 6"
						text6 = "thing31 6"
						text6 = "thing31 6"
					}
					thing31(atPosition = 7) {
						text7 = "thing31 7"
						text4 = "thing31 4"
						text7 = "thing31 7"
					}
					text8 = "thing31 8"
				}
			}
		}
	}
}
