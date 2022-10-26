package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing94.thing94s
import net.twisterrob.real.app.test.dsls.thing94.thing94sScreen
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
class Thing94Test : UiTest() {

	@Test
	fun testThing94_1() = gwen {
		given {
			server stubs {
				get("/thing94") with json(testR.raw.repos)
			}
			user launches { thing94sScreen("thing94") }
		}

		whenever {
			user selects {
				thing94s {
					action1()
					action2()
					action3()
					thing94(atPosition = 4) {
						action4()
					}
					action5()
					thing94(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing94(atPosition = 7) {
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
				thing94s {
					text1 = "thing94 1"
					text2 = "thing94 2"
					text3 = "thing94 3"
					thing94(atPosition = 4) {
						text4 = "thing94 4"
					}
					text5 = "thing94 5"
					thing94(atPosition = 6) {
						text6 = "thing94 6"
						text6 = "thing94 6"
						text6 = "thing94 6"
					}
					thing94(atPosition = 7) {
						text7 = "thing94 7"
						text4 = "thing94 4"
						text7 = "thing94 7"
					}
					text8 = "thing94 8"
				}
			}
		}
	}

	@Test
	fun testThing94_2() = gwen {
		given {
			server stubs {
				get("/thing94") with json(testR.raw.repos)
			}
			user launches { thing94sScreen("thing94") }
		}

		whenever {
			user selects {
				thing94s {
					action1()
					action2()
					action3()
					thing94(atPosition = 4) {
						action4()
					}
					action5()
					thing94(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing94(atPosition = 7) {
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
				thing94s {
					text1 = "thing94 1"
					text2 = "thing94 2"
					text3 = "thing94 3"
					thing94(atPosition = 4) {
						text4 = "thing94 4"
					}
					text5 = "thing94 5"
					thing94(atPosition = 6) {
						text6 = "thing94 6"
						text6 = "thing94 6"
						text6 = "thing94 6"
					}
					thing94(atPosition = 7) {
						text7 = "thing94 7"
						text4 = "thing94 4"
						text7 = "thing94 7"
					}
					text8 = "thing94 8"
				}
			}
		}
	}

	@Test
	fun testThing94_3() = gwen {
		given {
			server stubs {
				get("/thing94") with json(testR.raw.repos)
			}
			user launches { thing94sScreen("thing94") }
		}

		whenever {
			user selects {
				thing94s {
					action1()
					action2()
					action3()
					thing94(atPosition = 4) {
						action4()
					}
					action5()
					thing94(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing94(atPosition = 7) {
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
				thing94s {
					text1 = "thing94 1"
					text2 = "thing94 2"
					text3 = "thing94 3"
					thing94(atPosition = 4) {
						text4 = "thing94 4"
					}
					text5 = "thing94 5"
					thing94(atPosition = 6) {
						text6 = "thing94 6"
						text6 = "thing94 6"
						text6 = "thing94 6"
					}
					thing94(atPosition = 7) {
						text7 = "thing94 7"
						text4 = "thing94 4"
						text7 = "thing94 7"
					}
					text8 = "thing94 8"
				}
			}
		}
	}

	@Test
	fun testThing94_4() = gwen {
		given {
			server stubs {
				get("/thing94") with json(testR.raw.repos)
			}
			user launches { thing94sScreen("thing94") }
		}

		whenever {
			user selects {
				thing94s {
					action1()
					action2()
					action3()
					thing94(atPosition = 4) {
						action4()
					}
					action5()
					thing94(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing94(atPosition = 7) {
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
				thing94s {
					text1 = "thing94 1"
					text2 = "thing94 2"
					text3 = "thing94 3"
					thing94(atPosition = 4) {
						text4 = "thing94 4"
					}
					text5 = "thing94 5"
					thing94(atPosition = 6) {
						text6 = "thing94 6"
						text6 = "thing94 6"
						text6 = "thing94 6"
					}
					thing94(atPosition = 7) {
						text7 = "thing94 7"
						text4 = "thing94 4"
						text7 = "thing94 7"
					}
					text8 = "thing94 8"
				}
			}
		}
	}

	@Test
	fun testThing94_5() = gwen {
		given {
			server stubs {
				get("/thing94") with json(testR.raw.repos)
			}
			user launches { thing94sScreen("thing94") }
		}

		whenever {
			user selects {
				thing94s {
					action1()
					action2()
					action3()
					thing94(atPosition = 4) {
						action4()
					}
					action5()
					thing94(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing94(atPosition = 7) {
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
				thing94s {
					text1 = "thing94 1"
					text2 = "thing94 2"
					text3 = "thing94 3"
					thing94(atPosition = 4) {
						text4 = "thing94 4"
					}
					text5 = "thing94 5"
					thing94(atPosition = 6) {
						text6 = "thing94 6"
						text6 = "thing94 6"
						text6 = "thing94 6"
					}
					thing94(atPosition = 7) {
						text7 = "thing94 7"
						text4 = "thing94 4"
						text7 = "thing94 7"
					}
					text8 = "thing94 8"
				}
			}
		}
	}
}
