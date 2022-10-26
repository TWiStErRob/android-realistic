package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing43.thing43s
import net.twisterrob.real.app.test.dsls.thing43.thing43sScreen
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
class Thing43Test : UiTest() {

	@Test
	fun testThing43_1() = gwen {
		given {
			server stubs {
				get("/thing43") with json(testR.raw.repos)
			}
			user launches { thing43sScreen("thing43") }
		}

		whenever {
			user selects {
				thing43s {
					action1()
					action2()
					action3()
					thing43(atPosition = 4) {
						action4()
					}
					action5()
					thing43(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing43(atPosition = 7) {
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
				thing43s {
					text1 = "thing43 1"
					text2 = "thing43 2"
					text3 = "thing43 3"
					thing43(atPosition = 4) {
						text4 = "thing43 4"
					}
					text5 = "thing43 5"
					thing43(atPosition = 6) {
						text6 = "thing43 6"
						text6 = "thing43 6"
						text6 = "thing43 6"
					}
					thing43(atPosition = 7) {
						text7 = "thing43 7"
						text4 = "thing43 4"
						text7 = "thing43 7"
					}
					text8 = "thing43 8"
				}
			}
		}
	}

	@Test
	fun testThing43_2() = gwen {
		given {
			server stubs {
				get("/thing43") with json(testR.raw.repos)
			}
			user launches { thing43sScreen("thing43") }
		}

		whenever {
			user selects {
				thing43s {
					action1()
					action2()
					action3()
					thing43(atPosition = 4) {
						action4()
					}
					action5()
					thing43(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing43(atPosition = 7) {
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
				thing43s {
					text1 = "thing43 1"
					text2 = "thing43 2"
					text3 = "thing43 3"
					thing43(atPosition = 4) {
						text4 = "thing43 4"
					}
					text5 = "thing43 5"
					thing43(atPosition = 6) {
						text6 = "thing43 6"
						text6 = "thing43 6"
						text6 = "thing43 6"
					}
					thing43(atPosition = 7) {
						text7 = "thing43 7"
						text4 = "thing43 4"
						text7 = "thing43 7"
					}
					text8 = "thing43 8"
				}
			}
		}
	}

	@Test
	fun testThing43_3() = gwen {
		given {
			server stubs {
				get("/thing43") with json(testR.raw.repos)
			}
			user launches { thing43sScreen("thing43") }
		}

		whenever {
			user selects {
				thing43s {
					action1()
					action2()
					action3()
					thing43(atPosition = 4) {
						action4()
					}
					action5()
					thing43(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing43(atPosition = 7) {
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
				thing43s {
					text1 = "thing43 1"
					text2 = "thing43 2"
					text3 = "thing43 3"
					thing43(atPosition = 4) {
						text4 = "thing43 4"
					}
					text5 = "thing43 5"
					thing43(atPosition = 6) {
						text6 = "thing43 6"
						text6 = "thing43 6"
						text6 = "thing43 6"
					}
					thing43(atPosition = 7) {
						text7 = "thing43 7"
						text4 = "thing43 4"
						text7 = "thing43 7"
					}
					text8 = "thing43 8"
				}
			}
		}
	}

	@Test
	fun testThing43_4() = gwen {
		given {
			server stubs {
				get("/thing43") with json(testR.raw.repos)
			}
			user launches { thing43sScreen("thing43") }
		}

		whenever {
			user selects {
				thing43s {
					action1()
					action2()
					action3()
					thing43(atPosition = 4) {
						action4()
					}
					action5()
					thing43(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing43(atPosition = 7) {
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
				thing43s {
					text1 = "thing43 1"
					text2 = "thing43 2"
					text3 = "thing43 3"
					thing43(atPosition = 4) {
						text4 = "thing43 4"
					}
					text5 = "thing43 5"
					thing43(atPosition = 6) {
						text6 = "thing43 6"
						text6 = "thing43 6"
						text6 = "thing43 6"
					}
					thing43(atPosition = 7) {
						text7 = "thing43 7"
						text4 = "thing43 4"
						text7 = "thing43 7"
					}
					text8 = "thing43 8"
				}
			}
		}
	}

	@Test
	fun testThing43_5() = gwen {
		given {
			server stubs {
				get("/thing43") with json(testR.raw.repos)
			}
			user launches { thing43sScreen("thing43") }
		}

		whenever {
			user selects {
				thing43s {
					action1()
					action2()
					action3()
					thing43(atPosition = 4) {
						action4()
					}
					action5()
					thing43(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing43(atPosition = 7) {
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
				thing43s {
					text1 = "thing43 1"
					text2 = "thing43 2"
					text3 = "thing43 3"
					thing43(atPosition = 4) {
						text4 = "thing43 4"
					}
					text5 = "thing43 5"
					thing43(atPosition = 6) {
						text6 = "thing43 6"
						text6 = "thing43 6"
						text6 = "thing43 6"
					}
					thing43(atPosition = 7) {
						text7 = "thing43 7"
						text4 = "thing43 4"
						text7 = "thing43 7"
					}
					text8 = "thing43 8"
				}
			}
		}
	}
}
