package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing78.thing78s
import net.twisterrob.real.app.test.dsls.thing78.thing78sScreen
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
class Thing78Test : UiTest() {

	@Test
	fun testThing78_1() = gwen {
		given {
			server stubs {
				get("/thing78") with json(testR.raw.repos)
			}
			user launches { thing78sScreen("thing78") }
		}

		whenever {
			user selects {
				thing78s {
					action1()
					action2()
					action3()
					thing78(atPosition = 4) {
						action4()
					}
					action5()
					thing78(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing78(atPosition = 7) {
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
				thing78s {
					text1 = "thing78 1"
					text2 = "thing78 2"
					text3 = "thing78 3"
					thing78(atPosition = 4) {
						text4 = "thing78 4"
					}
					text5 = "thing78 5"
					thing78(atPosition = 6) {
						text6 = "thing78 6"
						text6 = "thing78 6"
						text6 = "thing78 6"
					}
					thing78(atPosition = 7) {
						text7 = "thing78 7"
						text4 = "thing78 4"
						text7 = "thing78 7"
					}
					text8 = "thing78 8"
				}
			}
		}
	}

	@Test
	fun testThing78_2() = gwen {
		given {
			server stubs {
				get("/thing78") with json(testR.raw.repos)
			}
			user launches { thing78sScreen("thing78") }
		}

		whenever {
			user selects {
				thing78s {
					action1()
					action2()
					action3()
					thing78(atPosition = 4) {
						action4()
					}
					action5()
					thing78(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing78(atPosition = 7) {
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
				thing78s {
					text1 = "thing78 1"
					text2 = "thing78 2"
					text3 = "thing78 3"
					thing78(atPosition = 4) {
						text4 = "thing78 4"
					}
					text5 = "thing78 5"
					thing78(atPosition = 6) {
						text6 = "thing78 6"
						text6 = "thing78 6"
						text6 = "thing78 6"
					}
					thing78(atPosition = 7) {
						text7 = "thing78 7"
						text4 = "thing78 4"
						text7 = "thing78 7"
					}
					text8 = "thing78 8"
				}
			}
		}
	}

	@Test
	fun testThing78_3() = gwen {
		given {
			server stubs {
				get("/thing78") with json(testR.raw.repos)
			}
			user launches { thing78sScreen("thing78") }
		}

		whenever {
			user selects {
				thing78s {
					action1()
					action2()
					action3()
					thing78(atPosition = 4) {
						action4()
					}
					action5()
					thing78(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing78(atPosition = 7) {
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
				thing78s {
					text1 = "thing78 1"
					text2 = "thing78 2"
					text3 = "thing78 3"
					thing78(atPosition = 4) {
						text4 = "thing78 4"
					}
					text5 = "thing78 5"
					thing78(atPosition = 6) {
						text6 = "thing78 6"
						text6 = "thing78 6"
						text6 = "thing78 6"
					}
					thing78(atPosition = 7) {
						text7 = "thing78 7"
						text4 = "thing78 4"
						text7 = "thing78 7"
					}
					text8 = "thing78 8"
				}
			}
		}
	}

	@Test
	fun testThing78_4() = gwen {
		given {
			server stubs {
				get("/thing78") with json(testR.raw.repos)
			}
			user launches { thing78sScreen("thing78") }
		}

		whenever {
			user selects {
				thing78s {
					action1()
					action2()
					action3()
					thing78(atPosition = 4) {
						action4()
					}
					action5()
					thing78(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing78(atPosition = 7) {
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
				thing78s {
					text1 = "thing78 1"
					text2 = "thing78 2"
					text3 = "thing78 3"
					thing78(atPosition = 4) {
						text4 = "thing78 4"
					}
					text5 = "thing78 5"
					thing78(atPosition = 6) {
						text6 = "thing78 6"
						text6 = "thing78 6"
						text6 = "thing78 6"
					}
					thing78(atPosition = 7) {
						text7 = "thing78 7"
						text4 = "thing78 4"
						text7 = "thing78 7"
					}
					text8 = "thing78 8"
				}
			}
		}
	}

	@Test
	fun testThing78_5() = gwen {
		given {
			server stubs {
				get("/thing78") with json(testR.raw.repos)
			}
			user launches { thing78sScreen("thing78") }
		}

		whenever {
			user selects {
				thing78s {
					action1()
					action2()
					action3()
					thing78(atPosition = 4) {
						action4()
					}
					action5()
					thing78(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing78(atPosition = 7) {
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
				thing78s {
					text1 = "thing78 1"
					text2 = "thing78 2"
					text3 = "thing78 3"
					thing78(atPosition = 4) {
						text4 = "thing78 4"
					}
					text5 = "thing78 5"
					thing78(atPosition = 6) {
						text6 = "thing78 6"
						text6 = "thing78 6"
						text6 = "thing78 6"
					}
					thing78(atPosition = 7) {
						text7 = "thing78 7"
						text4 = "thing78 4"
						text7 = "thing78 7"
					}
					text8 = "thing78 8"
				}
			}
		}
	}
}
