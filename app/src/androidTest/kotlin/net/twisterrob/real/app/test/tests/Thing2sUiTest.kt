package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing2.thing2s
import net.twisterrob.real.app.test.dsls.thing2.thing2sScreen
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
class Thing2Test : UiTest() {

	@Test
	fun testThing2_1() = gwen {
		given {
			server stubs {
				get("/thing2") with json(testR.raw.repos)
			}
			user launches { thing2sScreen("thing2") }
		}

		whenever {
			user selects {
				thing2s {
					action1()
					action2()
					action3()
					thing2(atPosition = 4) {
						action4()
					}
					action5()
					thing2(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing2(atPosition = 7) {
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
				thing2s {
					text1 = "thing2 1"
					text2 = "thing2 2"
					text3 = "thing2 3"
					thing2(atPosition = 4) {
						text4 = "thing2 4"
					}
					text5 = "thing2 5"
					thing2(atPosition = 6) {
						text6 = "thing2 6"
						text6 = "thing2 6"
						text6 = "thing2 6"
					}
					thing2(atPosition = 7) {
						text7 = "thing2 7"
						text4 = "thing2 4"
						text7 = "thing2 7"
					}
					text8 = "thing2 8"
				}
			}
		}
	}

	@Test
	fun testThing2_2() = gwen {
		given {
			server stubs {
				get("/thing2") with json(testR.raw.repos)
			}
			user launches { thing2sScreen("thing2") }
		}

		whenever {
			user selects {
				thing2s {
					action1()
					action2()
					action3()
					thing2(atPosition = 4) {
						action4()
					}
					action5()
					thing2(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing2(atPosition = 7) {
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
				thing2s {
					text1 = "thing2 1"
					text2 = "thing2 2"
					text3 = "thing2 3"
					thing2(atPosition = 4) {
						text4 = "thing2 4"
					}
					text5 = "thing2 5"
					thing2(atPosition = 6) {
						text6 = "thing2 6"
						text6 = "thing2 6"
						text6 = "thing2 6"
					}
					thing2(atPosition = 7) {
						text7 = "thing2 7"
						text4 = "thing2 4"
						text7 = "thing2 7"
					}
					text8 = "thing2 8"
				}
			}
		}
	}

	@Test
	fun testThing2_3() = gwen {
		given {
			server stubs {
				get("/thing2") with json(testR.raw.repos)
			}
			user launches { thing2sScreen("thing2") }
		}

		whenever {
			user selects {
				thing2s {
					action1()
					action2()
					action3()
					thing2(atPosition = 4) {
						action4()
					}
					action5()
					thing2(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing2(atPosition = 7) {
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
				thing2s {
					text1 = "thing2 1"
					text2 = "thing2 2"
					text3 = "thing2 3"
					thing2(atPosition = 4) {
						text4 = "thing2 4"
					}
					text5 = "thing2 5"
					thing2(atPosition = 6) {
						text6 = "thing2 6"
						text6 = "thing2 6"
						text6 = "thing2 6"
					}
					thing2(atPosition = 7) {
						text7 = "thing2 7"
						text4 = "thing2 4"
						text7 = "thing2 7"
					}
					text8 = "thing2 8"
				}
			}
		}
	}

	@Test
	fun testThing2_4() = gwen {
		given {
			server stubs {
				get("/thing2") with json(testR.raw.repos)
			}
			user launches { thing2sScreen("thing2") }
		}

		whenever {
			user selects {
				thing2s {
					action1()
					action2()
					action3()
					thing2(atPosition = 4) {
						action4()
					}
					action5()
					thing2(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing2(atPosition = 7) {
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
				thing2s {
					text1 = "thing2 1"
					text2 = "thing2 2"
					text3 = "thing2 3"
					thing2(atPosition = 4) {
						text4 = "thing2 4"
					}
					text5 = "thing2 5"
					thing2(atPosition = 6) {
						text6 = "thing2 6"
						text6 = "thing2 6"
						text6 = "thing2 6"
					}
					thing2(atPosition = 7) {
						text7 = "thing2 7"
						text4 = "thing2 4"
						text7 = "thing2 7"
					}
					text8 = "thing2 8"
				}
			}
		}
	}

	@Test
	fun testThing2_5() = gwen {
		given {
			server stubs {
				get("/thing2") with json(testR.raw.repos)
			}
			user launches { thing2sScreen("thing2") }
		}

		whenever {
			user selects {
				thing2s {
					action1()
					action2()
					action3()
					thing2(atPosition = 4) {
						action4()
					}
					action5()
					thing2(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing2(atPosition = 7) {
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
				thing2s {
					text1 = "thing2 1"
					text2 = "thing2 2"
					text3 = "thing2 3"
					thing2(atPosition = 4) {
						text4 = "thing2 4"
					}
					text5 = "thing2 5"
					thing2(atPosition = 6) {
						text6 = "thing2 6"
						text6 = "thing2 6"
						text6 = "thing2 6"
					}
					thing2(atPosition = 7) {
						text7 = "thing2 7"
						text4 = "thing2 4"
						text7 = "thing2 7"
					}
					text8 = "thing2 8"
				}
			}
		}
	}
}
