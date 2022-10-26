package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing53.thing53s
import net.twisterrob.real.app.test.dsls.thing53.thing53sScreen
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
class Thing53Test : UiTest() {

	@Test
	fun testThing53_1() = gwen {
		given {
			server stubs {
				get("/thing53") with json(testR.raw.repos)
			}
			user launches { thing53sScreen("thing53") }
		}

		whenever {
			user selects {
				thing53s {
					action1()
					action2()
					action3()
					thing53(atPosition = 4) {
						action4()
					}
					action5()
					thing53(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing53(atPosition = 7) {
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
				thing53s {
					text1 = "thing53 1"
					text2 = "thing53 2"
					text3 = "thing53 3"
					thing53(atPosition = 4) {
						text4 = "thing53 4"
					}
					text5 = "thing53 5"
					thing53(atPosition = 6) {
						text6 = "thing53 6"
						text6 = "thing53 6"
						text6 = "thing53 6"
					}
					thing53(atPosition = 7) {
						text7 = "thing53 7"
						text4 = "thing53 4"
						text7 = "thing53 7"
					}
					text8 = "thing53 8"
				}
			}
		}
	}

	@Test
	fun testThing53_2() = gwen {
		given {
			server stubs {
				get("/thing53") with json(testR.raw.repos)
			}
			user launches { thing53sScreen("thing53") }
		}

		whenever {
			user selects {
				thing53s {
					action1()
					action2()
					action3()
					thing53(atPosition = 4) {
						action4()
					}
					action5()
					thing53(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing53(atPosition = 7) {
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
				thing53s {
					text1 = "thing53 1"
					text2 = "thing53 2"
					text3 = "thing53 3"
					thing53(atPosition = 4) {
						text4 = "thing53 4"
					}
					text5 = "thing53 5"
					thing53(atPosition = 6) {
						text6 = "thing53 6"
						text6 = "thing53 6"
						text6 = "thing53 6"
					}
					thing53(atPosition = 7) {
						text7 = "thing53 7"
						text4 = "thing53 4"
						text7 = "thing53 7"
					}
					text8 = "thing53 8"
				}
			}
		}
	}

	@Test
	fun testThing53_3() = gwen {
		given {
			server stubs {
				get("/thing53") with json(testR.raw.repos)
			}
			user launches { thing53sScreen("thing53") }
		}

		whenever {
			user selects {
				thing53s {
					action1()
					action2()
					action3()
					thing53(atPosition = 4) {
						action4()
					}
					action5()
					thing53(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing53(atPosition = 7) {
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
				thing53s {
					text1 = "thing53 1"
					text2 = "thing53 2"
					text3 = "thing53 3"
					thing53(atPosition = 4) {
						text4 = "thing53 4"
					}
					text5 = "thing53 5"
					thing53(atPosition = 6) {
						text6 = "thing53 6"
						text6 = "thing53 6"
						text6 = "thing53 6"
					}
					thing53(atPosition = 7) {
						text7 = "thing53 7"
						text4 = "thing53 4"
						text7 = "thing53 7"
					}
					text8 = "thing53 8"
				}
			}
		}
	}

	@Test
	fun testThing53_4() = gwen {
		given {
			server stubs {
				get("/thing53") with json(testR.raw.repos)
			}
			user launches { thing53sScreen("thing53") }
		}

		whenever {
			user selects {
				thing53s {
					action1()
					action2()
					action3()
					thing53(atPosition = 4) {
						action4()
					}
					action5()
					thing53(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing53(atPosition = 7) {
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
				thing53s {
					text1 = "thing53 1"
					text2 = "thing53 2"
					text3 = "thing53 3"
					thing53(atPosition = 4) {
						text4 = "thing53 4"
					}
					text5 = "thing53 5"
					thing53(atPosition = 6) {
						text6 = "thing53 6"
						text6 = "thing53 6"
						text6 = "thing53 6"
					}
					thing53(atPosition = 7) {
						text7 = "thing53 7"
						text4 = "thing53 4"
						text7 = "thing53 7"
					}
					text8 = "thing53 8"
				}
			}
		}
	}

	@Test
	fun testThing53_5() = gwen {
		given {
			server stubs {
				get("/thing53") with json(testR.raw.repos)
			}
			user launches { thing53sScreen("thing53") }
		}

		whenever {
			user selects {
				thing53s {
					action1()
					action2()
					action3()
					thing53(atPosition = 4) {
						action4()
					}
					action5()
					thing53(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing53(atPosition = 7) {
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
				thing53s {
					text1 = "thing53 1"
					text2 = "thing53 2"
					text3 = "thing53 3"
					thing53(atPosition = 4) {
						text4 = "thing53 4"
					}
					text5 = "thing53 5"
					thing53(atPosition = 6) {
						text6 = "thing53 6"
						text6 = "thing53 6"
						text6 = "thing53 6"
					}
					thing53(atPosition = 7) {
						text7 = "thing53 7"
						text4 = "thing53 4"
						text7 = "thing53 7"
					}
					text8 = "thing53 8"
				}
			}
		}
	}
}
