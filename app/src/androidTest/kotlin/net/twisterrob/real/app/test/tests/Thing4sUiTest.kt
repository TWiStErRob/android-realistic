package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing4.thing4s
import net.twisterrob.real.app.test.dsls.thing4.thing4sScreen
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
class Thing4Test : UiTest() {

	@Test
	fun testThing4_1() = gwen {
		given {
			server stubs {
				get("/thing4") with json(testR.raw.repos)
			}
			user launches { thing4sScreen("thing4") }
		}

		whenever {
			user selects {
				thing4s {
					action1()
					action2()
					action3()
					thing4(atPosition = 4) {
						action4()
					}
					action5()
					thing4(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing4(atPosition = 7) {
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
				thing4s {
					text1 = "thing4 1"
					text2 = "thing4 2"
					text3 = "thing4 3"
					thing4(atPosition = 4) {
						text4 = "thing4 4"
					}
					text5 = "thing4 5"
					thing4(atPosition = 6) {
						text6 = "thing4 6"
						text6 = "thing4 6"
						text6 = "thing4 6"
					}
					thing4(atPosition = 7) {
						text7 = "thing4 7"
						text4 = "thing4 4"
						text7 = "thing4 7"
					}
					text8 = "thing4 8"
				}
			}
		}
	}

	@Test
	fun testThing4_2() = gwen {
		given {
			server stubs {
				get("/thing4") with json(testR.raw.repos)
			}
			user launches { thing4sScreen("thing4") }
		}

		whenever {
			user selects {
				thing4s {
					action1()
					action2()
					action3()
					thing4(atPosition = 4) {
						action4()
					}
					action5()
					thing4(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing4(atPosition = 7) {
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
				thing4s {
					text1 = "thing4 1"
					text2 = "thing4 2"
					text3 = "thing4 3"
					thing4(atPosition = 4) {
						text4 = "thing4 4"
					}
					text5 = "thing4 5"
					thing4(atPosition = 6) {
						text6 = "thing4 6"
						text6 = "thing4 6"
						text6 = "thing4 6"
					}
					thing4(atPosition = 7) {
						text7 = "thing4 7"
						text4 = "thing4 4"
						text7 = "thing4 7"
					}
					text8 = "thing4 8"
				}
			}
		}
	}

	@Test
	fun testThing4_3() = gwen {
		given {
			server stubs {
				get("/thing4") with json(testR.raw.repos)
			}
			user launches { thing4sScreen("thing4") }
		}

		whenever {
			user selects {
				thing4s {
					action1()
					action2()
					action3()
					thing4(atPosition = 4) {
						action4()
					}
					action5()
					thing4(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing4(atPosition = 7) {
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
				thing4s {
					text1 = "thing4 1"
					text2 = "thing4 2"
					text3 = "thing4 3"
					thing4(atPosition = 4) {
						text4 = "thing4 4"
					}
					text5 = "thing4 5"
					thing4(atPosition = 6) {
						text6 = "thing4 6"
						text6 = "thing4 6"
						text6 = "thing4 6"
					}
					thing4(atPosition = 7) {
						text7 = "thing4 7"
						text4 = "thing4 4"
						text7 = "thing4 7"
					}
					text8 = "thing4 8"
				}
			}
		}
	}

	@Test
	fun testThing4_4() = gwen {
		given {
			server stubs {
				get("/thing4") with json(testR.raw.repos)
			}
			user launches { thing4sScreen("thing4") }
		}

		whenever {
			user selects {
				thing4s {
					action1()
					action2()
					action3()
					thing4(atPosition = 4) {
						action4()
					}
					action5()
					thing4(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing4(atPosition = 7) {
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
				thing4s {
					text1 = "thing4 1"
					text2 = "thing4 2"
					text3 = "thing4 3"
					thing4(atPosition = 4) {
						text4 = "thing4 4"
					}
					text5 = "thing4 5"
					thing4(atPosition = 6) {
						text6 = "thing4 6"
						text6 = "thing4 6"
						text6 = "thing4 6"
					}
					thing4(atPosition = 7) {
						text7 = "thing4 7"
						text4 = "thing4 4"
						text7 = "thing4 7"
					}
					text8 = "thing4 8"
				}
			}
		}
	}

	@Test
	fun testThing4_5() = gwen {
		given {
			server stubs {
				get("/thing4") with json(testR.raw.repos)
			}
			user launches { thing4sScreen("thing4") }
		}

		whenever {
			user selects {
				thing4s {
					action1()
					action2()
					action3()
					thing4(atPosition = 4) {
						action4()
					}
					action5()
					thing4(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing4(atPosition = 7) {
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
				thing4s {
					text1 = "thing4 1"
					text2 = "thing4 2"
					text3 = "thing4 3"
					thing4(atPosition = 4) {
						text4 = "thing4 4"
					}
					text5 = "thing4 5"
					thing4(atPosition = 6) {
						text6 = "thing4 6"
						text6 = "thing4 6"
						text6 = "thing4 6"
					}
					thing4(atPosition = 7) {
						text7 = "thing4 7"
						text4 = "thing4 4"
						text7 = "thing4 7"
					}
					text8 = "thing4 8"
				}
			}
		}
	}
}
