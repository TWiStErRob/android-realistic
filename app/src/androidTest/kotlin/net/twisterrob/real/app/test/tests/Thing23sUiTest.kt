package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing23.thing23s
import net.twisterrob.real.app.test.dsls.thing23.thing23sScreen
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
class Thing23Test : UiTest() {

	@Test
	fun testThing23_1() = gwen {
		given {
			server stubs {
				get("/thing23") with json(testR.raw.repos)
			}
			user launches { thing23sScreen("thing23") }
		}

		whenever {
			user selects {
				thing23s {
					action1()
					action2()
					action3()
					thing23(atPosition = 4) {
						action4()
					}
					action5()
					thing23(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing23(atPosition = 7) {
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
				thing23s {
					text1 = "thing23 1"
					text2 = "thing23 2"
					text3 = "thing23 3"
					thing23(atPosition = 4) {
						text4 = "thing23 4"
					}
					text5 = "thing23 5"
					thing23(atPosition = 6) {
						text6 = "thing23 6"
						text6 = "thing23 6"
						text6 = "thing23 6"
					}
					thing23(atPosition = 7) {
						text7 = "thing23 7"
						text4 = "thing23 4"
						text7 = "thing23 7"
					}
					text8 = "thing23 8"
				}
			}
		}
	}

	@Test
	fun testThing23_2() = gwen {
		given {
			server stubs {
				get("/thing23") with json(testR.raw.repos)
			}
			user launches { thing23sScreen("thing23") }
		}

		whenever {
			user selects {
				thing23s {
					action1()
					action2()
					action3()
					thing23(atPosition = 4) {
						action4()
					}
					action5()
					thing23(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing23(atPosition = 7) {
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
				thing23s {
					text1 = "thing23 1"
					text2 = "thing23 2"
					text3 = "thing23 3"
					thing23(atPosition = 4) {
						text4 = "thing23 4"
					}
					text5 = "thing23 5"
					thing23(atPosition = 6) {
						text6 = "thing23 6"
						text6 = "thing23 6"
						text6 = "thing23 6"
					}
					thing23(atPosition = 7) {
						text7 = "thing23 7"
						text4 = "thing23 4"
						text7 = "thing23 7"
					}
					text8 = "thing23 8"
				}
			}
		}
	}

	@Test
	fun testThing23_3() = gwen {
		given {
			server stubs {
				get("/thing23") with json(testR.raw.repos)
			}
			user launches { thing23sScreen("thing23") }
		}

		whenever {
			user selects {
				thing23s {
					action1()
					action2()
					action3()
					thing23(atPosition = 4) {
						action4()
					}
					action5()
					thing23(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing23(atPosition = 7) {
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
				thing23s {
					text1 = "thing23 1"
					text2 = "thing23 2"
					text3 = "thing23 3"
					thing23(atPosition = 4) {
						text4 = "thing23 4"
					}
					text5 = "thing23 5"
					thing23(atPosition = 6) {
						text6 = "thing23 6"
						text6 = "thing23 6"
						text6 = "thing23 6"
					}
					thing23(atPosition = 7) {
						text7 = "thing23 7"
						text4 = "thing23 4"
						text7 = "thing23 7"
					}
					text8 = "thing23 8"
				}
			}
		}
	}

	@Test
	fun testThing23_4() = gwen {
		given {
			server stubs {
				get("/thing23") with json(testR.raw.repos)
			}
			user launches { thing23sScreen("thing23") }
		}

		whenever {
			user selects {
				thing23s {
					action1()
					action2()
					action3()
					thing23(atPosition = 4) {
						action4()
					}
					action5()
					thing23(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing23(atPosition = 7) {
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
				thing23s {
					text1 = "thing23 1"
					text2 = "thing23 2"
					text3 = "thing23 3"
					thing23(atPosition = 4) {
						text4 = "thing23 4"
					}
					text5 = "thing23 5"
					thing23(atPosition = 6) {
						text6 = "thing23 6"
						text6 = "thing23 6"
						text6 = "thing23 6"
					}
					thing23(atPosition = 7) {
						text7 = "thing23 7"
						text4 = "thing23 4"
						text7 = "thing23 7"
					}
					text8 = "thing23 8"
				}
			}
		}
	}

	@Test
	fun testThing23_5() = gwen {
		given {
			server stubs {
				get("/thing23") with json(testR.raw.repos)
			}
			user launches { thing23sScreen("thing23") }
		}

		whenever {
			user selects {
				thing23s {
					action1()
					action2()
					action3()
					thing23(atPosition = 4) {
						action4()
					}
					action5()
					thing23(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing23(atPosition = 7) {
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
				thing23s {
					text1 = "thing23 1"
					text2 = "thing23 2"
					text3 = "thing23 3"
					thing23(atPosition = 4) {
						text4 = "thing23 4"
					}
					text5 = "thing23 5"
					thing23(atPosition = 6) {
						text6 = "thing23 6"
						text6 = "thing23 6"
						text6 = "thing23 6"
					}
					thing23(atPosition = 7) {
						text7 = "thing23 7"
						text4 = "thing23 4"
						text7 = "thing23 7"
					}
					text8 = "thing23 8"
				}
			}
		}
	}
}
