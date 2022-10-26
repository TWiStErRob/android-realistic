package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing57.thing57s
import net.twisterrob.real.app.test.dsls.thing57.thing57sScreen
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
class Thing57Test : UiTest() {

	@Test
	fun testThing57_1() = gwen {
		given {
			server stubs {
				get("/thing57") with json(testR.raw.repos)
			}
			user launches { thing57sScreen("thing57") }
		}

		whenever {
			user selects {
				thing57s {
					action1()
					action2()
					action3()
					thing57(atPosition = 4) {
						action4()
					}
					action5()
					thing57(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing57(atPosition = 7) {
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
				thing57s {
					text1 = "thing57 1"
					text2 = "thing57 2"
					text3 = "thing57 3"
					thing57(atPosition = 4) {
						text4 = "thing57 4"
					}
					text5 = "thing57 5"
					thing57(atPosition = 6) {
						text6 = "thing57 6"
						text6 = "thing57 6"
						text6 = "thing57 6"
					}
					thing57(atPosition = 7) {
						text7 = "thing57 7"
						text4 = "thing57 4"
						text7 = "thing57 7"
					}
					text8 = "thing57 8"
				}
			}
		}
	}

	@Test
	fun testThing57_2() = gwen {
		given {
			server stubs {
				get("/thing57") with json(testR.raw.repos)
			}
			user launches { thing57sScreen("thing57") }
		}

		whenever {
			user selects {
				thing57s {
					action1()
					action2()
					action3()
					thing57(atPosition = 4) {
						action4()
					}
					action5()
					thing57(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing57(atPosition = 7) {
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
				thing57s {
					text1 = "thing57 1"
					text2 = "thing57 2"
					text3 = "thing57 3"
					thing57(atPosition = 4) {
						text4 = "thing57 4"
					}
					text5 = "thing57 5"
					thing57(atPosition = 6) {
						text6 = "thing57 6"
						text6 = "thing57 6"
						text6 = "thing57 6"
					}
					thing57(atPosition = 7) {
						text7 = "thing57 7"
						text4 = "thing57 4"
						text7 = "thing57 7"
					}
					text8 = "thing57 8"
				}
			}
		}
	}

	@Test
	fun testThing57_3() = gwen {
		given {
			server stubs {
				get("/thing57") with json(testR.raw.repos)
			}
			user launches { thing57sScreen("thing57") }
		}

		whenever {
			user selects {
				thing57s {
					action1()
					action2()
					action3()
					thing57(atPosition = 4) {
						action4()
					}
					action5()
					thing57(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing57(atPosition = 7) {
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
				thing57s {
					text1 = "thing57 1"
					text2 = "thing57 2"
					text3 = "thing57 3"
					thing57(atPosition = 4) {
						text4 = "thing57 4"
					}
					text5 = "thing57 5"
					thing57(atPosition = 6) {
						text6 = "thing57 6"
						text6 = "thing57 6"
						text6 = "thing57 6"
					}
					thing57(atPosition = 7) {
						text7 = "thing57 7"
						text4 = "thing57 4"
						text7 = "thing57 7"
					}
					text8 = "thing57 8"
				}
			}
		}
	}

	@Test
	fun testThing57_4() = gwen {
		given {
			server stubs {
				get("/thing57") with json(testR.raw.repos)
			}
			user launches { thing57sScreen("thing57") }
		}

		whenever {
			user selects {
				thing57s {
					action1()
					action2()
					action3()
					thing57(atPosition = 4) {
						action4()
					}
					action5()
					thing57(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing57(atPosition = 7) {
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
				thing57s {
					text1 = "thing57 1"
					text2 = "thing57 2"
					text3 = "thing57 3"
					thing57(atPosition = 4) {
						text4 = "thing57 4"
					}
					text5 = "thing57 5"
					thing57(atPosition = 6) {
						text6 = "thing57 6"
						text6 = "thing57 6"
						text6 = "thing57 6"
					}
					thing57(atPosition = 7) {
						text7 = "thing57 7"
						text4 = "thing57 4"
						text7 = "thing57 7"
					}
					text8 = "thing57 8"
				}
			}
		}
	}

	@Test
	fun testThing57_5() = gwen {
		given {
			server stubs {
				get("/thing57") with json(testR.raw.repos)
			}
			user launches { thing57sScreen("thing57") }
		}

		whenever {
			user selects {
				thing57s {
					action1()
					action2()
					action3()
					thing57(atPosition = 4) {
						action4()
					}
					action5()
					thing57(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing57(atPosition = 7) {
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
				thing57s {
					text1 = "thing57 1"
					text2 = "thing57 2"
					text3 = "thing57 3"
					thing57(atPosition = 4) {
						text4 = "thing57 4"
					}
					text5 = "thing57 5"
					thing57(atPosition = 6) {
						text6 = "thing57 6"
						text6 = "thing57 6"
						text6 = "thing57 6"
					}
					thing57(atPosition = 7) {
						text7 = "thing57 7"
						text4 = "thing57 4"
						text7 = "thing57 7"
					}
					text8 = "thing57 8"
				}
			}
		}
	}
}
