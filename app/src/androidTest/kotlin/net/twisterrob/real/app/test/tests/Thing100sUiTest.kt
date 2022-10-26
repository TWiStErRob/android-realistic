package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing100.thing100s
import net.twisterrob.real.app.test.dsls.thing100.thing100sScreen
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
class Thing100Test : UiTest() {

	@Test
	fun testThing100_1() = gwen {
		given {
			server stubs {
				get("/thing100") with json(testR.raw.repos)
			}
			user launches { thing100sScreen("thing100") }
		}

		whenever {
			user selects {
				thing100s {
					action1()
					action2()
					action3()
					thing100(atPosition = 4) {
						action4()
					}
					action5()
					thing100(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing100(atPosition = 7) {
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
				thing100s {
					text1 = "thing100 1"
					text2 = "thing100 2"
					text3 = "thing100 3"
					thing100(atPosition = 4) {
						text4 = "thing100 4"
					}
					text5 = "thing100 5"
					thing100(atPosition = 6) {
						text6 = "thing100 6"
						text6 = "thing100 6"
						text6 = "thing100 6"
					}
					thing100(atPosition = 7) {
						text7 = "thing100 7"
						text4 = "thing100 4"
						text7 = "thing100 7"
					}
					text8 = "thing100 8"
				}
			}
		}
	}

	@Test
	fun testThing100_2() = gwen {
		given {
			server stubs {
				get("/thing100") with json(testR.raw.repos)
			}
			user launches { thing100sScreen("thing100") }
		}

		whenever {
			user selects {
				thing100s {
					action1()
					action2()
					action3()
					thing100(atPosition = 4) {
						action4()
					}
					action5()
					thing100(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing100(atPosition = 7) {
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
				thing100s {
					text1 = "thing100 1"
					text2 = "thing100 2"
					text3 = "thing100 3"
					thing100(atPosition = 4) {
						text4 = "thing100 4"
					}
					text5 = "thing100 5"
					thing100(atPosition = 6) {
						text6 = "thing100 6"
						text6 = "thing100 6"
						text6 = "thing100 6"
					}
					thing100(atPosition = 7) {
						text7 = "thing100 7"
						text4 = "thing100 4"
						text7 = "thing100 7"
					}
					text8 = "thing100 8"
				}
			}
		}
	}

	@Test
	fun testThing100_3() = gwen {
		given {
			server stubs {
				get("/thing100") with json(testR.raw.repos)
			}
			user launches { thing100sScreen("thing100") }
		}

		whenever {
			user selects {
				thing100s {
					action1()
					action2()
					action3()
					thing100(atPosition = 4) {
						action4()
					}
					action5()
					thing100(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing100(atPosition = 7) {
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
				thing100s {
					text1 = "thing100 1"
					text2 = "thing100 2"
					text3 = "thing100 3"
					thing100(atPosition = 4) {
						text4 = "thing100 4"
					}
					text5 = "thing100 5"
					thing100(atPosition = 6) {
						text6 = "thing100 6"
						text6 = "thing100 6"
						text6 = "thing100 6"
					}
					thing100(atPosition = 7) {
						text7 = "thing100 7"
						text4 = "thing100 4"
						text7 = "thing100 7"
					}
					text8 = "thing100 8"
				}
			}
		}
	}

	@Test
	fun testThing100_4() = gwen {
		given {
			server stubs {
				get("/thing100") with json(testR.raw.repos)
			}
			user launches { thing100sScreen("thing100") }
		}

		whenever {
			user selects {
				thing100s {
					action1()
					action2()
					action3()
					thing100(atPosition = 4) {
						action4()
					}
					action5()
					thing100(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing100(atPosition = 7) {
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
				thing100s {
					text1 = "thing100 1"
					text2 = "thing100 2"
					text3 = "thing100 3"
					thing100(atPosition = 4) {
						text4 = "thing100 4"
					}
					text5 = "thing100 5"
					thing100(atPosition = 6) {
						text6 = "thing100 6"
						text6 = "thing100 6"
						text6 = "thing100 6"
					}
					thing100(atPosition = 7) {
						text7 = "thing100 7"
						text4 = "thing100 4"
						text7 = "thing100 7"
					}
					text8 = "thing100 8"
				}
			}
		}
	}

	@Test
	fun testThing100_5() = gwen {
		given {
			server stubs {
				get("/thing100") with json(testR.raw.repos)
			}
			user launches { thing100sScreen("thing100") }
		}

		whenever {
			user selects {
				thing100s {
					action1()
					action2()
					action3()
					thing100(atPosition = 4) {
						action4()
					}
					action5()
					thing100(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing100(atPosition = 7) {
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
				thing100s {
					text1 = "thing100 1"
					text2 = "thing100 2"
					text3 = "thing100 3"
					thing100(atPosition = 4) {
						text4 = "thing100 4"
					}
					text5 = "thing100 5"
					thing100(atPosition = 6) {
						text6 = "thing100 6"
						text6 = "thing100 6"
						text6 = "thing100 6"
					}
					thing100(atPosition = 7) {
						text7 = "thing100 7"
						text4 = "thing100 4"
						text7 = "thing100 7"
					}
					text8 = "thing100 8"
				}
			}
		}
	}
}
