package net.twisterrob.real.test.lifecycle

import net.twisterrob.real.app.AppComponent
import net.twisterrob.real.configuration.AppConfiguration
import net.twisterrob.real.test.collaborator.Server
import net.twisterrob.real.test.instrumentation.ApplicationLifecycleCallback
import net.twisterrob.real.test.instrumentation.TestApplication

class AppConfigurationApplicationLifecycleCallback : ApplicationLifecycleCallback {

	override fun onAppComponentReady(app: TestApplication, component: AppComponent) {
		component.provideConfigurator().configuration = TestConfiguration()
	}
}

private class TestConfiguration : AppConfiguration(
	githubApiUrl = Server.URL
)
