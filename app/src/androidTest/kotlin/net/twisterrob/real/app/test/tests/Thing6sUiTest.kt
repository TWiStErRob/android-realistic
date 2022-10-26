package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing6.thing6s
import net.twisterrob.real.app.test.dsls.thing6.thing6sScreen
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
class Thing6Test : UiTest() {

	@Test
	fun testThing6_1() = gwen {
		given {
			server stubs {
				get("/thing6") with json(testR.raw.repos)
			}
			user launches { thing6sScreen("thing6") }
		}

		whenever {
			user selects {
				thing6s {
					action1()
					action2()
					action3()
					thing6(atPosition = 4) {
						action4()
					}
					action5()
					thing6(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing6(atPosition = 7) {
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
				thing6s {
					text1 = "thing6 1"
					text2 = "thing6 2"
					text3 = "thing6 3"
					thing6(atPosition = 4) {
						text4 = "thing6 4"
					}
					text5 = "thing6 5"
					thing6(atPosition = 6) {
						text6 = "thing6 6"
						text6 = "thing6 6"
						text6 = "thing6 6"
					}
					thing6(atPosition = 7) {
						text7 = "thing6 7"
						text4 = "thing6 4"
						text7 = "thing6 7"
					}
					text8 = "thing6 8"
				}
			}
		}
	}

	@Test
	fun testThing6_2() = gwen {
		given {
			server stubs {
				get("/thing6") with json(testR.raw.repos)
			}
			user launches { thing6sScreen("thing6") }
		}

		whenever {
			user selects {
				thing6s {
					action1()
					action2()
					action3()
					thing6(atPosition = 4) {
						action4()
					}
					action5()
					thing6(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing6(atPosition = 7) {
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
				thing6s {
					text1 = "thing6 1"
					text2 = "thing6 2"
					text3 = "thing6 3"
					thing6(atPosition = 4) {
						text4 = "thing6 4"
					}
					text5 = "thing6 5"
					thing6(atPosition = 6) {
						text6 = "thing6 6"
						text6 = "thing6 6"
						text6 = "thing6 6"
					}
					thing6(atPosition = 7) {
						text7 = "thing6 7"
						text4 = "thing6 4"
						text7 = "thing6 7"
					}
					text8 = "thing6 8"
				}
			}
		}
	}

	@Test
	fun testThing6_3() = gwen {
		given {
			server stubs {
				get("/thing6") with json(testR.raw.repos)
			}
			user launches { thing6sScreen("thing6") }
		}

		whenever {
			user selects {
				thing6s {
					action1()
					action2()
					action3()
					thing6(atPosition = 4) {
						action4()
					}
					action5()
					thing6(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing6(atPosition = 7) {
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
				thing6s {
					text1 = "thing6 1"
					text2 = "thing6 2"
					text3 = "thing6 3"
					thing6(atPosition = 4) {
						text4 = "thing6 4"
					}
					text5 = "thing6 5"
					thing6(atPosition = 6) {
						text6 = "thing6 6"
						text6 = "thing6 6"
						text6 = "thing6 6"
					}
					thing6(atPosition = 7) {
						text7 = "thing6 7"
						text4 = "thing6 4"
						text7 = "thing6 7"
					}
					text8 = "thing6 8"
				}
			}
		}
	}

	@Test
	fun testThing6_4() = gwen {
		given {
			server stubs {
				get("/thing6") with json(testR.raw.repos)
			}
			user launches { thing6sScreen("thing6") }
		}

		whenever {
			user selects {
				thing6s {
					action1()
					action2()
					action3()
					thing6(atPosition = 4) {
						action4()
					}
					action5()
					thing6(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing6(atPosition = 7) {
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
				thing6s {
					text1 = "thing6 1"
					text2 = "thing6 2"
					text3 = "thing6 3"
					thing6(atPosition = 4) {
						text4 = "thing6 4"
					}
					text5 = "thing6 5"
					thing6(atPosition = 6) {
						text6 = "thing6 6"
						text6 = "thing6 6"
						text6 = "thing6 6"
					}
					thing6(atPosition = 7) {
						text7 = "thing6 7"
						text4 = "thing6 4"
						text7 = "thing6 7"
					}
					text8 = "thing6 8"
				}
			}
		}
	}

	@Test
	fun testThing6_5() = gwen {
		given {
			server stubs {
				get("/thing6") with json(testR.raw.repos)
			}
			user launches { thing6sScreen("thing6") }
		}

		whenever {
			user selects {
				thing6s {
					action1()
					action2()
					action3()
					thing6(atPosition = 4) {
						action4()
					}
					action5()
					thing6(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing6(atPosition = 7) {
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
				thing6s {
					text1 = "thing6 1"
					text2 = "thing6 2"
					text3 = "thing6 3"
					thing6(atPosition = 4) {
						text4 = "thing6 4"
					}
					text5 = "thing6 5"
					thing6(atPosition = 6) {
						text6 = "thing6 6"
						text6 = "thing6 6"
						text6 = "thing6 6"
					}
					thing6(atPosition = 7) {
						text7 = "thing6 7"
						text4 = "thing6 4"
						text7 = "thing6 7"
					}
					text8 = "thing6 8"
				}
			}
		}
	}
}