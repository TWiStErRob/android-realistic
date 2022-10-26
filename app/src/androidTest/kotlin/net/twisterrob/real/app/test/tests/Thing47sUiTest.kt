package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing47.thing47s
import net.twisterrob.real.app.test.dsls.thing47.thing47sScreen
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
class Thing47Test : UiTest() {

	@Test
	fun testThing47_1() = gwen {
		given {
			server stubs {
				get("/thing47") with json(testR.raw.repos)
			}
			user launches { thing47sScreen("thing47") }
		}

		whenever {
			user selects {
				thing47s {
					action1()
					action2()
					action3()
					thing47(atPosition = 4) {
						action4()
					}
					action5()
					thing47(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing47(atPosition = 7) {
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
				thing47s {
					text1 = "thing47 1"
					text2 = "thing47 2"
					text3 = "thing47 3"
					thing47(atPosition = 4) {
						text4 = "thing47 4"
					}
					text5 = "thing47 5"
					thing47(atPosition = 6) {
						text6 = "thing47 6"
						text6 = "thing47 6"
						text6 = "thing47 6"
					}
					thing47(atPosition = 7) {
						text7 = "thing47 7"
						text4 = "thing47 4"
						text7 = "thing47 7"
					}
					text8 = "thing47 8"
				}
			}
		}
	}

	@Test
	fun testThing47_2() = gwen {
		given {
			server stubs {
				get("/thing47") with json(testR.raw.repos)
			}
			user launches { thing47sScreen("thing47") }
		}

		whenever {
			user selects {
				thing47s {
					action1()
					action2()
					action3()
					thing47(atPosition = 4) {
						action4()
					}
					action5()
					thing47(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing47(atPosition = 7) {
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
				thing47s {
					text1 = "thing47 1"
					text2 = "thing47 2"
					text3 = "thing47 3"
					thing47(atPosition = 4) {
						text4 = "thing47 4"
					}
					text5 = "thing47 5"
					thing47(atPosition = 6) {
						text6 = "thing47 6"
						text6 = "thing47 6"
						text6 = "thing47 6"
					}
					thing47(atPosition = 7) {
						text7 = "thing47 7"
						text4 = "thing47 4"
						text7 = "thing47 7"
					}
					text8 = "thing47 8"
				}
			}
		}
	}

	@Test
	fun testThing47_3() = gwen {
		given {
			server stubs {
				get("/thing47") with json(testR.raw.repos)
			}
			user launches { thing47sScreen("thing47") }
		}

		whenever {
			user selects {
				thing47s {
					action1()
					action2()
					action3()
					thing47(atPosition = 4) {
						action4()
					}
					action5()
					thing47(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing47(atPosition = 7) {
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
				thing47s {
					text1 = "thing47 1"
					text2 = "thing47 2"
					text3 = "thing47 3"
					thing47(atPosition = 4) {
						text4 = "thing47 4"
					}
					text5 = "thing47 5"
					thing47(atPosition = 6) {
						text6 = "thing47 6"
						text6 = "thing47 6"
						text6 = "thing47 6"
					}
					thing47(atPosition = 7) {
						text7 = "thing47 7"
						text4 = "thing47 4"
						text7 = "thing47 7"
					}
					text8 = "thing47 8"
				}
			}
		}
	}

	@Test
	fun testThing47_4() = gwen {
		given {
			server stubs {
				get("/thing47") with json(testR.raw.repos)
			}
			user launches { thing47sScreen("thing47") }
		}

		whenever {
			user selects {
				thing47s {
					action1()
					action2()
					action3()
					thing47(atPosition = 4) {
						action4()
					}
					action5()
					thing47(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing47(atPosition = 7) {
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
				thing47s {
					text1 = "thing47 1"
					text2 = "thing47 2"
					text3 = "thing47 3"
					thing47(atPosition = 4) {
						text4 = "thing47 4"
					}
					text5 = "thing47 5"
					thing47(atPosition = 6) {
						text6 = "thing47 6"
						text6 = "thing47 6"
						text6 = "thing47 6"
					}
					thing47(atPosition = 7) {
						text7 = "thing47 7"
						text4 = "thing47 4"
						text7 = "thing47 7"
					}
					text8 = "thing47 8"
				}
			}
		}
	}

	@Test
	fun testThing47_5() = gwen {
		given {
			server stubs {
				get("/thing47") with json(testR.raw.repos)
			}
			user launches { thing47sScreen("thing47") }
		}

		whenever {
			user selects {
				thing47s {
					action1()
					action2()
					action3()
					thing47(atPosition = 4) {
						action4()
					}
					action5()
					thing47(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing47(atPosition = 7) {
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
				thing47s {
					text1 = "thing47 1"
					text2 = "thing47 2"
					text3 = "thing47 3"
					thing47(atPosition = 4) {
						text4 = "thing47 4"
					}
					text5 = "thing47 5"
					thing47(atPosition = 6) {
						text6 = "thing47 6"
						text6 = "thing47 6"
						text6 = "thing47 6"
					}
					thing47(atPosition = 7) {
						text7 = "thing47 7"
						text4 = "thing47 4"
						text7 = "thing47 7"
					}
					text8 = "thing47 8"
				}
			}
		}
	}
}