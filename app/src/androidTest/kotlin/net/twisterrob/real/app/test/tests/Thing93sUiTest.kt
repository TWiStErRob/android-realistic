package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing93.thing93s
import net.twisterrob.real.app.test.dsls.thing93.thing93sScreen
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
class Thing93Test : UiTest() {

	@Test
	fun testThing93_1() = gwen {
		given {
			server stubs {
				get("/thing93") with json(testR.raw.repos)
			}
			user launches { thing93sScreen("thing93") }
		}

		whenever {
			user selects {
				thing93s {
					action1()
					action2()
					action3()
					thing93(atPosition = 4) {
						action4()
					}
					action5()
					thing93(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing93(atPosition = 7) {
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
				thing93s {
					text1 = "thing93 1"
					text2 = "thing93 2"
					text3 = "thing93 3"
					thing93(atPosition = 4) {
						text4 = "thing93 4"
					}
					text5 = "thing93 5"
					thing93(atPosition = 6) {
						text6 = "thing93 6"
						text6 = "thing93 6"
						text6 = "thing93 6"
					}
					thing93(atPosition = 7) {
						text7 = "thing93 7"
						text4 = "thing93 4"
						text7 = "thing93 7"
					}
					text8 = "thing93 8"
				}
			}
		}
	}

	@Test
	fun testThing93_2() = gwen {
		given {
			server stubs {
				get("/thing93") with json(testR.raw.repos)
			}
			user launches { thing93sScreen("thing93") }
		}

		whenever {
			user selects {
				thing93s {
					action1()
					action2()
					action3()
					thing93(atPosition = 4) {
						action4()
					}
					action5()
					thing93(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing93(atPosition = 7) {
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
				thing93s {
					text1 = "thing93 1"
					text2 = "thing93 2"
					text3 = "thing93 3"
					thing93(atPosition = 4) {
						text4 = "thing93 4"
					}
					text5 = "thing93 5"
					thing93(atPosition = 6) {
						text6 = "thing93 6"
						text6 = "thing93 6"
						text6 = "thing93 6"
					}
					thing93(atPosition = 7) {
						text7 = "thing93 7"
						text4 = "thing93 4"
						text7 = "thing93 7"
					}
					text8 = "thing93 8"
				}
			}
		}
	}

	@Test
	fun testThing93_3() = gwen {
		given {
			server stubs {
				get("/thing93") with json(testR.raw.repos)
			}
			user launches { thing93sScreen("thing93") }
		}

		whenever {
			user selects {
				thing93s {
					action1()
					action2()
					action3()
					thing93(atPosition = 4) {
						action4()
					}
					action5()
					thing93(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing93(atPosition = 7) {
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
				thing93s {
					text1 = "thing93 1"
					text2 = "thing93 2"
					text3 = "thing93 3"
					thing93(atPosition = 4) {
						text4 = "thing93 4"
					}
					text5 = "thing93 5"
					thing93(atPosition = 6) {
						text6 = "thing93 6"
						text6 = "thing93 6"
						text6 = "thing93 6"
					}
					thing93(atPosition = 7) {
						text7 = "thing93 7"
						text4 = "thing93 4"
						text7 = "thing93 7"
					}
					text8 = "thing93 8"
				}
			}
		}
	}

	@Test
	fun testThing93_4() = gwen {
		given {
			server stubs {
				get("/thing93") with json(testR.raw.repos)
			}
			user launches { thing93sScreen("thing93") }
		}

		whenever {
			user selects {
				thing93s {
					action1()
					action2()
					action3()
					thing93(atPosition = 4) {
						action4()
					}
					action5()
					thing93(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing93(atPosition = 7) {
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
				thing93s {
					text1 = "thing93 1"
					text2 = "thing93 2"
					text3 = "thing93 3"
					thing93(atPosition = 4) {
						text4 = "thing93 4"
					}
					text5 = "thing93 5"
					thing93(atPosition = 6) {
						text6 = "thing93 6"
						text6 = "thing93 6"
						text6 = "thing93 6"
					}
					thing93(atPosition = 7) {
						text7 = "thing93 7"
						text4 = "thing93 4"
						text7 = "thing93 7"
					}
					text8 = "thing93 8"
				}
			}
		}
	}

	@Test
	fun testThing93_5() = gwen {
		given {
			server stubs {
				get("/thing93") with json(testR.raw.repos)
			}
			user launches { thing93sScreen("thing93") }
		}

		whenever {
			user selects {
				thing93s {
					action1()
					action2()
					action3()
					thing93(atPosition = 4) {
						action4()
					}
					action5()
					thing93(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing93(atPosition = 7) {
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
				thing93s {
					text1 = "thing93 1"
					text2 = "thing93 2"
					text3 = "thing93 3"
					thing93(atPosition = 4) {
						text4 = "thing93 4"
					}
					text5 = "thing93 5"
					thing93(atPosition = 6) {
						text6 = "thing93 6"
						text6 = "thing93 6"
						text6 = "thing93 6"
					}
					thing93(atPosition = 7) {
						text7 = "thing93 7"
						text4 = "thing93 4"
						text7 = "thing93 7"
					}
					text8 = "thing93 8"
				}
			}
		}
	}
}
