package net.twisterrob.real.test.instrumentation

import net.twisterrob.real.app.App
import net.twisterrob.real.app.AppComponent

class TestApplication : App() {

	internal lateinit var appComponentInitialisationListener: (AppComponent) -> Unit

	override fun createAppComponent(): AppComponent {
		val appComponent = super.createAppComponent()
		appComponentInitialisationListener(appComponent)
		return appComponent
	}
}
