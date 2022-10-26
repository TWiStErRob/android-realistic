package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing51.thing51s
import net.twisterrob.real.app.test.dsls.thing51.thing51sScreen
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
class Thing51Test : UiTest() {

	@Test
	fun testThing51_1() = gwen {
		given {
			server stubs {
				get("/thing51") with json(testR.raw.repos)
			}
			user launches { thing51sScreen("thing51") }
		}

		whenever {
			user selects {
				thing51s {
					action1()
					action2()
					action3()
					thing51(atPosition = 4) {
						action4()
					}
					action5()
					thing51(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing51(atPosition = 7) {
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
				thing51s {
					text1 = "thing51 1"
					text2 = "thing51 2"
					text3 = "thing51 3"
					thing51(atPosition = 4) {
						text4 = "thing51 4"
					}
					text5 = "thing51 5"
					thing51(atPosition = 6) {
						text6 = "thing51 6"
						text6 = "thing51 6"
						text6 = "thing51 6"
					}
					thing51(atPosition = 7) {
						text7 = "thing51 7"
						text4 = "thing51 4"
						text7 = "thing51 7"
					}
					text8 = "thing51 8"
				}
			}
		}
	}

	@Test
	fun testThing51_2() = gwen {
		given {
			server stubs {
				get("/thing51") with json(testR.raw.repos)
			}
			user launches { thing51sScreen("thing51") }
		}

		whenever {
			user selects {
				thing51s {
					action1()
					action2()
					action3()
					thing51(atPosition = 4) {
						action4()
					}
					action5()
					thing51(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing51(atPosition = 7) {
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
				thing51s {
					text1 = "thing51 1"
					text2 = "thing51 2"
					text3 = "thing51 3"
					thing51(atPosition = 4) {
						text4 = "thing51 4"
					}
					text5 = "thing51 5"
					thing51(atPosition = 6) {
						text6 = "thing51 6"
						text6 = "thing51 6"
						text6 = "thing51 6"
					}
					thing51(atPosition = 7) {
						text7 = "thing51 7"
						text4 = "thing51 4"
						text7 = "thing51 7"
					}
					text8 = "thing51 8"
				}
			}
		}
	}

	@Test
	fun testThing51_3() = gwen {
		given {
			server stubs {
				get("/thing51") with json(testR.raw.repos)
			}
			user launches { thing51sScreen("thing51") }
		}

		whenever {
			user selects {
				thing51s {
					action1()
					action2()
					action3()
					thing51(atPosition = 4) {
						action4()
					}
					action5()
					thing51(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing51(atPosition = 7) {
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
				thing51s {
					text1 = "thing51 1"
					text2 = "thing51 2"
					text3 = "thing51 3"
					thing51(atPosition = 4) {
						text4 = "thing51 4"
					}
					text5 = "thing51 5"
					thing51(atPosition = 6) {
						text6 = "thing51 6"
						text6 = "thing51 6"
						text6 = "thing51 6"
					}
					thing51(atPosition = 7) {
						text7 = "thing51 7"
						text4 = "thing51 4"
						text7 = "thing51 7"
					}
					text8 = "thing51 8"
				}
			}
		}
	}

	@Test
	fun testThing51_4() = gwen {
		given {
			server stubs {
				get("/thing51") with json(testR.raw.repos)
			}
			user launches { thing51sScreen("thing51") }
		}

		whenever {
			user selects {
				thing51s {
					action1()
					action2()
					action3()
					thing51(atPosition = 4) {
						action4()
					}
					action5()
					thing51(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing51(atPosition = 7) {
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
				thing51s {
					text1 = "thing51 1"
					text2 = "thing51 2"
					text3 = "thing51 3"
					thing51(atPosition = 4) {
						text4 = "thing51 4"
					}
					text5 = "thing51 5"
					thing51(atPosition = 6) {
						text6 = "thing51 6"
						text6 = "thing51 6"
						text6 = "thing51 6"
					}
					thing51(atPosition = 7) {
						text7 = "thing51 7"
						text4 = "thing51 4"
						text7 = "thing51 7"
					}
					text8 = "thing51 8"
				}
			}
		}
	}

	@Test
	fun testThing51_5() = gwen {
		given {
			server stubs {
				get("/thing51") with json(testR.raw.repos)
			}
			user launches { thing51sScreen("thing51") }
		}

		whenever {
			user selects {
				thing51s {
					action1()
					action2()
					action3()
					thing51(atPosition = 4) {
						action4()
					}
					action5()
					thing51(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing51(atPosition = 7) {
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
				thing51s {
					text1 = "thing51 1"
					text2 = "thing51 2"
					text3 = "thing51 3"
					thing51(atPosition = 4) {
						text4 = "thing51 4"
					}
					text5 = "thing51 5"
					thing51(atPosition = 6) {
						text6 = "thing51 6"
						text6 = "thing51 6"
						text6 = "thing51 6"
					}
					thing51(atPosition = 7) {
						text7 = "thing51 7"
						text4 = "thing51 4"
						text7 = "thing51 7"
					}
					text8 = "thing51 8"
				}
			}
		}
	}
}
