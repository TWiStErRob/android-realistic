package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing98.thing98s
import net.twisterrob.real.app.test.dsls.thing98.thing98sScreen
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
class Thing98Test : UiTest() {

	@Test
	fun testThing98_1() = gwen {
		given {
			server stubs {
				get("/thing98") with json(testR.raw.repos)
			}
			user launches { thing98sScreen("thing98") }
		}

		whenever {
			user selects {
				thing98s {
					action1()
					action2()
					action3()
					thing98(atPosition = 4) {
						action4()
					}
					action5()
					thing98(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing98(atPosition = 7) {
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
				thing98s {
					text1 = "thing98 1"
					text2 = "thing98 2"
					text3 = "thing98 3"
					thing98(atPosition = 4) {
						text4 = "thing98 4"
					}
					text5 = "thing98 5"
					thing98(atPosition = 6) {
						text6 = "thing98 6"
						text6 = "thing98 6"
						text6 = "thing98 6"
					}
					thing98(atPosition = 7) {
						text7 = "thing98 7"
						text4 = "thing98 4"
						text7 = "thing98 7"
					}
					text8 = "thing98 8"
				}
			}
		}
	}

	@Test
	fun testThing98_2() = gwen {
		given {
			server stubs {
				get("/thing98") with json(testR.raw.repos)
			}
			user launches { thing98sScreen("thing98") }
		}

		whenever {
			user selects {
				thing98s {
					action1()
					action2()
					action3()
					thing98(atPosition = 4) {
						action4()
					}
					action5()
					thing98(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing98(atPosition = 7) {
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
				thing98s {
					text1 = "thing98 1"
					text2 = "thing98 2"
					text3 = "thing98 3"
					thing98(atPosition = 4) {
						text4 = "thing98 4"
					}
					text5 = "thing98 5"
					thing98(atPosition = 6) {
						text6 = "thing98 6"
						text6 = "thing98 6"
						text6 = "thing98 6"
					}
					thing98(atPosition = 7) {
						text7 = "thing98 7"
						text4 = "thing98 4"
						text7 = "thing98 7"
					}
					text8 = "thing98 8"
				}
			}
		}
	}

	@Test
	fun testThing98_3() = gwen {
		given {
			server stubs {
				get("/thing98") with json(testR.raw.repos)
			}
			user launches { thing98sScreen("thing98") }
		}

		whenever {
			user selects {
				thing98s {
					action1()
					action2()
					action3()
					thing98(atPosition = 4) {
						action4()
					}
					action5()
					thing98(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing98(atPosition = 7) {
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
				thing98s {
					text1 = "thing98 1"
					text2 = "thing98 2"
					text3 = "thing98 3"
					thing98(atPosition = 4) {
						text4 = "thing98 4"
					}
					text5 = "thing98 5"
					thing98(atPosition = 6) {
						text6 = "thing98 6"
						text6 = "thing98 6"
						text6 = "thing98 6"
					}
					thing98(atPosition = 7) {
						text7 = "thing98 7"
						text4 = "thing98 4"
						text7 = "thing98 7"
					}
					text8 = "thing98 8"
				}
			}
		}
	}

	@Test
	fun testThing98_4() = gwen {
		given {
			server stubs {
				get("/thing98") with json(testR.raw.repos)
			}
			user launches { thing98sScreen("thing98") }
		}

		whenever {
			user selects {
				thing98s {
					action1()
					action2()
					action3()
					thing98(atPosition = 4) {
						action4()
					}
					action5()
					thing98(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing98(atPosition = 7) {
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
				thing98s {
					text1 = "thing98 1"
					text2 = "thing98 2"
					text3 = "thing98 3"
					thing98(atPosition = 4) {
						text4 = "thing98 4"
					}
					text5 = "thing98 5"
					thing98(atPosition = 6) {
						text6 = "thing98 6"
						text6 = "thing98 6"
						text6 = "thing98 6"
					}
					thing98(atPosition = 7) {
						text7 = "thing98 7"
						text4 = "thing98 4"
						text7 = "thing98 7"
					}
					text8 = "thing98 8"
				}
			}
		}
	}

	@Test
	fun testThing98_5() = gwen {
		given {
			server stubs {
				get("/thing98") with json(testR.raw.repos)
			}
			user launches { thing98sScreen("thing98") }
		}

		whenever {
			user selects {
				thing98s {
					action1()
					action2()
					action3()
					thing98(atPosition = 4) {
						action4()
					}
					action5()
					thing98(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing98(atPosition = 7) {
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
				thing98s {
					text1 = "thing98 1"
					text2 = "thing98 2"
					text3 = "thing98 3"
					thing98(atPosition = 4) {
						text4 = "thing98 4"
					}
					text5 = "thing98 5"
					thing98(atPosition = 6) {
						text6 = "thing98 6"
						text6 = "thing98 6"
						text6 = "thing98 6"
					}
					thing98(atPosition = 7) {
						text7 = "thing98 7"
						text4 = "thing98 4"
						text7 = "thing98 7"
					}
					text8 = "thing98 8"
				}
			}
		}
	}
}
