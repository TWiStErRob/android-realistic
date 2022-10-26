package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing91.thing91s
import net.twisterrob.real.app.test.dsls.thing91.thing91sScreen
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
class Thing91Test : UiTest() {

	@Test
	fun testThing91_1() = gwen {
		given {
			server stubs {
				get("/thing91") with json(testR.raw.repos)
			}
			user launches { thing91sScreen("thing91") }
		}

		whenever {
			user selects {
				thing91s {
					action1()
					action2()
					action3()
					thing91(atPosition = 4) {
						action4()
					}
					action5()
					thing91(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing91(atPosition = 7) {
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
				thing91s {
					text1 = "thing91 1"
					text2 = "thing91 2"
					text3 = "thing91 3"
					thing91(atPosition = 4) {
						text4 = "thing91 4"
					}
					text5 = "thing91 5"
					thing91(atPosition = 6) {
						text6 = "thing91 6"
						text6 = "thing91 6"
						text6 = "thing91 6"
					}
					thing91(atPosition = 7) {
						text7 = "thing91 7"
						text4 = "thing91 4"
						text7 = "thing91 7"
					}
					text8 = "thing91 8"
				}
			}
		}
	}

	@Test
	fun testThing91_2() = gwen {
		given {
			server stubs {
				get("/thing91") with json(testR.raw.repos)
			}
			user launches { thing91sScreen("thing91") }
		}

		whenever {
			user selects {
				thing91s {
					action1()
					action2()
					action3()
					thing91(atPosition = 4) {
						action4()
					}
					action5()
					thing91(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing91(atPosition = 7) {
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
				thing91s {
					text1 = "thing91 1"
					text2 = "thing91 2"
					text3 = "thing91 3"
					thing91(atPosition = 4) {
						text4 = "thing91 4"
					}
					text5 = "thing91 5"
					thing91(atPosition = 6) {
						text6 = "thing91 6"
						text6 = "thing91 6"
						text6 = "thing91 6"
					}
					thing91(atPosition = 7) {
						text7 = "thing91 7"
						text4 = "thing91 4"
						text7 = "thing91 7"
					}
					text8 = "thing91 8"
				}
			}
		}
	}

	@Test
	fun testThing91_3() = gwen {
		given {
			server stubs {
				get("/thing91") with json(testR.raw.repos)
			}
			user launches { thing91sScreen("thing91") }
		}

		whenever {
			user selects {
				thing91s {
					action1()
					action2()
					action3()
					thing91(atPosition = 4) {
						action4()
					}
					action5()
					thing91(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing91(atPosition = 7) {
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
				thing91s {
					text1 = "thing91 1"
					text2 = "thing91 2"
					text3 = "thing91 3"
					thing91(atPosition = 4) {
						text4 = "thing91 4"
					}
					text5 = "thing91 5"
					thing91(atPosition = 6) {
						text6 = "thing91 6"
						text6 = "thing91 6"
						text6 = "thing91 6"
					}
					thing91(atPosition = 7) {
						text7 = "thing91 7"
						text4 = "thing91 4"
						text7 = "thing91 7"
					}
					text8 = "thing91 8"
				}
			}
		}
	}

	@Test
	fun testThing91_4() = gwen {
		given {
			server stubs {
				get("/thing91") with json(testR.raw.repos)
			}
			user launches { thing91sScreen("thing91") }
		}

		whenever {
			user selects {
				thing91s {
					action1()
					action2()
					action3()
					thing91(atPosition = 4) {
						action4()
					}
					action5()
					thing91(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing91(atPosition = 7) {
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
				thing91s {
					text1 = "thing91 1"
					text2 = "thing91 2"
					text3 = "thing91 3"
					thing91(atPosition = 4) {
						text4 = "thing91 4"
					}
					text5 = "thing91 5"
					thing91(atPosition = 6) {
						text6 = "thing91 6"
						text6 = "thing91 6"
						text6 = "thing91 6"
					}
					thing91(atPosition = 7) {
						text7 = "thing91 7"
						text4 = "thing91 4"
						text7 = "thing91 7"
					}
					text8 = "thing91 8"
				}
			}
		}
	}

	@Test
	fun testThing91_5() = gwen {
		given {
			server stubs {
				get("/thing91") with json(testR.raw.repos)
			}
			user launches { thing91sScreen("thing91") }
		}

		whenever {
			user selects {
				thing91s {
					action1()
					action2()
					action3()
					thing91(atPosition = 4) {
						action4()
					}
					action5()
					thing91(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing91(atPosition = 7) {
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
				thing91s {
					text1 = "thing91 1"
					text2 = "thing91 2"
					text3 = "thing91 3"
					thing91(atPosition = 4) {
						text4 = "thing91 4"
					}
					text5 = "thing91 5"
					thing91(atPosition = 6) {
						text6 = "thing91 6"
						text6 = "thing91 6"
						text6 = "thing91 6"
					}
					thing91(atPosition = 7) {
						text7 = "thing91 7"
						text4 = "thing91 4"
						text7 = "thing91 7"
					}
					text8 = "thing91 8"
				}
			}
		}
	}
}
