package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing50.thing50s
import net.twisterrob.real.app.test.dsls.thing50.thing50sScreen
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
class Thing50Test : UiTest() {

	@Test
	fun testThing50_1() = gwen {
		given {
			server stubs {
				get("/thing50") with json(testR.raw.repos)
			}
			user launches { thing50sScreen("thing50") }
		}

		whenever {
			user selects {
				thing50s {
					action1()
					action2()
					action3()
					thing50(atPosition = 4) {
						action4()
					}
					action5()
					thing50(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing50(atPosition = 7) {
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
				thing50s {
					text1 = "thing50 1"
					text2 = "thing50 2"
					text3 = "thing50 3"
					thing50(atPosition = 4) {
						text4 = "thing50 4"
					}
					text5 = "thing50 5"
					thing50(atPosition = 6) {
						text6 = "thing50 6"
						text6 = "thing50 6"
						text6 = "thing50 6"
					}
					thing50(atPosition = 7) {
						text7 = "thing50 7"
						text4 = "thing50 4"
						text7 = "thing50 7"
					}
					text8 = "thing50 8"
				}
			}
		}
	}

	@Test
	fun testThing50_2() = gwen {
		given {
			server stubs {
				get("/thing50") with json(testR.raw.repos)
			}
			user launches { thing50sScreen("thing50") }
		}

		whenever {
			user selects {
				thing50s {
					action1()
					action2()
					action3()
					thing50(atPosition = 4) {
						action4()
					}
					action5()
					thing50(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing50(atPosition = 7) {
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
				thing50s {
					text1 = "thing50 1"
					text2 = "thing50 2"
					text3 = "thing50 3"
					thing50(atPosition = 4) {
						text4 = "thing50 4"
					}
					text5 = "thing50 5"
					thing50(atPosition = 6) {
						text6 = "thing50 6"
						text6 = "thing50 6"
						text6 = "thing50 6"
					}
					thing50(atPosition = 7) {
						text7 = "thing50 7"
						text4 = "thing50 4"
						text7 = "thing50 7"
					}
					text8 = "thing50 8"
				}
			}
		}
	}

	@Test
	fun testThing50_3() = gwen {
		given {
			server stubs {
				get("/thing50") with json(testR.raw.repos)
			}
			user launches { thing50sScreen("thing50") }
		}

		whenever {
			user selects {
				thing50s {
					action1()
					action2()
					action3()
					thing50(atPosition = 4) {
						action4()
					}
					action5()
					thing50(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing50(atPosition = 7) {
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
				thing50s {
					text1 = "thing50 1"
					text2 = "thing50 2"
					text3 = "thing50 3"
					thing50(atPosition = 4) {
						text4 = "thing50 4"
					}
					text5 = "thing50 5"
					thing50(atPosition = 6) {
						text6 = "thing50 6"
						text6 = "thing50 6"
						text6 = "thing50 6"
					}
					thing50(atPosition = 7) {
						text7 = "thing50 7"
						text4 = "thing50 4"
						text7 = "thing50 7"
					}
					text8 = "thing50 8"
				}
			}
		}
	}

	@Test
	fun testThing50_4() = gwen {
		given {
			server stubs {
				get("/thing50") with json(testR.raw.repos)
			}
			user launches { thing50sScreen("thing50") }
		}

		whenever {
			user selects {
				thing50s {
					action1()
					action2()
					action3()
					thing50(atPosition = 4) {
						action4()
					}
					action5()
					thing50(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing50(atPosition = 7) {
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
				thing50s {
					text1 = "thing50 1"
					text2 = "thing50 2"
					text3 = "thing50 3"
					thing50(atPosition = 4) {
						text4 = "thing50 4"
					}
					text5 = "thing50 5"
					thing50(atPosition = 6) {
						text6 = "thing50 6"
						text6 = "thing50 6"
						text6 = "thing50 6"
					}
					thing50(atPosition = 7) {
						text7 = "thing50 7"
						text4 = "thing50 4"
						text7 = "thing50 7"
					}
					text8 = "thing50 8"
				}
			}
		}
	}

	@Test
	fun testThing50_5() = gwen {
		given {
			server stubs {
				get("/thing50") with json(testR.raw.repos)
			}
			user launches { thing50sScreen("thing50") }
		}

		whenever {
			user selects {
				thing50s {
					action1()
					action2()
					action3()
					thing50(atPosition = 4) {
						action4()
					}
					action5()
					thing50(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing50(atPosition = 7) {
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
				thing50s {
					text1 = "thing50 1"
					text2 = "thing50 2"
					text3 = "thing50 3"
					thing50(atPosition = 4) {
						text4 = "thing50 4"
					}
					text5 = "thing50 5"
					thing50(atPosition = 6) {
						text6 = "thing50 6"
						text6 = "thing50 6"
						text6 = "thing50 6"
					}
					thing50(atPosition = 7) {
						text7 = "thing50 7"
						text4 = "thing50 4"
						text7 = "thing50 7"
					}
					text8 = "thing50 8"
				}
			}
		}
	}
}
