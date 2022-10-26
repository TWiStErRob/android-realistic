package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing79.thing79s
import net.twisterrob.real.app.test.dsls.thing79.thing79sScreen
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
class Thing79Test : UiTest() {

	@Test
	fun testThing79_1() = gwen {
		given {
			server stubs {
				get("/thing79") with json(testR.raw.repos)
			}
			user launches { thing79sScreen("thing79") }
		}

		whenever {
			user selects {
				thing79s {
					action1()
					action2()
					action3()
					thing79(atPosition = 4) {
						action4()
					}
					action5()
					thing79(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing79(atPosition = 7) {
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
				thing79s {
					text1 = "thing79 1"
					text2 = "thing79 2"
					text3 = "thing79 3"
					thing79(atPosition = 4) {
						text4 = "thing79 4"
					}
					text5 = "thing79 5"
					thing79(atPosition = 6) {
						text6 = "thing79 6"
						text6 = "thing79 6"
						text6 = "thing79 6"
					}
					thing79(atPosition = 7) {
						text7 = "thing79 7"
						text4 = "thing79 4"
						text7 = "thing79 7"
					}
					text8 = "thing79 8"
				}
			}
		}
	}

	@Test
	fun testThing79_2() = gwen {
		given {
			server stubs {
				get("/thing79") with json(testR.raw.repos)
			}
			user launches { thing79sScreen("thing79") }
		}

		whenever {
			user selects {
				thing79s {
					action1()
					action2()
					action3()
					thing79(atPosition = 4) {
						action4()
					}
					action5()
					thing79(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing79(atPosition = 7) {
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
				thing79s {
					text1 = "thing79 1"
					text2 = "thing79 2"
					text3 = "thing79 3"
					thing79(atPosition = 4) {
						text4 = "thing79 4"
					}
					text5 = "thing79 5"
					thing79(atPosition = 6) {
						text6 = "thing79 6"
						text6 = "thing79 6"
						text6 = "thing79 6"
					}
					thing79(atPosition = 7) {
						text7 = "thing79 7"
						text4 = "thing79 4"
						text7 = "thing79 7"
					}
					text8 = "thing79 8"
				}
			}
		}
	}

	@Test
	fun testThing79_3() = gwen {
		given {
			server stubs {
				get("/thing79") with json(testR.raw.repos)
			}
			user launches { thing79sScreen("thing79") }
		}

		whenever {
			user selects {
				thing79s {
					action1()
					action2()
					action3()
					thing79(atPosition = 4) {
						action4()
					}
					action5()
					thing79(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing79(atPosition = 7) {
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
				thing79s {
					text1 = "thing79 1"
					text2 = "thing79 2"
					text3 = "thing79 3"
					thing79(atPosition = 4) {
						text4 = "thing79 4"
					}
					text5 = "thing79 5"
					thing79(atPosition = 6) {
						text6 = "thing79 6"
						text6 = "thing79 6"
						text6 = "thing79 6"
					}
					thing79(atPosition = 7) {
						text7 = "thing79 7"
						text4 = "thing79 4"
						text7 = "thing79 7"
					}
					text8 = "thing79 8"
				}
			}
		}
	}

	@Test
	fun testThing79_4() = gwen {
		given {
			server stubs {
				get("/thing79") with json(testR.raw.repos)
			}
			user launches { thing79sScreen("thing79") }
		}

		whenever {
			user selects {
				thing79s {
					action1()
					action2()
					action3()
					thing79(atPosition = 4) {
						action4()
					}
					action5()
					thing79(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing79(atPosition = 7) {
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
				thing79s {
					text1 = "thing79 1"
					text2 = "thing79 2"
					text3 = "thing79 3"
					thing79(atPosition = 4) {
						text4 = "thing79 4"
					}
					text5 = "thing79 5"
					thing79(atPosition = 6) {
						text6 = "thing79 6"
						text6 = "thing79 6"
						text6 = "thing79 6"
					}
					thing79(atPosition = 7) {
						text7 = "thing79 7"
						text4 = "thing79 4"
						text7 = "thing79 7"
					}
					text8 = "thing79 8"
				}
			}
		}
	}

	@Test
	fun testThing79_5() = gwen {
		given {
			server stubs {
				get("/thing79") with json(testR.raw.repos)
			}
			user launches { thing79sScreen("thing79") }
		}

		whenever {
			user selects {
				thing79s {
					action1()
					action2()
					action3()
					thing79(atPosition = 4) {
						action4()
					}
					action5()
					thing79(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing79(atPosition = 7) {
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
				thing79s {
					text1 = "thing79 1"
					text2 = "thing79 2"
					text3 = "thing79 3"
					thing79(atPosition = 4) {
						text4 = "thing79 4"
					}
					text5 = "thing79 5"
					thing79(atPosition = 6) {
						text6 = "thing79 6"
						text6 = "thing79 6"
						text6 = "thing79 6"
					}
					thing79(atPosition = 7) {
						text7 = "thing79 7"
						text4 = "thing79 4"
						text7 = "thing79 7"
					}
					text8 = "thing79 8"
				}
			}
		}
	}
}
