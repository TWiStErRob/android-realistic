package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing14.thing14s
import net.twisterrob.real.app.test.dsls.thing14.thing14sScreen
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
class Thing14Test : UiTest() {

	@Test
	fun testThing14_1() = gwen {
		given {
			server stubs {
				get("/thing14") with json(testR.raw.repos)
			}
			user launches { thing14sScreen("thing14") }
		}

		whenever {
			user selects {
				thing14s {
					action1()
					action2()
					action3()
					thing14(atPosition = 4) {
						action4()
					}
					action5()
					thing14(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing14(atPosition = 7) {
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
				thing14s {
					text1 = "thing14 1"
					text2 = "thing14 2"
					text3 = "thing14 3"
					thing14(atPosition = 4) {
						text4 = "thing14 4"
					}
					text5 = "thing14 5"
					thing14(atPosition = 6) {
						text6 = "thing14 6"
						text6 = "thing14 6"
						text6 = "thing14 6"
					}
					thing14(atPosition = 7) {
						text7 = "thing14 7"
						text4 = "thing14 4"
						text7 = "thing14 7"
					}
					text8 = "thing14 8"
				}
			}
		}
	}

	@Test
	fun testThing14_2() = gwen {
		given {
			server stubs {
				get("/thing14") with json(testR.raw.repos)
			}
			user launches { thing14sScreen("thing14") }
		}

		whenever {
			user selects {
				thing14s {
					action1()
					action2()
					action3()
					thing14(atPosition = 4) {
						action4()
					}
					action5()
					thing14(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing14(atPosition = 7) {
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
				thing14s {
					text1 = "thing14 1"
					text2 = "thing14 2"
					text3 = "thing14 3"
					thing14(atPosition = 4) {
						text4 = "thing14 4"
					}
					text5 = "thing14 5"
					thing14(atPosition = 6) {
						text6 = "thing14 6"
						text6 = "thing14 6"
						text6 = "thing14 6"
					}
					thing14(atPosition = 7) {
						text7 = "thing14 7"
						text4 = "thing14 4"
						text7 = "thing14 7"
					}
					text8 = "thing14 8"
				}
			}
		}
	}

	@Test
	fun testThing14_3() = gwen {
		given {
			server stubs {
				get("/thing14") with json(testR.raw.repos)
			}
			user launches { thing14sScreen("thing14") }
		}

		whenever {
			user selects {
				thing14s {
					action1()
					action2()
					action3()
					thing14(atPosition = 4) {
						action4()
					}
					action5()
					thing14(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing14(atPosition = 7) {
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
				thing14s {
					text1 = "thing14 1"
					text2 = "thing14 2"
					text3 = "thing14 3"
					thing14(atPosition = 4) {
						text4 = "thing14 4"
					}
					text5 = "thing14 5"
					thing14(atPosition = 6) {
						text6 = "thing14 6"
						text6 = "thing14 6"
						text6 = "thing14 6"
					}
					thing14(atPosition = 7) {
						text7 = "thing14 7"
						text4 = "thing14 4"
						text7 = "thing14 7"
					}
					text8 = "thing14 8"
				}
			}
		}
	}

	@Test
	fun testThing14_4() = gwen {
		given {
			server stubs {
				get("/thing14") with json(testR.raw.repos)
			}
			user launches { thing14sScreen("thing14") }
		}

		whenever {
			user selects {
				thing14s {
					action1()
					action2()
					action3()
					thing14(atPosition = 4) {
						action4()
					}
					action5()
					thing14(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing14(atPosition = 7) {
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
				thing14s {
					text1 = "thing14 1"
					text2 = "thing14 2"
					text3 = "thing14 3"
					thing14(atPosition = 4) {
						text4 = "thing14 4"
					}
					text5 = "thing14 5"
					thing14(atPosition = 6) {
						text6 = "thing14 6"
						text6 = "thing14 6"
						text6 = "thing14 6"
					}
					thing14(atPosition = 7) {
						text7 = "thing14 7"
						text4 = "thing14 4"
						text7 = "thing14 7"
					}
					text8 = "thing14 8"
				}
			}
		}
	}

	@Test
	fun testThing14_5() = gwen {
		given {
			server stubs {
				get("/thing14") with json(testR.raw.repos)
			}
			user launches { thing14sScreen("thing14") }
		}

		whenever {
			user selects {
				thing14s {
					action1()
					action2()
					action3()
					thing14(atPosition = 4) {
						action4()
					}
					action5()
					thing14(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing14(atPosition = 7) {
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
				thing14s {
					text1 = "thing14 1"
					text2 = "thing14 2"
					text3 = "thing14 3"
					thing14(atPosition = 4) {
						text4 = "thing14 4"
					}
					text5 = "thing14 5"
					thing14(atPosition = 6) {
						text6 = "thing14 6"
						text6 = "thing14 6"
						text6 = "thing14 6"
					}
					thing14(atPosition = 7) {
						text7 = "thing14 7"
						text4 = "thing14 4"
						text7 = "thing14 7"
					}
					text8 = "thing14 8"
				}
			}
		}
	}
}
