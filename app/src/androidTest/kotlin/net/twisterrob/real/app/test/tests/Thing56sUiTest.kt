package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing56.thing56s
import net.twisterrob.real.app.test.dsls.thing56.thing56sScreen
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
class Thing56Test : UiTest() {

	@Test
	fun testThing56_1() = gwen {
		given {
			server stubs {
				get("/thing56") with json(testR.raw.repos)
			}
			user launches { thing56sScreen("thing56") }
		}

		whenever {
			user selects {
				thing56s {
					action1()
					action2()
					action3()
					thing56(atPosition = 4) {
						action4()
					}
					action5()
					thing56(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing56(atPosition = 7) {
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
				thing56s {
					text1 = "thing56 1"
					text2 = "thing56 2"
					text3 = "thing56 3"
					thing56(atPosition = 4) {
						text4 = "thing56 4"
					}
					text5 = "thing56 5"
					thing56(atPosition = 6) {
						text6 = "thing56 6"
						text6 = "thing56 6"
						text6 = "thing56 6"
					}
					thing56(atPosition = 7) {
						text7 = "thing56 7"
						text4 = "thing56 4"
						text7 = "thing56 7"
					}
					text8 = "thing56 8"
				}
			}
		}
	}

	@Test
	fun testThing56_2() = gwen {
		given {
			server stubs {
				get("/thing56") with json(testR.raw.repos)
			}
			user launches { thing56sScreen("thing56") }
		}

		whenever {
			user selects {
				thing56s {
					action1()
					action2()
					action3()
					thing56(atPosition = 4) {
						action4()
					}
					action5()
					thing56(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing56(atPosition = 7) {
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
				thing56s {
					text1 = "thing56 1"
					text2 = "thing56 2"
					text3 = "thing56 3"
					thing56(atPosition = 4) {
						text4 = "thing56 4"
					}
					text5 = "thing56 5"
					thing56(atPosition = 6) {
						text6 = "thing56 6"
						text6 = "thing56 6"
						text6 = "thing56 6"
					}
					thing56(atPosition = 7) {
						text7 = "thing56 7"
						text4 = "thing56 4"
						text7 = "thing56 7"
					}
					text8 = "thing56 8"
				}
			}
		}
	}

	@Test
	fun testThing56_3() = gwen {
		given {
			server stubs {
				get("/thing56") with json(testR.raw.repos)
			}
			user launches { thing56sScreen("thing56") }
		}

		whenever {
			user selects {
				thing56s {
					action1()
					action2()
					action3()
					thing56(atPosition = 4) {
						action4()
					}
					action5()
					thing56(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing56(atPosition = 7) {
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
				thing56s {
					text1 = "thing56 1"
					text2 = "thing56 2"
					text3 = "thing56 3"
					thing56(atPosition = 4) {
						text4 = "thing56 4"
					}
					text5 = "thing56 5"
					thing56(atPosition = 6) {
						text6 = "thing56 6"
						text6 = "thing56 6"
						text6 = "thing56 6"
					}
					thing56(atPosition = 7) {
						text7 = "thing56 7"
						text4 = "thing56 4"
						text7 = "thing56 7"
					}
					text8 = "thing56 8"
				}
			}
		}
	}

	@Test
	fun testThing56_4() = gwen {
		given {
			server stubs {
				get("/thing56") with json(testR.raw.repos)
			}
			user launches { thing56sScreen("thing56") }
		}

		whenever {
			user selects {
				thing56s {
					action1()
					action2()
					action3()
					thing56(atPosition = 4) {
						action4()
					}
					action5()
					thing56(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing56(atPosition = 7) {
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
				thing56s {
					text1 = "thing56 1"
					text2 = "thing56 2"
					text3 = "thing56 3"
					thing56(atPosition = 4) {
						text4 = "thing56 4"
					}
					text5 = "thing56 5"
					thing56(atPosition = 6) {
						text6 = "thing56 6"
						text6 = "thing56 6"
						text6 = "thing56 6"
					}
					thing56(atPosition = 7) {
						text7 = "thing56 7"
						text4 = "thing56 4"
						text7 = "thing56 7"
					}
					text8 = "thing56 8"
				}
			}
		}
	}

	@Test
	fun testThing56_5() = gwen {
		given {
			server stubs {
				get("/thing56") with json(testR.raw.repos)
			}
			user launches { thing56sScreen("thing56") }
		}

		whenever {
			user selects {
				thing56s {
					action1()
					action2()
					action3()
					thing56(atPosition = 4) {
						action4()
					}
					action5()
					thing56(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing56(atPosition = 7) {
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
				thing56s {
					text1 = "thing56 1"
					text2 = "thing56 2"
					text3 = "thing56 3"
					thing56(atPosition = 4) {
						text4 = "thing56 4"
					}
					text5 = "thing56 5"
					thing56(atPosition = 6) {
						text6 = "thing56 6"
						text6 = "thing56 6"
						text6 = "thing56 6"
					}
					thing56(atPosition = 7) {
						text7 = "thing56 7"
						text4 = "thing56 4"
						text7 = "thing56 7"
					}
					text8 = "thing56 8"
				}
			}
		}
	}
}
