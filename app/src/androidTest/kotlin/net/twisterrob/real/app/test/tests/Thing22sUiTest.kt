package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing22.thing22s
import net.twisterrob.real.app.test.dsls.thing22.thing22sScreen
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
class Thing22Test : UiTest() {

	@Test
	fun testThing22_1() = gwen {
		given {
			server stubs {
				get("/thing22") with json(testR.raw.repos)
			}
			user launches { thing22sScreen("thing22") }
		}

		whenever {
			user selects {
				thing22s {
					action1()
					action2()
					action3()
					thing22(atPosition = 4) {
						action4()
					}
					action5()
					thing22(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing22(atPosition = 7) {
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
				thing22s {
					text1 = "thing22 1"
					text2 = "thing22 2"
					text3 = "thing22 3"
					thing22(atPosition = 4) {
						text4 = "thing22 4"
					}
					text5 = "thing22 5"
					thing22(atPosition = 6) {
						text6 = "thing22 6"
						text6 = "thing22 6"
						text6 = "thing22 6"
					}
					thing22(atPosition = 7) {
						text7 = "thing22 7"
						text4 = "thing22 4"
						text7 = "thing22 7"
					}
					text8 = "thing22 8"
				}
			}
		}
	}

	@Test
	fun testThing22_2() = gwen {
		given {
			server stubs {
				get("/thing22") with json(testR.raw.repos)
			}
			user launches { thing22sScreen("thing22") }
		}

		whenever {
			user selects {
				thing22s {
					action1()
					action2()
					action3()
					thing22(atPosition = 4) {
						action4()
					}
					action5()
					thing22(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing22(atPosition = 7) {
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
				thing22s {
					text1 = "thing22 1"
					text2 = "thing22 2"
					text3 = "thing22 3"
					thing22(atPosition = 4) {
						text4 = "thing22 4"
					}
					text5 = "thing22 5"
					thing22(atPosition = 6) {
						text6 = "thing22 6"
						text6 = "thing22 6"
						text6 = "thing22 6"
					}
					thing22(atPosition = 7) {
						text7 = "thing22 7"
						text4 = "thing22 4"
						text7 = "thing22 7"
					}
					text8 = "thing22 8"
				}
			}
		}
	}

	@Test
	fun testThing22_3() = gwen {
		given {
			server stubs {
				get("/thing22") with json(testR.raw.repos)
			}
			user launches { thing22sScreen("thing22") }
		}

		whenever {
			user selects {
				thing22s {
					action1()
					action2()
					action3()
					thing22(atPosition = 4) {
						action4()
					}
					action5()
					thing22(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing22(atPosition = 7) {
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
				thing22s {
					text1 = "thing22 1"
					text2 = "thing22 2"
					text3 = "thing22 3"
					thing22(atPosition = 4) {
						text4 = "thing22 4"
					}
					text5 = "thing22 5"
					thing22(atPosition = 6) {
						text6 = "thing22 6"
						text6 = "thing22 6"
						text6 = "thing22 6"
					}
					thing22(atPosition = 7) {
						text7 = "thing22 7"
						text4 = "thing22 4"
						text7 = "thing22 7"
					}
					text8 = "thing22 8"
				}
			}
		}
	}

	@Test
	fun testThing22_4() = gwen {
		given {
			server stubs {
				get("/thing22") with json(testR.raw.repos)
			}
			user launches { thing22sScreen("thing22") }
		}

		whenever {
			user selects {
				thing22s {
					action1()
					action2()
					action3()
					thing22(atPosition = 4) {
						action4()
					}
					action5()
					thing22(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing22(atPosition = 7) {
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
				thing22s {
					text1 = "thing22 1"
					text2 = "thing22 2"
					text3 = "thing22 3"
					thing22(atPosition = 4) {
						text4 = "thing22 4"
					}
					text5 = "thing22 5"
					thing22(atPosition = 6) {
						text6 = "thing22 6"
						text6 = "thing22 6"
						text6 = "thing22 6"
					}
					thing22(atPosition = 7) {
						text7 = "thing22 7"
						text4 = "thing22 4"
						text7 = "thing22 7"
					}
					text8 = "thing22 8"
				}
			}
		}
	}

	@Test
	fun testThing22_5() = gwen {
		given {
			server stubs {
				get("/thing22") with json(testR.raw.repos)
			}
			user launches { thing22sScreen("thing22") }
		}

		whenever {
			user selects {
				thing22s {
					action1()
					action2()
					action3()
					thing22(atPosition = 4) {
						action4()
					}
					action5()
					thing22(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing22(atPosition = 7) {
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
				thing22s {
					text1 = "thing22 1"
					text2 = "thing22 2"
					text3 = "thing22 3"
					thing22(atPosition = 4) {
						text4 = "thing22 4"
					}
					text5 = "thing22 5"
					thing22(atPosition = 6) {
						text6 = "thing22 6"
						text6 = "thing22 6"
						text6 = "thing22 6"
					}
					thing22(atPosition = 7) {
						text7 = "thing22 7"
						text4 = "thing22 4"
						text7 = "thing22 7"
					}
					text8 = "thing22 8"
				}
			}
		}
	}
}
