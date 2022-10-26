package net.twisterrob.real.app.test

import androidx.test.filters.LargeTest
import net.twisterrob.real.app.test.dsls.__name__.__name__s
import net.twisterrob.real.app.test.dsls.__name__.__name__sScreen
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
class __Name__Test : UiTest() {

	@Test
	fun test__Name___1() = gwen {
		given {
			server stubs {
				get("/__name__") with json(testR.raw.repos)
			}
			user launches { __name__sScreen("__name__") }
		}

		whenever {
			user selects {
				__name__s {
					action1()
					action2()
					action3()
					__name__(atPosition = 4) {
						action4()
					}
					action5()
					__name__(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					__name__(atPosition = 7) {
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
				__name__s {
					text1 = "__name__ 1"
					text2 = "__name__ 2"
					text3 = "__name__ 3"
					__name__(atPosition = 4) {
						text4 = "__name__ 4"
					}
					text5 = "__name__ 5"
					__name__(atPosition = 6) {
						text6 = "__name__ 6"
						text6 = "__name__ 6"
						text6 = "__name__ 6"
					}
					__name__(atPosition = 7) {
						text7 = "__name__ 7"
						text4 = "__name__ 4"
						text7 = "__name__ 7"
					}
					text8 = "__name__ 8"
				}
			}
		}
	}

	@Test
	fun test__Name___2() = gwen {
		given {
			server stubs {
				get("/__name__") with json(testR.raw.repos)
			}
			user launches { __name__sScreen("__name__") }
		}

		whenever {
			user selects {
				__name__s {
					action1()
					action2()
					action3()
					__name__(atPosition = 4) {
						action4()
					}
					action5()
					__name__(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					__name__(atPosition = 7) {
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
				__name__s {
					text1 = "__name__ 1"
					text2 = "__name__ 2"
					text3 = "__name__ 3"
					__name__(atPosition = 4) {
						text4 = "__name__ 4"
					}
					text5 = "__name__ 5"
					__name__(atPosition = 6) {
						text6 = "__name__ 6"
						text6 = "__name__ 6"
						text6 = "__name__ 6"
					}
					__name__(atPosition = 7) {
						text7 = "__name__ 7"
						text4 = "__name__ 4"
						text7 = "__name__ 7"
					}
					text8 = "__name__ 8"
				}
			}
		}
	}

	@Test
	fun test__Name___3() = gwen {
		given {
			server stubs {
				get("/__name__") with json(testR.raw.repos)
			}
			user launches { __name__sScreen("__name__") }
		}

		whenever {
			user selects {
				__name__s {
					action1()
					action2()
					action3()
					__name__(atPosition = 4) {
						action4()
					}
					action5()
					__name__(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					__name__(atPosition = 7) {
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
				__name__s {
					text1 = "__name__ 1"
					text2 = "__name__ 2"
					text3 = "__name__ 3"
					__name__(atPosition = 4) {
						text4 = "__name__ 4"
					}
					text5 = "__name__ 5"
					__name__(atPosition = 6) {
						text6 = "__name__ 6"
						text6 = "__name__ 6"
						text6 = "__name__ 6"
					}
					__name__(atPosition = 7) {
						text7 = "__name__ 7"
						text4 = "__name__ 4"
						text7 = "__name__ 7"
					}
					text8 = "__name__ 8"
				}
			}
		}
	}

	@Test
	fun test__Name___4() = gwen {
		given {
			server stubs {
				get("/__name__") with json(testR.raw.repos)
			}
			user launches { __name__sScreen("__name__") }
		}

		whenever {
			user selects {
				__name__s {
					action1()
					action2()
					action3()
					__name__(atPosition = 4) {
						action4()
					}
					action5()
					__name__(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					__name__(atPosition = 7) {
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
				__name__s {
					text1 = "__name__ 1"
					text2 = "__name__ 2"
					text3 = "__name__ 3"
					__name__(atPosition = 4) {
						text4 = "__name__ 4"
					}
					text5 = "__name__ 5"
					__name__(atPosition = 6) {
						text6 = "__name__ 6"
						text6 = "__name__ 6"
						text6 = "__name__ 6"
					}
					__name__(atPosition = 7) {
						text7 = "__name__ 7"
						text4 = "__name__ 4"
						text7 = "__name__ 7"
					}
					text8 = "__name__ 8"
				}
			}
		}
	}

	@Test
	fun test__Name___5() = gwen {
		given {
			server stubs {
				get("/__name__") with json(testR.raw.repos)
			}
			user launches { __name__sScreen("__name__") }
		}

		whenever {
			user selects {
				__name__s {
					action1()
					action2()
					action3()
					__name__(atPosition = 4) {
						action4()
					}
					action5()
					__name__(atPosition = 6) {
						action6()
						action6()
						action6()
					}
					__name__(atPosition = 7) {
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
				__name__s {
					text1 = "__name__ 1"
					text2 = "__name__ 2"
					text3 = "__name__ 3"
					__name__(atPosition = 4) {
						text4 = "__name__ 4"
					}
					text5 = "__name__ 5"
					__name__(atPosition = 6) {
						text6 = "__name__ 6"
						text6 = "__name__ 6"
						text6 = "__name__ 6"
					}
					__name__(atPosition = 7) {
						text7 = "__name__ 7"
						text4 = "__name__ 4"
						text7 = "__name__ 7"
					}
					text8 = "__name__ 8"
				}
			}
		}
	}
}
