package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing7.thing7s
import net.twisterrob.real.app.test.dsls.thing7.thing7sScreen
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
class Thing7Test : UiTest() {

	@Test
	fun testThing7_1() = gwen {
		given {
			server stubs {
				get("/thing7") with json(testR.raw.repos)
			}
			user launches { thing7sScreen("thing7") }
		}

		whenever {
			user selects {
				thing7s {
					action1()
					action2()
					action3()
					thing7(atPosition = 4) {
						action4()
					}
					action5()
					thing7(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing7(atPosition = 7) {
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
				thing7s {
					text1 = "thing7 1"
					text2 = "thing7 2"
					text3 = "thing7 3"
					thing7(atPosition = 4) {
						text4 = "thing7 4"
					}
					text5 = "thing7 5"
					thing7(atPosition = 6) {
						text6 = "thing7 6"
						text6 = "thing7 6"
						text6 = "thing7 6"
					}
					thing7(atPosition = 7) {
						text7 = "thing7 7"
						text4 = "thing7 4"
						text7 = "thing7 7"
					}
					text8 = "thing7 8"
				}
			}
		}
	}

	@Test
	fun testThing7_2() = gwen {
		given {
			server stubs {
				get("/thing7") with json(testR.raw.repos)
			}
			user launches { thing7sScreen("thing7") }
		}

		whenever {
			user selects {
				thing7s {
					action1()
					action2()
					action3()
					thing7(atPosition = 4) {
						action4()
					}
					action5()
					thing7(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing7(atPosition = 7) {
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
				thing7s {
					text1 = "thing7 1"
					text2 = "thing7 2"
					text3 = "thing7 3"
					thing7(atPosition = 4) {
						text4 = "thing7 4"
					}
					text5 = "thing7 5"
					thing7(atPosition = 6) {
						text6 = "thing7 6"
						text6 = "thing7 6"
						text6 = "thing7 6"
					}
					thing7(atPosition = 7) {
						text7 = "thing7 7"
						text4 = "thing7 4"
						text7 = "thing7 7"
					}
					text8 = "thing7 8"
				}
			}
		}
	}

	@Test
	fun testThing7_3() = gwen {
		given {
			server stubs {
				get("/thing7") with json(testR.raw.repos)
			}
			user launches { thing7sScreen("thing7") }
		}

		whenever {
			user selects {
				thing7s {
					action1()
					action2()
					action3()
					thing7(atPosition = 4) {
						action4()
					}
					action5()
					thing7(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing7(atPosition = 7) {
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
				thing7s {
					text1 = "thing7 1"
					text2 = "thing7 2"
					text3 = "thing7 3"
					thing7(atPosition = 4) {
						text4 = "thing7 4"
					}
					text5 = "thing7 5"
					thing7(atPosition = 6) {
						text6 = "thing7 6"
						text6 = "thing7 6"
						text6 = "thing7 6"
					}
					thing7(atPosition = 7) {
						text7 = "thing7 7"
						text4 = "thing7 4"
						text7 = "thing7 7"
					}
					text8 = "thing7 8"
				}
			}
		}
	}

	@Test
	fun testThing7_4() = gwen {
		given {
			server stubs {
				get("/thing7") with json(testR.raw.repos)
			}
			user launches { thing7sScreen("thing7") }
		}

		whenever {
			user selects {
				thing7s {
					action1()
					action2()
					action3()
					thing7(atPosition = 4) {
						action4()
					}
					action5()
					thing7(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing7(atPosition = 7) {
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
				thing7s {
					text1 = "thing7 1"
					text2 = "thing7 2"
					text3 = "thing7 3"
					thing7(atPosition = 4) {
						text4 = "thing7 4"
					}
					text5 = "thing7 5"
					thing7(atPosition = 6) {
						text6 = "thing7 6"
						text6 = "thing7 6"
						text6 = "thing7 6"
					}
					thing7(atPosition = 7) {
						text7 = "thing7 7"
						text4 = "thing7 4"
						text7 = "thing7 7"
					}
					text8 = "thing7 8"
				}
			}
		}
	}

	@Test
	fun testThing7_5() = gwen {
		given {
			server stubs {
				get("/thing7") with json(testR.raw.repos)
			}
			user launches { thing7sScreen("thing7") }
		}

		whenever {
			user selects {
				thing7s {
					action1()
					action2()
					action3()
					thing7(atPosition = 4) {
						action4()
					}
					action5()
					thing7(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing7(atPosition = 7) {
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
				thing7s {
					text1 = "thing7 1"
					text2 = "thing7 2"
					text3 = "thing7 3"
					thing7(atPosition = 4) {
						text4 = "thing7 4"
					}
					text5 = "thing7 5"
					thing7(atPosition = 6) {
						text6 = "thing7 6"
						text6 = "thing7 6"
						text6 = "thing7 6"
					}
					thing7(atPosition = 7) {
						text7 = "thing7 7"
						text4 = "thing7 4"
						text7 = "thing7 7"
					}
					text8 = "thing7 8"
				}
			}
		}
	}
}
