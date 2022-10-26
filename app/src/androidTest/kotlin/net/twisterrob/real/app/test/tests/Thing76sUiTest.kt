package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing76.thing76s
import net.twisterrob.real.app.test.dsls.thing76.thing76sScreen
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
class Thing76Test : UiTest() {

	@Test
	fun testThing76_1() = gwen {
		given {
			server stubs {
				get("/thing76") with json(testR.raw.repos)
			}
			user launches { thing76sScreen("thing76") }
		}

		whenever {
			user selects {
				thing76s {
					action1()
					action2()
					action3()
					thing76(atPosition = 4) {
						action4()
					}
					action5()
					thing76(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing76(atPosition = 7) {
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
				thing76s {
					text1 = "thing76 1"
					text2 = "thing76 2"
					text3 = "thing76 3"
					thing76(atPosition = 4) {
						text4 = "thing76 4"
					}
					text5 = "thing76 5"
					thing76(atPosition = 6) {
						text6 = "thing76 6"
						text6 = "thing76 6"
						text6 = "thing76 6"
					}
					thing76(atPosition = 7) {
						text7 = "thing76 7"
						text4 = "thing76 4"
						text7 = "thing76 7"
					}
					text8 = "thing76 8"
				}
			}
		}
	}

	@Test
	fun testThing76_2() = gwen {
		given {
			server stubs {
				get("/thing76") with json(testR.raw.repos)
			}
			user launches { thing76sScreen("thing76") }
		}

		whenever {
			user selects {
				thing76s {
					action1()
					action2()
					action3()
					thing76(atPosition = 4) {
						action4()
					}
					action5()
					thing76(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing76(atPosition = 7) {
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
				thing76s {
					text1 = "thing76 1"
					text2 = "thing76 2"
					text3 = "thing76 3"
					thing76(atPosition = 4) {
						text4 = "thing76 4"
					}
					text5 = "thing76 5"
					thing76(atPosition = 6) {
						text6 = "thing76 6"
						text6 = "thing76 6"
						text6 = "thing76 6"
					}
					thing76(atPosition = 7) {
						text7 = "thing76 7"
						text4 = "thing76 4"
						text7 = "thing76 7"
					}
					text8 = "thing76 8"
				}
			}
		}
	}

	@Test
	fun testThing76_3() = gwen {
		given {
			server stubs {
				get("/thing76") with json(testR.raw.repos)
			}
			user launches { thing76sScreen("thing76") }
		}

		whenever {
			user selects {
				thing76s {
					action1()
					action2()
					action3()
					thing76(atPosition = 4) {
						action4()
					}
					action5()
					thing76(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing76(atPosition = 7) {
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
				thing76s {
					text1 = "thing76 1"
					text2 = "thing76 2"
					text3 = "thing76 3"
					thing76(atPosition = 4) {
						text4 = "thing76 4"
					}
					text5 = "thing76 5"
					thing76(atPosition = 6) {
						text6 = "thing76 6"
						text6 = "thing76 6"
						text6 = "thing76 6"
					}
					thing76(atPosition = 7) {
						text7 = "thing76 7"
						text4 = "thing76 4"
						text7 = "thing76 7"
					}
					text8 = "thing76 8"
				}
			}
		}
	}

	@Test
	fun testThing76_4() = gwen {
		given {
			server stubs {
				get("/thing76") with json(testR.raw.repos)
			}
			user launches { thing76sScreen("thing76") }
		}

		whenever {
			user selects {
				thing76s {
					action1()
					action2()
					action3()
					thing76(atPosition = 4) {
						action4()
					}
					action5()
					thing76(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing76(atPosition = 7) {
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
				thing76s {
					text1 = "thing76 1"
					text2 = "thing76 2"
					text3 = "thing76 3"
					thing76(atPosition = 4) {
						text4 = "thing76 4"
					}
					text5 = "thing76 5"
					thing76(atPosition = 6) {
						text6 = "thing76 6"
						text6 = "thing76 6"
						text6 = "thing76 6"
					}
					thing76(atPosition = 7) {
						text7 = "thing76 7"
						text4 = "thing76 4"
						text7 = "thing76 7"
					}
					text8 = "thing76 8"
				}
			}
		}
	}

	@Test
	fun testThing76_5() = gwen {
		given {
			server stubs {
				get("/thing76") with json(testR.raw.repos)
			}
			user launches { thing76sScreen("thing76") }
		}

		whenever {
			user selects {
				thing76s {
					action1()
					action2()
					action3()
					thing76(atPosition = 4) {
						action4()
					}
					action5()
					thing76(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing76(atPosition = 7) {
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
				thing76s {
					text1 = "thing76 1"
					text2 = "thing76 2"
					text3 = "thing76 3"
					thing76(atPosition = 4) {
						text4 = "thing76 4"
					}
					text5 = "thing76 5"
					thing76(atPosition = 6) {
						text6 = "thing76 6"
						text6 = "thing76 6"
						text6 = "thing76 6"
					}
					thing76(atPosition = 7) {
						text7 = "thing76 7"
						text4 = "thing76 4"
						text7 = "thing76 7"
					}
					text8 = "thing76 8"
				}
			}
		}
	}
}
