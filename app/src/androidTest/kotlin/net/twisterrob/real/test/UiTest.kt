package net.twisterrob.real.test

import android.support.test.rule.GrantPermissionRule
import android.support.test.runner.AndroidJUnit4
import net.twisterrob.real.test.collaborator.Device
import net.twisterrob.real.test.collaborator.Server
import org.junit.ClassRule
import org.junit.Rule
import org.junit.rules.RuleChain
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class UiTest {

	@DSL
	companion object {

		@[ClassRule JvmField]
		val classRules: RuleChain = RuleChain
			.emptyRuleChain()
			.around(GrantPermissionRule.grant(android.Manifest.permission.INTERNET))
	}

	@[Rule JvmField]
	val testRules: RuleChain = RuleChain
		.emptyRuleChain()
		.around(Server)
		.around(Device)
}
