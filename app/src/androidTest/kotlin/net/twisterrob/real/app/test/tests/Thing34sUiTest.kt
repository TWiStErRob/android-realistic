package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing34.thing34s
import net.twisterrob.real.app.test.dsls.thing34.thing34sScreen
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
class Thing34Test : UiTest() {

	@Test
	fun testThing34_1() = gwen {
		given {
			server stubs {
				get("/thing34") with json(testR.raw.repos)
			}
			user launches { thing34sScreen("thing34") }
		}

		whenever {
			user selects {
				thing34s {
					action1()
					action2()
					action3()
					thing34(atPosition = 4) {
						action4()
					}
					action5()
					thing34(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing34(atPosition = 7) {
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
				thing34s {
					text1 = "thing34 1"
					text2 = "thing34 2"
					text3 = "thing34 3"
					thing34(atPosition = 4) {
						text4 = "thing34 4"
					}
					text5 = "thing34 5"
					thing34(atPosition = 6) {
						text6 = "thing34 6"
						text6 = "thing34 6"
						text6 = "thing34 6"
					}
					thing34(atPosition = 7) {
						text7 = "thing34 7"
						text4 = "thing34 4"
						text7 = "thing34 7"
					}
					text8 = "thing34 8"
				}
			}
		}
	}

	@Test
	fun testThing34_2() = gwen {
		given {
			server stubs {
				get("/thing34") with json(testR.raw.repos)
			}
			user launches { thing34sScreen("thing34") }
		}

		whenever {
			user selects {
				thing34s {
					action1()
					action2()
					action3()
					thing34(atPosition = 4) {
						action4()
					}
					action5()
					thing34(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing34(atPosition = 7) {
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
				thing34s {
					text1 = "thing34 1"
					text2 = "thing34 2"
					text3 = "thing34 3"
					thing34(atPosition = 4) {
						text4 = "thing34 4"
					}
					text5 = "thing34 5"
					thing34(atPosition = 6) {
						text6 = "thing34 6"
						text6 = "thing34 6"
						text6 = "thing34 6"
					}
					thing34(atPosition = 7) {
						text7 = "thing34 7"
						text4 = "thing34 4"
						text7 = "thing34 7"
					}
					text8 = "thing34 8"
				}
			}
		}
	}

	@Test
	fun testThing34_3() = gwen {
		given {
			server stubs {
				get("/thing34") with json(testR.raw.repos)
			}
			user launches { thing34sScreen("thing34") }
		}

		whenever {
			user selects {
				thing34s {
					action1()
					action2()
					action3()
					thing34(atPosition = 4) {
						action4()
					}
					action5()
					thing34(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing34(atPosition = 7) {
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
				thing34s {
					text1 = "thing34 1"
					text2 = "thing34 2"
					text3 = "thing34 3"
					thing34(atPosition = 4) {
						text4 = "thing34 4"
					}
					text5 = "thing34 5"
					thing34(atPosition = 6) {
						text6 = "thing34 6"
						text6 = "thing34 6"
						text6 = "thing34 6"
					}
					thing34(atPosition = 7) {
						text7 = "thing34 7"
						text4 = "thing34 4"
						text7 = "thing34 7"
					}
					text8 = "thing34 8"
				}
			}
		}
	}

	@Test
	fun testThing34_4() = gwen {
		given {
			server stubs {
				get("/thing34") with json(testR.raw.repos)
			}
			user launches { thing34sScreen("thing34") }
		}

		whenever {
			user selects {
				thing34s {
					action1()
					action2()
					action3()
					thing34(atPosition = 4) {
						action4()
					}
					action5()
					thing34(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing34(atPosition = 7) {
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
				thing34s {
					text1 = "thing34 1"
					text2 = "thing34 2"
					text3 = "thing34 3"
					thing34(atPosition = 4) {
						text4 = "thing34 4"
					}
					text5 = "thing34 5"
					thing34(atPosition = 6) {
						text6 = "thing34 6"
						text6 = "thing34 6"
						text6 = "thing34 6"
					}
					thing34(atPosition = 7) {
						text7 = "thing34 7"
						text4 = "thing34 4"
						text7 = "thing34 7"
					}
					text8 = "thing34 8"
				}
			}
		}
	}

	@Test
	fun testThing34_5() = gwen {
		given {
			server stubs {
				get("/thing34") with json(testR.raw.repos)
			}
			user launches { thing34sScreen("thing34") }
		}

		whenever {
			user selects {
				thing34s {
					action1()
					action2()
					action3()
					thing34(atPosition = 4) {
						action4()
					}
					action5()
					thing34(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing34(atPosition = 7) {
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
				thing34s {
					text1 = "thing34 1"
					text2 = "thing34 2"
					text3 = "thing34 3"
					thing34(atPosition = 4) {
						text4 = "thing34 4"
					}
					text5 = "thing34 5"
					thing34(atPosition = 6) {
						text6 = "thing34 6"
						text6 = "thing34 6"
						text6 = "thing34 6"
					}
					thing34(atPosition = 7) {
						text7 = "thing34 7"
						text4 = "thing34 4"
						text7 = "thing34 7"
					}
					text8 = "thing34 8"
				}
			}
		}
	}
}
