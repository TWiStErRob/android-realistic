package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing87.thing87s
import net.twisterrob.real.app.test.dsls.thing87.thing87sScreen
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
class Thing87Test : UiTest() {

	@Test
	fun testThing87_1() = gwen {
		given {
			server stubs {
				get("/thing87") with json(testR.raw.repos)
			}
			user launches { thing87sScreen("thing87") }
		}

		whenever {
			user selects {
				thing87s {
					action1()
					action2()
					action3()
					thing87(atPosition = 4) {
						action4()
					}
					action5()
					thing87(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing87(atPosition = 7) {
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
				thing87s {
					text1 = "thing87 1"
					text2 = "thing87 2"
					text3 = "thing87 3"
					thing87(atPosition = 4) {
						text4 = "thing87 4"
					}
					text5 = "thing87 5"
					thing87(atPosition = 6) {
						text6 = "thing87 6"
						text6 = "thing87 6"
						text6 = "thing87 6"
					}
					thing87(atPosition = 7) {
						text7 = "thing87 7"
						text4 = "thing87 4"
						text7 = "thing87 7"
					}
					text8 = "thing87 8"
				}
			}
		}
	}

	@Test
	fun testThing87_2() = gwen {
		given {
			server stubs {
				get("/thing87") with json(testR.raw.repos)
			}
			user launches { thing87sScreen("thing87") }
		}

		whenever {
			user selects {
				thing87s {
					action1()
					action2()
					action3()
					thing87(atPosition = 4) {
						action4()
					}
					action5()
					thing87(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing87(atPosition = 7) {
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
				thing87s {
					text1 = "thing87 1"
					text2 = "thing87 2"
					text3 = "thing87 3"
					thing87(atPosition = 4) {
						text4 = "thing87 4"
					}
					text5 = "thing87 5"
					thing87(atPosition = 6) {
						text6 = "thing87 6"
						text6 = "thing87 6"
						text6 = "thing87 6"
					}
					thing87(atPosition = 7) {
						text7 = "thing87 7"
						text4 = "thing87 4"
						text7 = "thing87 7"
					}
					text8 = "thing87 8"
				}
			}
		}
	}

	@Test
	fun testThing87_3() = gwen {
		given {
			server stubs {
				get("/thing87") with json(testR.raw.repos)
			}
			user launches { thing87sScreen("thing87") }
		}

		whenever {
			user selects {
				thing87s {
					action1()
					action2()
					action3()
					thing87(atPosition = 4) {
						action4()
					}
					action5()
					thing87(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing87(atPosition = 7) {
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
				thing87s {
					text1 = "thing87 1"
					text2 = "thing87 2"
					text3 = "thing87 3"
					thing87(atPosition = 4) {
						text4 = "thing87 4"
					}
					text5 = "thing87 5"
					thing87(atPosition = 6) {
						text6 = "thing87 6"
						text6 = "thing87 6"
						text6 = "thing87 6"
					}
					thing87(atPosition = 7) {
						text7 = "thing87 7"
						text4 = "thing87 4"
						text7 = "thing87 7"
					}
					text8 = "thing87 8"
				}
			}
		}
	}

	@Test
	fun testThing87_4() = gwen {
		given {
			server stubs {
				get("/thing87") with json(testR.raw.repos)
			}
			user launches { thing87sScreen("thing87") }
		}

		whenever {
			user selects {
				thing87s {
					action1()
					action2()
					action3()
					thing87(atPosition = 4) {
						action4()
					}
					action5()
					thing87(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing87(atPosition = 7) {
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
				thing87s {
					text1 = "thing87 1"
					text2 = "thing87 2"
					text3 = "thing87 3"
					thing87(atPosition = 4) {
						text4 = "thing87 4"
					}
					text5 = "thing87 5"
					thing87(atPosition = 6) {
						text6 = "thing87 6"
						text6 = "thing87 6"
						text6 = "thing87 6"
					}
					thing87(atPosition = 7) {
						text7 = "thing87 7"
						text4 = "thing87 4"
						text7 = "thing87 7"
					}
					text8 = "thing87 8"
				}
			}
		}
	}

	@Test
	fun testThing87_5() = gwen {
		given {
			server stubs {
				get("/thing87") with json(testR.raw.repos)
			}
			user launches { thing87sScreen("thing87") }
		}

		whenever {
			user selects {
				thing87s {
					action1()
					action2()
					action3()
					thing87(atPosition = 4) {
						action4()
					}
					action5()
					thing87(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing87(atPosition = 7) {
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
				thing87s {
					text1 = "thing87 1"
					text2 = "thing87 2"
					text3 = "thing87 3"
					thing87(atPosition = 4) {
						text4 = "thing87 4"
					}
					text5 = "thing87 5"
					thing87(atPosition = 6) {
						text6 = "thing87 6"
						text6 = "thing87 6"
						text6 = "thing87 6"
					}
					thing87(atPosition = 7) {
						text7 = "thing87 7"
						text4 = "thing87 4"
						text7 = "thing87 7"
					}
					text8 = "thing87 8"
				}
			}
		}
	}
}
