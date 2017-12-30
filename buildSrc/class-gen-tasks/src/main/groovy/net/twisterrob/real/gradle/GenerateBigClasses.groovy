package net.twisterrob.real.gradle

import groovy.transform.CompileStatic
import net.twisterrob.real.gen.BigClassGenerator
import org.gradle.api.*
import org.gradle.api.tasks.*
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.compile.JavaCompile

/**
 * [big-gen] Gradle task to create a .jar file from the generated classes,
 * so it's easy to consume via {@code implementation fileTree(dir: 'libs', include: '*.jar')}.
 */
@CompileStatic
class GenerateBigClasses extends Jar {

	@Input
	String packageName

	Task configure(Closure closure) {
		def result = super.configure(closure)
		if (baseName == null) {
			throw new IllegalStateException("Missing baseName")
		}
		if (packageName == null) {
			throw new IllegalStateException("Missing packageName")
		}
		def temp = new File(project.buildDir, "generated/source/${baseName}")
		def compileClassesTask = project.tasks.create("compile${baseName.capitalize()}", JavaCompile) {
			it.source project.fileTree(temp)
			it.include '**/*.java'
			it.destinationDir = temp
			it.classpath = project.files()
			it.options.incremental = true
			it.sourceCompatibility = JavaVersion.VERSION_1_8
			it.targetCompatibility = JavaVersion.VERSION_1_8
			it
		}
		2.times { i ->
			def className = "${baseName.capitalize()}${i + 1}"
			def generateClass = project.tasks.create("generate${className}", GenTask) {
				it.packageName = packageName
				it.className = className
				it.fileName = new File(temp, "${className}.java")
				it
			}
			compileClassesTask.dependsOn generateClass
		}

		from compileClassesTask
		include '**/*.class'
		return result
	}

	/**
	 * Gradle's way of dealing with input and outputs. Using these annotations helps Gradle
	 * figure out if the task is up to date, and makes incremental builds faster.
	 */
	static class GenTask extends DefaultTask {

		@Input
		String packageName

		@Input
		String className

		@Input
		int numberOfMethods = 32768

		@OutputFile
		File fileName

		@TaskAction
		def generateClass() {
			fileName.withWriter {
				BigClassGenerator.generate(it, packageName, className, numberOfMethods)
			}
		}
	}
}
