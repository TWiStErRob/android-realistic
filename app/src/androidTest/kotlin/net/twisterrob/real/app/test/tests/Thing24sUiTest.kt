package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing24.thing24s
import net.twisterrob.real.app.test.dsls.thing24.thing24sScreen
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
class Thing24Test : UiTest() {

	@Test
	fun testThing24_1() = gwen {
		given {
			server stubs {
				get("/thing24") with json(testR.raw.repos)
			}
			user launches { thing24sScreen("thing24") }
		}

		whenever {
			user selects {
				thing24s {
					action1()
					action2()
					action3()
					thing24(atPosition = 4) {
						action4()
					}
					action5()
					thing24(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing24(atPosition = 7) {
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
				thing24s {
					text1 = "thing24 1"
					text2 = "thing24 2"
					text3 = "thing24 3"
					thing24(atPosition = 4) {
						text4 = "thing24 4"
					}
					text5 = "thing24 5"
					thing24(atPosition = 6) {
						text6 = "thing24 6"
						text6 = "thing24 6"
						text6 = "thing24 6"
					}
					thing24(atPosition = 7) {
						text7 = "thing24 7"
						text4 = "thing24 4"
						text7 = "thing24 7"
					}
					text8 = "thing24 8"
				}
			}
		}
	}

	@Test
	fun testThing24_2() = gwen {
		given {
			server stubs {
				get("/thing24") with json(testR.raw.repos)
			}
			user launches { thing24sScreen("thing24") }
		}

		whenever {
			user selects {
				thing24s {
					action1()
					action2()
					action3()
					thing24(atPosition = 4) {
						action4()
					}
					action5()
					thing24(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing24(atPosition = 7) {
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
				thing24s {
					text1 = "thing24 1"
					text2 = "thing24 2"
					text3 = "thing24 3"
					thing24(atPosition = 4) {
						text4 = "thing24 4"
					}
					text5 = "thing24 5"
					thing24(atPosition = 6) {
						text6 = "thing24 6"
						text6 = "thing24 6"
						text6 = "thing24 6"
					}
					thing24(atPosition = 7) {
						text7 = "thing24 7"
						text4 = "thing24 4"
						text7 = "thing24 7"
					}
					text8 = "thing24 8"
				}
			}
		}
	}

	@Test
	fun testThing24_3() = gwen {
		given {
			server stubs {
				get("/thing24") with json(testR.raw.repos)
			}
			user launches { thing24sScreen("thing24") }
		}

		whenever {
			user selects {
				thing24s {
					action1()
					action2()
					action3()
					thing24(atPosition = 4) {
						action4()
					}
					action5()
					thing24(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing24(atPosition = 7) {
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
				thing24s {
					text1 = "thing24 1"
					text2 = "thing24 2"
					text3 = "thing24 3"
					thing24(atPosition = 4) {
						text4 = "thing24 4"
					}
					text5 = "thing24 5"
					thing24(atPosition = 6) {
						text6 = "thing24 6"
						text6 = "thing24 6"
						text6 = "thing24 6"
					}
					thing24(atPosition = 7) {
						text7 = "thing24 7"
						text4 = "thing24 4"
						text7 = "thing24 7"
					}
					text8 = "thing24 8"
				}
			}
		}
	}

	@Test
	fun testThing24_4() = gwen {
		given {
			server stubs {
				get("/thing24") with json(testR.raw.repos)
			}
			user launches { thing24sScreen("thing24") }
		}

		whenever {
			user selects {
				thing24s {
					action1()
					action2()
					action3()
					thing24(atPosition = 4) {
						action4()
					}
					action5()
					thing24(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing24(atPosition = 7) {
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
				thing24s {
					text1 = "thing24 1"
					text2 = "thing24 2"
					text3 = "thing24 3"
					thing24(atPosition = 4) {
						text4 = "thing24 4"
					}
					text5 = "thing24 5"
					thing24(atPosition = 6) {
						text6 = "thing24 6"
						text6 = "thing24 6"
						text6 = "thing24 6"
					}
					thing24(atPosition = 7) {
						text7 = "thing24 7"
						text4 = "thing24 4"
						text7 = "thing24 7"
					}
					text8 = "thing24 8"
				}
			}
		}
	}

	@Test
	fun testThing24_5() = gwen {
		given {
			server stubs {
				get("/thing24") with json(testR.raw.repos)
			}
			user launches { thing24sScreen("thing24") }
		}

		whenever {
			user selects {
				thing24s {
					action1()
					action2()
					action3()
					thing24(atPosition = 4) {
						action4()
					}
					action5()
					thing24(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing24(atPosition = 7) {
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
				thing24s {
					text1 = "thing24 1"
					text2 = "thing24 2"
					text3 = "thing24 3"
					thing24(atPosition = 4) {
						text4 = "thing24 4"
					}
					text5 = "thing24 5"
					thing24(atPosition = 6) {
						text6 = "thing24 6"
						text6 = "thing24 6"
						text6 = "thing24 6"
					}
					thing24(atPosition = 7) {
						text7 = "thing24 7"
						text4 = "thing24 4"
						text7 = "thing24 7"
					}
					text8 = "thing24 8"
				}
			}
		}
	}
}
