package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing63.thing63s
import net.twisterrob.real.app.test.dsls.thing63.thing63sScreen
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
class Thing63Test : UiTest() {

	@Test
	fun testThing63_1() = gwen {
		given {
			server stubs {
				get("/thing63") with json(testR.raw.repos)
			}
			user launches { thing63sScreen("thing63") }
		}

		whenever {
			user selects {
				thing63s {
					action1()
					action2()
					action3()
					thing63(atPosition = 4) {
						action4()
					}
					action5()
					thing63(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing63(atPosition = 7) {
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
				thing63s {
					text1 = "thing63 1"
					text2 = "thing63 2"
					text3 = "thing63 3"
					thing63(atPosition = 4) {
						text4 = "thing63 4"
					}
					text5 = "thing63 5"
					thing63(atPosition = 6) {
						text6 = "thing63 6"
						text6 = "thing63 6"
						text6 = "thing63 6"
					}
					thing63(atPosition = 7) {
						text7 = "thing63 7"
						text4 = "thing63 4"
						text7 = "thing63 7"
					}
					text8 = "thing63 8"
				}
			}
		}
	}

	@Test
	fun testThing63_2() = gwen {
		given {
			server stubs {
				get("/thing63") with json(testR.raw.repos)
			}
			user launches { thing63sScreen("thing63") }
		}

		whenever {
			user selects {
				thing63s {
					action1()
					action2()
					action3()
					thing63(atPosition = 4) {
						action4()
					}
					action5()
					thing63(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing63(atPosition = 7) {
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
				thing63s {
					text1 = "thing63 1"
					text2 = "thing63 2"
					text3 = "thing63 3"
					thing63(atPosition = 4) {
						text4 = "thing63 4"
					}
					text5 = "thing63 5"
					thing63(atPosition = 6) {
						text6 = "thing63 6"
						text6 = "thing63 6"
						text6 = "thing63 6"
					}
					thing63(atPosition = 7) {
						text7 = "thing63 7"
						text4 = "thing63 4"
						text7 = "thing63 7"
					}
					text8 = "thing63 8"
				}
			}
		}
	}

	@Test
	fun testThing63_3() = gwen {
		given {
			server stubs {
				get("/thing63") with json(testR.raw.repos)
			}
			user launches { thing63sScreen("thing63") }
		}

		whenever {
			user selects {
				thing63s {
					action1()
					action2()
					action3()
					thing63(atPosition = 4) {
						action4()
					}
					action5()
					thing63(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing63(atPosition = 7) {
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
				thing63s {
					text1 = "thing63 1"
					text2 = "thing63 2"
					text3 = "thing63 3"
					thing63(atPosition = 4) {
						text4 = "thing63 4"
					}
					text5 = "thing63 5"
					thing63(atPosition = 6) {
						text6 = "thing63 6"
						text6 = "thing63 6"
						text6 = "thing63 6"
					}
					thing63(atPosition = 7) {
						text7 = "thing63 7"
						text4 = "thing63 4"
						text7 = "thing63 7"
					}
					text8 = "thing63 8"
				}
			}
		}
	}

	@Test
	fun testThing63_4() = gwen {
		given {
			server stubs {
				get("/thing63") with json(testR.raw.repos)
			}
			user launches { thing63sScreen("thing63") }
		}

		whenever {
			user selects {
				thing63s {
					action1()
					action2()
					action3()
					thing63(atPosition = 4) {
						action4()
					}
					action5()
					thing63(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing63(atPosition = 7) {
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
				thing63s {
					text1 = "thing63 1"
					text2 = "thing63 2"
					text3 = "thing63 3"
					thing63(atPosition = 4) {
						text4 = "thing63 4"
					}
					text5 = "thing63 5"
					thing63(atPosition = 6) {
						text6 = "thing63 6"
						text6 = "thing63 6"
						text6 = "thing63 6"
					}
					thing63(atPosition = 7) {
						text7 = "thing63 7"
						text4 = "thing63 4"
						text7 = "thing63 7"
					}
					text8 = "thing63 8"
				}
			}
		}
	}

	@Test
	fun testThing63_5() = gwen {
		given {
			server stubs {
				get("/thing63") with json(testR.raw.repos)
			}
			user launches { thing63sScreen("thing63") }
		}

		whenever {
			user selects {
				thing63s {
					action1()
					action2()
					action3()
					thing63(atPosition = 4) {
						action4()
					}
					action5()
					thing63(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing63(atPosition = 7) {
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
				thing63s {
					text1 = "thing63 1"
					text2 = "thing63 2"
					text3 = "thing63 3"
					thing63(atPosition = 4) {
						text4 = "thing63 4"
					}
					text5 = "thing63 5"
					thing63(atPosition = 6) {
						text6 = "thing63 6"
						text6 = "thing63 6"
						text6 = "thing63 6"
					}
					thing63(atPosition = 7) {
						text7 = "thing63 7"
						text4 = "thing63 4"
						text7 = "thing63 7"
					}
					text8 = "thing63 8"
				}
			}
		}
	}
}
