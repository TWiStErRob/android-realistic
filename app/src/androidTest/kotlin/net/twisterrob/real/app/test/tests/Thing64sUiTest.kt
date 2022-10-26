package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing64.thing64s
import net.twisterrob.real.app.test.dsls.thing64.thing64sScreen
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
class Thing64Test : UiTest() {

	@Test
	fun testThing64_1() = gwen {
		given {
			server stubs {
				get("/thing64") with json(testR.raw.repos)
			}
			user launches { thing64sScreen("thing64") }
		}

		whenever {
			user selects {
				thing64s {
					action1()
					action2()
					action3()
					thing64(atPosition = 4) {
						action4()
					}
					action5()
					thing64(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing64(atPosition = 7) {
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
				thing64s {
					text1 = "thing64 1"
					text2 = "thing64 2"
					text3 = "thing64 3"
					thing64(atPosition = 4) {
						text4 = "thing64 4"
					}
					text5 = "thing64 5"
					thing64(atPosition = 6) {
						text6 = "thing64 6"
						text6 = "thing64 6"
						text6 = "thing64 6"
					}
					thing64(atPosition = 7) {
						text7 = "thing64 7"
						text4 = "thing64 4"
						text7 = "thing64 7"
					}
					text8 = "thing64 8"
				}
			}
		}
	}

	@Test
	fun testThing64_2() = gwen {
		given {
			server stubs {
				get("/thing64") with json(testR.raw.repos)
			}
			user launches { thing64sScreen("thing64") }
		}

		whenever {
			user selects {
				thing64s {
					action1()
					action2()
					action3()
					thing64(atPosition = 4) {
						action4()
					}
					action5()
					thing64(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing64(atPosition = 7) {
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
				thing64s {
					text1 = "thing64 1"
					text2 = "thing64 2"
					text3 = "thing64 3"
					thing64(atPosition = 4) {
						text4 = "thing64 4"
					}
					text5 = "thing64 5"
					thing64(atPosition = 6) {
						text6 = "thing64 6"
						text6 = "thing64 6"
						text6 = "thing64 6"
					}
					thing64(atPosition = 7) {
						text7 = "thing64 7"
						text4 = "thing64 4"
						text7 = "thing64 7"
					}
					text8 = "thing64 8"
				}
			}
		}
	}

	@Test
	fun testThing64_3() = gwen {
		given {
			server stubs {
				get("/thing64") with json(testR.raw.repos)
			}
			user launches { thing64sScreen("thing64") }
		}

		whenever {
			user selects {
				thing64s {
					action1()
					action2()
					action3()
					thing64(atPosition = 4) {
						action4()
					}
					action5()
					thing64(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing64(atPosition = 7) {
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
				thing64s {
					text1 = "thing64 1"
					text2 = "thing64 2"
					text3 = "thing64 3"
					thing64(atPosition = 4) {
						text4 = "thing64 4"
					}
					text5 = "thing64 5"
					thing64(atPosition = 6) {
						text6 = "thing64 6"
						text6 = "thing64 6"
						text6 = "thing64 6"
					}
					thing64(atPosition = 7) {
						text7 = "thing64 7"
						text4 = "thing64 4"
						text7 = "thing64 7"
					}
					text8 = "thing64 8"
				}
			}
		}
	}

	@Test
	fun testThing64_4() = gwen {
		given {
			server stubs {
				get("/thing64") with json(testR.raw.repos)
			}
			user launches { thing64sScreen("thing64") }
		}

		whenever {
			user selects {
				thing64s {
					action1()
					action2()
					action3()
					thing64(atPosition = 4) {
						action4()
					}
					action5()
					thing64(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing64(atPosition = 7) {
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
				thing64s {
					text1 = "thing64 1"
					text2 = "thing64 2"
					text3 = "thing64 3"
					thing64(atPosition = 4) {
						text4 = "thing64 4"
					}
					text5 = "thing64 5"
					thing64(atPosition = 6) {
						text6 = "thing64 6"
						text6 = "thing64 6"
						text6 = "thing64 6"
					}
					thing64(atPosition = 7) {
						text7 = "thing64 7"
						text4 = "thing64 4"
						text7 = "thing64 7"
					}
					text8 = "thing64 8"
				}
			}
		}
	}

	@Test
	fun testThing64_5() = gwen {
		given {
			server stubs {
				get("/thing64") with json(testR.raw.repos)
			}
			user launches { thing64sScreen("thing64") }
		}

		whenever {
			user selects {
				thing64s {
					action1()
					action2()
					action3()
					thing64(atPosition = 4) {
						action4()
					}
					action5()
					thing64(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing64(atPosition = 7) {
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
				thing64s {
					text1 = "thing64 1"
					text2 = "thing64 2"
					text3 = "thing64 3"
					thing64(atPosition = 4) {
						text4 = "thing64 4"
					}
					text5 = "thing64 5"
					thing64(atPosition = 6) {
						text6 = "thing64 6"
						text6 = "thing64 6"
						text6 = "thing64 6"
					}
					thing64(atPosition = 7) {
						text7 = "thing64 7"
						text4 = "thing64 4"
						text7 = "thing64 7"
					}
					text8 = "thing64 8"
				}
			}
		}
	}
}
