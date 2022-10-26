package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing73.thing73s
import net.twisterrob.real.app.test.dsls.thing73.thing73sScreen
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
class Thing73Test : UiTest() {

	@Test
	fun testThing73_1() = gwen {
		given {
			server stubs {
				get("/thing73") with json(testR.raw.repos)
			}
			user launches { thing73sScreen("thing73") }
		}

		whenever {
			user selects {
				thing73s {
					action1()
					action2()
					action3()
					thing73(atPosition = 4) {
						action4()
					}
					action5()
					thing73(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing73(atPosition = 7) {
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
				thing73s {
					text1 = "thing73 1"
					text2 = "thing73 2"
					text3 = "thing73 3"
					thing73(atPosition = 4) {
						text4 = "thing73 4"
					}
					text5 = "thing73 5"
					thing73(atPosition = 6) {
						text6 = "thing73 6"
						text6 = "thing73 6"
						text6 = "thing73 6"
					}
					thing73(atPosition = 7) {
						text7 = "thing73 7"
						text4 = "thing73 4"
						text7 = "thing73 7"
					}
					text8 = "thing73 8"
				}
			}
		}
	}

	@Test
	fun testThing73_2() = gwen {
		given {
			server stubs {
				get("/thing73") with json(testR.raw.repos)
			}
			user launches { thing73sScreen("thing73") }
		}

		whenever {
			user selects {
				thing73s {
					action1()
					action2()
					action3()
					thing73(atPosition = 4) {
						action4()
					}
					action5()
					thing73(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing73(atPosition = 7) {
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
				thing73s {
					text1 = "thing73 1"
					text2 = "thing73 2"
					text3 = "thing73 3"
					thing73(atPosition = 4) {
						text4 = "thing73 4"
					}
					text5 = "thing73 5"
					thing73(atPosition = 6) {
						text6 = "thing73 6"
						text6 = "thing73 6"
						text6 = "thing73 6"
					}
					thing73(atPosition = 7) {
						text7 = "thing73 7"
						text4 = "thing73 4"
						text7 = "thing73 7"
					}
					text8 = "thing73 8"
				}
			}
		}
	}

	@Test
	fun testThing73_3() = gwen {
		given {
			server stubs {
				get("/thing73") with json(testR.raw.repos)
			}
			user launches { thing73sScreen("thing73") }
		}

		whenever {
			user selects {
				thing73s {
					action1()
					action2()
					action3()
					thing73(atPosition = 4) {
						action4()
					}
					action5()
					thing73(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing73(atPosition = 7) {
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
				thing73s {
					text1 = "thing73 1"
					text2 = "thing73 2"
					text3 = "thing73 3"
					thing73(atPosition = 4) {
						text4 = "thing73 4"
					}
					text5 = "thing73 5"
					thing73(atPosition = 6) {
						text6 = "thing73 6"
						text6 = "thing73 6"
						text6 = "thing73 6"
					}
					thing73(atPosition = 7) {
						text7 = "thing73 7"
						text4 = "thing73 4"
						text7 = "thing73 7"
					}
					text8 = "thing73 8"
				}
			}
		}
	}

	@Test
	fun testThing73_4() = gwen {
		given {
			server stubs {
				get("/thing73") with json(testR.raw.repos)
			}
			user launches { thing73sScreen("thing73") }
		}

		whenever {
			user selects {
				thing73s {
					action1()
					action2()
					action3()
					thing73(atPosition = 4) {
						action4()
					}
					action5()
					thing73(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing73(atPosition = 7) {
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
				thing73s {
					text1 = "thing73 1"
					text2 = "thing73 2"
					text3 = "thing73 3"
					thing73(atPosition = 4) {
						text4 = "thing73 4"
					}
					text5 = "thing73 5"
					thing73(atPosition = 6) {
						text6 = "thing73 6"
						text6 = "thing73 6"
						text6 = "thing73 6"
					}
					thing73(atPosition = 7) {
						text7 = "thing73 7"
						text4 = "thing73 4"
						text7 = "thing73 7"
					}
					text8 = "thing73 8"
				}
			}
		}
	}

	@Test
	fun testThing73_5() = gwen {
		given {
			server stubs {
				get("/thing73") with json(testR.raw.repos)
			}
			user launches { thing73sScreen("thing73") }
		}

		whenever {
			user selects {
				thing73s {
					action1()
					action2()
					action3()
					thing73(atPosition = 4) {
						action4()
					}
					action5()
					thing73(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing73(atPosition = 7) {
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
				thing73s {
					text1 = "thing73 1"
					text2 = "thing73 2"
					text3 = "thing73 3"
					thing73(atPosition = 4) {
						text4 = "thing73 4"
					}
					text5 = "thing73 5"
					thing73(atPosition = 6) {
						text6 = "thing73 6"
						text6 = "thing73 6"
						text6 = "thing73 6"
					}
					thing73(atPosition = 7) {
						text7 = "thing73 7"
						text4 = "thing73 4"
						text7 = "thing73 7"
					}
					text8 = "thing73 8"
				}
			}
		}
	}
}
