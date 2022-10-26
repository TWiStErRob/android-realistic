package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing9.thing9s
import net.twisterrob.real.app.test.dsls.thing9.thing9sScreen
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
class Thing9Test : UiTest() {

	@Test
	fun testThing9_1() = gwen {
		given {
			server stubs {
				get("/thing9") with json(testR.raw.repos)
			}
			user launches { thing9sScreen("thing9") }
		}

		whenever {
			user selects {
				thing9s {
					action1()
					action2()
					action3()
					thing9(atPosition = 4) {
						action4()
					}
					action5()
					thing9(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing9(atPosition = 7) {
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
				thing9s {
					text1 = "thing9 1"
					text2 = "thing9 2"
					text3 = "thing9 3"
					thing9(atPosition = 4) {
						text4 = "thing9 4"
					}
					text5 = "thing9 5"
					thing9(atPosition = 6) {
						text6 = "thing9 6"
						text6 = "thing9 6"
						text6 = "thing9 6"
					}
					thing9(atPosition = 7) {
						text7 = "thing9 7"
						text4 = "thing9 4"
						text7 = "thing9 7"
					}
					text8 = "thing9 8"
				}
			}
		}
	}

	@Test
	fun testThing9_2() = gwen {
		given {
			server stubs {
				get("/thing9") with json(testR.raw.repos)
			}
			user launches { thing9sScreen("thing9") }
		}

		whenever {
			user selects {
				thing9s {
					action1()
					action2()
					action3()
					thing9(atPosition = 4) {
						action4()
					}
					action5()
					thing9(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing9(atPosition = 7) {
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
				thing9s {
					text1 = "thing9 1"
					text2 = "thing9 2"
					text3 = "thing9 3"
					thing9(atPosition = 4) {
						text4 = "thing9 4"
					}
					text5 = "thing9 5"
					thing9(atPosition = 6) {
						text6 = "thing9 6"
						text6 = "thing9 6"
						text6 = "thing9 6"
					}
					thing9(atPosition = 7) {
						text7 = "thing9 7"
						text4 = "thing9 4"
						text7 = "thing9 7"
					}
					text8 = "thing9 8"
				}
			}
		}
	}

	@Test
	fun testThing9_3() = gwen {
		given {
			server stubs {
				get("/thing9") with json(testR.raw.repos)
			}
			user launches { thing9sScreen("thing9") }
		}

		whenever {
			user selects {
				thing9s {
					action1()
					action2()
					action3()
					thing9(atPosition = 4) {
						action4()
					}
					action5()
					thing9(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing9(atPosition = 7) {
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
				thing9s {
					text1 = "thing9 1"
					text2 = "thing9 2"
					text3 = "thing9 3"
					thing9(atPosition = 4) {
						text4 = "thing9 4"
					}
					text5 = "thing9 5"
					thing9(atPosition = 6) {
						text6 = "thing9 6"
						text6 = "thing9 6"
						text6 = "thing9 6"
					}
					thing9(atPosition = 7) {
						text7 = "thing9 7"
						text4 = "thing9 4"
						text7 = "thing9 7"
					}
					text8 = "thing9 8"
				}
			}
		}
	}

	@Test
	fun testThing9_4() = gwen {
		given {
			server stubs {
				get("/thing9") with json(testR.raw.repos)
			}
			user launches { thing9sScreen("thing9") }
		}

		whenever {
			user selects {
				thing9s {
					action1()
					action2()
					action3()
					thing9(atPosition = 4) {
						action4()
					}
					action5()
					thing9(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing9(atPosition = 7) {
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
				thing9s {
					text1 = "thing9 1"
					text2 = "thing9 2"
					text3 = "thing9 3"
					thing9(atPosition = 4) {
						text4 = "thing9 4"
					}
					text5 = "thing9 5"
					thing9(atPosition = 6) {
						text6 = "thing9 6"
						text6 = "thing9 6"
						text6 = "thing9 6"
					}
					thing9(atPosition = 7) {
						text7 = "thing9 7"
						text4 = "thing9 4"
						text7 = "thing9 7"
					}
					text8 = "thing9 8"
				}
			}
		}
	}

	@Test
	fun testThing9_5() = gwen {
		given {
			server stubs {
				get("/thing9") with json(testR.raw.repos)
			}
			user launches { thing9sScreen("thing9") }
		}

		whenever {
			user selects {
				thing9s {
					action1()
					action2()
					action3()
					thing9(atPosition = 4) {
						action4()
					}
					action5()
					thing9(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing9(atPosition = 7) {
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
				thing9s {
					text1 = "thing9 1"
					text2 = "thing9 2"
					text3 = "thing9 3"
					thing9(atPosition = 4) {
						text4 = "thing9 4"
					}
					text5 = "thing9 5"
					thing9(atPosition = 6) {
						text6 = "thing9 6"
						text6 = "thing9 6"
						text6 = "thing9 6"
					}
					thing9(atPosition = 7) {
						text7 = "thing9 7"
						text4 = "thing9 4"
						text7 = "thing9 7"
					}
					text8 = "thing9 8"
				}
			}
		}
	}
}
