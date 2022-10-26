package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing28.thing28s
import net.twisterrob.real.app.test.dsls.thing28.thing28sScreen
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
class Thing28Test : UiTest() {

	@Test
	fun testThing28_1() = gwen {
		given {
			server stubs {
				get("/thing28") with json(testR.raw.repos)
			}
			user launches { thing28sScreen("thing28") }
		}

		whenever {
			user selects {
				thing28s {
					action1()
					action2()
					action3()
					thing28(atPosition = 4) {
						action4()
					}
					action5()
					thing28(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing28(atPosition = 7) {
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
				thing28s {
					text1 = "thing28 1"
					text2 = "thing28 2"
					text3 = "thing28 3"
					thing28(atPosition = 4) {
						text4 = "thing28 4"
					}
					text5 = "thing28 5"
					thing28(atPosition = 6) {
						text6 = "thing28 6"
						text6 = "thing28 6"
						text6 = "thing28 6"
					}
					thing28(atPosition = 7) {
						text7 = "thing28 7"
						text4 = "thing28 4"
						text7 = "thing28 7"
					}
					text8 = "thing28 8"
				}
			}
		}
	}

	@Test
	fun testThing28_2() = gwen {
		given {
			server stubs {
				get("/thing28") with json(testR.raw.repos)
			}
			user launches { thing28sScreen("thing28") }
		}

		whenever {
			user selects {
				thing28s {
					action1()
					action2()
					action3()
					thing28(atPosition = 4) {
						action4()
					}
					action5()
					thing28(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing28(atPosition = 7) {
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
				thing28s {
					text1 = "thing28 1"
					text2 = "thing28 2"
					text3 = "thing28 3"
					thing28(atPosition = 4) {
						text4 = "thing28 4"
					}
					text5 = "thing28 5"
					thing28(atPosition = 6) {
						text6 = "thing28 6"
						text6 = "thing28 6"
						text6 = "thing28 6"
					}
					thing28(atPosition = 7) {
						text7 = "thing28 7"
						text4 = "thing28 4"
						text7 = "thing28 7"
					}
					text8 = "thing28 8"
				}
			}
		}
	}

	@Test
	fun testThing28_3() = gwen {
		given {
			server stubs {
				get("/thing28") with json(testR.raw.repos)
			}
			user launches { thing28sScreen("thing28") }
		}

		whenever {
			user selects {
				thing28s {
					action1()
					action2()
					action3()
					thing28(atPosition = 4) {
						action4()
					}
					action5()
					thing28(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing28(atPosition = 7) {
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
				thing28s {
					text1 = "thing28 1"
					text2 = "thing28 2"
					text3 = "thing28 3"
					thing28(atPosition = 4) {
						text4 = "thing28 4"
					}
					text5 = "thing28 5"
					thing28(atPosition = 6) {
						text6 = "thing28 6"
						text6 = "thing28 6"
						text6 = "thing28 6"
					}
					thing28(atPosition = 7) {
						text7 = "thing28 7"
						text4 = "thing28 4"
						text7 = "thing28 7"
					}
					text8 = "thing28 8"
				}
			}
		}
	}

	@Test
	fun testThing28_4() = gwen {
		given {
			server stubs {
				get("/thing28") with json(testR.raw.repos)
			}
			user launches { thing28sScreen("thing28") }
		}

		whenever {
			user selects {
				thing28s {
					action1()
					action2()
					action3()
					thing28(atPosition = 4) {
						action4()
					}
					action5()
					thing28(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing28(atPosition = 7) {
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
				thing28s {
					text1 = "thing28 1"
					text2 = "thing28 2"
					text3 = "thing28 3"
					thing28(atPosition = 4) {
						text4 = "thing28 4"
					}
					text5 = "thing28 5"
					thing28(atPosition = 6) {
						text6 = "thing28 6"
						text6 = "thing28 6"
						text6 = "thing28 6"
					}
					thing28(atPosition = 7) {
						text7 = "thing28 7"
						text4 = "thing28 4"
						text7 = "thing28 7"
					}
					text8 = "thing28 8"
				}
			}
		}
	}

	@Test
	fun testThing28_5() = gwen {
		given {
			server stubs {
				get("/thing28") with json(testR.raw.repos)
			}
			user launches { thing28sScreen("thing28") }
		}

		whenever {
			user selects {
				thing28s {
					action1()
					action2()
					action3()
					thing28(atPosition = 4) {
						action4()
					}
					action5()
					thing28(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing28(atPosition = 7) {
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
				thing28s {
					text1 = "thing28 1"
					text2 = "thing28 2"
					text3 = "thing28 3"
					thing28(atPosition = 4) {
						text4 = "thing28 4"
					}
					text5 = "thing28 5"
					thing28(atPosition = 6) {
						text6 = "thing28 6"
						text6 = "thing28 6"
						text6 = "thing28 6"
					}
					thing28(atPosition = 7) {
						text7 = "thing28 7"
						text4 = "thing28 4"
						text7 = "thing28 7"
					}
					text8 = "thing28 8"
				}
			}
		}
	}
}
