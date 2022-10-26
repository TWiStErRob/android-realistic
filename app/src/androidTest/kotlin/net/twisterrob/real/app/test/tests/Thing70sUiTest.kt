package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing70.thing70s
import net.twisterrob.real.app.test.dsls.thing70.thing70sScreen
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
class Thing70Test : UiTest() {

	@Test
	fun testThing70_1() = gwen {
		given {
			server stubs {
				get("/thing70") with json(testR.raw.repos)
			}
			user launches { thing70sScreen("thing70") }
		}

		whenever {
			user selects {
				thing70s {
					action1()
					action2()
					action3()
					thing70(atPosition = 4) {
						action4()
					}
					action5()
					thing70(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing70(atPosition = 7) {
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
				thing70s {
					text1 = "thing70 1"
					text2 = "thing70 2"
					text3 = "thing70 3"
					thing70(atPosition = 4) {
						text4 = "thing70 4"
					}
					text5 = "thing70 5"
					thing70(atPosition = 6) {
						text6 = "thing70 6"
						text6 = "thing70 6"
						text6 = "thing70 6"
					}
					thing70(atPosition = 7) {
						text7 = "thing70 7"
						text4 = "thing70 4"
						text7 = "thing70 7"
					}
					text8 = "thing70 8"
				}
			}
		}
	}

	@Test
	fun testThing70_2() = gwen {
		given {
			server stubs {
				get("/thing70") with json(testR.raw.repos)
			}
			user launches { thing70sScreen("thing70") }
		}

		whenever {
			user selects {
				thing70s {
					action1()
					action2()
					action3()
					thing70(atPosition = 4) {
						action4()
					}
					action5()
					thing70(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing70(atPosition = 7) {
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
				thing70s {
					text1 = "thing70 1"
					text2 = "thing70 2"
					text3 = "thing70 3"
					thing70(atPosition = 4) {
						text4 = "thing70 4"
					}
					text5 = "thing70 5"
					thing70(atPosition = 6) {
						text6 = "thing70 6"
						text6 = "thing70 6"
						text6 = "thing70 6"
					}
					thing70(atPosition = 7) {
						text7 = "thing70 7"
						text4 = "thing70 4"
						text7 = "thing70 7"
					}
					text8 = "thing70 8"
				}
			}
		}
	}

	@Test
	fun testThing70_3() = gwen {
		given {
			server stubs {
				get("/thing70") with json(testR.raw.repos)
			}
			user launches { thing70sScreen("thing70") }
		}

		whenever {
			user selects {
				thing70s {
					action1()
					action2()
					action3()
					thing70(atPosition = 4) {
						action4()
					}
					action5()
					thing70(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing70(atPosition = 7) {
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
				thing70s {
					text1 = "thing70 1"
					text2 = "thing70 2"
					text3 = "thing70 3"
					thing70(atPosition = 4) {
						text4 = "thing70 4"
					}
					text5 = "thing70 5"
					thing70(atPosition = 6) {
						text6 = "thing70 6"
						text6 = "thing70 6"
						text6 = "thing70 6"
					}
					thing70(atPosition = 7) {
						text7 = "thing70 7"
						text4 = "thing70 4"
						text7 = "thing70 7"
					}
					text8 = "thing70 8"
				}
			}
		}
	}

	@Test
	fun testThing70_4() = gwen {
		given {
			server stubs {
				get("/thing70") with json(testR.raw.repos)
			}
			user launches { thing70sScreen("thing70") }
		}

		whenever {
			user selects {
				thing70s {
					action1()
					action2()
					action3()
					thing70(atPosition = 4) {
						action4()
					}
					action5()
					thing70(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing70(atPosition = 7) {
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
				thing70s {
					text1 = "thing70 1"
					text2 = "thing70 2"
					text3 = "thing70 3"
					thing70(atPosition = 4) {
						text4 = "thing70 4"
					}
					text5 = "thing70 5"
					thing70(atPosition = 6) {
						text6 = "thing70 6"
						text6 = "thing70 6"
						text6 = "thing70 6"
					}
					thing70(atPosition = 7) {
						text7 = "thing70 7"
						text4 = "thing70 4"
						text7 = "thing70 7"
					}
					text8 = "thing70 8"
				}
			}
		}
	}

	@Test
	fun testThing70_5() = gwen {
		given {
			server stubs {
				get("/thing70") with json(testR.raw.repos)
			}
			user launches { thing70sScreen("thing70") }
		}

		whenever {
			user selects {
				thing70s {
					action1()
					action2()
					action3()
					thing70(atPosition = 4) {
						action4()
					}
					action5()
					thing70(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing70(atPosition = 7) {
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
				thing70s {
					text1 = "thing70 1"
					text2 = "thing70 2"
					text3 = "thing70 3"
					thing70(atPosition = 4) {
						text4 = "thing70 4"
					}
					text5 = "thing70 5"
					thing70(atPosition = 6) {
						text6 = "thing70 6"
						text6 = "thing70 6"
						text6 = "thing70 6"
					}
					thing70(atPosition = 7) {
						text7 = "thing70 7"
						text4 = "thing70 4"
						text7 = "thing70 7"
					}
					text8 = "thing70 8"
				}
			}
		}
	}
}
