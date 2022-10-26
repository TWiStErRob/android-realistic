package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing38.thing38s
import net.twisterrob.real.app.test.dsls.thing38.thing38sScreen
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
class Thing38Test : UiTest() {

	@Test
	fun testThing38_1() = gwen {
		given {
			server stubs {
				get("/thing38") with json(testR.raw.repos)
			}
			user launches { thing38sScreen("thing38") }
		}

		whenever {
			user selects {
				thing38s {
					action1()
					action2()
					action3()
					thing38(atPosition = 4) {
						action4()
					}
					action5()
					thing38(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing38(atPosition = 7) {
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
				thing38s {
					text1 = "thing38 1"
					text2 = "thing38 2"
					text3 = "thing38 3"
					thing38(atPosition = 4) {
						text4 = "thing38 4"
					}
					text5 = "thing38 5"
					thing38(atPosition = 6) {
						text6 = "thing38 6"
						text6 = "thing38 6"
						text6 = "thing38 6"
					}
					thing38(atPosition = 7) {
						text7 = "thing38 7"
						text4 = "thing38 4"
						text7 = "thing38 7"
					}
					text8 = "thing38 8"
				}
			}
		}
	}

	@Test
	fun testThing38_2() = gwen {
		given {
			server stubs {
				get("/thing38") with json(testR.raw.repos)
			}
			user launches { thing38sScreen("thing38") }
		}

		whenever {
			user selects {
				thing38s {
					action1()
					action2()
					action3()
					thing38(atPosition = 4) {
						action4()
					}
					action5()
					thing38(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing38(atPosition = 7) {
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
				thing38s {
					text1 = "thing38 1"
					text2 = "thing38 2"
					text3 = "thing38 3"
					thing38(atPosition = 4) {
						text4 = "thing38 4"
					}
					text5 = "thing38 5"
					thing38(atPosition = 6) {
						text6 = "thing38 6"
						text6 = "thing38 6"
						text6 = "thing38 6"
					}
					thing38(atPosition = 7) {
						text7 = "thing38 7"
						text4 = "thing38 4"
						text7 = "thing38 7"
					}
					text8 = "thing38 8"
				}
			}
		}
	}

	@Test
	fun testThing38_3() = gwen {
		given {
			server stubs {
				get("/thing38") with json(testR.raw.repos)
			}
			user launches { thing38sScreen("thing38") }
		}

		whenever {
			user selects {
				thing38s {
					action1()
					action2()
					action3()
					thing38(atPosition = 4) {
						action4()
					}
					action5()
					thing38(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing38(atPosition = 7) {
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
				thing38s {
					text1 = "thing38 1"
					text2 = "thing38 2"
					text3 = "thing38 3"
					thing38(atPosition = 4) {
						text4 = "thing38 4"
					}
					text5 = "thing38 5"
					thing38(atPosition = 6) {
						text6 = "thing38 6"
						text6 = "thing38 6"
						text6 = "thing38 6"
					}
					thing38(atPosition = 7) {
						text7 = "thing38 7"
						text4 = "thing38 4"
						text7 = "thing38 7"
					}
					text8 = "thing38 8"
				}
			}
		}
	}

	@Test
	fun testThing38_4() = gwen {
		given {
			server stubs {
				get("/thing38") with json(testR.raw.repos)
			}
			user launches { thing38sScreen("thing38") }
		}

		whenever {
			user selects {
				thing38s {
					action1()
					action2()
					action3()
					thing38(atPosition = 4) {
						action4()
					}
					action5()
					thing38(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing38(atPosition = 7) {
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
				thing38s {
					text1 = "thing38 1"
					text2 = "thing38 2"
					text3 = "thing38 3"
					thing38(atPosition = 4) {
						text4 = "thing38 4"
					}
					text5 = "thing38 5"
					thing38(atPosition = 6) {
						text6 = "thing38 6"
						text6 = "thing38 6"
						text6 = "thing38 6"
					}
					thing38(atPosition = 7) {
						text7 = "thing38 7"
						text4 = "thing38 4"
						text7 = "thing38 7"
					}
					text8 = "thing38 8"
				}
			}
		}
	}

	@Test
	fun testThing38_5() = gwen {
		given {
			server stubs {
				get("/thing38") with json(testR.raw.repos)
			}
			user launches { thing38sScreen("thing38") }
		}

		whenever {
			user selects {
				thing38s {
					action1()
					action2()
					action3()
					thing38(atPosition = 4) {
						action4()
					}
					action5()
					thing38(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing38(atPosition = 7) {
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
				thing38s {
					text1 = "thing38 1"
					text2 = "thing38 2"
					text3 = "thing38 3"
					thing38(atPosition = 4) {
						text4 = "thing38 4"
					}
					text5 = "thing38 5"
					thing38(atPosition = 6) {
						text6 = "thing38 6"
						text6 = "thing38 6"
						text6 = "thing38 6"
					}
					thing38(atPosition = 7) {
						text7 = "thing38 7"
						text4 = "thing38 4"
						text7 = "thing38 7"
					}
					text8 = "thing38 8"
				}
			}
		}
	}
}
