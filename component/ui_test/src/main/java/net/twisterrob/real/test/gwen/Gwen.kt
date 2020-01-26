package net.twisterrob.real.test.gwen

import androidx.test.espresso.Espresso
import net.twisterrob.real.test.DSL

/**
 * DSL type to restrict usages of [given], [whenever] and [then] to a top-level scope.
 * Trying to call without a scope would look like `Gwen.given` or `this@gwen.given`, which is easy to spot.
 *
 * @see gwen
 */
@DSL
object Gwen

/**
 * Wrapper method so we can have a Gwen context and constrain what's possible inside it.
 * It also clearly signifies that this test is written in a GivenWhenThen-style:
 * ```
 * @Test fun testSomething() = gwen {
 *     given { … }
 *     whenever { … }
 *     then { … }
 * }
 * ```
 * _Note_: the only difference from a normal test method is `= gwen`.
 * We decided to restrict [given] [whenever] and [then] to only work inside [gwen]
 * so we have more control over the [DSL].
 */
inline fun gwen(block: Gwen.() -> Unit) {
	// Loop the main thread until...
	// - the main looper is idle
	// - all AsyncTasks have finished
	// - all idling resources have become idle
	// This guarantees that any async work that's been kicked off in the application's onCreate()
	// has completed before the actual test starts to run.
	Espresso.onIdle()
	block(Gwen)
}

@DSL
object Arranger

inline fun Gwen.given(block: Arranger.() -> Unit) = block(Arranger)

@DSL
object Actor

inline fun Gwen.whenever(block: Actor.() -> Unit) = block(Actor)

@DSL
object Asserter

inline fun Gwen.then(block: Asserter.() -> Unit) = block(Asserter)
