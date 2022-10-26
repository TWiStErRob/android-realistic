package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing36.thing36s
import net.twisterrob.real.app.test.dsls.thing36.thing36sScreen
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
class Thing36Test : UiTest() {

	@Test
	fun testThing36_1() = gwen {
		given {
			server stubs {
				get("/thing36") with json(testR.raw.repos)
			}
			user launches { thing36sScreen("thing36") }
		}

		whenever {
			user selects {
				thing36s {
					action1()
					action2()
					action3()
					thing36(atPosition = 4) {
						action4()
					}
					action5()
					thing36(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing36(atPosition = 7) {
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
				thing36s {
					text1 = "thing36 1"
					text2 = "thing36 2"
					text3 = "thing36 3"
					thing36(atPosition = 4) {
						text4 = "thing36 4"
					}
					text5 = "thing36 5"
					thing36(atPosition = 6) {
						text6 = "thing36 6"
						text6 = "thing36 6"
						text6 = "thing36 6"
					}
					thing36(atPosition = 7) {
						text7 = "thing36 7"
						text4 = "thing36 4"
						text7 = "thing36 7"
					}
					text8 = "thing36 8"
				}
			}
		}
	}

	@Test
	fun testThing36_2() = gwen {
		given {
			server stubs {
				get("/thing36") with json(testR.raw.repos)
			}
			user launches { thing36sScreen("thing36") }
		}

		whenever {
			user selects {
				thing36s {
					action1()
					action2()
					action3()
					thing36(atPosition = 4) {
						action4()
					}
					action5()
					thing36(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing36(atPosition = 7) {
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
				thing36s {
					text1 = "thing36 1"
					text2 = "thing36 2"
					text3 = "thing36 3"
					thing36(atPosition = 4) {
						text4 = "thing36 4"
					}
					text5 = "thing36 5"
					thing36(atPosition = 6) {
						text6 = "thing36 6"
						text6 = "thing36 6"
						text6 = "thing36 6"
					}
					thing36(atPosition = 7) {
						text7 = "thing36 7"
						text4 = "thing36 4"
						text7 = "thing36 7"
					}
					text8 = "thing36 8"
				}
			}
		}
	}

	@Test
	fun testThing36_3() = gwen {
		given {
			server stubs {
				get("/thing36") with json(testR.raw.repos)
			}
			user launches { thing36sScreen("thing36") }
		}

		whenever {
			user selects {
				thing36s {
					action1()
					action2()
					action3()
					thing36(atPosition = 4) {
						action4()
					}
					action5()
					thing36(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing36(atPosition = 7) {
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
				thing36s {
					text1 = "thing36 1"
					text2 = "thing36 2"
					text3 = "thing36 3"
					thing36(atPosition = 4) {
						text4 = "thing36 4"
					}
					text5 = "thing36 5"
					thing36(atPosition = 6) {
						text6 = "thing36 6"
						text6 = "thing36 6"
						text6 = "thing36 6"
					}
					thing36(atPosition = 7) {
						text7 = "thing36 7"
						text4 = "thing36 4"
						text7 = "thing36 7"
					}
					text8 = "thing36 8"
				}
			}
		}
	}

	@Test
	fun testThing36_4() = gwen {
		given {
			server stubs {
				get("/thing36") with json(testR.raw.repos)
			}
			user launches { thing36sScreen("thing36") }
		}

		whenever {
			user selects {
				thing36s {
					action1()
					action2()
					action3()
					thing36(atPosition = 4) {
						action4()
					}
					action5()
					thing36(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing36(atPosition = 7) {
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
				thing36s {
					text1 = "thing36 1"
					text2 = "thing36 2"
					text3 = "thing36 3"
					thing36(atPosition = 4) {
						text4 = "thing36 4"
					}
					text5 = "thing36 5"
					thing36(atPosition = 6) {
						text6 = "thing36 6"
						text6 = "thing36 6"
						text6 = "thing36 6"
					}
					thing36(atPosition = 7) {
						text7 = "thing36 7"
						text4 = "thing36 4"
						text7 = "thing36 7"
					}
					text8 = "thing36 8"
				}
			}
		}
	}

	@Test
	fun testThing36_5() = gwen {
		given {
			server stubs {
				get("/thing36") with json(testR.raw.repos)
			}
			user launches { thing36sScreen("thing36") }
		}

		whenever {
			user selects {
				thing36s {
					action1()
					action2()
					action3()
					thing36(atPosition = 4) {
						action4()
					}
					action5()
					thing36(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing36(atPosition = 7) {
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
				thing36s {
					text1 = "thing36 1"
					text2 = "thing36 2"
					text3 = "thing36 3"
					thing36(atPosition = 4) {
						text4 = "thing36 4"
					}
					text5 = "thing36 5"
					thing36(atPosition = 6) {
						text6 = "thing36 6"
						text6 = "thing36 6"
						text6 = "thing36 6"
					}
					thing36(atPosition = 7) {
						text7 = "thing36 7"
						text4 = "thing36 4"
						text7 = "thing36 7"
					}
					text8 = "thing36 8"
				}
			}
		}
	}
}
