package net.twisterrob.real.test.collaborator

import net.twisterrob.real.test.DSL
import net.twisterrob.real.test.gwen.Actor
import net.twisterrob.real.test.gwen.Arranger
import net.twisterrob.real.test.gwen.Asserter

val Arranger.user inline get() = User
val Actor.user inline get() = User
val Asserter.user inline get() = User

@DSL
object User {

	//inline operator fun invoke(block: User.() -> Unit) = block(this)

	@DSL
	object LaunchesActions

	inline infix fun launches(block: LaunchesActions.() -> Unit) = block(LaunchesActions)

	@DSL
	object SelectsActions

	inline infix fun selects(block: SelectsActions.() -> Unit) = block(SelectsActions)

	@DSL
	object TypesActions

	inline infix fun types(block: TypesActions.() -> Unit) = block(TypesActions)

	@DSL
	object SeesAssertions

	inline infix fun sees(block: SeesAssertions.() -> Unit) = block(SeesAssertions)
}
