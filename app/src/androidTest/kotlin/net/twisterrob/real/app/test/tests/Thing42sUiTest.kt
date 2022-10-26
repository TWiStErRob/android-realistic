package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing42.thing42s
import net.twisterrob.real.app.test.dsls.thing42.thing42sScreen
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
class Thing42Test : UiTest() {

	@Test
	fun testThing42_1() = gwen {
		given {
			server stubs {
				get("/thing42") with json(testR.raw.repos)
			}
			user launches { thing42sScreen("thing42") }
		}

		whenever {
			user selects {
				thing42s {
					action1()
					action2()
					action3()
					thing42(atPosition = 4) {
						action4()
					}
					action5()
					thing42(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing42(atPosition = 7) {
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
				thing42s {
					text1 = "thing42 1"
					text2 = "thing42 2"
					text3 = "thing42 3"
					thing42(atPosition = 4) {
						text4 = "thing42 4"
					}
					text5 = "thing42 5"
					thing42(atPosition = 6) {
						text6 = "thing42 6"
						text6 = "thing42 6"
						text6 = "thing42 6"
					}
					thing42(atPosition = 7) {
						text7 = "thing42 7"
						text4 = "thing42 4"
						text7 = "thing42 7"
					}
					text8 = "thing42 8"
				}
			}
		}
	}

	@Test
	fun testThing42_2() = gwen {
		given {
			server stubs {
				get("/thing42") with json(testR.raw.repos)
			}
			user launches { thing42sScreen("thing42") }
		}

		whenever {
			user selects {
				thing42s {
					action1()
					action2()
					action3()
					thing42(atPosition = 4) {
						action4()
					}
					action5()
					thing42(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing42(atPosition = 7) {
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
				thing42s {
					text1 = "thing42 1"
					text2 = "thing42 2"
					text3 = "thing42 3"
					thing42(atPosition = 4) {
						text4 = "thing42 4"
					}
					text5 = "thing42 5"
					thing42(atPosition = 6) {
						text6 = "thing42 6"
						text6 = "thing42 6"
						text6 = "thing42 6"
					}
					thing42(atPosition = 7) {
						text7 = "thing42 7"
						text4 = "thing42 4"
						text7 = "thing42 7"
					}
					text8 = "thing42 8"
				}
			}
		}
	}

	@Test
	fun testThing42_3() = gwen {
		given {
			server stubs {
				get("/thing42") with json(testR.raw.repos)
			}
			user launches { thing42sScreen("thing42") }
		}

		whenever {
			user selects {
				thing42s {
					action1()
					action2()
					action3()
					thing42(atPosition = 4) {
						action4()
					}
					action5()
					thing42(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing42(atPosition = 7) {
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
				thing42s {
					text1 = "thing42 1"
					text2 = "thing42 2"
					text3 = "thing42 3"
					thing42(atPosition = 4) {
						text4 = "thing42 4"
					}
					text5 = "thing42 5"
					thing42(atPosition = 6) {
						text6 = "thing42 6"
						text6 = "thing42 6"
						text6 = "thing42 6"
					}
					thing42(atPosition = 7) {
						text7 = "thing42 7"
						text4 = "thing42 4"
						text7 = "thing42 7"
					}
					text8 = "thing42 8"
				}
			}
		}
	}

	@Test
	fun testThing42_4() = gwen {
		given {
			server stubs {
				get("/thing42") with json(testR.raw.repos)
			}
			user launches { thing42sScreen("thing42") }
		}

		whenever {
			user selects {
				thing42s {
					action1()
					action2()
					action3()
					thing42(atPosition = 4) {
						action4()
					}
					action5()
					thing42(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing42(atPosition = 7) {
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
				thing42s {
					text1 = "thing42 1"
					text2 = "thing42 2"
					text3 = "thing42 3"
					thing42(atPosition = 4) {
						text4 = "thing42 4"
					}
					text5 = "thing42 5"
					thing42(atPosition = 6) {
						text6 = "thing42 6"
						text6 = "thing42 6"
						text6 = "thing42 6"
					}
					thing42(atPosition = 7) {
						text7 = "thing42 7"
						text4 = "thing42 4"
						text7 = "thing42 7"
					}
					text8 = "thing42 8"
				}
			}
		}
	}

	@Test
	fun testThing42_5() = gwen {
		given {
			server stubs {
				get("/thing42") with json(testR.raw.repos)
			}
			user launches { thing42sScreen("thing42") }
		}

		whenever {
			user selects {
				thing42s {
					action1()
					action2()
					action3()
					thing42(atPosition = 4) {
						action4()
					}
					action5()
					thing42(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing42(atPosition = 7) {
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
				thing42s {
					text1 = "thing42 1"
					text2 = "thing42 2"
					text3 = "thing42 3"
					thing42(atPosition = 4) {
						text4 = "thing42 4"
					}
					text5 = "thing42 5"
					thing42(atPosition = 6) {
						text6 = "thing42 6"
						text6 = "thing42 6"
						text6 = "thing42 6"
					}
					thing42(atPosition = 7) {
						text7 = "thing42 7"
						text4 = "thing42 4"
						text7 = "thing42 7"
					}
					text8 = "thing42 8"
				}
			}
		}
	}
}
