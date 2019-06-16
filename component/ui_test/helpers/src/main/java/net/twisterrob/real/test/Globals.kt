package net.twisterrob.real.test

import android.app.Instrumentation
import android.content.Context
import android.content.res.Resources
import android.support.annotation.CheckResult
import android.support.test.InstrumentationRegistry

@get:CheckResult
val appContext: Context
	get() = InstrumentationRegistry.getTargetContext()
@get:CheckResult
val appResources: Resources
	get() = appContext.resources

@get:CheckResult
val instrumentation: Instrumentation
	get() = InstrumentationRegistry.getInstrumentation()

@get:CheckResult
val testContext: Context
	get() = instrumentation.context
@get:CheckResult
val testResources: Resources
	get() = testContext.resources

//@get:CheckResult
//val testApplication: TestApplication
//	get() = appContext.applicationContext as TestApplication
