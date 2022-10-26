package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing12.thing12s
import net.twisterrob.real.app.test.dsls.thing12.thing12sScreen
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
class Thing12Test : UiTest() {

	@Test
	fun testThing12_1() = gwen {
		given {
			server stubs {
				get("/thing12") with json(testR.raw.repos)
			}
			user launches { thing12sScreen("thing12") }
		}

		whenever {
			user selects {
				thing12s {
					action1()
					action2()
					action3()
					thing12(atPosition = 4) {
						action4()
					}
					action5()
					thing12(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing12(atPosition = 7) {
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
				thing12s {
					text1 = "thing12 1"
					text2 = "thing12 2"
					text3 = "thing12 3"
					thing12(atPosition = 4) {
						text4 = "thing12 4"
					}
					text5 = "thing12 5"
					thing12(atPosition = 6) {
						text6 = "thing12 6"
						text6 = "thing12 6"
						text6 = "thing12 6"
					}
					thing12(atPosition = 7) {
						text7 = "thing12 7"
						text4 = "thing12 4"
						text7 = "thing12 7"
					}
					text8 = "thing12 8"
				}
			}
		}
	}

	@Test
	fun testThing12_2() = gwen {
		given {
			server stubs {
				get("/thing12") with json(testR.raw.repos)
			}
			user launches { thing12sScreen("thing12") }
		}

		whenever {
			user selects {
				thing12s {
					action1()
					action2()
					action3()
					thing12(atPosition = 4) {
						action4()
					}
					action5()
					thing12(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing12(atPosition = 7) {
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
				thing12s {
					text1 = "thing12 1"
					text2 = "thing12 2"
					text3 = "thing12 3"
					thing12(atPosition = 4) {
						text4 = "thing12 4"
					}
					text5 = "thing12 5"
					thing12(atPosition = 6) {
						text6 = "thing12 6"
						text6 = "thing12 6"
						text6 = "thing12 6"
					}
					thing12(atPosition = 7) {
						text7 = "thing12 7"
						text4 = "thing12 4"
						text7 = "thing12 7"
					}
					text8 = "thing12 8"
				}
			}
		}
	}

	@Test
	fun testThing12_3() = gwen {
		given {
			server stubs {
				get("/thing12") with json(testR.raw.repos)
			}
			user launches { thing12sScreen("thing12") }
		}

		whenever {
			user selects {
				thing12s {
					action1()
					action2()
					action3()
					thing12(atPosition = 4) {
						action4()
					}
					action5()
					thing12(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing12(atPosition = 7) {
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
				thing12s {
					text1 = "thing12 1"
					text2 = "thing12 2"
					text3 = "thing12 3"
					thing12(atPosition = 4) {
						text4 = "thing12 4"
					}
					text5 = "thing12 5"
					thing12(atPosition = 6) {
						text6 = "thing12 6"
						text6 = "thing12 6"
						text6 = "thing12 6"
					}
					thing12(atPosition = 7) {
						text7 = "thing12 7"
						text4 = "thing12 4"
						text7 = "thing12 7"
					}
					text8 = "thing12 8"
				}
			}
		}
	}

	@Test
	fun testThing12_4() = gwen {
		given {
			server stubs {
				get("/thing12") with json(testR.raw.repos)
			}
			user launches { thing12sScreen("thing12") }
		}

		whenever {
			user selects {
				thing12s {
					action1()
					action2()
					action3()
					thing12(atPosition = 4) {
						action4()
					}
					action5()
					thing12(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing12(atPosition = 7) {
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
				thing12s {
					text1 = "thing12 1"
					text2 = "thing12 2"
					text3 = "thing12 3"
					thing12(atPosition = 4) {
						text4 = "thing12 4"
					}
					text5 = "thing12 5"
					thing12(atPosition = 6) {
						text6 = "thing12 6"
						text6 = "thing12 6"
						text6 = "thing12 6"
					}
					thing12(atPosition = 7) {
						text7 = "thing12 7"
						text4 = "thing12 4"
						text7 = "thing12 7"
					}
					text8 = "thing12 8"
				}
			}
		}
	}

	@Test
	fun testThing12_5() = gwen {
		given {
			server stubs {
				get("/thing12") with json(testR.raw.repos)
			}
			user launches { thing12sScreen("thing12") }
		}

		whenever {
			user selects {
				thing12s {
					action1()
					action2()
					action3()
					thing12(atPosition = 4) {
						action4()
					}
					action5()
					thing12(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing12(atPosition = 7) {
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
				thing12s {
					text1 = "thing12 1"
					text2 = "thing12 2"
					text3 = "thing12 3"
					thing12(atPosition = 4) {
						text4 = "thing12 4"
					}
					text5 = "thing12 5"
					thing12(atPosition = 6) {
						text6 = "thing12 6"
						text6 = "thing12 6"
						text6 = "thing12 6"
					}
					thing12(atPosition = 7) {
						text7 = "thing12 7"
						text4 = "thing12 4"
						text7 = "thing12 7"
					}
					text8 = "thing12 8"
				}
			}
		}
	}
}
