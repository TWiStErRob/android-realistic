package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing33.thing33s
import net.twisterrob.real.app.test.dsls.thing33.thing33sScreen
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
class Thing33Test : UiTest() {

	@Test
	fun testThing33_1() = gwen {
		given {
			server stubs {
				get("/thing33") with json(testR.raw.repos)
			}
			user launches { thing33sScreen("thing33") }
		}

		whenever {
			user selects {
				thing33s {
					action1()
					action2()
					action3()
					thing33(atPosition = 4) {
						action4()
					}
					action5()
					thing33(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing33(atPosition = 7) {
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
				thing33s {
					text1 = "thing33 1"
					text2 = "thing33 2"
					text3 = "thing33 3"
					thing33(atPosition = 4) {
						text4 = "thing33 4"
					}
					text5 = "thing33 5"
					thing33(atPosition = 6) {
						text6 = "thing33 6"
						text6 = "thing33 6"
						text6 = "thing33 6"
					}
					thing33(atPosition = 7) {
						text7 = "thing33 7"
						text4 = "thing33 4"
						text7 = "thing33 7"
					}
					text8 = "thing33 8"
				}
			}
		}
	}

	@Test
	fun testThing33_2() = gwen {
		given {
			server stubs {
				get("/thing33") with json(testR.raw.repos)
			}
			user launches { thing33sScreen("thing33") }
		}

		whenever {
			user selects {
				thing33s {
					action1()
					action2()
					action3()
					thing33(atPosition = 4) {
						action4()
					}
					action5()
					thing33(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing33(atPosition = 7) {
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
				thing33s {
					text1 = "thing33 1"
					text2 = "thing33 2"
					text3 = "thing33 3"
					thing33(atPosition = 4) {
						text4 = "thing33 4"
					}
					text5 = "thing33 5"
					thing33(atPosition = 6) {
						text6 = "thing33 6"
						text6 = "thing33 6"
						text6 = "thing33 6"
					}
					thing33(atPosition = 7) {
						text7 = "thing33 7"
						text4 = "thing33 4"
						text7 = "thing33 7"
					}
					text8 = "thing33 8"
				}
			}
		}
	}

	@Test
	fun testThing33_3() = gwen {
		given {
			server stubs {
				get("/thing33") with json(testR.raw.repos)
			}
			user launches { thing33sScreen("thing33") }
		}

		whenever {
			user selects {
				thing33s {
					action1()
					action2()
					action3()
					thing33(atPosition = 4) {
						action4()
					}
					action5()
					thing33(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing33(atPosition = 7) {
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
				thing33s {
					text1 = "thing33 1"
					text2 = "thing33 2"
					text3 = "thing33 3"
					thing33(atPosition = 4) {
						text4 = "thing33 4"
					}
					text5 = "thing33 5"
					thing33(atPosition = 6) {
						text6 = "thing33 6"
						text6 = "thing33 6"
						text6 = "thing33 6"
					}
					thing33(atPosition = 7) {
						text7 = "thing33 7"
						text4 = "thing33 4"
						text7 = "thing33 7"
					}
					text8 = "thing33 8"
				}
			}
		}
	}

	@Test
	fun testThing33_4() = gwen {
		given {
			server stubs {
				get("/thing33") with json(testR.raw.repos)
			}
			user launches { thing33sScreen("thing33") }
		}

		whenever {
			user selects {
				thing33s {
					action1()
					action2()
					action3()
					thing33(atPosition = 4) {
						action4()
					}
					action5()
					thing33(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing33(atPosition = 7) {
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
				thing33s {
					text1 = "thing33 1"
					text2 = "thing33 2"
					text3 = "thing33 3"
					thing33(atPosition = 4) {
						text4 = "thing33 4"
					}
					text5 = "thing33 5"
					thing33(atPosition = 6) {
						text6 = "thing33 6"
						text6 = "thing33 6"
						text6 = "thing33 6"
					}
					thing33(atPosition = 7) {
						text7 = "thing33 7"
						text4 = "thing33 4"
						text7 = "thing33 7"
					}
					text8 = "thing33 8"
				}
			}
		}
	}

	@Test
	fun testThing33_5() = gwen {
		given {
			server stubs {
				get("/thing33") with json(testR.raw.repos)
			}
			user launches { thing33sScreen("thing33") }
		}

		whenever {
			user selects {
				thing33s {
					action1()
					action2()
					action3()
					thing33(atPosition = 4) {
						action4()
					}
					action5()
					thing33(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing33(atPosition = 7) {
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
				thing33s {
					text1 = "thing33 1"
					text2 = "thing33 2"
					text3 = "thing33 3"
					thing33(atPosition = 4) {
						text4 = "thing33 4"
					}
					text5 = "thing33 5"
					thing33(atPosition = 6) {
						text6 = "thing33 6"
						text6 = "thing33 6"
						text6 = "thing33 6"
					}
					thing33(atPosition = 7) {
						text7 = "thing33 7"
						text4 = "thing33 4"
						text7 = "thing33 7"
					}
					text8 = "thing33 8"
				}
			}
		}
	}
}
