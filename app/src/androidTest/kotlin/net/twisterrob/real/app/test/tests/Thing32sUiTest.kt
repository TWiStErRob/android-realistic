package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.thing32.thing32s
import net.twisterrob.real.app.test.dsls.thing32.thing32sScreen
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
class Thing32Test : UiTest() {

	@Test
	fun testThing32_1() = gwen {
		given {
			server stubs {
				get("/thing32") with json(testR.raw.repos)
			}
			user launches { thing32sScreen("thing32") }
		}

		whenever {
			user selects {
				thing32s {
					action1()
					action2()
					action3()
					thing32(atPosition = 4) {
						action4()
					}
					action5()
					thing32(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing32(atPosition = 7) {
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
				thing32s {
					text1 = "thing32 1"
					text2 = "thing32 2"
					text3 = "thing32 3"
					thing32(atPosition = 4) {
						text4 = "thing32 4"
					}
					text5 = "thing32 5"
					thing32(atPosition = 6) {
						text6 = "thing32 6"
						text6 = "thing32 6"
						text6 = "thing32 6"
					}
					thing32(atPosition = 7) {
						text7 = "thing32 7"
						text4 = "thing32 4"
						text7 = "thing32 7"
					}
					text8 = "thing32 8"
				}
			}
		}
	}

	@Test
	fun testThing32_2() = gwen {
		given {
			server stubs {
				get("/thing32") with json(testR.raw.repos)
			}
			user launches { thing32sScreen("thing32") }
		}

		whenever {
			user selects {
				thing32s {
					action1()
					action2()
					action3()
					thing32(atPosition = 4) {
						action4()
					}
					action5()
					thing32(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing32(atPosition = 7) {
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
				thing32s {
					text1 = "thing32 1"
					text2 = "thing32 2"
					text3 = "thing32 3"
					thing32(atPosition = 4) {
						text4 = "thing32 4"
					}
					text5 = "thing32 5"
					thing32(atPosition = 6) {
						text6 = "thing32 6"
						text6 = "thing32 6"
						text6 = "thing32 6"
					}
					thing32(atPosition = 7) {
						text7 = "thing32 7"
						text4 = "thing32 4"
						text7 = "thing32 7"
					}
					text8 = "thing32 8"
				}
			}
		}
	}

	@Test
	fun testThing32_3() = gwen {
		given {
			server stubs {
				get("/thing32") with json(testR.raw.repos)
			}
			user launches { thing32sScreen("thing32") }
		}

		whenever {
			user selects {
				thing32s {
					action1()
					action2()
					action3()
					thing32(atPosition = 4) {
						action4()
					}
					action5()
					thing32(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing32(atPosition = 7) {
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
				thing32s {
					text1 = "thing32 1"
					text2 = "thing32 2"
					text3 = "thing32 3"
					thing32(atPosition = 4) {
						text4 = "thing32 4"
					}
					text5 = "thing32 5"
					thing32(atPosition = 6) {
						text6 = "thing32 6"
						text6 = "thing32 6"
						text6 = "thing32 6"
					}
					thing32(atPosition = 7) {
						text7 = "thing32 7"
						text4 = "thing32 4"
						text7 = "thing32 7"
					}
					text8 = "thing32 8"
				}
			}
		}
	}

	@Test
	fun testThing32_4() = gwen {
		given {
			server stubs {
				get("/thing32") with json(testR.raw.repos)
			}
			user launches { thing32sScreen("thing32") }
		}

		whenever {
			user selects {
				thing32s {
					action1()
					action2()
					action3()
					thing32(atPosition = 4) {
						action4()
					}
					action5()
					thing32(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing32(atPosition = 7) {
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
				thing32s {
					text1 = "thing32 1"
					text2 = "thing32 2"
					text3 = "thing32 3"
					thing32(atPosition = 4) {
						text4 = "thing32 4"
					}
					text5 = "thing32 5"
					thing32(atPosition = 6) {
						text6 = "thing32 6"
						text6 = "thing32 6"
						text6 = "thing32 6"
					}
					thing32(atPosition = 7) {
						text7 = "thing32 7"
						text4 = "thing32 4"
						text7 = "thing32 7"
					}
					text8 = "thing32 8"
				}
			}
		}
	}

	@Test
	fun testThing32_5() = gwen {
		given {
			server stubs {
				get("/thing32") with json(testR.raw.repos)
			}
			user launches { thing32sScreen("thing32") }
		}

		whenever {
			user selects {
				thing32s {
					action1()
					action2()
					action3()
					thing32(atPosition = 4) {
						action4()
					}
					action5()
					thing32(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					thing32(atPosition = 7) {
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
				thing32s {
					text1 = "thing32 1"
					text2 = "thing32 2"
					text3 = "thing32 3"
					thing32(atPosition = 4) {
						text4 = "thing32 4"
					}
					text5 = "thing32 5"
					thing32(atPosition = 6) {
						text6 = "thing32 6"
						text6 = "thing32 6"
						text6 = "thing32 6"
					}
					thing32(atPosition = 7) {
						text7 = "thing32 7"
						text4 = "thing32 4"
						text7 = "thing32 7"
					}
					text8 = "thing32 8"
				}
			}
		}
	}
}
