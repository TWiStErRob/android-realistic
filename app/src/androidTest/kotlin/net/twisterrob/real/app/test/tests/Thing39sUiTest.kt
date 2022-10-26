package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing39.thing39s
import net.twisterrob.real.app.test.dsls.thing39.thing39sScreen
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
class Thing39Test : UiTest() {

	@Test
	fun testThing39_1() = gwen {
		given {
			server stubs {
				get("/thing39") with json(testR.raw.repos)
			}
			user launches { thing39sScreen("thing39") }
		}

		whenever {
			user selects {
				thing39s {
					action1()
					action2()
					action3()
					thing39(atPosition = 4) {
						action4()
					}
					action5()
					thing39(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing39(atPosition = 7) {
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
				thing39s {
					text1 = "thing39 1"
					text2 = "thing39 2"
					text3 = "thing39 3"
					thing39(atPosition = 4) {
						text4 = "thing39 4"
					}
					text5 = "thing39 5"
					thing39(atPosition = 6) {
						text6 = "thing39 6"
						text6 = "thing39 6"
						text6 = "thing39 6"
					}
					thing39(atPosition = 7) {
						text7 = "thing39 7"
						text4 = "thing39 4"
						text7 = "thing39 7"
					}
					text8 = "thing39 8"
				}
			}
		}
	}

	@Test
	fun testThing39_2() = gwen {
		given {
			server stubs {
				get("/thing39") with json(testR.raw.repos)
			}
			user launches { thing39sScreen("thing39") }
		}

		whenever {
			user selects {
				thing39s {
					action1()
					action2()
					action3()
					thing39(atPosition = 4) {
						action4()
					}
					action5()
					thing39(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing39(atPosition = 7) {
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
				thing39s {
					text1 = "thing39 1"
					text2 = "thing39 2"
					text3 = "thing39 3"
					thing39(atPosition = 4) {
						text4 = "thing39 4"
					}
					text5 = "thing39 5"
					thing39(atPosition = 6) {
						text6 = "thing39 6"
						text6 = "thing39 6"
						text6 = "thing39 6"
					}
					thing39(atPosition = 7) {
						text7 = "thing39 7"
						text4 = "thing39 4"
						text7 = "thing39 7"
					}
					text8 = "thing39 8"
				}
			}
		}
	}

	@Test
	fun testThing39_3() = gwen {
		given {
			server stubs {
				get("/thing39") with json(testR.raw.repos)
			}
			user launches { thing39sScreen("thing39") }
		}

		whenever {
			user selects {
				thing39s {
					action1()
					action2()
					action3()
					thing39(atPosition = 4) {
						action4()
					}
					action5()
					thing39(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing39(atPosition = 7) {
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
				thing39s {
					text1 = "thing39 1"
					text2 = "thing39 2"
					text3 = "thing39 3"
					thing39(atPosition = 4) {
						text4 = "thing39 4"
					}
					text5 = "thing39 5"
					thing39(atPosition = 6) {
						text6 = "thing39 6"
						text6 = "thing39 6"
						text6 = "thing39 6"
					}
					thing39(atPosition = 7) {
						text7 = "thing39 7"
						text4 = "thing39 4"
						text7 = "thing39 7"
					}
					text8 = "thing39 8"
				}
			}
		}
	}

	@Test
	fun testThing39_4() = gwen {
		given {
			server stubs {
				get("/thing39") with json(testR.raw.repos)
			}
			user launches { thing39sScreen("thing39") }
		}

		whenever {
			user selects {
				thing39s {
					action1()
					action2()
					action3()
					thing39(atPosition = 4) {
						action4()
					}
					action5()
					thing39(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing39(atPosition = 7) {
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
				thing39s {
					text1 = "thing39 1"
					text2 = "thing39 2"
					text3 = "thing39 3"
					thing39(atPosition = 4) {
						text4 = "thing39 4"
					}
					text5 = "thing39 5"
					thing39(atPosition = 6) {
						text6 = "thing39 6"
						text6 = "thing39 6"
						text6 = "thing39 6"
					}
					thing39(atPosition = 7) {
						text7 = "thing39 7"
						text4 = "thing39 4"
						text7 = "thing39 7"
					}
					text8 = "thing39 8"
				}
			}
		}
	}

	@Test
	fun testThing39_5() = gwen {
		given {
			server stubs {
				get("/thing39") with json(testR.raw.repos)
			}
			user launches { thing39sScreen("thing39") }
		}

		whenever {
			user selects {
				thing39s {
					action1()
					action2()
					action3()
					thing39(atPosition = 4) {
						action4()
					}
					action5()
					thing39(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing39(atPosition = 7) {
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
				thing39s {
					text1 = "thing39 1"
					text2 = "thing39 2"
					text3 = "thing39 3"
					thing39(atPosition = 4) {
						text4 = "thing39 4"
					}
					text5 = "thing39 5"
					thing39(atPosition = 6) {
						text6 = "thing39 6"
						text6 = "thing39 6"
						text6 = "thing39 6"
					}
					thing39(atPosition = 7) {
						text7 = "thing39 7"
						text4 = "thing39 4"
						text7 = "thing39 7"
					}
					text8 = "thing39 8"
				}
			}
		}
	}
}
