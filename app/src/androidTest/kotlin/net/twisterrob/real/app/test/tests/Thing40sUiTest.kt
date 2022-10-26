package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing40.thing40s
import net.twisterrob.real.app.test.dsls.thing40.thing40sScreen
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
class Thing40Test : UiTest() {

	@Test
	fun testThing40_1() = gwen {
		given {
			server stubs {
				get("/thing40") with json(testR.raw.repos)
			}
			user launches { thing40sScreen("thing40") }
		}

		whenever {
			user selects {
				thing40s {
					action1()
					action2()
					action3()
					thing40(atPosition = 4) {
						action4()
					}
					action5()
					thing40(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing40(atPosition = 7) {
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
				thing40s {
					text1 = "thing40 1"
					text2 = "thing40 2"
					text3 = "thing40 3"
					thing40(atPosition = 4) {
						text4 = "thing40 4"
					}
					text5 = "thing40 5"
					thing40(atPosition = 6) {
						text6 = "thing40 6"
						text6 = "thing40 6"
						text6 = "thing40 6"
					}
					thing40(atPosition = 7) {
						text7 = "thing40 7"
						text4 = "thing40 4"
						text7 = "thing40 7"
					}
					text8 = "thing40 8"
				}
			}
		}
	}

	@Test
	fun testThing40_2() = gwen {
		given {
			server stubs {
				get("/thing40") with json(testR.raw.repos)
			}
			user launches { thing40sScreen("thing40") }
		}

		whenever {
			user selects {
				thing40s {
					action1()
					action2()
					action3()
					thing40(atPosition = 4) {
						action4()
					}
					action5()
					thing40(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing40(atPosition = 7) {
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
				thing40s {
					text1 = "thing40 1"
					text2 = "thing40 2"
					text3 = "thing40 3"
					thing40(atPosition = 4) {
						text4 = "thing40 4"
					}
					text5 = "thing40 5"
					thing40(atPosition = 6) {
						text6 = "thing40 6"
						text6 = "thing40 6"
						text6 = "thing40 6"
					}
					thing40(atPosition = 7) {
						text7 = "thing40 7"
						text4 = "thing40 4"
						text7 = "thing40 7"
					}
					text8 = "thing40 8"
				}
			}
		}
	}

	@Test
	fun testThing40_3() = gwen {
		given {
			server stubs {
				get("/thing40") with json(testR.raw.repos)
			}
			user launches { thing40sScreen("thing40") }
		}

		whenever {
			user selects {
				thing40s {
					action1()
					action2()
					action3()
					thing40(atPosition = 4) {
						action4()
					}
					action5()
					thing40(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing40(atPosition = 7) {
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
				thing40s {
					text1 = "thing40 1"
					text2 = "thing40 2"
					text3 = "thing40 3"
					thing40(atPosition = 4) {
						text4 = "thing40 4"
					}
					text5 = "thing40 5"
					thing40(atPosition = 6) {
						text6 = "thing40 6"
						text6 = "thing40 6"
						text6 = "thing40 6"
					}
					thing40(atPosition = 7) {
						text7 = "thing40 7"
						text4 = "thing40 4"
						text7 = "thing40 7"
					}
					text8 = "thing40 8"
				}
			}
		}
	}

	@Test
	fun testThing40_4() = gwen {
		given {
			server stubs {
				get("/thing40") with json(testR.raw.repos)
			}
			user launches { thing40sScreen("thing40") }
		}

		whenever {
			user selects {
				thing40s {
					action1()
					action2()
					action3()
					thing40(atPosition = 4) {
						action4()
					}
					action5()
					thing40(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing40(atPosition = 7) {
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
				thing40s {
					text1 = "thing40 1"
					text2 = "thing40 2"
					text3 = "thing40 3"
					thing40(atPosition = 4) {
						text4 = "thing40 4"
					}
					text5 = "thing40 5"
					thing40(atPosition = 6) {
						text6 = "thing40 6"
						text6 = "thing40 6"
						text6 = "thing40 6"
					}
					thing40(atPosition = 7) {
						text7 = "thing40 7"
						text4 = "thing40 4"
						text7 = "thing40 7"
					}
					text8 = "thing40 8"
				}
			}
		}
	}

	@Test
	fun testThing40_5() = gwen {
		given {
			server stubs {
				get("/thing40") with json(testR.raw.repos)
			}
			user launches { thing40sScreen("thing40") }
		}

		whenever {
			user selects {
				thing40s {
					action1()
					action2()
					action3()
					thing40(atPosition = 4) {
						action4()
					}
					action5()
					thing40(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing40(atPosition = 7) {
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
				thing40s {
					text1 = "thing40 1"
					text2 = "thing40 2"
					text3 = "thing40 3"
					thing40(atPosition = 4) {
						text4 = "thing40 4"
					}
					text5 = "thing40 5"
					thing40(atPosition = 6) {
						text6 = "thing40 6"
						text6 = "thing40 6"
						text6 = "thing40 6"
					}
					thing40(atPosition = 7) {
						text7 = "thing40 7"
						text4 = "thing40 4"
						text7 = "thing40 7"
					}
					text8 = "thing40 8"
				}
			}
		}
	}
}
