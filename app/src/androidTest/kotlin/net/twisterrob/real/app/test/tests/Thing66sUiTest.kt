package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing66.thing66s
import net.twisterrob.real.app.test.dsls.thing66.thing66sScreen
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
class Thing66Test : UiTest() {

	@Test
	fun testThing66_1() = gwen {
		given {
			server stubs {
				get("/thing66") with json(testR.raw.repos)
			}
			user launches { thing66sScreen("thing66") }
		}

		whenever {
			user selects {
				thing66s {
					action1()
					action2()
					action3()
					thing66(atPosition = 4) {
						action4()
					}
					action5()
					thing66(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing66(atPosition = 7) {
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
				thing66s {
					text1 = "thing66 1"
					text2 = "thing66 2"
					text3 = "thing66 3"
					thing66(atPosition = 4) {
						text4 = "thing66 4"
					}
					text5 = "thing66 5"
					thing66(atPosition = 6) {
						text6 = "thing66 6"
						text6 = "thing66 6"
						text6 = "thing66 6"
					}
					thing66(atPosition = 7) {
						text7 = "thing66 7"
						text4 = "thing66 4"
						text7 = "thing66 7"
					}
					text8 = "thing66 8"
				}
			}
		}
	}

	@Test
	fun testThing66_2() = gwen {
		given {
			server stubs {
				get("/thing66") with json(testR.raw.repos)
			}
			user launches { thing66sScreen("thing66") }
		}

		whenever {
			user selects {
				thing66s {
					action1()
					action2()
					action3()
					thing66(atPosition = 4) {
						action4()
					}
					action5()
					thing66(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing66(atPosition = 7) {
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
				thing66s {
					text1 = "thing66 1"
					text2 = "thing66 2"
					text3 = "thing66 3"
					thing66(atPosition = 4) {
						text4 = "thing66 4"
					}
					text5 = "thing66 5"
					thing66(atPosition = 6) {
						text6 = "thing66 6"
						text6 = "thing66 6"
						text6 = "thing66 6"
					}
					thing66(atPosition = 7) {
						text7 = "thing66 7"
						text4 = "thing66 4"
						text7 = "thing66 7"
					}
					text8 = "thing66 8"
				}
			}
		}
	}

	@Test
	fun testThing66_3() = gwen {
		given {
			server stubs {
				get("/thing66") with json(testR.raw.repos)
			}
			user launches { thing66sScreen("thing66") }
		}

		whenever {
			user selects {
				thing66s {
					action1()
					action2()
					action3()
					thing66(atPosition = 4) {
						action4()
					}
					action5()
					thing66(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing66(atPosition = 7) {
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
				thing66s {
					text1 = "thing66 1"
					text2 = "thing66 2"
					text3 = "thing66 3"
					thing66(atPosition = 4) {
						text4 = "thing66 4"
					}
					text5 = "thing66 5"
					thing66(atPosition = 6) {
						text6 = "thing66 6"
						text6 = "thing66 6"
						text6 = "thing66 6"
					}
					thing66(atPosition = 7) {
						text7 = "thing66 7"
						text4 = "thing66 4"
						text7 = "thing66 7"
					}
					text8 = "thing66 8"
				}
			}
		}
	}

	@Test
	fun testThing66_4() = gwen {
		given {
			server stubs {
				get("/thing66") with json(testR.raw.repos)
			}
			user launches { thing66sScreen("thing66") }
		}

		whenever {
			user selects {
				thing66s {
					action1()
					action2()
					action3()
					thing66(atPosition = 4) {
						action4()
					}
					action5()
					thing66(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing66(atPosition = 7) {
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
				thing66s {
					text1 = "thing66 1"
					text2 = "thing66 2"
					text3 = "thing66 3"
					thing66(atPosition = 4) {
						text4 = "thing66 4"
					}
					text5 = "thing66 5"
					thing66(atPosition = 6) {
						text6 = "thing66 6"
						text6 = "thing66 6"
						text6 = "thing66 6"
					}
					thing66(atPosition = 7) {
						text7 = "thing66 7"
						text4 = "thing66 4"
						text7 = "thing66 7"
					}
					text8 = "thing66 8"
				}
			}
		}
	}

	@Test
	fun testThing66_5() = gwen {
		given {
			server stubs {
				get("/thing66") with json(testR.raw.repos)
			}
			user launches { thing66sScreen("thing66") }
		}

		whenever {
			user selects {
				thing66s {
					action1()
					action2()
					action3()
					thing66(atPosition = 4) {
						action4()
					}
					action5()
					thing66(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing66(atPosition = 7) {
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
				thing66s {
					text1 = "thing66 1"
					text2 = "thing66 2"
					text3 = "thing66 3"
					thing66(atPosition = 4) {
						text4 = "thing66 4"
					}
					text5 = "thing66 5"
					thing66(atPosition = 6) {
						text6 = "thing66 6"
						text6 = "thing66 6"
						text6 = "thing66 6"
					}
					thing66(atPosition = 7) {
						text7 = "thing66 7"
						text4 = "thing66 4"
						text7 = "thing66 7"
					}
					text8 = "thing66 8"
				}
			}
		}
	}
}
