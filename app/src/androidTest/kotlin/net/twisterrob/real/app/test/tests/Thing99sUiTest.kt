package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing99.thing99s
import net.twisterrob.real.app.test.dsls.thing99.thing99sScreen
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
class Thing99Test : UiTest() {

	@Test
	fun testThing99_1() = gwen {
		given {
			server stubs {
				get("/thing99") with json(testR.raw.repos)
			}
			user launches { thing99sScreen("thing99") }
		}

		whenever {
			user selects {
				thing99s {
					action1()
					action2()
					action3()
					thing99(atPosition = 4) {
						action4()
					}
					action5()
					thing99(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing99(atPosition = 7) {
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
				thing99s {
					text1 = "thing99 1"
					text2 = "thing99 2"
					text3 = "thing99 3"
					thing99(atPosition = 4) {
						text4 = "thing99 4"
					}
					text5 = "thing99 5"
					thing99(atPosition = 6) {
						text6 = "thing99 6"
						text6 = "thing99 6"
						text6 = "thing99 6"
					}
					thing99(atPosition = 7) {
						text7 = "thing99 7"
						text4 = "thing99 4"
						text7 = "thing99 7"
					}
					text8 = "thing99 8"
				}
			}
		}
	}

	@Test
	fun testThing99_2() = gwen {
		given {
			server stubs {
				get("/thing99") with json(testR.raw.repos)
			}
			user launches { thing99sScreen("thing99") }
		}

		whenever {
			user selects {
				thing99s {
					action1()
					action2()
					action3()
					thing99(atPosition = 4) {
						action4()
					}
					action5()
					thing99(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing99(atPosition = 7) {
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
				thing99s {
					text1 = "thing99 1"
					text2 = "thing99 2"
					text3 = "thing99 3"
					thing99(atPosition = 4) {
						text4 = "thing99 4"
					}
					text5 = "thing99 5"
					thing99(atPosition = 6) {
						text6 = "thing99 6"
						text6 = "thing99 6"
						text6 = "thing99 6"
					}
					thing99(atPosition = 7) {
						text7 = "thing99 7"
						text4 = "thing99 4"
						text7 = "thing99 7"
					}
					text8 = "thing99 8"
				}
			}
		}
	}

	@Test
	fun testThing99_3() = gwen {
		given {
			server stubs {
				get("/thing99") with json(testR.raw.repos)
			}
			user launches { thing99sScreen("thing99") }
		}

		whenever {
			user selects {
				thing99s {
					action1()
					action2()
					action3()
					thing99(atPosition = 4) {
						action4()
					}
					action5()
					thing99(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing99(atPosition = 7) {
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
				thing99s {
					text1 = "thing99 1"
					text2 = "thing99 2"
					text3 = "thing99 3"
					thing99(atPosition = 4) {
						text4 = "thing99 4"
					}
					text5 = "thing99 5"
					thing99(atPosition = 6) {
						text6 = "thing99 6"
						text6 = "thing99 6"
						text6 = "thing99 6"
					}
					thing99(atPosition = 7) {
						text7 = "thing99 7"
						text4 = "thing99 4"
						text7 = "thing99 7"
					}
					text8 = "thing99 8"
				}
			}
		}
	}

	@Test
	fun testThing99_4() = gwen {
		given {
			server stubs {
				get("/thing99") with json(testR.raw.repos)
			}
			user launches { thing99sScreen("thing99") }
		}

		whenever {
			user selects {
				thing99s {
					action1()
					action2()
					action3()
					thing99(atPosition = 4) {
						action4()
					}
					action5()
					thing99(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing99(atPosition = 7) {
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
				thing99s {
					text1 = "thing99 1"
					text2 = "thing99 2"
					text3 = "thing99 3"
					thing99(atPosition = 4) {
						text4 = "thing99 4"
					}
					text5 = "thing99 5"
					thing99(atPosition = 6) {
						text6 = "thing99 6"
						text6 = "thing99 6"
						text6 = "thing99 6"
					}
					thing99(atPosition = 7) {
						text7 = "thing99 7"
						text4 = "thing99 4"
						text7 = "thing99 7"
					}
					text8 = "thing99 8"
				}
			}
		}
	}

	@Test
	fun testThing99_5() = gwen {
		given {
			server stubs {
				get("/thing99") with json(testR.raw.repos)
			}
			user launches { thing99sScreen("thing99") }
		}

		whenever {
			user selects {
				thing99s {
					action1()
					action2()
					action3()
					thing99(atPosition = 4) {
						action4()
					}
					action5()
					thing99(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing99(atPosition = 7) {
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
				thing99s {
					text1 = "thing99 1"
					text2 = "thing99 2"
					text3 = "thing99 3"
					thing99(atPosition = 4) {
						text4 = "thing99 4"
					}
					text5 = "thing99 5"
					thing99(atPosition = 6) {
						text6 = "thing99 6"
						text6 = "thing99 6"
						text6 = "thing99 6"
					}
					thing99(atPosition = 7) {
						text7 = "thing99 7"
						text4 = "thing99 4"
						text7 = "thing99 7"
					}
					text8 = "thing99 8"
				}
			}
		}
	}
}
