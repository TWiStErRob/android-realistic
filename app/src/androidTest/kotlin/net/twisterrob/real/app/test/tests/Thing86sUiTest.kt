package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing86.thing86s
import net.twisterrob.real.app.test.dsls.thing86.thing86sScreen
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
class Thing86Test : UiTest() {

	@Test
	fun testThing86_1() = gwen {
		given {
			server stubs {
				get("/thing86") with json(testR.raw.repos)
			}
			user launches { thing86sScreen("thing86") }
		}

		whenever {
			user selects {
				thing86s {
					action1()
					action2()
					action3()
					thing86(atPosition = 4) {
						action4()
					}
					action5()
					thing86(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing86(atPosition = 7) {
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
				thing86s {
					text1 = "thing86 1"
					text2 = "thing86 2"
					text3 = "thing86 3"
					thing86(atPosition = 4) {
						text4 = "thing86 4"
					}
					text5 = "thing86 5"
					thing86(atPosition = 6) {
						text6 = "thing86 6"
						text6 = "thing86 6"
						text6 = "thing86 6"
					}
					thing86(atPosition = 7) {
						text7 = "thing86 7"
						text4 = "thing86 4"
						text7 = "thing86 7"
					}
					text8 = "thing86 8"
				}
			}
		}
	}

	@Test
	fun testThing86_2() = gwen {
		given {
			server stubs {
				get("/thing86") with json(testR.raw.repos)
			}
			user launches { thing86sScreen("thing86") }
		}

		whenever {
			user selects {
				thing86s {
					action1()
					action2()
					action3()
					thing86(atPosition = 4) {
						action4()
					}
					action5()
					thing86(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing86(atPosition = 7) {
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
				thing86s {
					text1 = "thing86 1"
					text2 = "thing86 2"
					text3 = "thing86 3"
					thing86(atPosition = 4) {
						text4 = "thing86 4"
					}
					text5 = "thing86 5"
					thing86(atPosition = 6) {
						text6 = "thing86 6"
						text6 = "thing86 6"
						text6 = "thing86 6"
					}
					thing86(atPosition = 7) {
						text7 = "thing86 7"
						text4 = "thing86 4"
						text7 = "thing86 7"
					}
					text8 = "thing86 8"
				}
			}
		}
	}

	@Test
	fun testThing86_3() = gwen {
		given {
			server stubs {
				get("/thing86") with json(testR.raw.repos)
			}
			user launches { thing86sScreen("thing86") }
		}

		whenever {
			user selects {
				thing86s {
					action1()
					action2()
					action3()
					thing86(atPosition = 4) {
						action4()
					}
					action5()
					thing86(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing86(atPosition = 7) {
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
				thing86s {
					text1 = "thing86 1"
					text2 = "thing86 2"
					text3 = "thing86 3"
					thing86(atPosition = 4) {
						text4 = "thing86 4"
					}
					text5 = "thing86 5"
					thing86(atPosition = 6) {
						text6 = "thing86 6"
						text6 = "thing86 6"
						text6 = "thing86 6"
					}
					thing86(atPosition = 7) {
						text7 = "thing86 7"
						text4 = "thing86 4"
						text7 = "thing86 7"
					}
					text8 = "thing86 8"
				}
			}
		}
	}

	@Test
	fun testThing86_4() = gwen {
		given {
			server stubs {
				get("/thing86") with json(testR.raw.repos)
			}
			user launches { thing86sScreen("thing86") }
		}

		whenever {
			user selects {
				thing86s {
					action1()
					action2()
					action3()
					thing86(atPosition = 4) {
						action4()
					}
					action5()
					thing86(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing86(atPosition = 7) {
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
				thing86s {
					text1 = "thing86 1"
					text2 = "thing86 2"
					text3 = "thing86 3"
					thing86(atPosition = 4) {
						text4 = "thing86 4"
					}
					text5 = "thing86 5"
					thing86(atPosition = 6) {
						text6 = "thing86 6"
						text6 = "thing86 6"
						text6 = "thing86 6"
					}
					thing86(atPosition = 7) {
						text7 = "thing86 7"
						text4 = "thing86 4"
						text7 = "thing86 7"
					}
					text8 = "thing86 8"
				}
			}
		}
	}

	@Test
	fun testThing86_5() = gwen {
		given {
			server stubs {
				get("/thing86") with json(testR.raw.repos)
			}
			user launches { thing86sScreen("thing86") }
		}

		whenever {
			user selects {
				thing86s {
					action1()
					action2()
					action3()
					thing86(atPosition = 4) {
						action4()
					}
					action5()
					thing86(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing86(atPosition = 7) {
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
				thing86s {
					text1 = "thing86 1"
					text2 = "thing86 2"
					text3 = "thing86 3"
					thing86(atPosition = 4) {
						text4 = "thing86 4"
					}
					text5 = "thing86 5"
					thing86(atPosition = 6) {
						text6 = "thing86 6"
						text6 = "thing86 6"
						text6 = "thing86 6"
					}
					thing86(atPosition = 7) {
						text7 = "thing86 7"
						text4 = "thing86 4"
						text7 = "thing86 7"
					}
					text8 = "thing86 8"
				}
			}
		}
	}
}
