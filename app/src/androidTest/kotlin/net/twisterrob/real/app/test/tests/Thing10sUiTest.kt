package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing10.thing10s
import net.twisterrob.real.app.test.dsls.thing10.thing10sScreen
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
class Thing10Test : UiTest() {

	@Test
	fun testThing10_1() = gwen {
		given {
			server stubs {
				get("/thing10") with json(testR.raw.repos)
			}
			user launches { thing10sScreen("thing10") }
		}

		whenever {
			user selects {
				thing10s {
					action1()
					action2()
					action3()
					thing10(atPosition = 4) {
						action4()
					}
					action5()
					thing10(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing10(atPosition = 7) {
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
				thing10s {
					text1 = "thing10 1"
					text2 = "thing10 2"
					text3 = "thing10 3"
					thing10(atPosition = 4) {
						text4 = "thing10 4"
					}
					text5 = "thing10 5"
					thing10(atPosition = 6) {
						text6 = "thing10 6"
						text6 = "thing10 6"
						text6 = "thing10 6"
					}
					thing10(atPosition = 7) {
						text7 = "thing10 7"
						text4 = "thing10 4"
						text7 = "thing10 7"
					}
					text8 = "thing10 8"
				}
			}
		}
	}

	@Test
	fun testThing10_2() = gwen {
		given {
			server stubs {
				get("/thing10") with json(testR.raw.repos)
			}
			user launches { thing10sScreen("thing10") }
		}

		whenever {
			user selects {
				thing10s {
					action1()
					action2()
					action3()
					thing10(atPosition = 4) {
						action4()
					}
					action5()
					thing10(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing10(atPosition = 7) {
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
				thing10s {
					text1 = "thing10 1"
					text2 = "thing10 2"
					text3 = "thing10 3"
					thing10(atPosition = 4) {
						text4 = "thing10 4"
					}
					text5 = "thing10 5"
					thing10(atPosition = 6) {
						text6 = "thing10 6"
						text6 = "thing10 6"
						text6 = "thing10 6"
					}
					thing10(atPosition = 7) {
						text7 = "thing10 7"
						text4 = "thing10 4"
						text7 = "thing10 7"
					}
					text8 = "thing10 8"
				}
			}
		}
	}

	@Test
	fun testThing10_3() = gwen {
		given {
			server stubs {
				get("/thing10") with json(testR.raw.repos)
			}
			user launches { thing10sScreen("thing10") }
		}

		whenever {
			user selects {
				thing10s {
					action1()
					action2()
					action3()
					thing10(atPosition = 4) {
						action4()
					}
					action5()
					thing10(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing10(atPosition = 7) {
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
				thing10s {
					text1 = "thing10 1"
					text2 = "thing10 2"
					text3 = "thing10 3"
					thing10(atPosition = 4) {
						text4 = "thing10 4"
					}
					text5 = "thing10 5"
					thing10(atPosition = 6) {
						text6 = "thing10 6"
						text6 = "thing10 6"
						text6 = "thing10 6"
					}
					thing10(atPosition = 7) {
						text7 = "thing10 7"
						text4 = "thing10 4"
						text7 = "thing10 7"
					}
					text8 = "thing10 8"
				}
			}
		}
	}

	@Test
	fun testThing10_4() = gwen {
		given {
			server stubs {
				get("/thing10") with json(testR.raw.repos)
			}
			user launches { thing10sScreen("thing10") }
		}

		whenever {
			user selects {
				thing10s {
					action1()
					action2()
					action3()
					thing10(atPosition = 4) {
						action4()
					}
					action5()
					thing10(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing10(atPosition = 7) {
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
				thing10s {
					text1 = "thing10 1"
					text2 = "thing10 2"
					text3 = "thing10 3"
					thing10(atPosition = 4) {
						text4 = "thing10 4"
					}
					text5 = "thing10 5"
					thing10(atPosition = 6) {
						text6 = "thing10 6"
						text6 = "thing10 6"
						text6 = "thing10 6"
					}
					thing10(atPosition = 7) {
						text7 = "thing10 7"
						text4 = "thing10 4"
						text7 = "thing10 7"
					}
					text8 = "thing10 8"
				}
			}
		}
	}

	@Test
	fun testThing10_5() = gwen {
		given {
			server stubs {
				get("/thing10") with json(testR.raw.repos)
			}
			user launches { thing10sScreen("thing10") }
		}

		whenever {
			user selects {
				thing10s {
					action1()
					action2()
					action3()
					thing10(atPosition = 4) {
						action4()
					}
					action5()
					thing10(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing10(atPosition = 7) {
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
				thing10s {
					text1 = "thing10 1"
					text2 = "thing10 2"
					text3 = "thing10 3"
					thing10(atPosition = 4) {
						text4 = "thing10 4"
					}
					text5 = "thing10 5"
					thing10(atPosition = 6) {
						text6 = "thing10 6"
						text6 = "thing10 6"
						text6 = "thing10 6"
					}
					thing10(atPosition = 7) {
						text7 = "thing10 7"
						text4 = "thing10 4"
						text7 = "thing10 7"
					}
					text8 = "thing10 8"
				}
			}
		}
	}
}
