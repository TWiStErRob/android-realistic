package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing25.thing25s
import net.twisterrob.real.app.test.dsls.thing25.thing25sScreen
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
class Thing25Test : UiTest() {

	@Test
	fun testThing25_1() = gwen {
		given {
			server stubs {
				get("/thing25") with json(testR.raw.repos)
			}
			user launches { thing25sScreen("thing25") }
		}

		whenever {
			user selects {
				thing25s {
					action1()
					action2()
					action3()
					thing25(atPosition = 4) {
						action4()
					}
					action5()
					thing25(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing25(atPosition = 7) {
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
				thing25s {
					text1 = "thing25 1"
					text2 = "thing25 2"
					text3 = "thing25 3"
					thing25(atPosition = 4) {
						text4 = "thing25 4"
					}
					text5 = "thing25 5"
					thing25(atPosition = 6) {
						text6 = "thing25 6"
						text6 = "thing25 6"
						text6 = "thing25 6"
					}
					thing25(atPosition = 7) {
						text7 = "thing25 7"
						text4 = "thing25 4"
						text7 = "thing25 7"
					}
					text8 = "thing25 8"
				}
			}
		}
	}

	@Test
	fun testThing25_2() = gwen {
		given {
			server stubs {
				get("/thing25") with json(testR.raw.repos)
			}
			user launches { thing25sScreen("thing25") }
		}

		whenever {
			user selects {
				thing25s {
					action1()
					action2()
					action3()
					thing25(atPosition = 4) {
						action4()
					}
					action5()
					thing25(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing25(atPosition = 7) {
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
				thing25s {
					text1 = "thing25 1"
					text2 = "thing25 2"
					text3 = "thing25 3"
					thing25(atPosition = 4) {
						text4 = "thing25 4"
					}
					text5 = "thing25 5"
					thing25(atPosition = 6) {
						text6 = "thing25 6"
						text6 = "thing25 6"
						text6 = "thing25 6"
					}
					thing25(atPosition = 7) {
						text7 = "thing25 7"
						text4 = "thing25 4"
						text7 = "thing25 7"
					}
					text8 = "thing25 8"
				}
			}
		}
	}

	@Test
	fun testThing25_3() = gwen {
		given {
			server stubs {
				get("/thing25") with json(testR.raw.repos)
			}
			user launches { thing25sScreen("thing25") }
		}

		whenever {
			user selects {
				thing25s {
					action1()
					action2()
					action3()
					thing25(atPosition = 4) {
						action4()
					}
					action5()
					thing25(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing25(atPosition = 7) {
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
				thing25s {
					text1 = "thing25 1"
					text2 = "thing25 2"
					text3 = "thing25 3"
					thing25(atPosition = 4) {
						text4 = "thing25 4"
					}
					text5 = "thing25 5"
					thing25(atPosition = 6) {
						text6 = "thing25 6"
						text6 = "thing25 6"
						text6 = "thing25 6"
					}
					thing25(atPosition = 7) {
						text7 = "thing25 7"
						text4 = "thing25 4"
						text7 = "thing25 7"
					}
					text8 = "thing25 8"
				}
			}
		}
	}

	@Test
	fun testThing25_4() = gwen {
		given {
			server stubs {
				get("/thing25") with json(testR.raw.repos)
			}
			user launches { thing25sScreen("thing25") }
		}

		whenever {
			user selects {
				thing25s {
					action1()
					action2()
					action3()
					thing25(atPosition = 4) {
						action4()
					}
					action5()
					thing25(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing25(atPosition = 7) {
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
				thing25s {
					text1 = "thing25 1"
					text2 = "thing25 2"
					text3 = "thing25 3"
					thing25(atPosition = 4) {
						text4 = "thing25 4"
					}
					text5 = "thing25 5"
					thing25(atPosition = 6) {
						text6 = "thing25 6"
						text6 = "thing25 6"
						text6 = "thing25 6"
					}
					thing25(atPosition = 7) {
						text7 = "thing25 7"
						text4 = "thing25 4"
						text7 = "thing25 7"
					}
					text8 = "thing25 8"
				}
			}
		}
	}

	@Test
	fun testThing25_5() = gwen {
		given {
			server stubs {
				get("/thing25") with json(testR.raw.repos)
			}
			user launches { thing25sScreen("thing25") }
		}

		whenever {
			user selects {
				thing25s {
					action1()
					action2()
					action3()
					thing25(atPosition = 4) {
						action4()
					}
					action5()
					thing25(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing25(atPosition = 7) {
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
				thing25s {
					text1 = "thing25 1"
					text2 = "thing25 2"
					text3 = "thing25 3"
					thing25(atPosition = 4) {
						text4 = "thing25 4"
					}
					text5 = "thing25 5"
					thing25(atPosition = 6) {
						text6 = "thing25 6"
						text6 = "thing25 6"
						text6 = "thing25 6"
					}
					thing25(atPosition = 7) {
						text7 = "thing25 7"
						text4 = "thing25 4"
						text7 = "thing25 7"
					}
					text8 = "thing25 8"
				}
			}
		}
	}
}
