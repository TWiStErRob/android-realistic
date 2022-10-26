package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing97.thing97s
import net.twisterrob.real.app.test.dsls.thing97.thing97sScreen
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
class Thing97Test : UiTest() {

	@Test
	fun testThing97_1() = gwen {
		given {
			server stubs {
				get("/thing97") with json(testR.raw.repos)
			}
			user launches { thing97sScreen("thing97") }
		}

		whenever {
			user selects {
				thing97s {
					action1()
					action2()
					action3()
					thing97(atPosition = 4) {
						action4()
					}
					action5()
					thing97(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing97(atPosition = 7) {
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
				thing97s {
					text1 = "thing97 1"
					text2 = "thing97 2"
					text3 = "thing97 3"
					thing97(atPosition = 4) {
						text4 = "thing97 4"
					}
					text5 = "thing97 5"
					thing97(atPosition = 6) {
						text6 = "thing97 6"
						text6 = "thing97 6"
						text6 = "thing97 6"
					}
					thing97(atPosition = 7) {
						text7 = "thing97 7"
						text4 = "thing97 4"
						text7 = "thing97 7"
					}
					text8 = "thing97 8"
				}
			}
		}
	}

	@Test
	fun testThing97_2() = gwen {
		given {
			server stubs {
				get("/thing97") with json(testR.raw.repos)
			}
			user launches { thing97sScreen("thing97") }
		}

		whenever {
			user selects {
				thing97s {
					action1()
					action2()
					action3()
					thing97(atPosition = 4) {
						action4()
					}
					action5()
					thing97(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing97(atPosition = 7) {
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
				thing97s {
					text1 = "thing97 1"
					text2 = "thing97 2"
					text3 = "thing97 3"
					thing97(atPosition = 4) {
						text4 = "thing97 4"
					}
					text5 = "thing97 5"
					thing97(atPosition = 6) {
						text6 = "thing97 6"
						text6 = "thing97 6"
						text6 = "thing97 6"
					}
					thing97(atPosition = 7) {
						text7 = "thing97 7"
						text4 = "thing97 4"
						text7 = "thing97 7"
					}
					text8 = "thing97 8"
				}
			}
		}
	}

	@Test
	fun testThing97_3() = gwen {
		given {
			server stubs {
				get("/thing97") with json(testR.raw.repos)
			}
			user launches { thing97sScreen("thing97") }
		}

		whenever {
			user selects {
				thing97s {
					action1()
					action2()
					action3()
					thing97(atPosition = 4) {
						action4()
					}
					action5()
					thing97(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing97(atPosition = 7) {
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
				thing97s {
					text1 = "thing97 1"
					text2 = "thing97 2"
					text3 = "thing97 3"
					thing97(atPosition = 4) {
						text4 = "thing97 4"
					}
					text5 = "thing97 5"
					thing97(atPosition = 6) {
						text6 = "thing97 6"
						text6 = "thing97 6"
						text6 = "thing97 6"
					}
					thing97(atPosition = 7) {
						text7 = "thing97 7"
						text4 = "thing97 4"
						text7 = "thing97 7"
					}
					text8 = "thing97 8"
				}
			}
		}
	}

	@Test
	fun testThing97_4() = gwen {
		given {
			server stubs {
				get("/thing97") with json(testR.raw.repos)
			}
			user launches { thing97sScreen("thing97") }
		}

		whenever {
			user selects {
				thing97s {
					action1()
					action2()
					action3()
					thing97(atPosition = 4) {
						action4()
					}
					action5()
					thing97(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing97(atPosition = 7) {
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
				thing97s {
					text1 = "thing97 1"
					text2 = "thing97 2"
					text3 = "thing97 3"
					thing97(atPosition = 4) {
						text4 = "thing97 4"
					}
					text5 = "thing97 5"
					thing97(atPosition = 6) {
						text6 = "thing97 6"
						text6 = "thing97 6"
						text6 = "thing97 6"
					}
					thing97(atPosition = 7) {
						text7 = "thing97 7"
						text4 = "thing97 4"
						text7 = "thing97 7"
					}
					text8 = "thing97 8"
				}
			}
		}
	}

	@Test
	fun testThing97_5() = gwen {
		given {
			server stubs {
				get("/thing97") with json(testR.raw.repos)
			}
			user launches { thing97sScreen("thing97") }
		}

		whenever {
			user selects {
				thing97s {
					action1()
					action2()
					action3()
					thing97(atPosition = 4) {
						action4()
					}
					action5()
					thing97(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing97(atPosition = 7) {
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
				thing97s {
					text1 = "thing97 1"
					text2 = "thing97 2"
					text3 = "thing97 3"
					thing97(atPosition = 4) {
						text4 = "thing97 4"
					}
					text5 = "thing97 5"
					thing97(atPosition = 6) {
						text6 = "thing97 6"
						text6 = "thing97 6"
						text6 = "thing97 6"
					}
					thing97(atPosition = 7) {
						text7 = "thing97 7"
						text4 = "thing97 4"
						text7 = "thing97 7"
					}
					text8 = "thing97 8"
				}
			}
		}
	}
}
