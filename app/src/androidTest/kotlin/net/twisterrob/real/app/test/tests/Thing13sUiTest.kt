package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing13.thing13s
import net.twisterrob.real.app.test.dsls.thing13.thing13sScreen
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
class Thing13Test : UiTest() {

	@Test
	fun testThing13_1() = gwen {
		given {
			server stubs {
				get("/thing13") with json(testR.raw.repos)
			}
			user launches { thing13sScreen("thing13") }
		}

		whenever {
			user selects {
				thing13s {
					action1()
					action2()
					action3()
					thing13(atPosition = 4) {
						action4()
					}
					action5()
					thing13(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing13(atPosition = 7) {
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
				thing13s {
					text1 = "thing13 1"
					text2 = "thing13 2"
					text3 = "thing13 3"
					thing13(atPosition = 4) {
						text4 = "thing13 4"
					}
					text5 = "thing13 5"
					thing13(atPosition = 6) {
						text6 = "thing13 6"
						text6 = "thing13 6"
						text6 = "thing13 6"
					}
					thing13(atPosition = 7) {
						text7 = "thing13 7"
						text4 = "thing13 4"
						text7 = "thing13 7"
					}
					text8 = "thing13 8"
				}
			}
		}
	}

	@Test
	fun testThing13_2() = gwen {
		given {
			server stubs {
				get("/thing13") with json(testR.raw.repos)
			}
			user launches { thing13sScreen("thing13") }
		}

		whenever {
			user selects {
				thing13s {
					action1()
					action2()
					action3()
					thing13(atPosition = 4) {
						action4()
					}
					action5()
					thing13(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing13(atPosition = 7) {
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
				thing13s {
					text1 = "thing13 1"
					text2 = "thing13 2"
					text3 = "thing13 3"
					thing13(atPosition = 4) {
						text4 = "thing13 4"
					}
					text5 = "thing13 5"
					thing13(atPosition = 6) {
						text6 = "thing13 6"
						text6 = "thing13 6"
						text6 = "thing13 6"
					}
					thing13(atPosition = 7) {
						text7 = "thing13 7"
						text4 = "thing13 4"
						text7 = "thing13 7"
					}
					text8 = "thing13 8"
				}
			}
		}
	}

	@Test
	fun testThing13_3() = gwen {
		given {
			server stubs {
				get("/thing13") with json(testR.raw.repos)
			}
			user launches { thing13sScreen("thing13") }
		}

		whenever {
			user selects {
				thing13s {
					action1()
					action2()
					action3()
					thing13(atPosition = 4) {
						action4()
					}
					action5()
					thing13(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing13(atPosition = 7) {
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
				thing13s {
					text1 = "thing13 1"
					text2 = "thing13 2"
					text3 = "thing13 3"
					thing13(atPosition = 4) {
						text4 = "thing13 4"
					}
					text5 = "thing13 5"
					thing13(atPosition = 6) {
						text6 = "thing13 6"
						text6 = "thing13 6"
						text6 = "thing13 6"
					}
					thing13(atPosition = 7) {
						text7 = "thing13 7"
						text4 = "thing13 4"
						text7 = "thing13 7"
					}
					text8 = "thing13 8"
				}
			}
		}
	}

	@Test
	fun testThing13_4() = gwen {
		given {
			server stubs {
				get("/thing13") with json(testR.raw.repos)
			}
			user launches { thing13sScreen("thing13") }
		}

		whenever {
			user selects {
				thing13s {
					action1()
					action2()
					action3()
					thing13(atPosition = 4) {
						action4()
					}
					action5()
					thing13(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing13(atPosition = 7) {
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
				thing13s {
					text1 = "thing13 1"
					text2 = "thing13 2"
					text3 = "thing13 3"
					thing13(atPosition = 4) {
						text4 = "thing13 4"
					}
					text5 = "thing13 5"
					thing13(atPosition = 6) {
						text6 = "thing13 6"
						text6 = "thing13 6"
						text6 = "thing13 6"
					}
					thing13(atPosition = 7) {
						text7 = "thing13 7"
						text4 = "thing13 4"
						text7 = "thing13 7"
					}
					text8 = "thing13 8"
				}
			}
		}
	}

	@Test
	fun testThing13_5() = gwen {
		given {
			server stubs {
				get("/thing13") with json(testR.raw.repos)
			}
			user launches { thing13sScreen("thing13") }
		}

		whenever {
			user selects {
				thing13s {
					action1()
					action2()
					action3()
					thing13(atPosition = 4) {
						action4()
					}
					action5()
					thing13(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing13(atPosition = 7) {
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
				thing13s {
					text1 = "thing13 1"
					text2 = "thing13 2"
					text3 = "thing13 3"
					thing13(atPosition = 4) {
						text4 = "thing13 4"
					}
					text5 = "thing13 5"
					thing13(atPosition = 6) {
						text6 = "thing13 6"
						text6 = "thing13 6"
						text6 = "thing13 6"
					}
					thing13(atPosition = 7) {
						text7 = "thing13 7"
						text4 = "thing13 4"
						text7 = "thing13 7"
					}
					text8 = "thing13 8"
				}
			}
		}
	}
}
