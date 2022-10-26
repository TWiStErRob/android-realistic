package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing69.thing69s
import net.twisterrob.real.app.test.dsls.thing69.thing69sScreen
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
class Thing69Test : UiTest() {

	@Test
	fun testThing69_1() = gwen {
		given {
			server stubs {
				get("/thing69") with json(testR.raw.repos)
			}
			user launches { thing69sScreen("thing69") }
		}

		whenever {
			user selects {
				thing69s {
					action1()
					action2()
					action3()
					thing69(atPosition = 4) {
						action4()
					}
					action5()
					thing69(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing69(atPosition = 7) {
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
				thing69s {
					text1 = "thing69 1"
					text2 = "thing69 2"
					text3 = "thing69 3"
					thing69(atPosition = 4) {
						text4 = "thing69 4"
					}
					text5 = "thing69 5"
					thing69(atPosition = 6) {
						text6 = "thing69 6"
						text6 = "thing69 6"
						text6 = "thing69 6"
					}
					thing69(atPosition = 7) {
						text7 = "thing69 7"
						text4 = "thing69 4"
						text7 = "thing69 7"
					}
					text8 = "thing69 8"
				}
			}
		}
	}

	@Test
	fun testThing69_2() = gwen {
		given {
			server stubs {
				get("/thing69") with json(testR.raw.repos)
			}
			user launches { thing69sScreen("thing69") }
		}

		whenever {
			user selects {
				thing69s {
					action1()
					action2()
					action3()
					thing69(atPosition = 4) {
						action4()
					}
					action5()
					thing69(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing69(atPosition = 7) {
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
				thing69s {
					text1 = "thing69 1"
					text2 = "thing69 2"
					text3 = "thing69 3"
					thing69(atPosition = 4) {
						text4 = "thing69 4"
					}
					text5 = "thing69 5"
					thing69(atPosition = 6) {
						text6 = "thing69 6"
						text6 = "thing69 6"
						text6 = "thing69 6"
					}
					thing69(atPosition = 7) {
						text7 = "thing69 7"
						text4 = "thing69 4"
						text7 = "thing69 7"
					}
					text8 = "thing69 8"
				}
			}
		}
	}

	@Test
	fun testThing69_3() = gwen {
		given {
			server stubs {
				get("/thing69") with json(testR.raw.repos)
			}
			user launches { thing69sScreen("thing69") }
		}

		whenever {
			user selects {
				thing69s {
					action1()
					action2()
					action3()
					thing69(atPosition = 4) {
						action4()
					}
					action5()
					thing69(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing69(atPosition = 7) {
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
				thing69s {
					text1 = "thing69 1"
					text2 = "thing69 2"
					text3 = "thing69 3"
					thing69(atPosition = 4) {
						text4 = "thing69 4"
					}
					text5 = "thing69 5"
					thing69(atPosition = 6) {
						text6 = "thing69 6"
						text6 = "thing69 6"
						text6 = "thing69 6"
					}
					thing69(atPosition = 7) {
						text7 = "thing69 7"
						text4 = "thing69 4"
						text7 = "thing69 7"
					}
					text8 = "thing69 8"
				}
			}
		}
	}

	@Test
	fun testThing69_4() = gwen {
		given {
			server stubs {
				get("/thing69") with json(testR.raw.repos)
			}
			user launches { thing69sScreen("thing69") }
		}

		whenever {
			user selects {
				thing69s {
					action1()
					action2()
					action3()
					thing69(atPosition = 4) {
						action4()
					}
					action5()
					thing69(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing69(atPosition = 7) {
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
				thing69s {
					text1 = "thing69 1"
					text2 = "thing69 2"
					text3 = "thing69 3"
					thing69(atPosition = 4) {
						text4 = "thing69 4"
					}
					text5 = "thing69 5"
					thing69(atPosition = 6) {
						text6 = "thing69 6"
						text6 = "thing69 6"
						text6 = "thing69 6"
					}
					thing69(atPosition = 7) {
						text7 = "thing69 7"
						text4 = "thing69 4"
						text7 = "thing69 7"
					}
					text8 = "thing69 8"
				}
			}
		}
	}

	@Test
	fun testThing69_5() = gwen {
		given {
			server stubs {
				get("/thing69") with json(testR.raw.repos)
			}
			user launches { thing69sScreen("thing69") }
		}

		whenever {
			user selects {
				thing69s {
					action1()
					action2()
					action3()
					thing69(atPosition = 4) {
						action4()
					}
					action5()
					thing69(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing69(atPosition = 7) {
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
				thing69s {
					text1 = "thing69 1"
					text2 = "thing69 2"
					text3 = "thing69 3"
					thing69(atPosition = 4) {
						text4 = "thing69 4"
					}
					text5 = "thing69 5"
					thing69(atPosition = 6) {
						text6 = "thing69 6"
						text6 = "thing69 6"
						text6 = "thing69 6"
					}
					thing69(atPosition = 7) {
						text7 = "thing69 7"
						text4 = "thing69 4"
						text7 = "thing69 7"
					}
					text8 = "thing69 8"
				}
			}
		}
	}
}
