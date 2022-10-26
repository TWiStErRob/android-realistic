package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing88.thing88s
import net.twisterrob.real.app.test.dsls.thing88.thing88sScreen
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
class Thing88Test : UiTest() {

	@Test
	fun testThing88_1() = gwen {
		given {
			server stubs {
				get("/thing88") with json(testR.raw.repos)
			}
			user launches { thing88sScreen("thing88") }
		}

		whenever {
			user selects {
				thing88s {
					action1()
					action2()
					action3()
					thing88(atPosition = 4) {
						action4()
					}
					action5()
					thing88(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing88(atPosition = 7) {
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
				thing88s {
					text1 = "thing88 1"
					text2 = "thing88 2"
					text3 = "thing88 3"
					thing88(atPosition = 4) {
						text4 = "thing88 4"
					}
					text5 = "thing88 5"
					thing88(atPosition = 6) {
						text6 = "thing88 6"
						text6 = "thing88 6"
						text6 = "thing88 6"
					}
					thing88(atPosition = 7) {
						text7 = "thing88 7"
						text4 = "thing88 4"
						text7 = "thing88 7"
					}
					text8 = "thing88 8"
				}
			}
		}
	}

	@Test
	fun testThing88_2() = gwen {
		given {
			server stubs {
				get("/thing88") with json(testR.raw.repos)
			}
			user launches { thing88sScreen("thing88") }
		}

		whenever {
			user selects {
				thing88s {
					action1()
					action2()
					action3()
					thing88(atPosition = 4) {
						action4()
					}
					action5()
					thing88(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing88(atPosition = 7) {
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
				thing88s {
					text1 = "thing88 1"
					text2 = "thing88 2"
					text3 = "thing88 3"
					thing88(atPosition = 4) {
						text4 = "thing88 4"
					}
					text5 = "thing88 5"
					thing88(atPosition = 6) {
						text6 = "thing88 6"
						text6 = "thing88 6"
						text6 = "thing88 6"
					}
					thing88(atPosition = 7) {
						text7 = "thing88 7"
						text4 = "thing88 4"
						text7 = "thing88 7"
					}
					text8 = "thing88 8"
				}
			}
		}
	}

	@Test
	fun testThing88_3() = gwen {
		given {
			server stubs {
				get("/thing88") with json(testR.raw.repos)
			}
			user launches { thing88sScreen("thing88") }
		}

		whenever {
			user selects {
				thing88s {
					action1()
					action2()
					action3()
					thing88(atPosition = 4) {
						action4()
					}
					action5()
					thing88(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing88(atPosition = 7) {
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
				thing88s {
					text1 = "thing88 1"
					text2 = "thing88 2"
					text3 = "thing88 3"
					thing88(atPosition = 4) {
						text4 = "thing88 4"
					}
					text5 = "thing88 5"
					thing88(atPosition = 6) {
						text6 = "thing88 6"
						text6 = "thing88 6"
						text6 = "thing88 6"
					}
					thing88(atPosition = 7) {
						text7 = "thing88 7"
						text4 = "thing88 4"
						text7 = "thing88 7"
					}
					text8 = "thing88 8"
				}
			}
		}
	}

	@Test
	fun testThing88_4() = gwen {
		given {
			server stubs {
				get("/thing88") with json(testR.raw.repos)
			}
			user launches { thing88sScreen("thing88") }
		}

		whenever {
			user selects {
				thing88s {
					action1()
					action2()
					action3()
					thing88(atPosition = 4) {
						action4()
					}
					action5()
					thing88(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing88(atPosition = 7) {
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
				thing88s {
					text1 = "thing88 1"
					text2 = "thing88 2"
					text3 = "thing88 3"
					thing88(atPosition = 4) {
						text4 = "thing88 4"
					}
					text5 = "thing88 5"
					thing88(atPosition = 6) {
						text6 = "thing88 6"
						text6 = "thing88 6"
						text6 = "thing88 6"
					}
					thing88(atPosition = 7) {
						text7 = "thing88 7"
						text4 = "thing88 4"
						text7 = "thing88 7"
					}
					text8 = "thing88 8"
				}
			}
		}
	}

	@Test
	fun testThing88_5() = gwen {
		given {
			server stubs {
				get("/thing88") with json(testR.raw.repos)
			}
			user launches { thing88sScreen("thing88") }
		}

		whenever {
			user selects {
				thing88s {
					action1()
					action2()
					action3()
					thing88(atPosition = 4) {
						action4()
					}
					action5()
					thing88(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing88(atPosition = 7) {
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
				thing88s {
					text1 = "thing88 1"
					text2 = "thing88 2"
					text3 = "thing88 3"
					thing88(atPosition = 4) {
						text4 = "thing88 4"
					}
					text5 = "thing88 5"
					thing88(atPosition = 6) {
						text6 = "thing88 6"
						text6 = "thing88 6"
						text6 = "thing88 6"
					}
					thing88(atPosition = 7) {
						text7 = "thing88 7"
						text4 = "thing88 4"
						text7 = "thing88 7"
					}
					text8 = "thing88 8"
				}
			}
		}
	}
}
