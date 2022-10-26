package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing21.thing21s
import net.twisterrob.real.app.test.dsls.thing21.thing21sScreen
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
class Thing21Test : UiTest() {

	@Test
	fun testThing21_1() = gwen {
		given {
			server stubs {
				get("/thing21") with json(testR.raw.repos)
			}
			user launches { thing21sScreen("thing21") }
		}

		whenever {
			user selects {
				thing21s {
					action1()
					action2()
					action3()
					thing21(atPosition = 4) {
						action4()
					}
					action5()
					thing21(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing21(atPosition = 7) {
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
				thing21s {
					text1 = "thing21 1"
					text2 = "thing21 2"
					text3 = "thing21 3"
					thing21(atPosition = 4) {
						text4 = "thing21 4"
					}
					text5 = "thing21 5"
					thing21(atPosition = 6) {
						text6 = "thing21 6"
						text6 = "thing21 6"
						text6 = "thing21 6"
					}
					thing21(atPosition = 7) {
						text7 = "thing21 7"
						text4 = "thing21 4"
						text7 = "thing21 7"
					}
					text8 = "thing21 8"
				}
			}
		}
	}

	@Test
	fun testThing21_2() = gwen {
		given {
			server stubs {
				get("/thing21") with json(testR.raw.repos)
			}
			user launches { thing21sScreen("thing21") }
		}

		whenever {
			user selects {
				thing21s {
					action1()
					action2()
					action3()
					thing21(atPosition = 4) {
						action4()
					}
					action5()
					thing21(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing21(atPosition = 7) {
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
				thing21s {
					text1 = "thing21 1"
					text2 = "thing21 2"
					text3 = "thing21 3"
					thing21(atPosition = 4) {
						text4 = "thing21 4"
					}
					text5 = "thing21 5"
					thing21(atPosition = 6) {
						text6 = "thing21 6"
						text6 = "thing21 6"
						text6 = "thing21 6"
					}
					thing21(atPosition = 7) {
						text7 = "thing21 7"
						text4 = "thing21 4"
						text7 = "thing21 7"
					}
					text8 = "thing21 8"
				}
			}
		}
	}

	@Test
	fun testThing21_3() = gwen {
		given {
			server stubs {
				get("/thing21") with json(testR.raw.repos)
			}
			user launches { thing21sScreen("thing21") }
		}

		whenever {
			user selects {
				thing21s {
					action1()
					action2()
					action3()
					thing21(atPosition = 4) {
						action4()
					}
					action5()
					thing21(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing21(atPosition = 7) {
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
				thing21s {
					text1 = "thing21 1"
					text2 = "thing21 2"
					text3 = "thing21 3"
					thing21(atPosition = 4) {
						text4 = "thing21 4"
					}
					text5 = "thing21 5"
					thing21(atPosition = 6) {
						text6 = "thing21 6"
						text6 = "thing21 6"
						text6 = "thing21 6"
					}
					thing21(atPosition = 7) {
						text7 = "thing21 7"
						text4 = "thing21 4"
						text7 = "thing21 7"
					}
					text8 = "thing21 8"
				}
			}
		}
	}

	@Test
	fun testThing21_4() = gwen {
		given {
			server stubs {
				get("/thing21") with json(testR.raw.repos)
			}
			user launches { thing21sScreen("thing21") }
		}

		whenever {
			user selects {
				thing21s {
					action1()
					action2()
					action3()
					thing21(atPosition = 4) {
						action4()
					}
					action5()
					thing21(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing21(atPosition = 7) {
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
				thing21s {
					text1 = "thing21 1"
					text2 = "thing21 2"
					text3 = "thing21 3"
					thing21(atPosition = 4) {
						text4 = "thing21 4"
					}
					text5 = "thing21 5"
					thing21(atPosition = 6) {
						text6 = "thing21 6"
						text6 = "thing21 6"
						text6 = "thing21 6"
					}
					thing21(atPosition = 7) {
						text7 = "thing21 7"
						text4 = "thing21 4"
						text7 = "thing21 7"
					}
					text8 = "thing21 8"
				}
			}
		}
	}

	@Test
	fun testThing21_5() = gwen {
		given {
			server stubs {
				get("/thing21") with json(testR.raw.repos)
			}
			user launches { thing21sScreen("thing21") }
		}

		whenever {
			user selects {
				thing21s {
					action1()
					action2()
					action3()
					thing21(atPosition = 4) {
						action4()
					}
					action5()
					thing21(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing21(atPosition = 7) {
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
				thing21s {
					text1 = "thing21 1"
					text2 = "thing21 2"
					text3 = "thing21 3"
					thing21(atPosition = 4) {
						text4 = "thing21 4"
					}
					text5 = "thing21 5"
					thing21(atPosition = 6) {
						text6 = "thing21 6"
						text6 = "thing21 6"
						text6 = "thing21 6"
					}
					thing21(atPosition = 7) {
						text7 = "thing21 7"
						text4 = "thing21 4"
						text7 = "thing21 7"
					}
					text8 = "thing21 8"
				}
			}
		}
	}
}
