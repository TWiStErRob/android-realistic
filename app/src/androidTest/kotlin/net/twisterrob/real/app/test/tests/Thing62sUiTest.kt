package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing62.thing62s
import net.twisterrob.real.app.test.dsls.thing62.thing62sScreen
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
class Thing62Test : UiTest() {

	@Test
	fun testThing62_1() = gwen {
		given {
			server stubs {
				get("/thing62") with json(testR.raw.repos)
			}
			user launches { thing62sScreen("thing62") }
		}

		whenever {
			user selects {
				thing62s {
					action1()
					action2()
					action3()
					thing62(atPosition = 4) {
						action4()
					}
					action5()
					thing62(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing62(atPosition = 7) {
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
				thing62s {
					text1 = "thing62 1"
					text2 = "thing62 2"
					text3 = "thing62 3"
					thing62(atPosition = 4) {
						text4 = "thing62 4"
					}
					text5 = "thing62 5"
					thing62(atPosition = 6) {
						text6 = "thing62 6"
						text6 = "thing62 6"
						text6 = "thing62 6"
					}
					thing62(atPosition = 7) {
						text7 = "thing62 7"
						text4 = "thing62 4"
						text7 = "thing62 7"
					}
					text8 = "thing62 8"
				}
			}
		}
	}

	@Test
	fun testThing62_2() = gwen {
		given {
			server stubs {
				get("/thing62") with json(testR.raw.repos)
			}
			user launches { thing62sScreen("thing62") }
		}

		whenever {
			user selects {
				thing62s {
					action1()
					action2()
					action3()
					thing62(atPosition = 4) {
						action4()
					}
					action5()
					thing62(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing62(atPosition = 7) {
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
				thing62s {
					text1 = "thing62 1"
					text2 = "thing62 2"
					text3 = "thing62 3"
					thing62(atPosition = 4) {
						text4 = "thing62 4"
					}
					text5 = "thing62 5"
					thing62(atPosition = 6) {
						text6 = "thing62 6"
						text6 = "thing62 6"
						text6 = "thing62 6"
					}
					thing62(atPosition = 7) {
						text7 = "thing62 7"
						text4 = "thing62 4"
						text7 = "thing62 7"
					}
					text8 = "thing62 8"
				}
			}
		}
	}

	@Test
	fun testThing62_3() = gwen {
		given {
			server stubs {
				get("/thing62") with json(testR.raw.repos)
			}
			user launches { thing62sScreen("thing62") }
		}

		whenever {
			user selects {
				thing62s {
					action1()
					action2()
					action3()
					thing62(atPosition = 4) {
						action4()
					}
					action5()
					thing62(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing62(atPosition = 7) {
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
				thing62s {
					text1 = "thing62 1"
					text2 = "thing62 2"
					text3 = "thing62 3"
					thing62(atPosition = 4) {
						text4 = "thing62 4"
					}
					text5 = "thing62 5"
					thing62(atPosition = 6) {
						text6 = "thing62 6"
						text6 = "thing62 6"
						text6 = "thing62 6"
					}
					thing62(atPosition = 7) {
						text7 = "thing62 7"
						text4 = "thing62 4"
						text7 = "thing62 7"
					}
					text8 = "thing62 8"
				}
			}
		}
	}

	@Test
	fun testThing62_4() = gwen {
		given {
			server stubs {
				get("/thing62") with json(testR.raw.repos)
			}
			user launches { thing62sScreen("thing62") }
		}

		whenever {
			user selects {
				thing62s {
					action1()
					action2()
					action3()
					thing62(atPosition = 4) {
						action4()
					}
					action5()
					thing62(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing62(atPosition = 7) {
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
				thing62s {
					text1 = "thing62 1"
					text2 = "thing62 2"
					text3 = "thing62 3"
					thing62(atPosition = 4) {
						text4 = "thing62 4"
					}
					text5 = "thing62 5"
					thing62(atPosition = 6) {
						text6 = "thing62 6"
						text6 = "thing62 6"
						text6 = "thing62 6"
					}
					thing62(atPosition = 7) {
						text7 = "thing62 7"
						text4 = "thing62 4"
						text7 = "thing62 7"
					}
					text8 = "thing62 8"
				}
			}
		}
	}

	@Test
	fun testThing62_5() = gwen {
		given {
			server stubs {
				get("/thing62") with json(testR.raw.repos)
			}
			user launches { thing62sScreen("thing62") }
		}

		whenever {
			user selects {
				thing62s {
					action1()
					action2()
					action3()
					thing62(atPosition = 4) {
						action4()
					}
					action5()
					thing62(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing62(atPosition = 7) {
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
				thing62s {
					text1 = "thing62 1"
					text2 = "thing62 2"
					text3 = "thing62 3"
					thing62(atPosition = 4) {
						text4 = "thing62 4"
					}
					text5 = "thing62 5"
					thing62(atPosition = 6) {
						text6 = "thing62 6"
						text6 = "thing62 6"
						text6 = "thing62 6"
					}
					thing62(atPosition = 7) {
						text7 = "thing62 7"
						text4 = "thing62 4"
						text7 = "thing62 7"
					}
					text8 = "thing62 8"
				}
			}
		}
	}
}
