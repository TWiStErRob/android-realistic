package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing71.thing71s
import net.twisterrob.real.app.test.dsls.thing71.thing71sScreen
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
class Thing71Test : UiTest() {

	@Test
	fun testThing71_1() = gwen {
		given {
			server stubs {
				get("/thing71") with json(testR.raw.repos)
			}
			user launches { thing71sScreen("thing71") }
		}

		whenever {
			user selects {
				thing71s {
					action1()
					action2()
					action3()
					thing71(atPosition = 4) {
						action4()
					}
					action5()
					thing71(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing71(atPosition = 7) {
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
				thing71s {
					text1 = "thing71 1"
					text2 = "thing71 2"
					text3 = "thing71 3"
					thing71(atPosition = 4) {
						text4 = "thing71 4"
					}
					text5 = "thing71 5"
					thing71(atPosition = 6) {
						text6 = "thing71 6"
						text6 = "thing71 6"
						text6 = "thing71 6"
					}
					thing71(atPosition = 7) {
						text7 = "thing71 7"
						text4 = "thing71 4"
						text7 = "thing71 7"
					}
					text8 = "thing71 8"
				}
			}
		}
	}

	@Test
	fun testThing71_2() = gwen {
		given {
			server stubs {
				get("/thing71") with json(testR.raw.repos)
			}
			user launches { thing71sScreen("thing71") }
		}

		whenever {
			user selects {
				thing71s {
					action1()
					action2()
					action3()
					thing71(atPosition = 4) {
						action4()
					}
					action5()
					thing71(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing71(atPosition = 7) {
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
				thing71s {
					text1 = "thing71 1"
					text2 = "thing71 2"
					text3 = "thing71 3"
					thing71(atPosition = 4) {
						text4 = "thing71 4"
					}
					text5 = "thing71 5"
					thing71(atPosition = 6) {
						text6 = "thing71 6"
						text6 = "thing71 6"
						text6 = "thing71 6"
					}
					thing71(atPosition = 7) {
						text7 = "thing71 7"
						text4 = "thing71 4"
						text7 = "thing71 7"
					}
					text8 = "thing71 8"
				}
			}
		}
	}

	@Test
	fun testThing71_3() = gwen {
		given {
			server stubs {
				get("/thing71") with json(testR.raw.repos)
			}
			user launches { thing71sScreen("thing71") }
		}

		whenever {
			user selects {
				thing71s {
					action1()
					action2()
					action3()
					thing71(atPosition = 4) {
						action4()
					}
					action5()
					thing71(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing71(atPosition = 7) {
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
				thing71s {
					text1 = "thing71 1"
					text2 = "thing71 2"
					text3 = "thing71 3"
					thing71(atPosition = 4) {
						text4 = "thing71 4"
					}
					text5 = "thing71 5"
					thing71(atPosition = 6) {
						text6 = "thing71 6"
						text6 = "thing71 6"
						text6 = "thing71 6"
					}
					thing71(atPosition = 7) {
						text7 = "thing71 7"
						text4 = "thing71 4"
						text7 = "thing71 7"
					}
					text8 = "thing71 8"
				}
			}
		}
	}

	@Test
	fun testThing71_4() = gwen {
		given {
			server stubs {
				get("/thing71") with json(testR.raw.repos)
			}
			user launches { thing71sScreen("thing71") }
		}

		whenever {
			user selects {
				thing71s {
					action1()
					action2()
					action3()
					thing71(atPosition = 4) {
						action4()
					}
					action5()
					thing71(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing71(atPosition = 7) {
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
				thing71s {
					text1 = "thing71 1"
					text2 = "thing71 2"
					text3 = "thing71 3"
					thing71(atPosition = 4) {
						text4 = "thing71 4"
					}
					text5 = "thing71 5"
					thing71(atPosition = 6) {
						text6 = "thing71 6"
						text6 = "thing71 6"
						text6 = "thing71 6"
					}
					thing71(atPosition = 7) {
						text7 = "thing71 7"
						text4 = "thing71 4"
						text7 = "thing71 7"
					}
					text8 = "thing71 8"
				}
			}
		}
	}

	@Test
	fun testThing71_5() = gwen {
		given {
			server stubs {
				get("/thing71") with json(testR.raw.repos)
			}
			user launches { thing71sScreen("thing71") }
		}

		whenever {
			user selects {
				thing71s {
					action1()
					action2()
					action3()
					thing71(atPosition = 4) {
						action4()
					}
					action5()
					thing71(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing71(atPosition = 7) {
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
				thing71s {
					text1 = "thing71 1"
					text2 = "thing71 2"
					text3 = "thing71 3"
					thing71(atPosition = 4) {
						text4 = "thing71 4"
					}
					text5 = "thing71 5"
					thing71(atPosition = 6) {
						text6 = "thing71 6"
						text6 = "thing71 6"
						text6 = "thing71 6"
					}
					thing71(atPosition = 7) {
						text7 = "thing71 7"
						text4 = "thing71 4"
						text7 = "thing71 7"
					}
					text8 = "thing71 8"
				}
			}
		}
	}
}
