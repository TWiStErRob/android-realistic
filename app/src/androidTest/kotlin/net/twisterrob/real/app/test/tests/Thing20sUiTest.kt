package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing20.thing20s
import net.twisterrob.real.app.test.dsls.thing20.thing20sScreen
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
class Thing20Test : UiTest() {

	@Test
	fun testThing20_1() = gwen {
		given {
			server stubs {
				get("/thing20") with json(testR.raw.repos)
			}
			user launches { thing20sScreen("thing20") }
		}

		whenever {
			user selects {
				thing20s {
					action1()
					action2()
					action3()
					thing20(atPosition = 4) {
						action4()
					}
					action5()
					thing20(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing20(atPosition = 7) {
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
				thing20s {
					text1 = "thing20 1"
					text2 = "thing20 2"
					text3 = "thing20 3"
					thing20(atPosition = 4) {
						text4 = "thing20 4"
					}
					text5 = "thing20 5"
					thing20(atPosition = 6) {
						text6 = "thing20 6"
						text6 = "thing20 6"
						text6 = "thing20 6"
					}
					thing20(atPosition = 7) {
						text7 = "thing20 7"
						text4 = "thing20 4"
						text7 = "thing20 7"
					}
					text8 = "thing20 8"
				}
			}
		}
	}

	@Test
	fun testThing20_2() = gwen {
		given {
			server stubs {
				get("/thing20") with json(testR.raw.repos)
			}
			user launches { thing20sScreen("thing20") }
		}

		whenever {
			user selects {
				thing20s {
					action1()
					action2()
					action3()
					thing20(atPosition = 4) {
						action4()
					}
					action5()
					thing20(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing20(atPosition = 7) {
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
				thing20s {
					text1 = "thing20 1"
					text2 = "thing20 2"
					text3 = "thing20 3"
					thing20(atPosition = 4) {
						text4 = "thing20 4"
					}
					text5 = "thing20 5"
					thing20(atPosition = 6) {
						text6 = "thing20 6"
						text6 = "thing20 6"
						text6 = "thing20 6"
					}
					thing20(atPosition = 7) {
						text7 = "thing20 7"
						text4 = "thing20 4"
						text7 = "thing20 7"
					}
					text8 = "thing20 8"
				}
			}
		}
	}

	@Test
	fun testThing20_3() = gwen {
		given {
			server stubs {
				get("/thing20") with json(testR.raw.repos)
			}
			user launches { thing20sScreen("thing20") }
		}

		whenever {
			user selects {
				thing20s {
					action1()
					action2()
					action3()
					thing20(atPosition = 4) {
						action4()
					}
					action5()
					thing20(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing20(atPosition = 7) {
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
				thing20s {
					text1 = "thing20 1"
					text2 = "thing20 2"
					text3 = "thing20 3"
					thing20(atPosition = 4) {
						text4 = "thing20 4"
					}
					text5 = "thing20 5"
					thing20(atPosition = 6) {
						text6 = "thing20 6"
						text6 = "thing20 6"
						text6 = "thing20 6"
					}
					thing20(atPosition = 7) {
						text7 = "thing20 7"
						text4 = "thing20 4"
						text7 = "thing20 7"
					}
					text8 = "thing20 8"
				}
			}
		}
	}

	@Test
	fun testThing20_4() = gwen {
		given {
			server stubs {
				get("/thing20") with json(testR.raw.repos)
			}
			user launches { thing20sScreen("thing20") }
		}

		whenever {
			user selects {
				thing20s {
					action1()
					action2()
					action3()
					thing20(atPosition = 4) {
						action4()
					}
					action5()
					thing20(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing20(atPosition = 7) {
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
				thing20s {
					text1 = "thing20 1"
					text2 = "thing20 2"
					text3 = "thing20 3"
					thing20(atPosition = 4) {
						text4 = "thing20 4"
					}
					text5 = "thing20 5"
					thing20(atPosition = 6) {
						text6 = "thing20 6"
						text6 = "thing20 6"
						text6 = "thing20 6"
					}
					thing20(atPosition = 7) {
						text7 = "thing20 7"
						text4 = "thing20 4"
						text7 = "thing20 7"
					}
					text8 = "thing20 8"
				}
			}
		}
	}

	@Test
	fun testThing20_5() = gwen {
		given {
			server stubs {
				get("/thing20") with json(testR.raw.repos)
			}
			user launches { thing20sScreen("thing20") }
		}

		whenever {
			user selects {
				thing20s {
					action1()
					action2()
					action3()
					thing20(atPosition = 4) {
						action4()
					}
					action5()
					thing20(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing20(atPosition = 7) {
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
				thing20s {
					text1 = "thing20 1"
					text2 = "thing20 2"
					text3 = "thing20 3"
					thing20(atPosition = 4) {
						text4 = "thing20 4"
					}
					text5 = "thing20 5"
					thing20(atPosition = 6) {
						text6 = "thing20 6"
						text6 = "thing20 6"
						text6 = "thing20 6"
					}
					thing20(atPosition = 7) {
						text7 = "thing20 7"
						text4 = "thing20 4"
						text7 = "thing20 7"
					}
					text8 = "thing20 8"
				}
			}
		}
	}
}
