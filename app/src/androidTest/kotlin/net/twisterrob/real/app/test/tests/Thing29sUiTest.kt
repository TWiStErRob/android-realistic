package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing29.thing29s
import net.twisterrob.real.app.test.dsls.thing29.thing29sScreen
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
class Thing29Test : UiTest() {

	@Test
	fun testThing29_1() = gwen {
		given {
			server stubs {
				get("/thing29") with json(testR.raw.repos)
			}
			user launches { thing29sScreen("thing29") }
		}

		whenever {
			user selects {
				thing29s {
					action1()
					action2()
					action3()
					thing29(atPosition = 4) {
						action4()
					}
					action5()
					thing29(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing29(atPosition = 7) {
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
				thing29s {
					text1 = "thing29 1"
					text2 = "thing29 2"
					text3 = "thing29 3"
					thing29(atPosition = 4) {
						text4 = "thing29 4"
					}
					text5 = "thing29 5"
					thing29(atPosition = 6) {
						text6 = "thing29 6"
						text6 = "thing29 6"
						text6 = "thing29 6"
					}
					thing29(atPosition = 7) {
						text7 = "thing29 7"
						text4 = "thing29 4"
						text7 = "thing29 7"
					}
					text8 = "thing29 8"
				}
			}
		}
	}

	@Test
	fun testThing29_2() = gwen {
		given {
			server stubs {
				get("/thing29") with json(testR.raw.repos)
			}
			user launches { thing29sScreen("thing29") }
		}

		whenever {
			user selects {
				thing29s {
					action1()
					action2()
					action3()
					thing29(atPosition = 4) {
						action4()
					}
					action5()
					thing29(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing29(atPosition = 7) {
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
				thing29s {
					text1 = "thing29 1"
					text2 = "thing29 2"
					text3 = "thing29 3"
					thing29(atPosition = 4) {
						text4 = "thing29 4"
					}
					text5 = "thing29 5"
					thing29(atPosition = 6) {
						text6 = "thing29 6"
						text6 = "thing29 6"
						text6 = "thing29 6"
					}
					thing29(atPosition = 7) {
						text7 = "thing29 7"
						text4 = "thing29 4"
						text7 = "thing29 7"
					}
					text8 = "thing29 8"
				}
			}
		}
	}

	@Test
	fun testThing29_3() = gwen {
		given {
			server stubs {
				get("/thing29") with json(testR.raw.repos)
			}
			user launches { thing29sScreen("thing29") }
		}

		whenever {
			user selects {
				thing29s {
					action1()
					action2()
					action3()
					thing29(atPosition = 4) {
						action4()
					}
					action5()
					thing29(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing29(atPosition = 7) {
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
				thing29s {
					text1 = "thing29 1"
					text2 = "thing29 2"
					text3 = "thing29 3"
					thing29(atPosition = 4) {
						text4 = "thing29 4"
					}
					text5 = "thing29 5"
					thing29(atPosition = 6) {
						text6 = "thing29 6"
						text6 = "thing29 6"
						text6 = "thing29 6"
					}
					thing29(atPosition = 7) {
						text7 = "thing29 7"
						text4 = "thing29 4"
						text7 = "thing29 7"
					}
					text8 = "thing29 8"
				}
			}
		}
	}

	@Test
	fun testThing29_4() = gwen {
		given {
			server stubs {
				get("/thing29") with json(testR.raw.repos)
			}
			user launches { thing29sScreen("thing29") }
		}

		whenever {
			user selects {
				thing29s {
					action1()
					action2()
					action3()
					thing29(atPosition = 4) {
						action4()
					}
					action5()
					thing29(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing29(atPosition = 7) {
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
				thing29s {
					text1 = "thing29 1"
					text2 = "thing29 2"
					text3 = "thing29 3"
					thing29(atPosition = 4) {
						text4 = "thing29 4"
					}
					text5 = "thing29 5"
					thing29(atPosition = 6) {
						text6 = "thing29 6"
						text6 = "thing29 6"
						text6 = "thing29 6"
					}
					thing29(atPosition = 7) {
						text7 = "thing29 7"
						text4 = "thing29 4"
						text7 = "thing29 7"
					}
					text8 = "thing29 8"
				}
			}
		}
	}

	@Test
	fun testThing29_5() = gwen {
		given {
			server stubs {
				get("/thing29") with json(testR.raw.repos)
			}
			user launches { thing29sScreen("thing29") }
		}

		whenever {
			user selects {
				thing29s {
					action1()
					action2()
					action3()
					thing29(atPosition = 4) {
						action4()
					}
					action5()
					thing29(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing29(atPosition = 7) {
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
				thing29s {
					text1 = "thing29 1"
					text2 = "thing29 2"
					text3 = "thing29 3"
					thing29(atPosition = 4) {
						text4 = "thing29 4"
					}
					text5 = "thing29 5"
					thing29(atPosition = 6) {
						text6 = "thing29 6"
						text6 = "thing29 6"
						text6 = "thing29 6"
					}
					thing29(atPosition = 7) {
						text7 = "thing29 7"
						text4 = "thing29 4"
						text7 = "thing29 7"
					}
					text8 = "thing29 8"
				}
			}
		}
	}
}
