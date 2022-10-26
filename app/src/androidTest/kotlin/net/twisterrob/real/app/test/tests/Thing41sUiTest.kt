package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing41.thing41s
import net.twisterrob.real.app.test.dsls.thing41.thing41sScreen
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
class Thing41Test : UiTest() {

	@Test
	fun testThing41_1() = gwen {
		given {
			server stubs {
				get("/thing41") with json(testR.raw.repos)
			}
			user launches { thing41sScreen("thing41") }
		}

		whenever {
			user selects {
				thing41s {
					action1()
					action2()
					action3()
					thing41(atPosition = 4) {
						action4()
					}
					action5()
					thing41(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing41(atPosition = 7) {
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
				thing41s {
					text1 = "thing41 1"
					text2 = "thing41 2"
					text3 = "thing41 3"
					thing41(atPosition = 4) {
						text4 = "thing41 4"
					}
					text5 = "thing41 5"
					thing41(atPosition = 6) {
						text6 = "thing41 6"
						text6 = "thing41 6"
						text6 = "thing41 6"
					}
					thing41(atPosition = 7) {
						text7 = "thing41 7"
						text4 = "thing41 4"
						text7 = "thing41 7"
					}
					text8 = "thing41 8"
				}
			}
		}
	}

	@Test
	fun testThing41_2() = gwen {
		given {
			server stubs {
				get("/thing41") with json(testR.raw.repos)
			}
			user launches { thing41sScreen("thing41") }
		}

		whenever {
			user selects {
				thing41s {
					action1()
					action2()
					action3()
					thing41(atPosition = 4) {
						action4()
					}
					action5()
					thing41(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing41(atPosition = 7) {
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
				thing41s {
					text1 = "thing41 1"
					text2 = "thing41 2"
					text3 = "thing41 3"
					thing41(atPosition = 4) {
						text4 = "thing41 4"
					}
					text5 = "thing41 5"
					thing41(atPosition = 6) {
						text6 = "thing41 6"
						text6 = "thing41 6"
						text6 = "thing41 6"
					}
					thing41(atPosition = 7) {
						text7 = "thing41 7"
						text4 = "thing41 4"
						text7 = "thing41 7"
					}
					text8 = "thing41 8"
				}
			}
		}
	}

	@Test
	fun testThing41_3() = gwen {
		given {
			server stubs {
				get("/thing41") with json(testR.raw.repos)
			}
			user launches { thing41sScreen("thing41") }
		}

		whenever {
			user selects {
				thing41s {
					action1()
					action2()
					action3()
					thing41(atPosition = 4) {
						action4()
					}
					action5()
					thing41(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing41(atPosition = 7) {
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
				thing41s {
					text1 = "thing41 1"
					text2 = "thing41 2"
					text3 = "thing41 3"
					thing41(atPosition = 4) {
						text4 = "thing41 4"
					}
					text5 = "thing41 5"
					thing41(atPosition = 6) {
						text6 = "thing41 6"
						text6 = "thing41 6"
						text6 = "thing41 6"
					}
					thing41(atPosition = 7) {
						text7 = "thing41 7"
						text4 = "thing41 4"
						text7 = "thing41 7"
					}
					text8 = "thing41 8"
				}
			}
		}
	}

	@Test
	fun testThing41_4() = gwen {
		given {
			server stubs {
				get("/thing41") with json(testR.raw.repos)
			}
			user launches { thing41sScreen("thing41") }
		}

		whenever {
			user selects {
				thing41s {
					action1()
					action2()
					action3()
					thing41(atPosition = 4) {
						action4()
					}
					action5()
					thing41(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing41(atPosition = 7) {
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
				thing41s {
					text1 = "thing41 1"
					text2 = "thing41 2"
					text3 = "thing41 3"
					thing41(atPosition = 4) {
						text4 = "thing41 4"
					}
					text5 = "thing41 5"
					thing41(atPosition = 6) {
						text6 = "thing41 6"
						text6 = "thing41 6"
						text6 = "thing41 6"
					}
					thing41(atPosition = 7) {
						text7 = "thing41 7"
						text4 = "thing41 4"
						text7 = "thing41 7"
					}
					text8 = "thing41 8"
				}
			}
		}
	}

	@Test
	fun testThing41_5() = gwen {
		given {
			server stubs {
				get("/thing41") with json(testR.raw.repos)
			}
			user launches { thing41sScreen("thing41") }
		}

		whenever {
			user selects {
				thing41s {
					action1()
					action2()
					action3()
					thing41(atPosition = 4) {
						action4()
					}
					action5()
					thing41(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing41(atPosition = 7) {
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
				thing41s {
					text1 = "thing41 1"
					text2 = "thing41 2"
					text3 = "thing41 3"
					thing41(atPosition = 4) {
						text4 = "thing41 4"
					}
					text5 = "thing41 5"
					thing41(atPosition = 6) {
						text6 = "thing41 6"
						text6 = "thing41 6"
						text6 = "thing41 6"
					}
					thing41(atPosition = 7) {
						text7 = "thing41 7"
						text4 = "thing41 4"
						text7 = "thing41 7"
					}
					text8 = "thing41 8"
				}
			}
		}
	}
}
