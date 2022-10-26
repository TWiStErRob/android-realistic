package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing1.thing1s
import net.twisterrob.real.app.test.dsls.thing1.thing1sScreen
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
class Thing1Test : UiTest() {

	@Test
	fun testThing1_1() = gwen {
		given {
			server stubs {
				get("/thing1") with json(testR.raw.repos)
			}
			user launches { thing1sScreen("thing1") }
		}

		whenever {
			user selects {
				thing1s {
					action1()
					action2()
					action3()
					thing1(atPosition = 4) {
						action4()
					}
					action5()
					thing1(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing1(atPosition = 7) {
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
				thing1s {
					text1 = "thing1 1"
					text2 = "thing1 2"
					text3 = "thing1 3"
					thing1(atPosition = 4) {
						text4 = "thing1 4"
					}
					text5 = "thing1 5"
					thing1(atPosition = 6) {
						text6 = "thing1 6"
						text6 = "thing1 6"
						text6 = "thing1 6"
					}
					thing1(atPosition = 7) {
						text7 = "thing1 7"
						text4 = "thing1 4"
						text7 = "thing1 7"
					}
					text8 = "thing1 8"
				}
			}
		}
	}

	@Test
	fun testThing1_2() = gwen {
		given {
			server stubs {
				get("/thing1") with json(testR.raw.repos)
			}
			user launches { thing1sScreen("thing1") }
		}

		whenever {
			user selects {
				thing1s {
					action1()
					action2()
					action3()
					thing1(atPosition = 4) {
						action4()
					}
					action5()
					thing1(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing1(atPosition = 7) {
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
				thing1s {
					text1 = "thing1 1"
					text2 = "thing1 2"
					text3 = "thing1 3"
					thing1(atPosition = 4) {
						text4 = "thing1 4"
					}
					text5 = "thing1 5"
					thing1(atPosition = 6) {
						text6 = "thing1 6"
						text6 = "thing1 6"
						text6 = "thing1 6"
					}
					thing1(atPosition = 7) {
						text7 = "thing1 7"
						text4 = "thing1 4"
						text7 = "thing1 7"
					}
					text8 = "thing1 8"
				}
			}
		}
	}

	@Test
	fun testThing1_3() = gwen {
		given {
			server stubs {
				get("/thing1") with json(testR.raw.repos)
			}
			user launches { thing1sScreen("thing1") }
		}

		whenever {
			user selects {
				thing1s {
					action1()
					action2()
					action3()
					thing1(atPosition = 4) {
						action4()
					}
					action5()
					thing1(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing1(atPosition = 7) {
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
				thing1s {
					text1 = "thing1 1"
					text2 = "thing1 2"
					text3 = "thing1 3"
					thing1(atPosition = 4) {
						text4 = "thing1 4"
					}
					text5 = "thing1 5"
					thing1(atPosition = 6) {
						text6 = "thing1 6"
						text6 = "thing1 6"
						text6 = "thing1 6"
					}
					thing1(atPosition = 7) {
						text7 = "thing1 7"
						text4 = "thing1 4"
						text7 = "thing1 7"
					}
					text8 = "thing1 8"
				}
			}
		}
	}

	@Test
	fun testThing1_4() = gwen {
		given {
			server stubs {
				get("/thing1") with json(testR.raw.repos)
			}
			user launches { thing1sScreen("thing1") }
		}

		whenever {
			user selects {
				thing1s {
					action1()
					action2()
					action3()
					thing1(atPosition = 4) {
						action4()
					}
					action5()
					thing1(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing1(atPosition = 7) {
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
				thing1s {
					text1 = "thing1 1"
					text2 = "thing1 2"
					text3 = "thing1 3"
					thing1(atPosition = 4) {
						text4 = "thing1 4"
					}
					text5 = "thing1 5"
					thing1(atPosition = 6) {
						text6 = "thing1 6"
						text6 = "thing1 6"
						text6 = "thing1 6"
					}
					thing1(atPosition = 7) {
						text7 = "thing1 7"
						text4 = "thing1 4"
						text7 = "thing1 7"
					}
					text8 = "thing1 8"
				}
			}
		}
	}

	@Test
	fun testThing1_5() = gwen {
		given {
			server stubs {
				get("/thing1") with json(testR.raw.repos)
			}
			user launches { thing1sScreen("thing1") }
		}

		whenever {
			user selects {
				thing1s {
					action1()
					action2()
					action3()
					thing1(atPosition = 4) {
						action4()
					}
					action5()
					thing1(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing1(atPosition = 7) {
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
				thing1s {
					text1 = "thing1 1"
					text2 = "thing1 2"
					text3 = "thing1 3"
					thing1(atPosition = 4) {
						text4 = "thing1 4"
					}
					text5 = "thing1 5"
					thing1(atPosition = 6) {
						text6 = "thing1 6"
						text6 = "thing1 6"
						text6 = "thing1 6"
					}
					thing1(atPosition = 7) {
						text7 = "thing1 7"
						text4 = "thing1 4"
						text7 = "thing1 7"
					}
					text8 = "thing1 8"
				}
			}
		}
	}
}
