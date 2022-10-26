package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing17.thing17s
import net.twisterrob.real.app.test.dsls.thing17.thing17sScreen
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
class Thing17Test : UiTest() {

	@Test
	fun testThing17_1() = gwen {
		given {
			server stubs {
				get("/thing17") with json(testR.raw.repos)
			}
			user launches { thing17sScreen("thing17") }
		}

		whenever {
			user selects {
				thing17s {
					action1()
					action2()
					action3()
					thing17(atPosition = 4) {
						action4()
					}
					action5()
					thing17(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing17(atPosition = 7) {
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
				thing17s {
					text1 = "thing17 1"
					text2 = "thing17 2"
					text3 = "thing17 3"
					thing17(atPosition = 4) {
						text4 = "thing17 4"
					}
					text5 = "thing17 5"
					thing17(atPosition = 6) {
						text6 = "thing17 6"
						text6 = "thing17 6"
						text6 = "thing17 6"
					}
					thing17(atPosition = 7) {
						text7 = "thing17 7"
						text4 = "thing17 4"
						text7 = "thing17 7"
					}
					text8 = "thing17 8"
				}
			}
		}
	}

	@Test
	fun testThing17_2() = gwen {
		given {
			server stubs {
				get("/thing17") with json(testR.raw.repos)
			}
			user launches { thing17sScreen("thing17") }
		}

		whenever {
			user selects {
				thing17s {
					action1()
					action2()
					action3()
					thing17(atPosition = 4) {
						action4()
					}
					action5()
					thing17(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing17(atPosition = 7) {
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
				thing17s {
					text1 = "thing17 1"
					text2 = "thing17 2"
					text3 = "thing17 3"
					thing17(atPosition = 4) {
						text4 = "thing17 4"
					}
					text5 = "thing17 5"
					thing17(atPosition = 6) {
						text6 = "thing17 6"
						text6 = "thing17 6"
						text6 = "thing17 6"
					}
					thing17(atPosition = 7) {
						text7 = "thing17 7"
						text4 = "thing17 4"
						text7 = "thing17 7"
					}
					text8 = "thing17 8"
				}
			}
		}
	}

	@Test
	fun testThing17_3() = gwen {
		given {
			server stubs {
				get("/thing17") with json(testR.raw.repos)
			}
			user launches { thing17sScreen("thing17") }
		}

		whenever {
			user selects {
				thing17s {
					action1()
					action2()
					action3()
					thing17(atPosition = 4) {
						action4()
					}
					action5()
					thing17(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing17(atPosition = 7) {
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
				thing17s {
					text1 = "thing17 1"
					text2 = "thing17 2"
					text3 = "thing17 3"
					thing17(atPosition = 4) {
						text4 = "thing17 4"
					}
					text5 = "thing17 5"
					thing17(atPosition = 6) {
						text6 = "thing17 6"
						text6 = "thing17 6"
						text6 = "thing17 6"
					}
					thing17(atPosition = 7) {
						text7 = "thing17 7"
						text4 = "thing17 4"
						text7 = "thing17 7"
					}
					text8 = "thing17 8"
				}
			}
		}
	}

	@Test
	fun testThing17_4() = gwen {
		given {
			server stubs {
				get("/thing17") with json(testR.raw.repos)
			}
			user launches { thing17sScreen("thing17") }
		}

		whenever {
			user selects {
				thing17s {
					action1()
					action2()
					action3()
					thing17(atPosition = 4) {
						action4()
					}
					action5()
					thing17(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing17(atPosition = 7) {
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
				thing17s {
					text1 = "thing17 1"
					text2 = "thing17 2"
					text3 = "thing17 3"
					thing17(atPosition = 4) {
						text4 = "thing17 4"
					}
					text5 = "thing17 5"
					thing17(atPosition = 6) {
						text6 = "thing17 6"
						text6 = "thing17 6"
						text6 = "thing17 6"
					}
					thing17(atPosition = 7) {
						text7 = "thing17 7"
						text4 = "thing17 4"
						text7 = "thing17 7"
					}
					text8 = "thing17 8"
				}
			}
		}
	}

	@Test
	fun testThing17_5() = gwen {
		given {
			server stubs {
				get("/thing17") with json(testR.raw.repos)
			}
			user launches { thing17sScreen("thing17") }
		}

		whenever {
			user selects {
				thing17s {
					action1()
					action2()
					action3()
					thing17(atPosition = 4) {
						action4()
					}
					action5()
					thing17(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing17(atPosition = 7) {
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
				thing17s {
					text1 = "thing17 1"
					text2 = "thing17 2"
					text3 = "thing17 3"
					thing17(atPosition = 4) {
						text4 = "thing17 4"
					}
					text5 = "thing17 5"
					thing17(atPosition = 6) {
						text6 = "thing17 6"
						text6 = "thing17 6"
						text6 = "thing17 6"
					}
					thing17(atPosition = 7) {
						text7 = "thing17 7"
						text4 = "thing17 4"
						text7 = "thing17 7"
					}
					text8 = "thing17 8"
				}
			}
		}
	}
}
