package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing52.thing52s
import net.twisterrob.real.app.test.dsls.thing52.thing52sScreen
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
class Thing52Test : UiTest() {

	@Test
	fun testThing52_1() = gwen {
		given {
			server stubs {
				get("/thing52") with json(testR.raw.repos)
			}
			user launches { thing52sScreen("thing52") }
		}

		whenever {
			user selects {
				thing52s {
					action1()
					action2()
					action3()
					thing52(atPosition = 4) {
						action4()
					}
					action5()
					thing52(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing52(atPosition = 7) {
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
				thing52s {
					text1 = "thing52 1"
					text2 = "thing52 2"
					text3 = "thing52 3"
					thing52(atPosition = 4) {
						text4 = "thing52 4"
					}
					text5 = "thing52 5"
					thing52(atPosition = 6) {
						text6 = "thing52 6"
						text6 = "thing52 6"
						text6 = "thing52 6"
					}
					thing52(atPosition = 7) {
						text7 = "thing52 7"
						text4 = "thing52 4"
						text7 = "thing52 7"
					}
					text8 = "thing52 8"
				}
			}
		}
	}

	@Test
	fun testThing52_2() = gwen {
		given {
			server stubs {
				get("/thing52") with json(testR.raw.repos)
			}
			user launches { thing52sScreen("thing52") }
		}

		whenever {
			user selects {
				thing52s {
					action1()
					action2()
					action3()
					thing52(atPosition = 4) {
						action4()
					}
					action5()
					thing52(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing52(atPosition = 7) {
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
				thing52s {
					text1 = "thing52 1"
					text2 = "thing52 2"
					text3 = "thing52 3"
					thing52(atPosition = 4) {
						text4 = "thing52 4"
					}
					text5 = "thing52 5"
					thing52(atPosition = 6) {
						text6 = "thing52 6"
						text6 = "thing52 6"
						text6 = "thing52 6"
					}
					thing52(atPosition = 7) {
						text7 = "thing52 7"
						text4 = "thing52 4"
						text7 = "thing52 7"
					}
					text8 = "thing52 8"
				}
			}
		}
	}

	@Test
	fun testThing52_3() = gwen {
		given {
			server stubs {
				get("/thing52") with json(testR.raw.repos)
			}
			user launches { thing52sScreen("thing52") }
		}

		whenever {
			user selects {
				thing52s {
					action1()
					action2()
					action3()
					thing52(atPosition = 4) {
						action4()
					}
					action5()
					thing52(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing52(atPosition = 7) {
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
				thing52s {
					text1 = "thing52 1"
					text2 = "thing52 2"
					text3 = "thing52 3"
					thing52(atPosition = 4) {
						text4 = "thing52 4"
					}
					text5 = "thing52 5"
					thing52(atPosition = 6) {
						text6 = "thing52 6"
						text6 = "thing52 6"
						text6 = "thing52 6"
					}
					thing52(atPosition = 7) {
						text7 = "thing52 7"
						text4 = "thing52 4"
						text7 = "thing52 7"
					}
					text8 = "thing52 8"
				}
			}
		}
	}

	@Test
	fun testThing52_4() = gwen {
		given {
			server stubs {
				get("/thing52") with json(testR.raw.repos)
			}
			user launches { thing52sScreen("thing52") }
		}

		whenever {
			user selects {
				thing52s {
					action1()
					action2()
					action3()
					thing52(atPosition = 4) {
						action4()
					}
					action5()
					thing52(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing52(atPosition = 7) {
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
				thing52s {
					text1 = "thing52 1"
					text2 = "thing52 2"
					text3 = "thing52 3"
					thing52(atPosition = 4) {
						text4 = "thing52 4"
					}
					text5 = "thing52 5"
					thing52(atPosition = 6) {
						text6 = "thing52 6"
						text6 = "thing52 6"
						text6 = "thing52 6"
					}
					thing52(atPosition = 7) {
						text7 = "thing52 7"
						text4 = "thing52 4"
						text7 = "thing52 7"
					}
					text8 = "thing52 8"
				}
			}
		}
	}

	@Test
	fun testThing52_5() = gwen {
		given {
			server stubs {
				get("/thing52") with json(testR.raw.repos)
			}
			user launches { thing52sScreen("thing52") }
		}

		whenever {
			user selects {
				thing52s {
					action1()
					action2()
					action3()
					thing52(atPosition = 4) {
						action4()
					}
					action5()
					thing52(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing52(atPosition = 7) {
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
				thing52s {
					text1 = "thing52 1"
					text2 = "thing52 2"
					text3 = "thing52 3"
					thing52(atPosition = 4) {
						text4 = "thing52 4"
					}
					text5 = "thing52 5"
					thing52(atPosition = 6) {
						text6 = "thing52 6"
						text6 = "thing52 6"
						text6 = "thing52 6"
					}
					thing52(atPosition = 7) {
						text7 = "thing52 7"
						text4 = "thing52 4"
						text7 = "thing52 7"
					}
					text8 = "thing52 8"
				}
			}
		}
	}
}
