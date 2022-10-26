package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing90.thing90s
import net.twisterrob.real.app.test.dsls.thing90.thing90sScreen
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
class Thing90Test : UiTest() {

	@Test
	fun testThing90_1() = gwen {
		given {
			server stubs {
				get("/thing90") with json(testR.raw.repos)
			}
			user launches { thing90sScreen("thing90") }
		}

		whenever {
			user selects {
				thing90s {
					action1()
					action2()
					action3()
					thing90(atPosition = 4) {
						action4()
					}
					action5()
					thing90(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing90(atPosition = 7) {
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
				thing90s {
					text1 = "thing90 1"
					text2 = "thing90 2"
					text3 = "thing90 3"
					thing90(atPosition = 4) {
						text4 = "thing90 4"
					}
					text5 = "thing90 5"
					thing90(atPosition = 6) {
						text6 = "thing90 6"
						text6 = "thing90 6"
						text6 = "thing90 6"
					}
					thing90(atPosition = 7) {
						text7 = "thing90 7"
						text4 = "thing90 4"
						text7 = "thing90 7"
					}
					text8 = "thing90 8"
				}
			}
		}
	}

	@Test
	fun testThing90_2() = gwen {
		given {
			server stubs {
				get("/thing90") with json(testR.raw.repos)
			}
			user launches { thing90sScreen("thing90") }
		}

		whenever {
			user selects {
				thing90s {
					action1()
					action2()
					action3()
					thing90(atPosition = 4) {
						action4()
					}
					action5()
					thing90(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing90(atPosition = 7) {
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
				thing90s {
					text1 = "thing90 1"
					text2 = "thing90 2"
					text3 = "thing90 3"
					thing90(atPosition = 4) {
						text4 = "thing90 4"
					}
					text5 = "thing90 5"
					thing90(atPosition = 6) {
						text6 = "thing90 6"
						text6 = "thing90 6"
						text6 = "thing90 6"
					}
					thing90(atPosition = 7) {
						text7 = "thing90 7"
						text4 = "thing90 4"
						text7 = "thing90 7"
					}
					text8 = "thing90 8"
				}
			}
		}
	}

	@Test
	fun testThing90_3() = gwen {
		given {
			server stubs {
				get("/thing90") with json(testR.raw.repos)
			}
			user launches { thing90sScreen("thing90") }
		}

		whenever {
			user selects {
				thing90s {
					action1()
					action2()
					action3()
					thing90(atPosition = 4) {
						action4()
					}
					action5()
					thing90(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing90(atPosition = 7) {
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
				thing90s {
					text1 = "thing90 1"
					text2 = "thing90 2"
					text3 = "thing90 3"
					thing90(atPosition = 4) {
						text4 = "thing90 4"
					}
					text5 = "thing90 5"
					thing90(atPosition = 6) {
						text6 = "thing90 6"
						text6 = "thing90 6"
						text6 = "thing90 6"
					}
					thing90(atPosition = 7) {
						text7 = "thing90 7"
						text4 = "thing90 4"
						text7 = "thing90 7"
					}
					text8 = "thing90 8"
				}
			}
		}
	}

	@Test
	fun testThing90_4() = gwen {
		given {
			server stubs {
				get("/thing90") with json(testR.raw.repos)
			}
			user launches { thing90sScreen("thing90") }
		}

		whenever {
			user selects {
				thing90s {
					action1()
					action2()
					action3()
					thing90(atPosition = 4) {
						action4()
					}
					action5()
					thing90(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing90(atPosition = 7) {
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
				thing90s {
					text1 = "thing90 1"
					text2 = "thing90 2"
					text3 = "thing90 3"
					thing90(atPosition = 4) {
						text4 = "thing90 4"
					}
					text5 = "thing90 5"
					thing90(atPosition = 6) {
						text6 = "thing90 6"
						text6 = "thing90 6"
						text6 = "thing90 6"
					}
					thing90(atPosition = 7) {
						text7 = "thing90 7"
						text4 = "thing90 4"
						text7 = "thing90 7"
					}
					text8 = "thing90 8"
				}
			}
		}
	}

	@Test
	fun testThing90_5() = gwen {
		given {
			server stubs {
				get("/thing90") with json(testR.raw.repos)
			}
			user launches { thing90sScreen("thing90") }
		}

		whenever {
			user selects {
				thing90s {
					action1()
					action2()
					action3()
					thing90(atPosition = 4) {
						action4()
					}
					action5()
					thing90(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing90(atPosition = 7) {
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
				thing90s {
					text1 = "thing90 1"
					text2 = "thing90 2"
					text3 = "thing90 3"
					thing90(atPosition = 4) {
						text4 = "thing90 4"
					}
					text5 = "thing90 5"
					thing90(atPosition = 6) {
						text6 = "thing90 6"
						text6 = "thing90 6"
						text6 = "thing90 6"
					}
					thing90(atPosition = 7) {
						text7 = "thing90 7"
						text4 = "thing90 4"
						text7 = "thing90 7"
					}
					text8 = "thing90 8"
				}
			}
		}
	}
}
