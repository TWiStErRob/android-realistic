package net.twisterrob.real.gradle

import groovy.transform.CompileStatic
import org.gradle.testkit.runner.GradleRunner
import org.intellij.lang.annotations.Language
import org.junit.rules.*
import org.junit.runner.Description
import org.junit.runners.model.Statement

/**
 * Simplified {@link org.junit.Rule} around {@link GradleRunner} to reduce code repetition.
 */
@CompileStatic
class GradleRunnerRule implements TestRule {

	private final TemporaryFolder temp = new TemporaryFolder()
	private File buildFile

	GradleRunner runner

	@Override
	Statement apply(Statement base, Description description) {
		def setUpTestProject = new Statement() {
			@Override
			void evaluate() {
				setUp()
				base.evaluate()
			}
		}
		// by applying this other rule around our statement we get the temp folder before our code is called
		return temp.apply(setUpTestProject, description)
	}

	/*@Before*/
	private void setUp() {
		buildFile = temp.newFile('build.gradle')
		runner = GradleRunner
				.create()
				.forwardOutput()
				.withProjectDir(temp.root)
				.withPluginClasspath()
		// [build-test] withPluginClasspath is not enough by itself, needs some hacky `classpath files()` to run
		fixClassPath(runner)
	}

	/*@Test*/
	GradleRunner run(@Language("gradle") String script, String... tasks) {
		buildFile << script
		def args = tasks + [ '--stacktrace' ]
		println """
				Running `gradle ${args}` on ${buildFile.absolutePath}:
				```gradle
${buildFile.text.trim().split('\n').collect { '\t\t\t\t\t' + it }.join('\n')}
				```
			""".stripIndent()
		return runner.withArguments(args)
	}

	/**
	 * This is a workaround because runner.withPluginClasspath() doesn't seem to work.
	 */
	private static void fixClassPath(GradleRunner runner) {
		def buildFile = new File(runner.projectDir, 'build.gradle')
		def classPaths = runner
				.pluginClasspath
				.collect { "\t\t\t\t\tclasspath files(\$/${it.absolutePath}/\$)" }
				.join('\n')
		@Language("gradle")
		def buildscript = """
			buildscript {
				dependencies {
${classPaths}
				}
			}
		""".stripIndent()
		buildFile << buildscript
	}
}
