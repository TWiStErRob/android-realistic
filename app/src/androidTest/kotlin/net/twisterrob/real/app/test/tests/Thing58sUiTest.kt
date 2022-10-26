package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing58.thing58s
import net.twisterrob.real.app.test.dsls.thing58.thing58sScreen
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
class Thing58Test : UiTest() {

	@Test
	fun testThing58_1() = gwen {
		given {
			server stubs {
				get("/thing58") with json(testR.raw.repos)
			}
			user launches { thing58sScreen("thing58") }
		}

		whenever {
			user selects {
				thing58s {
					action1()
					action2()
					action3()
					thing58(atPosition = 4) {
						action4()
					}
					action5()
					thing58(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing58(atPosition = 7) {
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
				thing58s {
					text1 = "thing58 1"
					text2 = "thing58 2"
					text3 = "thing58 3"
					thing58(atPosition = 4) {
						text4 = "thing58 4"
					}
					text5 = "thing58 5"
					thing58(atPosition = 6) {
						text6 = "thing58 6"
						text6 = "thing58 6"
						text6 = "thing58 6"
					}
					thing58(atPosition = 7) {
						text7 = "thing58 7"
						text4 = "thing58 4"
						text7 = "thing58 7"
					}
					text8 = "thing58 8"
				}
			}
		}
	}

	@Test
	fun testThing58_2() = gwen {
		given {
			server stubs {
				get("/thing58") with json(testR.raw.repos)
			}
			user launches { thing58sScreen("thing58") }
		}

		whenever {
			user selects {
				thing58s {
					action1()
					action2()
					action3()
					thing58(atPosition = 4) {
						action4()
					}
					action5()
					thing58(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing58(atPosition = 7) {
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
				thing58s {
					text1 = "thing58 1"
					text2 = "thing58 2"
					text3 = "thing58 3"
					thing58(atPosition = 4) {
						text4 = "thing58 4"
					}
					text5 = "thing58 5"
					thing58(atPosition = 6) {
						text6 = "thing58 6"
						text6 = "thing58 6"
						text6 = "thing58 6"
					}
					thing58(atPosition = 7) {
						text7 = "thing58 7"
						text4 = "thing58 4"
						text7 = "thing58 7"
					}
					text8 = "thing58 8"
				}
			}
		}
	}

	@Test
	fun testThing58_3() = gwen {
		given {
			server stubs {
				get("/thing58") with json(testR.raw.repos)
			}
			user launches { thing58sScreen("thing58") }
		}

		whenever {
			user selects {
				thing58s {
					action1()
					action2()
					action3()
					thing58(atPosition = 4) {
						action4()
					}
					action5()
					thing58(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing58(atPosition = 7) {
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
				thing58s {
					text1 = "thing58 1"
					text2 = "thing58 2"
					text3 = "thing58 3"
					thing58(atPosition = 4) {
						text4 = "thing58 4"
					}
					text5 = "thing58 5"
					thing58(atPosition = 6) {
						text6 = "thing58 6"
						text6 = "thing58 6"
						text6 = "thing58 6"
					}
					thing58(atPosition = 7) {
						text7 = "thing58 7"
						text4 = "thing58 4"
						text7 = "thing58 7"
					}
					text8 = "thing58 8"
				}
			}
		}
	}

	@Test
	fun testThing58_4() = gwen {
		given {
			server stubs {
				get("/thing58") with json(testR.raw.repos)
			}
			user launches { thing58sScreen("thing58") }
		}

		whenever {
			user selects {
				thing58s {
					action1()
					action2()
					action3()
					thing58(atPosition = 4) {
						action4()
					}
					action5()
					thing58(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing58(atPosition = 7) {
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
				thing58s {
					text1 = "thing58 1"
					text2 = "thing58 2"
					text3 = "thing58 3"
					thing58(atPosition = 4) {
						text4 = "thing58 4"
					}
					text5 = "thing58 5"
					thing58(atPosition = 6) {
						text6 = "thing58 6"
						text6 = "thing58 6"
						text6 = "thing58 6"
					}
					thing58(atPosition = 7) {
						text7 = "thing58 7"
						text4 = "thing58 4"
						text7 = "thing58 7"
					}
					text8 = "thing58 8"
				}
			}
		}
	}

	@Test
	fun testThing58_5() = gwen {
		given {
			server stubs {
				get("/thing58") with json(testR.raw.repos)
			}
			user launches { thing58sScreen("thing58") }
		}

		whenever {
			user selects {
				thing58s {
					action1()
					action2()
					action3()
					thing58(atPosition = 4) {
						action4()
					}
					action5()
					thing58(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing58(atPosition = 7) {
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
				thing58s {
					text1 = "thing58 1"
					text2 = "thing58 2"
					text3 = "thing58 3"
					thing58(atPosition = 4) {
						text4 = "thing58 4"
					}
					text5 = "thing58 5"
					thing58(atPosition = 6) {
						text6 = "thing58 6"
						text6 = "thing58 6"
						text6 = "thing58 6"
					}
					thing58(atPosition = 7) {
						text7 = "thing58 7"
						text4 = "thing58 4"
						text7 = "thing58 7"
					}
					text8 = "thing58 8"
				}
			}
		}
	}
}
