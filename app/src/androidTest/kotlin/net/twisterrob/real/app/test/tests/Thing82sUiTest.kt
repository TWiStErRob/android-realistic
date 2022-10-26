package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing82.thing82s
import net.twisterrob.real.app.test.dsls.thing82.thing82sScreen
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
class Thing82Test : UiTest() {

	@Test
	fun testThing82_1() = gwen {
		given {
			server stubs {
				get("/thing82") with json(testR.raw.repos)
			}
			user launches { thing82sScreen("thing82") }
		}

		whenever {
			user selects {
				thing82s {
					action1()
					action2()
					action3()
					thing82(atPosition = 4) {
						action4()
					}
					action5()
					thing82(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing82(atPosition = 7) {
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
				thing82s {
					text1 = "thing82 1"
					text2 = "thing82 2"
					text3 = "thing82 3"
					thing82(atPosition = 4) {
						text4 = "thing82 4"
					}
					text5 = "thing82 5"
					thing82(atPosition = 6) {
						text6 = "thing82 6"
						text6 = "thing82 6"
						text6 = "thing82 6"
					}
					thing82(atPosition = 7) {
						text7 = "thing82 7"
						text4 = "thing82 4"
						text7 = "thing82 7"
					}
					text8 = "thing82 8"
				}
			}
		}
	}

	@Test
	fun testThing82_2() = gwen {
		given {
			server stubs {
				get("/thing82") with json(testR.raw.repos)
			}
			user launches { thing82sScreen("thing82") }
		}

		whenever {
			user selects {
				thing82s {
					action1()
					action2()
					action3()
					thing82(atPosition = 4) {
						action4()
					}
					action5()
					thing82(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing82(atPosition = 7) {
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
				thing82s {
					text1 = "thing82 1"
					text2 = "thing82 2"
					text3 = "thing82 3"
					thing82(atPosition = 4) {
						text4 = "thing82 4"
					}
					text5 = "thing82 5"
					thing82(atPosition = 6) {
						text6 = "thing82 6"
						text6 = "thing82 6"
						text6 = "thing82 6"
					}
					thing82(atPosition = 7) {
						text7 = "thing82 7"
						text4 = "thing82 4"
						text7 = "thing82 7"
					}
					text8 = "thing82 8"
				}
			}
		}
	}

	@Test
	fun testThing82_3() = gwen {
		given {
			server stubs {
				get("/thing82") with json(testR.raw.repos)
			}
			user launches { thing82sScreen("thing82") }
		}

		whenever {
			user selects {
				thing82s {
					action1()
					action2()
					action3()
					thing82(atPosition = 4) {
						action4()
					}
					action5()
					thing82(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing82(atPosition = 7) {
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
				thing82s {
					text1 = "thing82 1"
					text2 = "thing82 2"
					text3 = "thing82 3"
					thing82(atPosition = 4) {
						text4 = "thing82 4"
					}
					text5 = "thing82 5"
					thing82(atPosition = 6) {
						text6 = "thing82 6"
						text6 = "thing82 6"
						text6 = "thing82 6"
					}
					thing82(atPosition = 7) {
						text7 = "thing82 7"
						text4 = "thing82 4"
						text7 = "thing82 7"
					}
					text8 = "thing82 8"
				}
			}
		}
	}

	@Test
	fun testThing82_4() = gwen {
		given {
			server stubs {
				get("/thing82") with json(testR.raw.repos)
			}
			user launches { thing82sScreen("thing82") }
		}

		whenever {
			user selects {
				thing82s {
					action1()
					action2()
					action3()
					thing82(atPosition = 4) {
						action4()
					}
					action5()
					thing82(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing82(atPosition = 7) {
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
				thing82s {
					text1 = "thing82 1"
					text2 = "thing82 2"
					text3 = "thing82 3"
					thing82(atPosition = 4) {
						text4 = "thing82 4"
					}
					text5 = "thing82 5"
					thing82(atPosition = 6) {
						text6 = "thing82 6"
						text6 = "thing82 6"
						text6 = "thing82 6"
					}
					thing82(atPosition = 7) {
						text7 = "thing82 7"
						text4 = "thing82 4"
						text7 = "thing82 7"
					}
					text8 = "thing82 8"
				}
			}
		}
	}

	@Test
	fun testThing82_5() = gwen {
		given {
			server stubs {
				get("/thing82") with json(testR.raw.repos)
			}
			user launches { thing82sScreen("thing82") }
		}

		whenever {
			user selects {
				thing82s {
					action1()
					action2()
					action3()
					thing82(atPosition = 4) {
						action4()
					}
					action5()
					thing82(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing82(atPosition = 7) {
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
				thing82s {
					text1 = "thing82 1"
					text2 = "thing82 2"
					text3 = "thing82 3"
					thing82(atPosition = 4) {
						text4 = "thing82 4"
					}
					text5 = "thing82 5"
					thing82(atPosition = 6) {
						text6 = "thing82 6"
						text6 = "thing82 6"
						text6 = "thing82 6"
					}
					thing82(atPosition = 7) {
						text7 = "thing82 7"
						text4 = "thing82 4"
						text7 = "thing82 7"
					}
					text8 = "thing82 8"
				}
			}
		}
	}
}
