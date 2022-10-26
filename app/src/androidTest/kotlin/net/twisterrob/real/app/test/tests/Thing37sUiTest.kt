package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing37.thing37s
import net.twisterrob.real.app.test.dsls.thing37.thing37sScreen
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
class Thing37Test : UiTest() {

	@Test
	fun testThing37_1() = gwen {
		given {
			server stubs {
				get("/thing37") with json(testR.raw.repos)
			}
			user launches { thing37sScreen("thing37") }
		}

		whenever {
			user selects {
				thing37s {
					action1()
					action2()
					action3()
					thing37(atPosition = 4) {
						action4()
					}
					action5()
					thing37(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing37(atPosition = 7) {
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
				thing37s {
					text1 = "thing37 1"
					text2 = "thing37 2"
					text3 = "thing37 3"
					thing37(atPosition = 4) {
						text4 = "thing37 4"
					}
					text5 = "thing37 5"
					thing37(atPosition = 6) {
						text6 = "thing37 6"
						text6 = "thing37 6"
						text6 = "thing37 6"
					}
					thing37(atPosition = 7) {
						text7 = "thing37 7"
						text4 = "thing37 4"
						text7 = "thing37 7"
					}
					text8 = "thing37 8"
				}
			}
		}
	}

	@Test
	fun testThing37_2() = gwen {
		given {
			server stubs {
				get("/thing37") with json(testR.raw.repos)
			}
			user launches { thing37sScreen("thing37") }
		}

		whenever {
			user selects {
				thing37s {
					action1()
					action2()
					action3()
					thing37(atPosition = 4) {
						action4()
					}
					action5()
					thing37(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing37(atPosition = 7) {
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
				thing37s {
					text1 = "thing37 1"
					text2 = "thing37 2"
					text3 = "thing37 3"
					thing37(atPosition = 4) {
						text4 = "thing37 4"
					}
					text5 = "thing37 5"
					thing37(atPosition = 6) {
						text6 = "thing37 6"
						text6 = "thing37 6"
						text6 = "thing37 6"
					}
					thing37(atPosition = 7) {
						text7 = "thing37 7"
						text4 = "thing37 4"
						text7 = "thing37 7"
					}
					text8 = "thing37 8"
				}
			}
		}
	}

	@Test
	fun testThing37_3() = gwen {
		given {
			server stubs {
				get("/thing37") with json(testR.raw.repos)
			}
			user launches { thing37sScreen("thing37") }
		}

		whenever {
			user selects {
				thing37s {
					action1()
					action2()
					action3()
					thing37(atPosition = 4) {
						action4()
					}
					action5()
					thing37(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing37(atPosition = 7) {
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
				thing37s {
					text1 = "thing37 1"
					text2 = "thing37 2"
					text3 = "thing37 3"
					thing37(atPosition = 4) {
						text4 = "thing37 4"
					}
					text5 = "thing37 5"
					thing37(atPosition = 6) {
						text6 = "thing37 6"
						text6 = "thing37 6"
						text6 = "thing37 6"
					}
					thing37(atPosition = 7) {
						text7 = "thing37 7"
						text4 = "thing37 4"
						text7 = "thing37 7"
					}
					text8 = "thing37 8"
				}
			}
		}
	}

	@Test
	fun testThing37_4() = gwen {
		given {
			server stubs {
				get("/thing37") with json(testR.raw.repos)
			}
			user launches { thing37sScreen("thing37") }
		}

		whenever {
			user selects {
				thing37s {
					action1()
					action2()
					action3()
					thing37(atPosition = 4) {
						action4()
					}
					action5()
					thing37(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing37(atPosition = 7) {
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
				thing37s {
					text1 = "thing37 1"
					text2 = "thing37 2"
					text3 = "thing37 3"
					thing37(atPosition = 4) {
						text4 = "thing37 4"
					}
					text5 = "thing37 5"
					thing37(atPosition = 6) {
						text6 = "thing37 6"
						text6 = "thing37 6"
						text6 = "thing37 6"
					}
					thing37(atPosition = 7) {
						text7 = "thing37 7"
						text4 = "thing37 4"
						text7 = "thing37 7"
					}
					text8 = "thing37 8"
				}
			}
		}
	}

	@Test
	fun testThing37_5() = gwen {
		given {
			server stubs {
				get("/thing37") with json(testR.raw.repos)
			}
			user launches { thing37sScreen("thing37") }
		}

		whenever {
			user selects {
				thing37s {
					action1()
					action2()
					action3()
					thing37(atPosition = 4) {
						action4()
					}
					action5()
					thing37(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing37(atPosition = 7) {
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
				thing37s {
					text1 = "thing37 1"
					text2 = "thing37 2"
					text3 = "thing37 3"
					thing37(atPosition = 4) {
						text4 = "thing37 4"
					}
					text5 = "thing37 5"
					thing37(atPosition = 6) {
						text6 = "thing37 6"
						text6 = "thing37 6"
						text6 = "thing37 6"
					}
					thing37(atPosition = 7) {
						text7 = "thing37 7"
						text4 = "thing37 4"
						text7 = "thing37 7"
					}
					text8 = "thing37 8"
				}
			}
		}
	}
}
