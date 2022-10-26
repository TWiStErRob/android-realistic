package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing5.thing5s
import net.twisterrob.real.app.test.dsls.thing5.thing5sScreen
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
class Thing5Test : UiTest() {

	@Test
	fun testThing5_1() = gwen {
		given {
			server stubs {
				get("/thing5") with json(testR.raw.repos)
			}
			user launches { thing5sScreen("thing5") }
		}

		whenever {
			user selects {
				thing5s {
					action1()
					action2()
					action3()
					thing5(atPosition = 4) {
						action4()
					}
					action5()
					thing5(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing5(atPosition = 7) {
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
				thing5s {
					text1 = "thing5 1"
					text2 = "thing5 2"
					text3 = "thing5 3"
					thing5(atPosition = 4) {
						text4 = "thing5 4"
					}
					text5 = "thing5 5"
					thing5(atPosition = 6) {
						text6 = "thing5 6"
						text6 = "thing5 6"
						text6 = "thing5 6"
					}
					thing5(atPosition = 7) {
						text7 = "thing5 7"
						text4 = "thing5 4"
						text7 = "thing5 7"
					}
					text8 = "thing5 8"
				}
			}
		}
	}

	@Test
	fun testThing5_2() = gwen {
		given {
			server stubs {
				get("/thing5") with json(testR.raw.repos)
			}
			user launches { thing5sScreen("thing5") }
		}

		whenever {
			user selects {
				thing5s {
					action1()
					action2()
					action3()
					thing5(atPosition = 4) {
						action4()
					}
					action5()
					thing5(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing5(atPosition = 7) {
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
				thing5s {
					text1 = "thing5 1"
					text2 = "thing5 2"
					text3 = "thing5 3"
					thing5(atPosition = 4) {
						text4 = "thing5 4"
					}
					text5 = "thing5 5"
					thing5(atPosition = 6) {
						text6 = "thing5 6"
						text6 = "thing5 6"
						text6 = "thing5 6"
					}
					thing5(atPosition = 7) {
						text7 = "thing5 7"
						text4 = "thing5 4"
						text7 = "thing5 7"
					}
					text8 = "thing5 8"
				}
			}
		}
	}

	@Test
	fun testThing5_3() = gwen {
		given {
			server stubs {
				get("/thing5") with json(testR.raw.repos)
			}
			user launches { thing5sScreen("thing5") }
		}

		whenever {
			user selects {
				thing5s {
					action1()
					action2()
					action3()
					thing5(atPosition = 4) {
						action4()
					}
					action5()
					thing5(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing5(atPosition = 7) {
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
				thing5s {
					text1 = "thing5 1"
					text2 = "thing5 2"
					text3 = "thing5 3"
					thing5(atPosition = 4) {
						text4 = "thing5 4"
					}
					text5 = "thing5 5"
					thing5(atPosition = 6) {
						text6 = "thing5 6"
						text6 = "thing5 6"
						text6 = "thing5 6"
					}
					thing5(atPosition = 7) {
						text7 = "thing5 7"
						text4 = "thing5 4"
						text7 = "thing5 7"
					}
					text8 = "thing5 8"
				}
			}
		}
	}

	@Test
	fun testThing5_4() = gwen {
		given {
			server stubs {
				get("/thing5") with json(testR.raw.repos)
			}
			user launches { thing5sScreen("thing5") }
		}

		whenever {
			user selects {
				thing5s {
					action1()
					action2()
					action3()
					thing5(atPosition = 4) {
						action4()
					}
					action5()
					thing5(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing5(atPosition = 7) {
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
				thing5s {
					text1 = "thing5 1"
					text2 = "thing5 2"
					text3 = "thing5 3"
					thing5(atPosition = 4) {
						text4 = "thing5 4"
					}
					text5 = "thing5 5"
					thing5(atPosition = 6) {
						text6 = "thing5 6"
						text6 = "thing5 6"
						text6 = "thing5 6"
					}
					thing5(atPosition = 7) {
						text7 = "thing5 7"
						text4 = "thing5 4"
						text7 = "thing5 7"
					}
					text8 = "thing5 8"
				}
			}
		}
	}

	@Test
	fun testThing5_5() = gwen {
		given {
			server stubs {
				get("/thing5") with json(testR.raw.repos)
			}
			user launches { thing5sScreen("thing5") }
		}

		whenever {
			user selects {
				thing5s {
					action1()
					action2()
					action3()
					thing5(atPosition = 4) {
						action4()
					}
					action5()
					thing5(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing5(atPosition = 7) {
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
				thing5s {
					text1 = "thing5 1"
					text2 = "thing5 2"
					text3 = "thing5 3"
					thing5(atPosition = 4) {
						text4 = "thing5 4"
					}
					text5 = "thing5 5"
					thing5(atPosition = 6) {
						text6 = "thing5 6"
						text6 = "thing5 6"
						text6 = "thing5 6"
					}
					thing5(atPosition = 7) {
						text7 = "thing5 7"
						text4 = "thing5 4"
						text7 = "thing5 7"
					}
					text8 = "thing5 8"
				}
			}
		}
	}
}
