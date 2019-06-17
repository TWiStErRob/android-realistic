package net.twisterrob.real.test.collaborator

import android.support.test.espresso.intent.Intents
import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.gwen.Arranger
import net.twisterrob.real.test.gwen.Asserter
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

val Arranger.device inline get() = Device
val Asserter.device inline get() = Device

@DSL
object Device : TestRule {

	override fun apply(base: Statement, description: Description) = object : Statement() {
		override fun evaluate() {
			try {
				Intents.init()
				base.evaluate()
			} catch (ex: Throwable) {
				// this would be simply `finally { Intents.release() }` but in that case we would hide the real cause
				try {
					Intents.release()
				} catch (intentEx: Throwable) {
					// Intents.release() failed, add cause and re-throw original
					intentEx.rootCause.initCause(ex)
					throw intentEx
				}
				// Intents.release() terminated correctly, re-throw root cause
				throw ex
			}
			// nothing failed yet, clean up (outside of try so we don't try to double-release)
			Intents.release()
		}

		inline val Throwable.rootCause: Throwable
			get() = generateSequence(this) { it.cause }.last()
	}

	/**
	 * Useful for blocking out [Intent](android.content.Intent)s via
	 * [Intents.indending](android.support.test.espresso.intent.Intents.intending)
	 * to make sure no external apps or screens are launched.
	 * See `IntentDSL.Kt` for methods.
	 */
	@DSL
	object ArrangeExpectations

	inline infix fun expects(block: ArrangeExpectations.() -> Unit) {
		block(ArrangeExpectations)
	}

	@DSL
	object ObservationAssertions

	inline infix fun observes(block: ObservationAssertions.() -> Unit) {
		block(ObservationAssertions)
	}
}
