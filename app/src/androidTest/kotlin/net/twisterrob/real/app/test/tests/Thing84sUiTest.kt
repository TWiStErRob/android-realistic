package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing84.thing84s
import net.twisterrob.real.app.test.dsls.thing84.thing84sScreen
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
class Thing84Test : UiTest() {

	@Test
	fun testThing84_1() = gwen {
		given {
			server stubs {
				get("/thing84") with json(testR.raw.repos)
			}
			user launches { thing84sScreen("thing84") }
		}

		whenever {
			user selects {
				thing84s {
					action1()
					action2()
					action3()
					thing84(atPosition = 4) {
						action4()
					}
					action5()
					thing84(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing84(atPosition = 7) {
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
				thing84s {
					text1 = "thing84 1"
					text2 = "thing84 2"
					text3 = "thing84 3"
					thing84(atPosition = 4) {
						text4 = "thing84 4"
					}
					text5 = "thing84 5"
					thing84(atPosition = 6) {
						text6 = "thing84 6"
						text6 = "thing84 6"
						text6 = "thing84 6"
					}
					thing84(atPosition = 7) {
						text7 = "thing84 7"
						text4 = "thing84 4"
						text7 = "thing84 7"
					}
					text8 = "thing84 8"
				}
			}
		}
	}

	@Test
	fun testThing84_2() = gwen {
		given {
			server stubs {
				get("/thing84") with json(testR.raw.repos)
			}
			user launches { thing84sScreen("thing84") }
		}

		whenever {
			user selects {
				thing84s {
					action1()
					action2()
					action3()
					thing84(atPosition = 4) {
						action4()
					}
					action5()
					thing84(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing84(atPosition = 7) {
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
				thing84s {
					text1 = "thing84 1"
					text2 = "thing84 2"
					text3 = "thing84 3"
					thing84(atPosition = 4) {
						text4 = "thing84 4"
					}
					text5 = "thing84 5"
					thing84(atPosition = 6) {
						text6 = "thing84 6"
						text6 = "thing84 6"
						text6 = "thing84 6"
					}
					thing84(atPosition = 7) {
						text7 = "thing84 7"
						text4 = "thing84 4"
						text7 = "thing84 7"
					}
					text8 = "thing84 8"
				}
			}
		}
	}

	@Test
	fun testThing84_3() = gwen {
		given {
			server stubs {
				get("/thing84") with json(testR.raw.repos)
			}
			user launches { thing84sScreen("thing84") }
		}

		whenever {
			user selects {
				thing84s {
					action1()
					action2()
					action3()
					thing84(atPosition = 4) {
						action4()
					}
					action5()
					thing84(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing84(atPosition = 7) {
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
				thing84s {
					text1 = "thing84 1"
					text2 = "thing84 2"
					text3 = "thing84 3"
					thing84(atPosition = 4) {
						text4 = "thing84 4"
					}
					text5 = "thing84 5"
					thing84(atPosition = 6) {
						text6 = "thing84 6"
						text6 = "thing84 6"
						text6 = "thing84 6"
					}
					thing84(atPosition = 7) {
						text7 = "thing84 7"
						text4 = "thing84 4"
						text7 = "thing84 7"
					}
					text8 = "thing84 8"
				}
			}
		}
	}

	@Test
	fun testThing84_4() = gwen {
		given {
			server stubs {
				get("/thing84") with json(testR.raw.repos)
			}
			user launches { thing84sScreen("thing84") }
		}

		whenever {
			user selects {
				thing84s {
					action1()
					action2()
					action3()
					thing84(atPosition = 4) {
						action4()
					}
					action5()
					thing84(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing84(atPosition = 7) {
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
				thing84s {
					text1 = "thing84 1"
					text2 = "thing84 2"
					text3 = "thing84 3"
					thing84(atPosition = 4) {
						text4 = "thing84 4"
					}
					text5 = "thing84 5"
					thing84(atPosition = 6) {
						text6 = "thing84 6"
						text6 = "thing84 6"
						text6 = "thing84 6"
					}
					thing84(atPosition = 7) {
						text7 = "thing84 7"
						text4 = "thing84 4"
						text7 = "thing84 7"
					}
					text8 = "thing84 8"
				}
			}
		}
	}

	@Test
	fun testThing84_5() = gwen {
		given {
			server stubs {
				get("/thing84") with json(testR.raw.repos)
			}
			user launches { thing84sScreen("thing84") }
		}

		whenever {
			user selects {
				thing84s {
					action1()
					action2()
					action3()
					thing84(atPosition = 4) {
						action4()
					}
					action5()
					thing84(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing84(atPosition = 7) {
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
				thing84s {
					text1 = "thing84 1"
					text2 = "thing84 2"
					text3 = "thing84 3"
					thing84(atPosition = 4) {
						text4 = "thing84 4"
					}
					text5 = "thing84 5"
					thing84(atPosition = 6) {
						text6 = "thing84 6"
						text6 = "thing84 6"
						text6 = "thing84 6"
					}
					thing84(atPosition = 7) {
						text7 = "thing84 7"
						text4 = "thing84 4"
						text7 = "thing84 7"
					}
					text8 = "thing84 8"
				}
			}
		}
	}
}
