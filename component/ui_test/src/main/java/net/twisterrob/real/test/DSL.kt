package net.twisterrob.real.test

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@DslMarker
@Target(AnnotationTarget.CLASS)
annotation class DSL

fun <R, T> setOnly(block: (value: T) -> Unit): ReadWriteProperty<R, T> =
	object : ReadWriteProperty<R, T> {
		override fun getValue(thisRef: R, property: KProperty<*>): T {
			error("Property ${property.name} on ${thisRef} is write-only.")
		}

		override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
			block(value)
		}
	}
