package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing46.thing46s
import net.twisterrob.real.app.test.dsls.thing46.thing46sScreen
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
class Thing46Test : UiTest() {

	@Test
	fun testThing46_1() = gwen {
		given {
			server stubs {
				get("/thing46") with json(testR.raw.repos)
			}
			user launches { thing46sScreen("thing46") }
		}

		whenever {
			user selects {
				thing46s {
					action1()
					action2()
					action3()
					thing46(atPosition = 4) {
						action4()
					}
					action5()
					thing46(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing46(atPosition = 7) {
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
				thing46s {
					text1 = "thing46 1"
					text2 = "thing46 2"
					text3 = "thing46 3"
					thing46(atPosition = 4) {
						text4 = "thing46 4"
					}
					text5 = "thing46 5"
					thing46(atPosition = 6) {
						text6 = "thing46 6"
						text6 = "thing46 6"
						text6 = "thing46 6"
					}
					thing46(atPosition = 7) {
						text7 = "thing46 7"
						text4 = "thing46 4"
						text7 = "thing46 7"
					}
					text8 = "thing46 8"
				}
			}
		}
	}

	@Test
	fun testThing46_2() = gwen {
		given {
			server stubs {
				get("/thing46") with json(testR.raw.repos)
			}
			user launches { thing46sScreen("thing46") }
		}

		whenever {
			user selects {
				thing46s {
					action1()
					action2()
					action3()
					thing46(atPosition = 4) {
						action4()
					}
					action5()
					thing46(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing46(atPosition = 7) {
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
				thing46s {
					text1 = "thing46 1"
					text2 = "thing46 2"
					text3 = "thing46 3"
					thing46(atPosition = 4) {
						text4 = "thing46 4"
					}
					text5 = "thing46 5"
					thing46(atPosition = 6) {
						text6 = "thing46 6"
						text6 = "thing46 6"
						text6 = "thing46 6"
					}
					thing46(atPosition = 7) {
						text7 = "thing46 7"
						text4 = "thing46 4"
						text7 = "thing46 7"
					}
					text8 = "thing46 8"
				}
			}
		}
	}

	@Test
	fun testThing46_3() = gwen {
		given {
			server stubs {
				get("/thing46") with json(testR.raw.repos)
			}
			user launches { thing46sScreen("thing46") }
		}

		whenever {
			user selects {
				thing46s {
					action1()
					action2()
					action3()
					thing46(atPosition = 4) {
						action4()
					}
					action5()
					thing46(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing46(atPosition = 7) {
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
				thing46s {
					text1 = "thing46 1"
					text2 = "thing46 2"
					text3 = "thing46 3"
					thing46(atPosition = 4) {
						text4 = "thing46 4"
					}
					text5 = "thing46 5"
					thing46(atPosition = 6) {
						text6 = "thing46 6"
						text6 = "thing46 6"
						text6 = "thing46 6"
					}
					thing46(atPosition = 7) {
						text7 = "thing46 7"
						text4 = "thing46 4"
						text7 = "thing46 7"
					}
					text8 = "thing46 8"
				}
			}
		}
	}

	@Test
	fun testThing46_4() = gwen {
		given {
			server stubs {
				get("/thing46") with json(testR.raw.repos)
			}
			user launches { thing46sScreen("thing46") }
		}

		whenever {
			user selects {
				thing46s {
					action1()
					action2()
					action3()
					thing46(atPosition = 4) {
						action4()
					}
					action5()
					thing46(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing46(atPosition = 7) {
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
				thing46s {
					text1 = "thing46 1"
					text2 = "thing46 2"
					text3 = "thing46 3"
					thing46(atPosition = 4) {
						text4 = "thing46 4"
					}
					text5 = "thing46 5"
					thing46(atPosition = 6) {
						text6 = "thing46 6"
						text6 = "thing46 6"
						text6 = "thing46 6"
					}
					thing46(atPosition = 7) {
						text7 = "thing46 7"
						text4 = "thing46 4"
						text7 = "thing46 7"
					}
					text8 = "thing46 8"
				}
			}
		}
	}

	@Test
	fun testThing46_5() = gwen {
		given {
			server stubs {
				get("/thing46") with json(testR.raw.repos)
			}
			user launches { thing46sScreen("thing46") }
		}

		whenever {
			user selects {
				thing46s {
					action1()
					action2()
					action3()
					thing46(atPosition = 4) {
						action4()
					}
					action5()
					thing46(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing46(atPosition = 7) {
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
				thing46s {
					text1 = "thing46 1"
					text2 = "thing46 2"
					text3 = "thing46 3"
					thing46(atPosition = 4) {
						text4 = "thing46 4"
					}
					text5 = "thing46 5"
					thing46(atPosition = 6) {
						text6 = "thing46 6"
						text6 = "thing46 6"
						text6 = "thing46 6"
					}
					thing46(atPosition = 7) {
						text7 = "thing46 7"
						text4 = "thing46 4"
						text7 = "thing46 7"
					}
					text8 = "thing46 8"
				}
			}
		}
	}
}
