package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing16.thing16s
import net.twisterrob.real.app.test.dsls.thing16.thing16sScreen
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
class Thing16Test : UiTest() {

	@Test
	fun testThing16_1() = gwen {
		given {
			server stubs {
				get("/thing16") with json(testR.raw.repos)
			}
			user launches { thing16sScreen("thing16") }
		}

		whenever {
			user selects {
				thing16s {
					action1()
					action2()
					action3()
					thing16(atPosition = 4) {
						action4()
					}
					action5()
					thing16(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing16(atPosition = 7) {
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
				thing16s {
					text1 = "thing16 1"
					text2 = "thing16 2"
					text3 = "thing16 3"
					thing16(atPosition = 4) {
						text4 = "thing16 4"
					}
					text5 = "thing16 5"
					thing16(atPosition = 6) {
						text6 = "thing16 6"
						text6 = "thing16 6"
						text6 = "thing16 6"
					}
					thing16(atPosition = 7) {
						text7 = "thing16 7"
						text4 = "thing16 4"
						text7 = "thing16 7"
					}
					text8 = "thing16 8"
				}
			}
		}
	}

	@Test
	fun testThing16_2() = gwen {
		given {
			server stubs {
				get("/thing16") with json(testR.raw.repos)
			}
			user launches { thing16sScreen("thing16") }
		}

		whenever {
			user selects {
				thing16s {
					action1()
					action2()
					action3()
					thing16(atPosition = 4) {
						action4()
					}
					action5()
					thing16(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing16(atPosition = 7) {
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
				thing16s {
					text1 = "thing16 1"
					text2 = "thing16 2"
					text3 = "thing16 3"
					thing16(atPosition = 4) {
						text4 = "thing16 4"
					}
					text5 = "thing16 5"
					thing16(atPosition = 6) {
						text6 = "thing16 6"
						text6 = "thing16 6"
						text6 = "thing16 6"
					}
					thing16(atPosition = 7) {
						text7 = "thing16 7"
						text4 = "thing16 4"
						text7 = "thing16 7"
					}
					text8 = "thing16 8"
				}
			}
		}
	}

	@Test
	fun testThing16_3() = gwen {
		given {
			server stubs {
				get("/thing16") with json(testR.raw.repos)
			}
			user launches { thing16sScreen("thing16") }
		}

		whenever {
			user selects {
				thing16s {
					action1()
					action2()
					action3()
					thing16(atPosition = 4) {
						action4()
					}
					action5()
					thing16(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing16(atPosition = 7) {
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
				thing16s {
					text1 = "thing16 1"
					text2 = "thing16 2"
					text3 = "thing16 3"
					thing16(atPosition = 4) {
						text4 = "thing16 4"
					}
					text5 = "thing16 5"
					thing16(atPosition = 6) {
						text6 = "thing16 6"
						text6 = "thing16 6"
						text6 = "thing16 6"
					}
					thing16(atPosition = 7) {
						text7 = "thing16 7"
						text4 = "thing16 4"
						text7 = "thing16 7"
					}
					text8 = "thing16 8"
				}
			}
		}
	}

	@Test
	fun testThing16_4() = gwen {
		given {
			server stubs {
				get("/thing16") with json(testR.raw.repos)
			}
			user launches { thing16sScreen("thing16") }
		}

		whenever {
			user selects {
				thing16s {
					action1()
					action2()
					action3()
					thing16(atPosition = 4) {
						action4()
					}
					action5()
					thing16(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing16(atPosition = 7) {
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
				thing16s {
					text1 = "thing16 1"
					text2 = "thing16 2"
					text3 = "thing16 3"
					thing16(atPosition = 4) {
						text4 = "thing16 4"
					}
					text5 = "thing16 5"
					thing16(atPosition = 6) {
						text6 = "thing16 6"
						text6 = "thing16 6"
						text6 = "thing16 6"
					}
					thing16(atPosition = 7) {
						text7 = "thing16 7"
						text4 = "thing16 4"
						text7 = "thing16 7"
					}
					text8 = "thing16 8"
				}
			}
		}
	}

	@Test
	fun testThing16_5() = gwen {
		given {
			server stubs {
				get("/thing16") with json(testR.raw.repos)
			}
			user launches { thing16sScreen("thing16") }
		}

		whenever {
			user selects {
				thing16s {
					action1()
					action2()
					action3()
					thing16(atPosition = 4) {
						action4()
					}
					action5()
					thing16(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing16(atPosition = 7) {
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
				thing16s {
					text1 = "thing16 1"
					text2 = "thing16 2"
					text3 = "thing16 3"
					thing16(atPosition = 4) {
						text4 = "thing16 4"
					}
					text5 = "thing16 5"
					thing16(atPosition = 6) {
						text6 = "thing16 6"
						text6 = "thing16 6"
						text6 = "thing16 6"
					}
					thing16(atPosition = 7) {
						text7 = "thing16 7"
						text4 = "thing16 4"
						text7 = "thing16 7"
					}
					text8 = "thing16 8"
				}
			}
		}
	}
}
