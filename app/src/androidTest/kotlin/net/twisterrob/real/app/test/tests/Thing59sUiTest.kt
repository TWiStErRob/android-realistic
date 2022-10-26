package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing59.thing59s
import net.twisterrob.real.app.test.dsls.thing59.thing59sScreen
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
class Thing59Test : UiTest() {

	@Test
	fun testThing59_1() = gwen {
		given {
			server stubs {
				get("/thing59") with json(testR.raw.repos)
			}
			user launches { thing59sScreen("thing59") }
		}

		whenever {
			user selects {
				thing59s {
					action1()
					action2()
					action3()
					thing59(atPosition = 4) {
						action4()
					}
					action5()
					thing59(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing59(atPosition = 7) {
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
				thing59s {
					text1 = "thing59 1"
					text2 = "thing59 2"
					text3 = "thing59 3"
					thing59(atPosition = 4) {
						text4 = "thing59 4"
					}
					text5 = "thing59 5"
					thing59(atPosition = 6) {
						text6 = "thing59 6"
						text6 = "thing59 6"
						text6 = "thing59 6"
					}
					thing59(atPosition = 7) {
						text7 = "thing59 7"
						text4 = "thing59 4"
						text7 = "thing59 7"
					}
					text8 = "thing59 8"
				}
			}
		}
	}

	@Test
	fun testThing59_2() = gwen {
		given {
			server stubs {
				get("/thing59") with json(testR.raw.repos)
			}
			user launches { thing59sScreen("thing59") }
		}

		whenever {
			user selects {
				thing59s {
					action1()
					action2()
					action3()
					thing59(atPosition = 4) {
						action4()
					}
					action5()
					thing59(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing59(atPosition = 7) {
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
				thing59s {
					text1 = "thing59 1"
					text2 = "thing59 2"
					text3 = "thing59 3"
					thing59(atPosition = 4) {
						text4 = "thing59 4"
					}
					text5 = "thing59 5"
					thing59(atPosition = 6) {
						text6 = "thing59 6"
						text6 = "thing59 6"
						text6 = "thing59 6"
					}
					thing59(atPosition = 7) {
						text7 = "thing59 7"
						text4 = "thing59 4"
						text7 = "thing59 7"
					}
					text8 = "thing59 8"
				}
			}
		}
	}

	@Test
	fun testThing59_3() = gwen {
		given {
			server stubs {
				get("/thing59") with json(testR.raw.repos)
			}
			user launches { thing59sScreen("thing59") }
		}

		whenever {
			user selects {
				thing59s {
					action1()
					action2()
					action3()
					thing59(atPosition = 4) {
						action4()
					}
					action5()
					thing59(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing59(atPosition = 7) {
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
				thing59s {
					text1 = "thing59 1"
					text2 = "thing59 2"
					text3 = "thing59 3"
					thing59(atPosition = 4) {
						text4 = "thing59 4"
					}
					text5 = "thing59 5"
					thing59(atPosition = 6) {
						text6 = "thing59 6"
						text6 = "thing59 6"
						text6 = "thing59 6"
					}
					thing59(atPosition = 7) {
						text7 = "thing59 7"
						text4 = "thing59 4"
						text7 = "thing59 7"
					}
					text8 = "thing59 8"
				}
			}
		}
	}

	@Test
	fun testThing59_4() = gwen {
		given {
			server stubs {
				get("/thing59") with json(testR.raw.repos)
			}
			user launches { thing59sScreen("thing59") }
		}

		whenever {
			user selects {
				thing59s {
					action1()
					action2()
					action3()
					thing59(atPosition = 4) {
						action4()
					}
					action5()
					thing59(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing59(atPosition = 7) {
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
				thing59s {
					text1 = "thing59 1"
					text2 = "thing59 2"
					text3 = "thing59 3"
					thing59(atPosition = 4) {
						text4 = "thing59 4"
					}
					text5 = "thing59 5"
					thing59(atPosition = 6) {
						text6 = "thing59 6"
						text6 = "thing59 6"
						text6 = "thing59 6"
					}
					thing59(atPosition = 7) {
						text7 = "thing59 7"
						text4 = "thing59 4"
						text7 = "thing59 7"
					}
					text8 = "thing59 8"
				}
			}
		}
	}

	@Test
	fun testThing59_5() = gwen {
		given {
			server stubs {
				get("/thing59") with json(testR.raw.repos)
			}
			user launches { thing59sScreen("thing59") }
		}

		whenever {
			user selects {
				thing59s {
					action1()
					action2()
					action3()
					thing59(atPosition = 4) {
						action4()
					}
					action5()
					thing59(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing59(atPosition = 7) {
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
				thing59s {
					text1 = "thing59 1"
					text2 = "thing59 2"
					text3 = "thing59 3"
					thing59(atPosition = 4) {
						text4 = "thing59 4"
					}
					text5 = "thing59 5"
					thing59(atPosition = 6) {
						text6 = "thing59 6"
						text6 = "thing59 6"
						text6 = "thing59 6"
					}
					thing59(atPosition = 7) {
						text7 = "thing59 7"
						text4 = "thing59 4"
						text7 = "thing59 7"
					}
					text8 = "thing59 8"
				}
			}
		}
	}
}
