package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing68.thing68s
import net.twisterrob.real.app.test.dsls.thing68.thing68sScreen
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
class Thing68Test : UiTest() {

	@Test
	fun testThing68_1() = gwen {
		given {
			server stubs {
				get("/thing68") with json(testR.raw.repos)
			}
			user launches { thing68sScreen("thing68") }
		}

		whenever {
			user selects {
				thing68s {
					action1()
					action2()
					action3()
					thing68(atPosition = 4) {
						action4()
					}
					action5()
					thing68(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing68(atPosition = 7) {
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
				thing68s {
					text1 = "thing68 1"
					text2 = "thing68 2"
					text3 = "thing68 3"
					thing68(atPosition = 4) {
						text4 = "thing68 4"
					}
					text5 = "thing68 5"
					thing68(atPosition = 6) {
						text6 = "thing68 6"
						text6 = "thing68 6"
						text6 = "thing68 6"
					}
					thing68(atPosition = 7) {
						text7 = "thing68 7"
						text4 = "thing68 4"
						text7 = "thing68 7"
					}
					text8 = "thing68 8"
				}
			}
		}
	}

	@Test
	fun testThing68_2() = gwen {
		given {
			server stubs {
				get("/thing68") with json(testR.raw.repos)
			}
			user launches { thing68sScreen("thing68") }
		}

		whenever {
			user selects {
				thing68s {
					action1()
					action2()
					action3()
					thing68(atPosition = 4) {
						action4()
					}
					action5()
					thing68(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing68(atPosition = 7) {
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
				thing68s {
					text1 = "thing68 1"
					text2 = "thing68 2"
					text3 = "thing68 3"
					thing68(atPosition = 4) {
						text4 = "thing68 4"
					}
					text5 = "thing68 5"
					thing68(atPosition = 6) {
						text6 = "thing68 6"
						text6 = "thing68 6"
						text6 = "thing68 6"
					}
					thing68(atPosition = 7) {
						text7 = "thing68 7"
						text4 = "thing68 4"
						text7 = "thing68 7"
					}
					text8 = "thing68 8"
				}
			}
		}
	}

	@Test
	fun testThing68_3() = gwen {
		given {
			server stubs {
				get("/thing68") with json(testR.raw.repos)
			}
			user launches { thing68sScreen("thing68") }
		}

		whenever {
			user selects {
				thing68s {
					action1()
					action2()
					action3()
					thing68(atPosition = 4) {
						action4()
					}
					action5()
					thing68(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing68(atPosition = 7) {
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
				thing68s {
					text1 = "thing68 1"
					text2 = "thing68 2"
					text3 = "thing68 3"
					thing68(atPosition = 4) {
						text4 = "thing68 4"
					}
					text5 = "thing68 5"
					thing68(atPosition = 6) {
						text6 = "thing68 6"
						text6 = "thing68 6"
						text6 = "thing68 6"
					}
					thing68(atPosition = 7) {
						text7 = "thing68 7"
						text4 = "thing68 4"
						text7 = "thing68 7"
					}
					text8 = "thing68 8"
				}
			}
		}
	}

	@Test
	fun testThing68_4() = gwen {
		given {
			server stubs {
				get("/thing68") with json(testR.raw.repos)
			}
			user launches { thing68sScreen("thing68") }
		}

		whenever {
			user selects {
				thing68s {
					action1()
					action2()
					action3()
					thing68(atPosition = 4) {
						action4()
					}
					action5()
					thing68(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing68(atPosition = 7) {
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
				thing68s {
					text1 = "thing68 1"
					text2 = "thing68 2"
					text3 = "thing68 3"
					thing68(atPosition = 4) {
						text4 = "thing68 4"
					}
					text5 = "thing68 5"
					thing68(atPosition = 6) {
						text6 = "thing68 6"
						text6 = "thing68 6"
						text6 = "thing68 6"
					}
					thing68(atPosition = 7) {
						text7 = "thing68 7"
						text4 = "thing68 4"
						text7 = "thing68 7"
					}
					text8 = "thing68 8"
				}
			}
		}
	}

	@Test
	fun testThing68_5() = gwen {
		given {
			server stubs {
				get("/thing68") with json(testR.raw.repos)
			}
			user launches { thing68sScreen("thing68") }
		}

		whenever {
			user selects {
				thing68s {
					action1()
					action2()
					action3()
					thing68(atPosition = 4) {
						action4()
					}
					action5()
					thing68(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing68(atPosition = 7) {
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
				thing68s {
					text1 = "thing68 1"
					text2 = "thing68 2"
					text3 = "thing68 3"
					thing68(atPosition = 4) {
						text4 = "thing68 4"
					}
					text5 = "thing68 5"
					thing68(atPosition = 6) {
						text6 = "thing68 6"
						text6 = "thing68 6"
						text6 = "thing68 6"
					}
					thing68(atPosition = 7) {
						text7 = "thing68 7"
						text4 = "thing68 4"
						text7 = "thing68 7"
					}
					text8 = "thing68 8"
				}
			}
		}
	}
}
