package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing49.thing49s
import net.twisterrob.real.app.test.dsls.thing49.thing49sScreen
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
class Thing49Test : UiTest() {

	@Test
	fun testThing49_1() = gwen {
		given {
			server stubs {
				get("/thing49") with json(testR.raw.repos)
			}
			user launches { thing49sScreen("thing49") }
		}

		whenever {
			user selects {
				thing49s {
					action1()
					action2()
					action3()
					thing49(atPosition = 4) {
						action4()
					}
					action5()
					thing49(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing49(atPosition = 7) {
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
				thing49s {
					text1 = "thing49 1"
					text2 = "thing49 2"
					text3 = "thing49 3"
					thing49(atPosition = 4) {
						text4 = "thing49 4"
					}
					text5 = "thing49 5"
					thing49(atPosition = 6) {
						text6 = "thing49 6"
						text6 = "thing49 6"
						text6 = "thing49 6"
					}
					thing49(atPosition = 7) {
						text7 = "thing49 7"
						text4 = "thing49 4"
						text7 = "thing49 7"
					}
					text8 = "thing49 8"
				}
			}
		}
	}

	@Test
	fun testThing49_2() = gwen {
		given {
			server stubs {
				get("/thing49") with json(testR.raw.repos)
			}
			user launches { thing49sScreen("thing49") }
		}

		whenever {
			user selects {
				thing49s {
					action1()
					action2()
					action3()
					thing49(atPosition = 4) {
						action4()
					}
					action5()
					thing49(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing49(atPosition = 7) {
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
				thing49s {
					text1 = "thing49 1"
					text2 = "thing49 2"
					text3 = "thing49 3"
					thing49(atPosition = 4) {
						text4 = "thing49 4"
					}
					text5 = "thing49 5"
					thing49(atPosition = 6) {
						text6 = "thing49 6"
						text6 = "thing49 6"
						text6 = "thing49 6"
					}
					thing49(atPosition = 7) {
						text7 = "thing49 7"
						text4 = "thing49 4"
						text7 = "thing49 7"
					}
					text8 = "thing49 8"
				}
			}
		}
	}

	@Test
	fun testThing49_3() = gwen {
		given {
			server stubs {
				get("/thing49") with json(testR.raw.repos)
			}
			user launches { thing49sScreen("thing49") }
		}

		whenever {
			user selects {
				thing49s {
					action1()
					action2()
					action3()
					thing49(atPosition = 4) {
						action4()
					}
					action5()
					thing49(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing49(atPosition = 7) {
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
				thing49s {
					text1 = "thing49 1"
					text2 = "thing49 2"
					text3 = "thing49 3"
					thing49(atPosition = 4) {
						text4 = "thing49 4"
					}
					text5 = "thing49 5"
					thing49(atPosition = 6) {
						text6 = "thing49 6"
						text6 = "thing49 6"
						text6 = "thing49 6"
					}
					thing49(atPosition = 7) {
						text7 = "thing49 7"
						text4 = "thing49 4"
						text7 = "thing49 7"
					}
					text8 = "thing49 8"
				}
			}
		}
	}

	@Test
	fun testThing49_4() = gwen {
		given {
			server stubs {
				get("/thing49") with json(testR.raw.repos)
			}
			user launches { thing49sScreen("thing49") }
		}

		whenever {
			user selects {
				thing49s {
					action1()
					action2()
					action3()
					thing49(atPosition = 4) {
						action4()
					}
					action5()
					thing49(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing49(atPosition = 7) {
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
				thing49s {
					text1 = "thing49 1"
					text2 = "thing49 2"
					text3 = "thing49 3"
					thing49(atPosition = 4) {
						text4 = "thing49 4"
					}
					text5 = "thing49 5"
					thing49(atPosition = 6) {
						text6 = "thing49 6"
						text6 = "thing49 6"
						text6 = "thing49 6"
					}
					thing49(atPosition = 7) {
						text7 = "thing49 7"
						text4 = "thing49 4"
						text7 = "thing49 7"
					}
					text8 = "thing49 8"
				}
			}
		}
	}

	@Test
	fun testThing49_5() = gwen {
		given {
			server stubs {
				get("/thing49") with json(testR.raw.repos)
			}
			user launches { thing49sScreen("thing49") }
		}

		whenever {
			user selects {
				thing49s {
					action1()
					action2()
					action3()
					thing49(atPosition = 4) {
						action4()
					}
					action5()
					thing49(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing49(atPosition = 7) {
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
				thing49s {
					text1 = "thing49 1"
					text2 = "thing49 2"
					text3 = "thing49 3"
					thing49(atPosition = 4) {
						text4 = "thing49 4"
					}
					text5 = "thing49 5"
					thing49(atPosition = 6) {
						text6 = "thing49 6"
						text6 = "thing49 6"
						text6 = "thing49 6"
					}
					thing49(atPosition = 7) {
						text7 = "thing49 7"
						text4 = "thing49 4"
						text7 = "thing49 7"
					}
					text8 = "thing49 8"
				}
			}
		}
	}
}
