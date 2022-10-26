package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing65.thing65s
import net.twisterrob.real.app.test.dsls.thing65.thing65sScreen
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
class Thing65Test : UiTest() {

	@Test
	fun testThing65_1() = gwen {
		given {
			server stubs {
				get("/thing65") with json(testR.raw.repos)
			}
			user launches { thing65sScreen("thing65") }
		}

		whenever {
			user selects {
				thing65s {
					action1()
					action2()
					action3()
					thing65(atPosition = 4) {
						action4()
					}
					action5()
					thing65(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing65(atPosition = 7) {
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
				thing65s {
					text1 = "thing65 1"
					text2 = "thing65 2"
					text3 = "thing65 3"
					thing65(atPosition = 4) {
						text4 = "thing65 4"
					}
					text5 = "thing65 5"
					thing65(atPosition = 6) {
						text6 = "thing65 6"
						text6 = "thing65 6"
						text6 = "thing65 6"
					}
					thing65(atPosition = 7) {
						text7 = "thing65 7"
						text4 = "thing65 4"
						text7 = "thing65 7"
					}
					text8 = "thing65 8"
				}
			}
		}
	}

	@Test
	fun testThing65_2() = gwen {
		given {
			server stubs {
				get("/thing65") with json(testR.raw.repos)
			}
			user launches { thing65sScreen("thing65") }
		}

		whenever {
			user selects {
				thing65s {
					action1()
					action2()
					action3()
					thing65(atPosition = 4) {
						action4()
					}
					action5()
					thing65(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing65(atPosition = 7) {
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
				thing65s {
					text1 = "thing65 1"
					text2 = "thing65 2"
					text3 = "thing65 3"
					thing65(atPosition = 4) {
						text4 = "thing65 4"
					}
					text5 = "thing65 5"
					thing65(atPosition = 6) {
						text6 = "thing65 6"
						text6 = "thing65 6"
						text6 = "thing65 6"
					}
					thing65(atPosition = 7) {
						text7 = "thing65 7"
						text4 = "thing65 4"
						text7 = "thing65 7"
					}
					text8 = "thing65 8"
				}
			}
		}
	}

	@Test
	fun testThing65_3() = gwen {
		given {
			server stubs {
				get("/thing65") with json(testR.raw.repos)
			}
			user launches { thing65sScreen("thing65") }
		}

		whenever {
			user selects {
				thing65s {
					action1()
					action2()
					action3()
					thing65(atPosition = 4) {
						action4()
					}
					action5()
					thing65(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing65(atPosition = 7) {
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
				thing65s {
					text1 = "thing65 1"
					text2 = "thing65 2"
					text3 = "thing65 3"
					thing65(atPosition = 4) {
						text4 = "thing65 4"
					}
					text5 = "thing65 5"
					thing65(atPosition = 6) {
						text6 = "thing65 6"
						text6 = "thing65 6"
						text6 = "thing65 6"
					}
					thing65(atPosition = 7) {
						text7 = "thing65 7"
						text4 = "thing65 4"
						text7 = "thing65 7"
					}
					text8 = "thing65 8"
				}
			}
		}
	}

	@Test
	fun testThing65_4() = gwen {
		given {
			server stubs {
				get("/thing65") with json(testR.raw.repos)
			}
			user launches { thing65sScreen("thing65") }
		}

		whenever {
			user selects {
				thing65s {
					action1()
					action2()
					action3()
					thing65(atPosition = 4) {
						action4()
					}
					action5()
					thing65(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing65(atPosition = 7) {
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
				thing65s {
					text1 = "thing65 1"
					text2 = "thing65 2"
					text3 = "thing65 3"
					thing65(atPosition = 4) {
						text4 = "thing65 4"
					}
					text5 = "thing65 5"
					thing65(atPosition = 6) {
						text6 = "thing65 6"
						text6 = "thing65 6"
						text6 = "thing65 6"
					}
					thing65(atPosition = 7) {
						text7 = "thing65 7"
						text4 = "thing65 4"
						text7 = "thing65 7"
					}
					text8 = "thing65 8"
				}
			}
		}
	}

	@Test
	fun testThing65_5() = gwen {
		given {
			server stubs {
				get("/thing65") with json(testR.raw.repos)
			}
			user launches { thing65sScreen("thing65") }
		}

		whenever {
			user selects {
				thing65s {
					action1()
					action2()
					action3()
					thing65(atPosition = 4) {
						action4()
					}
					action5()
					thing65(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing65(atPosition = 7) {
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
				thing65s {
					text1 = "thing65 1"
					text2 = "thing65 2"
					text3 = "thing65 3"
					thing65(atPosition = 4) {
						text4 = "thing65 4"
					}
					text5 = "thing65 5"
					thing65(atPosition = 6) {
						text6 = "thing65 6"
						text6 = "thing65 6"
						text6 = "thing65 6"
					}
					thing65(atPosition = 7) {
						text7 = "thing65 7"
						text4 = "thing65 4"
						text7 = "thing65 7"
					}
					text8 = "thing65 8"
				}
			}
		}
	}
}
