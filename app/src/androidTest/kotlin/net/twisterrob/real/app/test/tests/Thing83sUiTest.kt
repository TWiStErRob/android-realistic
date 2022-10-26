package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing83.thing83s
import net.twisterrob.real.app.test.dsls.thing83.thing83sScreen
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
class Thing83Test : UiTest() {

	@Test
	fun testThing83_1() = gwen {
		given {
			server stubs {
				get("/thing83") with json(testR.raw.repos)
			}
			user launches { thing83sScreen("thing83") }
		}

		whenever {
			user selects {
				thing83s {
					action1()
					action2()
					action3()
					thing83(atPosition = 4) {
						action4()
					}
					action5()
					thing83(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing83(atPosition = 7) {
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
				thing83s {
					text1 = "thing83 1"
					text2 = "thing83 2"
					text3 = "thing83 3"
					thing83(atPosition = 4) {
						text4 = "thing83 4"
					}
					text5 = "thing83 5"
					thing83(atPosition = 6) {
						text6 = "thing83 6"
						text6 = "thing83 6"
						text6 = "thing83 6"
					}
					thing83(atPosition = 7) {
						text7 = "thing83 7"
						text4 = "thing83 4"
						text7 = "thing83 7"
					}
					text8 = "thing83 8"
				}
			}
		}
	}

	@Test
	fun testThing83_2() = gwen {
		given {
			server stubs {
				get("/thing83") with json(testR.raw.repos)
			}
			user launches { thing83sScreen("thing83") }
		}

		whenever {
			user selects {
				thing83s {
					action1()
					action2()
					action3()
					thing83(atPosition = 4) {
						action4()
					}
					action5()
					thing83(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing83(atPosition = 7) {
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
				thing83s {
					text1 = "thing83 1"
					text2 = "thing83 2"
					text3 = "thing83 3"
					thing83(atPosition = 4) {
						text4 = "thing83 4"
					}
					text5 = "thing83 5"
					thing83(atPosition = 6) {
						text6 = "thing83 6"
						text6 = "thing83 6"
						text6 = "thing83 6"
					}
					thing83(atPosition = 7) {
						text7 = "thing83 7"
						text4 = "thing83 4"
						text7 = "thing83 7"
					}
					text8 = "thing83 8"
				}
			}
		}
	}

	@Test
	fun testThing83_3() = gwen {
		given {
			server stubs {
				get("/thing83") with json(testR.raw.repos)
			}
			user launches { thing83sScreen("thing83") }
		}

		whenever {
			user selects {
				thing83s {
					action1()
					action2()
					action3()
					thing83(atPosition = 4) {
						action4()
					}
					action5()
					thing83(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing83(atPosition = 7) {
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
				thing83s {
					text1 = "thing83 1"
					text2 = "thing83 2"
					text3 = "thing83 3"
					thing83(atPosition = 4) {
						text4 = "thing83 4"
					}
					text5 = "thing83 5"
					thing83(atPosition = 6) {
						text6 = "thing83 6"
						text6 = "thing83 6"
						text6 = "thing83 6"
					}
					thing83(atPosition = 7) {
						text7 = "thing83 7"
						text4 = "thing83 4"
						text7 = "thing83 7"
					}
					text8 = "thing83 8"
				}
			}
		}
	}

	@Test
	fun testThing83_4() = gwen {
		given {
			server stubs {
				get("/thing83") with json(testR.raw.repos)
			}
			user launches { thing83sScreen("thing83") }
		}

		whenever {
			user selects {
				thing83s {
					action1()
					action2()
					action3()
					thing83(atPosition = 4) {
						action4()
					}
					action5()
					thing83(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing83(atPosition = 7) {
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
				thing83s {
					text1 = "thing83 1"
					text2 = "thing83 2"
					text3 = "thing83 3"
					thing83(atPosition = 4) {
						text4 = "thing83 4"
					}
					text5 = "thing83 5"
					thing83(atPosition = 6) {
						text6 = "thing83 6"
						text6 = "thing83 6"
						text6 = "thing83 6"
					}
					thing83(atPosition = 7) {
						text7 = "thing83 7"
						text4 = "thing83 4"
						text7 = "thing83 7"
					}
					text8 = "thing83 8"
				}
			}
		}
	}

	@Test
	fun testThing83_5() = gwen {
		given {
			server stubs {
				get("/thing83") with json(testR.raw.repos)
			}
			user launches { thing83sScreen("thing83") }
		}

		whenever {
			user selects {
				thing83s {
					action1()
					action2()
					action3()
					thing83(atPosition = 4) {
						action4()
					}
					action5()
					thing83(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing83(atPosition = 7) {
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
				thing83s {
					text1 = "thing83 1"
					text2 = "thing83 2"
					text3 = "thing83 3"
					thing83(atPosition = 4) {
						text4 = "thing83 4"
					}
					text5 = "thing83 5"
					thing83(atPosition = 6) {
						text6 = "thing83 6"
						text6 = "thing83 6"
						text6 = "thing83 6"
					}
					thing83(atPosition = 7) {
						text7 = "thing83 7"
						text4 = "thing83 4"
						text7 = "thing83 7"
					}
					text8 = "thing83 8"
				}
			}
		}
	}
}
