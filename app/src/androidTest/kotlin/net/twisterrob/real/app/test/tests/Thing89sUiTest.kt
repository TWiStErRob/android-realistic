package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing89.thing89s
import net.twisterrob.real.app.test.dsls.thing89.thing89sScreen
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
class Thing89Test : UiTest() {

	@Test
	fun testThing89_1() = gwen {
		given {
			server stubs {
				get("/thing89") with json(testR.raw.repos)
			}
			user launches { thing89sScreen("thing89") }
		}

		whenever {
			user selects {
				thing89s {
					action1()
					action2()
					action3()
					thing89(atPosition = 4) {
						action4()
					}
					action5()
					thing89(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing89(atPosition = 7) {
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
				thing89s {
					text1 = "thing89 1"
					text2 = "thing89 2"
					text3 = "thing89 3"
					thing89(atPosition = 4) {
						text4 = "thing89 4"
					}
					text5 = "thing89 5"
					thing89(atPosition = 6) {
						text6 = "thing89 6"
						text6 = "thing89 6"
						text6 = "thing89 6"
					}
					thing89(atPosition = 7) {
						text7 = "thing89 7"
						text4 = "thing89 4"
						text7 = "thing89 7"
					}
					text8 = "thing89 8"
				}
			}
		}
	}

	@Test
	fun testThing89_2() = gwen {
		given {
			server stubs {
				get("/thing89") with json(testR.raw.repos)
			}
			user launches { thing89sScreen("thing89") }
		}

		whenever {
			user selects {
				thing89s {
					action1()
					action2()
					action3()
					thing89(atPosition = 4) {
						action4()
					}
					action5()
					thing89(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing89(atPosition = 7) {
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
				thing89s {
					text1 = "thing89 1"
					text2 = "thing89 2"
					text3 = "thing89 3"
					thing89(atPosition = 4) {
						text4 = "thing89 4"
					}
					text5 = "thing89 5"
					thing89(atPosition = 6) {
						text6 = "thing89 6"
						text6 = "thing89 6"
						text6 = "thing89 6"
					}
					thing89(atPosition = 7) {
						text7 = "thing89 7"
						text4 = "thing89 4"
						text7 = "thing89 7"
					}
					text8 = "thing89 8"
				}
			}
		}
	}

	@Test
	fun testThing89_3() = gwen {
		given {
			server stubs {
				get("/thing89") with json(testR.raw.repos)
			}
			user launches { thing89sScreen("thing89") }
		}

		whenever {
			user selects {
				thing89s {
					action1()
					action2()
					action3()
					thing89(atPosition = 4) {
						action4()
					}
					action5()
					thing89(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing89(atPosition = 7) {
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
				thing89s {
					text1 = "thing89 1"
					text2 = "thing89 2"
					text3 = "thing89 3"
					thing89(atPosition = 4) {
						text4 = "thing89 4"
					}
					text5 = "thing89 5"
					thing89(atPosition = 6) {
						text6 = "thing89 6"
						text6 = "thing89 6"
						text6 = "thing89 6"
					}
					thing89(atPosition = 7) {
						text7 = "thing89 7"
						text4 = "thing89 4"
						text7 = "thing89 7"
					}
					text8 = "thing89 8"
				}
			}
		}
	}

	@Test
	fun testThing89_4() = gwen {
		given {
			server stubs {
				get("/thing89") with json(testR.raw.repos)
			}
			user launches { thing89sScreen("thing89") }
		}

		whenever {
			user selects {
				thing89s {
					action1()
					action2()
					action3()
					thing89(atPosition = 4) {
						action4()
					}
					action5()
					thing89(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing89(atPosition = 7) {
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
				thing89s {
					text1 = "thing89 1"
					text2 = "thing89 2"
					text3 = "thing89 3"
					thing89(atPosition = 4) {
						text4 = "thing89 4"
					}
					text5 = "thing89 5"
					thing89(atPosition = 6) {
						text6 = "thing89 6"
						text6 = "thing89 6"
						text6 = "thing89 6"
					}
					thing89(atPosition = 7) {
						text7 = "thing89 7"
						text4 = "thing89 4"
						text7 = "thing89 7"
					}
					text8 = "thing89 8"
				}
			}
		}
	}

	@Test
	fun testThing89_5() = gwen {
		given {
			server stubs {
				get("/thing89") with json(testR.raw.repos)
			}
			user launches { thing89sScreen("thing89") }
		}

		whenever {
			user selects {
				thing89s {
					action1()
					action2()
					action3()
					thing89(atPosition = 4) {
						action4()
					}
					action5()
					thing89(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing89(atPosition = 7) {
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
				thing89s {
					text1 = "thing89 1"
					text2 = "thing89 2"
					text3 = "thing89 3"
					thing89(atPosition = 4) {
						text4 = "thing89 4"
					}
					text5 = "thing89 5"
					thing89(atPosition = 6) {
						text6 = "thing89 6"
						text6 = "thing89 6"
						text6 = "thing89 6"
					}
					thing89(atPosition = 7) {
						text7 = "thing89 7"
						text4 = "thing89 4"
						text7 = "thing89 7"
					}
					text8 = "thing89 8"
				}
			}
		}
	}
}
