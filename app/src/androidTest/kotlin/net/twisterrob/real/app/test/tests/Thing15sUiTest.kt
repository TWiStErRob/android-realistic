package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing15.thing15s
import net.twisterrob.real.app.test.dsls.thing15.thing15sScreen
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
class Thing15Test : UiTest() {

	@Test
	fun testThing15_1() = gwen {
		given {
			server stubs {
				get("/thing15") with json(testR.raw.repos)
			}
			user launches { thing15sScreen("thing15") }
		}

		whenever {
			user selects {
				thing15s {
					action1()
					action2()
					action3()
					thing15(atPosition = 4) {
						action4()
					}
					action5()
					thing15(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing15(atPosition = 7) {
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
				thing15s {
					text1 = "thing15 1"
					text2 = "thing15 2"
					text3 = "thing15 3"
					thing15(atPosition = 4) {
						text4 = "thing15 4"
					}
					text5 = "thing15 5"
					thing15(atPosition = 6) {
						text6 = "thing15 6"
						text6 = "thing15 6"
						text6 = "thing15 6"
					}
					thing15(atPosition = 7) {
						text7 = "thing15 7"
						text4 = "thing15 4"
						text7 = "thing15 7"
					}
					text8 = "thing15 8"
				}
			}
		}
	}

	@Test
	fun testThing15_2() = gwen {
		given {
			server stubs {
				get("/thing15") with json(testR.raw.repos)
			}
			user launches { thing15sScreen("thing15") }
		}

		whenever {
			user selects {
				thing15s {
					action1()
					action2()
					action3()
					thing15(atPosition = 4) {
						action4()
					}
					action5()
					thing15(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing15(atPosition = 7) {
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
				thing15s {
					text1 = "thing15 1"
					text2 = "thing15 2"
					text3 = "thing15 3"
					thing15(atPosition = 4) {
						text4 = "thing15 4"
					}
					text5 = "thing15 5"
					thing15(atPosition = 6) {
						text6 = "thing15 6"
						text6 = "thing15 6"
						text6 = "thing15 6"
					}
					thing15(atPosition = 7) {
						text7 = "thing15 7"
						text4 = "thing15 4"
						text7 = "thing15 7"
					}
					text8 = "thing15 8"
				}
			}
		}
	}

	@Test
	fun testThing15_3() = gwen {
		given {
			server stubs {
				get("/thing15") with json(testR.raw.repos)
			}
			user launches { thing15sScreen("thing15") }
		}

		whenever {
			user selects {
				thing15s {
					action1()
					action2()
					action3()
					thing15(atPosition = 4) {
						action4()
					}
					action5()
					thing15(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing15(atPosition = 7) {
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
				thing15s {
					text1 = "thing15 1"
					text2 = "thing15 2"
					text3 = "thing15 3"
					thing15(atPosition = 4) {
						text4 = "thing15 4"
					}
					text5 = "thing15 5"
					thing15(atPosition = 6) {
						text6 = "thing15 6"
						text6 = "thing15 6"
						text6 = "thing15 6"
					}
					thing15(atPosition = 7) {
						text7 = "thing15 7"
						text4 = "thing15 4"
						text7 = "thing15 7"
					}
					text8 = "thing15 8"
				}
			}
		}
	}

	@Test
	fun testThing15_4() = gwen {
		given {
			server stubs {
				get("/thing15") with json(testR.raw.repos)
			}
			user launches { thing15sScreen("thing15") }
		}

		whenever {
			user selects {
				thing15s {
					action1()
					action2()
					action3()
					thing15(atPosition = 4) {
						action4()
					}
					action5()
					thing15(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing15(atPosition = 7) {
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
				thing15s {
					text1 = "thing15 1"
					text2 = "thing15 2"
					text3 = "thing15 3"
					thing15(atPosition = 4) {
						text4 = "thing15 4"
					}
					text5 = "thing15 5"
					thing15(atPosition = 6) {
						text6 = "thing15 6"
						text6 = "thing15 6"
						text6 = "thing15 6"
					}
					thing15(atPosition = 7) {
						text7 = "thing15 7"
						text4 = "thing15 4"
						text7 = "thing15 7"
					}
					text8 = "thing15 8"
				}
			}
		}
	}

	@Test
	fun testThing15_5() = gwen {
		given {
			server stubs {
				get("/thing15") with json(testR.raw.repos)
			}
			user launches { thing15sScreen("thing15") }
		}

		whenever {
			user selects {
				thing15s {
					action1()
					action2()
					action3()
					thing15(atPosition = 4) {
						action4()
					}
					action5()
					thing15(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing15(atPosition = 7) {
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
				thing15s {
					text1 = "thing15 1"
					text2 = "thing15 2"
					text3 = "thing15 3"
					thing15(atPosition = 4) {
						text4 = "thing15 4"
					}
					text5 = "thing15 5"
					thing15(atPosition = 6) {
						text6 = "thing15 6"
						text6 = "thing15 6"
						text6 = "thing15 6"
					}
					thing15(atPosition = 7) {
						text7 = "thing15 7"
						text4 = "thing15 4"
						text7 = "thing15 7"
					}
					text8 = "thing15 8"
				}
			}
		}
	}
}
