package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing54.thing54s
import net.twisterrob.real.app.test.dsls.thing54.thing54sScreen
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
class Thing54Test : UiTest() {

	@Test
	fun testThing54_1() = gwen {
		given {
			server stubs {
				get("/thing54") with json(testR.raw.repos)
			}
			user launches { thing54sScreen("thing54") }
		}

		whenever {
			user selects {
				thing54s {
					action1()
					action2()
					action3()
					thing54(atPosition = 4) {
						action4()
					}
					action5()
					thing54(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing54(atPosition = 7) {
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
				thing54s {
					text1 = "thing54 1"
					text2 = "thing54 2"
					text3 = "thing54 3"
					thing54(atPosition = 4) {
						text4 = "thing54 4"
					}
					text5 = "thing54 5"
					thing54(atPosition = 6) {
						text6 = "thing54 6"
						text6 = "thing54 6"
						text6 = "thing54 6"
					}
					thing54(atPosition = 7) {
						text7 = "thing54 7"
						text4 = "thing54 4"
						text7 = "thing54 7"
					}
					text8 = "thing54 8"
				}
			}
		}
	}

	@Test
	fun testThing54_2() = gwen {
		given {
			server stubs {
				get("/thing54") with json(testR.raw.repos)
			}
			user launches { thing54sScreen("thing54") }
		}

		whenever {
			user selects {
				thing54s {
					action1()
					action2()
					action3()
					thing54(atPosition = 4) {
						action4()
					}
					action5()
					thing54(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing54(atPosition = 7) {
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
				thing54s {
					text1 = "thing54 1"
					text2 = "thing54 2"
					text3 = "thing54 3"
					thing54(atPosition = 4) {
						text4 = "thing54 4"
					}
					text5 = "thing54 5"
					thing54(atPosition = 6) {
						text6 = "thing54 6"
						text6 = "thing54 6"
						text6 = "thing54 6"
					}
					thing54(atPosition = 7) {
						text7 = "thing54 7"
						text4 = "thing54 4"
						text7 = "thing54 7"
					}
					text8 = "thing54 8"
				}
			}
		}
	}

	@Test
	fun testThing54_3() = gwen {
		given {
			server stubs {
				get("/thing54") with json(testR.raw.repos)
			}
			user launches { thing54sScreen("thing54") }
		}

		whenever {
			user selects {
				thing54s {
					action1()
					action2()
					action3()
					thing54(atPosition = 4) {
						action4()
					}
					action5()
					thing54(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing54(atPosition = 7) {
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
				thing54s {
					text1 = "thing54 1"
					text2 = "thing54 2"
					text3 = "thing54 3"
					thing54(atPosition = 4) {
						text4 = "thing54 4"
					}
					text5 = "thing54 5"
					thing54(atPosition = 6) {
						text6 = "thing54 6"
						text6 = "thing54 6"
						text6 = "thing54 6"
					}
					thing54(atPosition = 7) {
						text7 = "thing54 7"
						text4 = "thing54 4"
						text7 = "thing54 7"
					}
					text8 = "thing54 8"
				}
			}
		}
	}

	@Test
	fun testThing54_4() = gwen {
		given {
			server stubs {
				get("/thing54") with json(testR.raw.repos)
			}
			user launches { thing54sScreen("thing54") }
		}

		whenever {
			user selects {
				thing54s {
					action1()
					action2()
					action3()
					thing54(atPosition = 4) {
						action4()
					}
					action5()
					thing54(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing54(atPosition = 7) {
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
				thing54s {
					text1 = "thing54 1"
					text2 = "thing54 2"
					text3 = "thing54 3"
					thing54(atPosition = 4) {
						text4 = "thing54 4"
					}
					text5 = "thing54 5"
					thing54(atPosition = 6) {
						text6 = "thing54 6"
						text6 = "thing54 6"
						text6 = "thing54 6"
					}
					thing54(atPosition = 7) {
						text7 = "thing54 7"
						text4 = "thing54 4"
						text7 = "thing54 7"
					}
					text8 = "thing54 8"
				}
			}
		}
	}

	@Test
	fun testThing54_5() = gwen {
		given {
			server stubs {
				get("/thing54") with json(testR.raw.repos)
			}
			user launches { thing54sScreen("thing54") }
		}

		whenever {
			user selects {
				thing54s {
					action1()
					action2()
					action3()
					thing54(atPosition = 4) {
						action4()
					}
					action5()
					thing54(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing54(atPosition = 7) {
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
				thing54s {
					text1 = "thing54 1"
					text2 = "thing54 2"
					text3 = "thing54 3"
					thing54(atPosition = 4) {
						text4 = "thing54 4"
					}
					text5 = "thing54 5"
					thing54(atPosition = 6) {
						text6 = "thing54 6"
						text6 = "thing54 6"
						text6 = "thing54 6"
					}
					thing54(atPosition = 7) {
						text7 = "thing54 7"
						text4 = "thing54 4"
						text7 = "thing54 7"
					}
					text8 = "thing54 8"
				}
			}
		}
	}
}
