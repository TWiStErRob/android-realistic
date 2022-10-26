package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing8.thing8s
import net.twisterrob.real.app.test.dsls.thing8.thing8sScreen
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
class Thing8Test : UiTest() {

	@Test
	fun testThing8_1() = gwen {
		given {
			server stubs {
				get("/thing8") with json(testR.raw.repos)
			}
			user launches { thing8sScreen("thing8") }
		}

		whenever {
			user selects {
				thing8s {
					action1()
					action2()
					action3()
					thing8(atPosition = 4) {
						action4()
					}
					action5()
					thing8(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing8(atPosition = 7) {
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
				thing8s {
					text1 = "thing8 1"
					text2 = "thing8 2"
					text3 = "thing8 3"
					thing8(atPosition = 4) {
						text4 = "thing8 4"
					}
					text5 = "thing8 5"
					thing8(atPosition = 6) {
						text6 = "thing8 6"
						text6 = "thing8 6"
						text6 = "thing8 6"
					}
					thing8(atPosition = 7) {
						text7 = "thing8 7"
						text4 = "thing8 4"
						text7 = "thing8 7"
					}
					text8 = "thing8 8"
				}
			}
		}
	}

	@Test
	fun testThing8_2() = gwen {
		given {
			server stubs {
				get("/thing8") with json(testR.raw.repos)
			}
			user launches { thing8sScreen("thing8") }
		}

		whenever {
			user selects {
				thing8s {
					action1()
					action2()
					action3()
					thing8(atPosition = 4) {
						action4()
					}
					action5()
					thing8(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing8(atPosition = 7) {
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
				thing8s {
					text1 = "thing8 1"
					text2 = "thing8 2"
					text3 = "thing8 3"
					thing8(atPosition = 4) {
						text4 = "thing8 4"
					}
					text5 = "thing8 5"
					thing8(atPosition = 6) {
						text6 = "thing8 6"
						text6 = "thing8 6"
						text6 = "thing8 6"
					}
					thing8(atPosition = 7) {
						text7 = "thing8 7"
						text4 = "thing8 4"
						text7 = "thing8 7"
					}
					text8 = "thing8 8"
				}
			}
		}
	}

	@Test
	fun testThing8_3() = gwen {
		given {
			server stubs {
				get("/thing8") with json(testR.raw.repos)
			}
			user launches { thing8sScreen("thing8") }
		}

		whenever {
			user selects {
				thing8s {
					action1()
					action2()
					action3()
					thing8(atPosition = 4) {
						action4()
					}
					action5()
					thing8(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing8(atPosition = 7) {
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
				thing8s {
					text1 = "thing8 1"
					text2 = "thing8 2"
					text3 = "thing8 3"
					thing8(atPosition = 4) {
						text4 = "thing8 4"
					}
					text5 = "thing8 5"
					thing8(atPosition = 6) {
						text6 = "thing8 6"
						text6 = "thing8 6"
						text6 = "thing8 6"
					}
					thing8(atPosition = 7) {
						text7 = "thing8 7"
						text4 = "thing8 4"
						text7 = "thing8 7"
					}
					text8 = "thing8 8"
				}
			}
		}
	}

	@Test
	fun testThing8_4() = gwen {
		given {
			server stubs {
				get("/thing8") with json(testR.raw.repos)
			}
			user launches { thing8sScreen("thing8") }
		}

		whenever {
			user selects {
				thing8s {
					action1()
					action2()
					action3()
					thing8(atPosition = 4) {
						action4()
					}
					action5()
					thing8(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing8(atPosition = 7) {
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
				thing8s {
					text1 = "thing8 1"
					text2 = "thing8 2"
					text3 = "thing8 3"
					thing8(atPosition = 4) {
						text4 = "thing8 4"
					}
					text5 = "thing8 5"
					thing8(atPosition = 6) {
						text6 = "thing8 6"
						text6 = "thing8 6"
						text6 = "thing8 6"
					}
					thing8(atPosition = 7) {
						text7 = "thing8 7"
						text4 = "thing8 4"
						text7 = "thing8 7"
					}
					text8 = "thing8 8"
				}
			}
		}
	}

	@Test
	fun testThing8_5() = gwen {
		given {
			server stubs {
				get("/thing8") with json(testR.raw.repos)
			}
			user launches { thing8sScreen("thing8") }
		}

		whenever {
			user selects {
				thing8s {
					action1()
					action2()
					action3()
					thing8(atPosition = 4) {
						action4()
					}
					action5()
					thing8(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing8(atPosition = 7) {
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
				thing8s {
					text1 = "thing8 1"
					text2 = "thing8 2"
					text3 = "thing8 3"
					thing8(atPosition = 4) {
						text4 = "thing8 4"
					}
					text5 = "thing8 5"
					thing8(atPosition = 6) {
						text6 = "thing8 6"
						text6 = "thing8 6"
						text6 = "thing8 6"
					}
					thing8(atPosition = 7) {
						text7 = "thing8 7"
						text4 = "thing8 4"
						text7 = "thing8 7"
					}
					text8 = "thing8 8"
				}
			}
		}
	}
}
