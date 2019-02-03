package net.twisterrob.real.gradle

import groovy.transform.CompileStatic
import org.gradle.testkit.runner.TaskOutcome
import org.intellij.lang.annotations.Language
import org.junit.*

import java.util.jar.*

/**
 * To run this test from Android Studio, run it as usual,
 * but edit the "Gradle-aware Make" to run {@code classes testClasses} tasks.
 * <br>
 * To run this test from IntelliJ IDEA, run it as usual,
 * but first set: "Build, Execution, Deployment > Build Tools > Gradle > Runner > Run tests using:" in Settings
 * to "Gradle Test Runner"
 */
@CompileStatic
class GenerateBigClassesTest {

	@Rule public final GradleRunnerRule gradle = new GradleRunnerRule()

	@Test void "missing baseName"() {
		given:
		@Language('gradle')
		def script = """
			task('testTask', type: ${GenerateBigClasses.name}) {
				//baseName = 'something'
				packageName = 'something'
			}
		""".stripIndent()

		when:
		def result = gradle.run(script, 'testTask').buildAndFail()

		then:
		assert result.output.contains('Missing baseName')
	}

	@Test void "missing packageName"() {
		given:
		@Language('gradle')
		def script = """
			task('testTask', type: ${GenerateBigClasses.name}) {
				baseName = 'something'
				//packageName = 'something'
			}
		""".stripIndent()

		when:
		def result = gradle.run(script, 'testTask').buildAndFail()

		then:
		assert result.output.contains('Missing packageName')
	}

	@Test void "successful build generates jar with expected files"() {
		given:
		def outputDirectory = new File(gradle.runner.projectDir, 'output');
		@Language('gradle')
		def script = """
			task('testTask', type: ${GenerateBigClasses.name}) {
				baseName = 'base'
				packageName = 'pack.age'
				destinationDir file(\$/${outputDirectory.absolutePath}/\$)
			}
		""".stripIndent()

		when:
		def result = gradle.run(script, 'testTask').build()

		then:
		assert result.task(':testTask').outcome == TaskOutcome.SUCCESS
		def jarFile = new JarFile(new File(outputDirectory, 'base.jar'))
		def entries = jarFile.entries().toList()
		assert entries.grep { JarEntry entry -> entry.name.contains('.java') }.isEmpty()
		def fileEntries = entries.grep { JarEntry entry -> !entry.name.endsWith('/') }
		assert fileEntries*.name == [ 'META-INF/MANIFEST.MF', 'pack/age/Base1.class', 'pack/age/Base2.class' ]
		assert jarFile.getEntry('pack/age/Base1.class').size > 0
		assert jarFile.getEntry('pack/age/Base2.class').size > 0
	}

	@Test void "incremental build does not rebuild unnecessarily"() {
		given:
		def outputDirectory = new File(gradle.runner.projectDir, 'output');
		@Language('gradle')
		def script = """
			task('testTask', type: ${GenerateBigClasses.name}) {
				baseName = 'base'
				packageName = 'pack.age'
				destinationDir file(\$/${outputDirectory.absolutePath}/\$)
			}
		""".stripIndent()
		def result = gradle.run(script, 'testTask').build()
		assert result.task(':testTask').outcome == TaskOutcome.SUCCESS

		when:
		def resultIncremental = gradle.runner.withArguments('testTask').build()

		then:
		assert resultIncremental.task(':testTask').outcome == TaskOutcome.UP_TO_DATE
	}
}
