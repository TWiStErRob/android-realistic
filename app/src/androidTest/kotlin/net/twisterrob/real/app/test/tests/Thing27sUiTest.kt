package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing27.thing27s
import net.twisterrob.real.app.test.dsls.thing27.thing27sScreen
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
class Thing27Test : UiTest() {

	@Test
	fun testThing27_1() = gwen {
		given {
			server stubs {
				get("/thing27") with json(testR.raw.repos)
			}
			user launches { thing27sScreen("thing27") }
		}

		whenever {
			user selects {
				thing27s {
					action1()
					action2()
					action3()
					thing27(atPosition = 4) {
						action4()
					}
					action5()
					thing27(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing27(atPosition = 7) {
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
				thing27s {
					text1 = "thing27 1"
					text2 = "thing27 2"
					text3 = "thing27 3"
					thing27(atPosition = 4) {
						text4 = "thing27 4"
					}
					text5 = "thing27 5"
					thing27(atPosition = 6) {
						text6 = "thing27 6"
						text6 = "thing27 6"
						text6 = "thing27 6"
					}
					thing27(atPosition = 7) {
						text7 = "thing27 7"
						text4 = "thing27 4"
						text7 = "thing27 7"
					}
					text8 = "thing27 8"
				}
			}
		}
	}

	@Test
	fun testThing27_2() = gwen {
		given {
			server stubs {
				get("/thing27") with json(testR.raw.repos)
			}
			user launches { thing27sScreen("thing27") }
		}

		whenever {
			user selects {
				thing27s {
					action1()
					action2()
					action3()
					thing27(atPosition = 4) {
						action4()
					}
					action5()
					thing27(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing27(atPosition = 7) {
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
				thing27s {
					text1 = "thing27 1"
					text2 = "thing27 2"
					text3 = "thing27 3"
					thing27(atPosition = 4) {
						text4 = "thing27 4"
					}
					text5 = "thing27 5"
					thing27(atPosition = 6) {
						text6 = "thing27 6"
						text6 = "thing27 6"
						text6 = "thing27 6"
					}
					thing27(atPosition = 7) {
						text7 = "thing27 7"
						text4 = "thing27 4"
						text7 = "thing27 7"
					}
					text8 = "thing27 8"
				}
			}
		}
	}

	@Test
	fun testThing27_3() = gwen {
		given {
			server stubs {
				get("/thing27") with json(testR.raw.repos)
			}
			user launches { thing27sScreen("thing27") }
		}

		whenever {
			user selects {
				thing27s {
					action1()
					action2()
					action3()
					thing27(atPosition = 4) {
						action4()
					}
					action5()
					thing27(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing27(atPosition = 7) {
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
				thing27s {
					text1 = "thing27 1"
					text2 = "thing27 2"
					text3 = "thing27 3"
					thing27(atPosition = 4) {
						text4 = "thing27 4"
					}
					text5 = "thing27 5"
					thing27(atPosition = 6) {
						text6 = "thing27 6"
						text6 = "thing27 6"
						text6 = "thing27 6"
					}
					thing27(atPosition = 7) {
						text7 = "thing27 7"
						text4 = "thing27 4"
						text7 = "thing27 7"
					}
					text8 = "thing27 8"
				}
			}
		}
	}

	@Test
	fun testThing27_4() = gwen {
		given {
			server stubs {
				get("/thing27") with json(testR.raw.repos)
			}
			user launches { thing27sScreen("thing27") }
		}

		whenever {
			user selects {
				thing27s {
					action1()
					action2()
					action3()
					thing27(atPosition = 4) {
						action4()
					}
					action5()
					thing27(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing27(atPosition = 7) {
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
				thing27s {
					text1 = "thing27 1"
					text2 = "thing27 2"
					text3 = "thing27 3"
					thing27(atPosition = 4) {
						text4 = "thing27 4"
					}
					text5 = "thing27 5"
					thing27(atPosition = 6) {
						text6 = "thing27 6"
						text6 = "thing27 6"
						text6 = "thing27 6"
					}
					thing27(atPosition = 7) {
						text7 = "thing27 7"
						text4 = "thing27 4"
						text7 = "thing27 7"
					}
					text8 = "thing27 8"
				}
			}
		}
	}

	@Test
	fun testThing27_5() = gwen {
		given {
			server stubs {
				get("/thing27") with json(testR.raw.repos)
			}
			user launches { thing27sScreen("thing27") }
		}

		whenever {
			user selects {
				thing27s {
					action1()
					action2()
					action3()
					thing27(atPosition = 4) {
						action4()
					}
					action5()
					thing27(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing27(atPosition = 7) {
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
				thing27s {
					text1 = "thing27 1"
					text2 = "thing27 2"
					text3 = "thing27 3"
					thing27(atPosition = 4) {
						text4 = "thing27 4"
					}
					text5 = "thing27 5"
					thing27(atPosition = 6) {
						text6 = "thing27 6"
						text6 = "thing27 6"
						text6 = "thing27 6"
					}
					thing27(atPosition = 7) {
						text7 = "thing27 7"
						text4 = "thing27 4"
						text7 = "thing27 7"
					}
					text8 = "thing27 8"
				}
			}
		}
	}
}
