package net.twisterrob.real.test.rules

import com.linkedin.android.testbutler.TestButler
import net.twisterrob.real.test.assertAppIsInstalled
import org.junit.rules.ExternalResource

private const val TEST_BUTLER_PACKAGE = "com.linkedin.android.testbutler"

class TestButlerRule : ExternalResource() { // [test-butler]

	override fun before() {
		assertAppIsInstalled(TEST_BUTLER_PACKAGE) { "Test Butler is used, but not installed." }
		setAirplaneMode(true)
	}

	override fun after() {
		setAirplaneMode(false)
	}

	private fun setAirplaneMode(enabled: Boolean) {
		TestButler.setWifiState(!enabled)
		TestButler.setGsmState(!enabled)
	}
}
