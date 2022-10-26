package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing75.thing75s
import net.twisterrob.real.app.test.dsls.thing75.thing75sScreen
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
class Thing75Test : UiTest() {

	@Test
	fun testThing75_1() = gwen {
		given {
			server stubs {
				get("/thing75") with json(testR.raw.repos)
			}
			user launches { thing75sScreen("thing75") }
		}

		whenever {
			user selects {
				thing75s {
					action1()
					action2()
					action3()
					thing75(atPosition = 4) {
						action4()
					}
					action5()
					thing75(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing75(atPosition = 7) {
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
				thing75s {
					text1 = "thing75 1"
					text2 = "thing75 2"
					text3 = "thing75 3"
					thing75(atPosition = 4) {
						text4 = "thing75 4"
					}
					text5 = "thing75 5"
					thing75(atPosition = 6) {
						text6 = "thing75 6"
						text6 = "thing75 6"
						text6 = "thing75 6"
					}
					thing75(atPosition = 7) {
						text7 = "thing75 7"
						text4 = "thing75 4"
						text7 = "thing75 7"
					}
					text8 = "thing75 8"
				}
			}
		}
	}

	@Test
	fun testThing75_2() = gwen {
		given {
			server stubs {
				get("/thing75") with json(testR.raw.repos)
			}
			user launches { thing75sScreen("thing75") }
		}

		whenever {
			user selects {
				thing75s {
					action1()
					action2()
					action3()
					thing75(atPosition = 4) {
						action4()
					}
					action5()
					thing75(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing75(atPosition = 7) {
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
				thing75s {
					text1 = "thing75 1"
					text2 = "thing75 2"
					text3 = "thing75 3"
					thing75(atPosition = 4) {
						text4 = "thing75 4"
					}
					text5 = "thing75 5"
					thing75(atPosition = 6) {
						text6 = "thing75 6"
						text6 = "thing75 6"
						text6 = "thing75 6"
					}
					thing75(atPosition = 7) {
						text7 = "thing75 7"
						text4 = "thing75 4"
						text7 = "thing75 7"
					}
					text8 = "thing75 8"
				}
			}
		}
	}

	@Test
	fun testThing75_3() = gwen {
		given {
			server stubs {
				get("/thing75") with json(testR.raw.repos)
			}
			user launches { thing75sScreen("thing75") }
		}

		whenever {
			user selects {
				thing75s {
					action1()
					action2()
					action3()
					thing75(atPosition = 4) {
						action4()
					}
					action5()
					thing75(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing75(atPosition = 7) {
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
				thing75s {
					text1 = "thing75 1"
					text2 = "thing75 2"
					text3 = "thing75 3"
					thing75(atPosition = 4) {
						text4 = "thing75 4"
					}
					text5 = "thing75 5"
					thing75(atPosition = 6) {
						text6 = "thing75 6"
						text6 = "thing75 6"
						text6 = "thing75 6"
					}
					thing75(atPosition = 7) {
						text7 = "thing75 7"
						text4 = "thing75 4"
						text7 = "thing75 7"
					}
					text8 = "thing75 8"
				}
			}
		}
	}

	@Test
	fun testThing75_4() = gwen {
		given {
			server stubs {
				get("/thing75") with json(testR.raw.repos)
			}
			user launches { thing75sScreen("thing75") }
		}

		whenever {
			user selects {
				thing75s {
					action1()
					action2()
					action3()
					thing75(atPosition = 4) {
						action4()
					}
					action5()
					thing75(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing75(atPosition = 7) {
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
				thing75s {
					text1 = "thing75 1"
					text2 = "thing75 2"
					text3 = "thing75 3"
					thing75(atPosition = 4) {
						text4 = "thing75 4"
					}
					text5 = "thing75 5"
					thing75(atPosition = 6) {
						text6 = "thing75 6"
						text6 = "thing75 6"
						text6 = "thing75 6"
					}
					thing75(atPosition = 7) {
						text7 = "thing75 7"
						text4 = "thing75 4"
						text7 = "thing75 7"
					}
					text8 = "thing75 8"
				}
			}
		}
	}

	@Test
	fun testThing75_5() = gwen {
		given {
			server stubs {
				get("/thing75") with json(testR.raw.repos)
			}
			user launches { thing75sScreen("thing75") }
		}

		whenever {
			user selects {
				thing75s {
					action1()
					action2()
					action3()
					thing75(atPosition = 4) {
						action4()
					}
					action5()
					thing75(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing75(atPosition = 7) {
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
				thing75s {
					text1 = "thing75 1"
					text2 = "thing75 2"
					text3 = "thing75 3"
					thing75(atPosition = 4) {
						text4 = "thing75 4"
					}
					text5 = "thing75 5"
					thing75(atPosition = 6) {
						text6 = "thing75 6"
						text6 = "thing75 6"
						text6 = "thing75 6"
					}
					thing75(atPosition = 7) {
						text7 = "thing75 7"
						text4 = "thing75 4"
						text7 = "thing75 7"
					}
					text8 = "thing75 8"
				}
			}
		}
	}
}