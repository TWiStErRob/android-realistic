package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing80.thing80s
import net.twisterrob.real.app.test.dsls.thing80.thing80sScreen
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
class Thing80Test : UiTest() {

	@Test
	fun testThing80_1() = gwen {
		given {
			server stubs {
				get("/thing80") with json(testR.raw.repos)
			}
			user launches { thing80sScreen("thing80") }
		}

		whenever {
			user selects {
				thing80s {
					action1()
					action2()
					action3()
					thing80(atPosition = 4) {
						action4()
					}
					action5()
					thing80(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing80(atPosition = 7) {
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
				thing80s {
					text1 = "thing80 1"
					text2 = "thing80 2"
					text3 = "thing80 3"
					thing80(atPosition = 4) {
						text4 = "thing80 4"
					}
					text5 = "thing80 5"
					thing80(atPosition = 6) {
						text6 = "thing80 6"
						text6 = "thing80 6"
						text6 = "thing80 6"
					}
					thing80(atPosition = 7) {
						text7 = "thing80 7"
						text4 = "thing80 4"
						text7 = "thing80 7"
					}
					text8 = "thing80 8"
				}
			}
		}
	}

	@Test
	fun testThing80_2() = gwen {
		given {
			server stubs {
				get("/thing80") with json(testR.raw.repos)
			}
			user launches { thing80sScreen("thing80") }
		}

		whenever {
			user selects {
				thing80s {
					action1()
					action2()
					action3()
					thing80(atPosition = 4) {
						action4()
					}
					action5()
					thing80(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing80(atPosition = 7) {
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
				thing80s {
					text1 = "thing80 1"
					text2 = "thing80 2"
					text3 = "thing80 3"
					thing80(atPosition = 4) {
						text4 = "thing80 4"
					}
					text5 = "thing80 5"
					thing80(atPosition = 6) {
						text6 = "thing80 6"
						text6 = "thing80 6"
						text6 = "thing80 6"
					}
					thing80(atPosition = 7) {
						text7 = "thing80 7"
						text4 = "thing80 4"
						text7 = "thing80 7"
					}
					text8 = "thing80 8"
				}
			}
		}
	}

	@Test
	fun testThing80_3() = gwen {
		given {
			server stubs {
				get("/thing80") with json(testR.raw.repos)
			}
			user launches { thing80sScreen("thing80") }
		}

		whenever {
			user selects {
				thing80s {
					action1()
					action2()
					action3()
					thing80(atPosition = 4) {
						action4()
					}
					action5()
					thing80(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing80(atPosition = 7) {
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
				thing80s {
					text1 = "thing80 1"
					text2 = "thing80 2"
					text3 = "thing80 3"
					thing80(atPosition = 4) {
						text4 = "thing80 4"
					}
					text5 = "thing80 5"
					thing80(atPosition = 6) {
						text6 = "thing80 6"
						text6 = "thing80 6"
						text6 = "thing80 6"
					}
					thing80(atPosition = 7) {
						text7 = "thing80 7"
						text4 = "thing80 4"
						text7 = "thing80 7"
					}
					text8 = "thing80 8"
				}
			}
		}
	}

	@Test
	fun testThing80_4() = gwen {
		given {
			server stubs {
				get("/thing80") with json(testR.raw.repos)
			}
			user launches { thing80sScreen("thing80") }
		}

		whenever {
			user selects {
				thing80s {
					action1()
					action2()
					action3()
					thing80(atPosition = 4) {
						action4()
					}
					action5()
					thing80(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing80(atPosition = 7) {
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
				thing80s {
					text1 = "thing80 1"
					text2 = "thing80 2"
					text3 = "thing80 3"
					thing80(atPosition = 4) {
						text4 = "thing80 4"
					}
					text5 = "thing80 5"
					thing80(atPosition = 6) {
						text6 = "thing80 6"
						text6 = "thing80 6"
						text6 = "thing80 6"
					}
					thing80(atPosition = 7) {
						text7 = "thing80 7"
						text4 = "thing80 4"
						text7 = "thing80 7"
					}
					text8 = "thing80 8"
				}
			}
		}
	}

	@Test
	fun testThing80_5() = gwen {
		given {
			server stubs {
				get("/thing80") with json(testR.raw.repos)
			}
			user launches { thing80sScreen("thing80") }
		}

		whenever {
			user selects {
				thing80s {
					action1()
					action2()
					action3()
					thing80(atPosition = 4) {
						action4()
					}
					action5()
					thing80(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing80(atPosition = 7) {
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
				thing80s {
					text1 = "thing80 1"
					text2 = "thing80 2"
					text3 = "thing80 3"
					thing80(atPosition = 4) {
						text4 = "thing80 4"
					}
					text5 = "thing80 5"
					thing80(atPosition = 6) {
						text6 = "thing80 6"
						text6 = "thing80 6"
						text6 = "thing80 6"
					}
					thing80(atPosition = 7) {
						text7 = "thing80 7"
						text4 = "thing80 4"
						text7 = "thing80 7"
					}
					text8 = "thing80 8"
				}
			}
		}
	}
}
