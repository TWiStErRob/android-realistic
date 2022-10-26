```kotlin
(1..100).forEach { counter ->
	println("Writing $counter...")
	val module = java.io.File("c:\\dev\\code\\android-realistic\\app")
	val pack = module.resolve("src/androidTest/kotlin/net/twisterrob/real/app/test")
	val dslTemplate = pack.resolve("__name__/DSL.kt").readText()
	val testTemplate = pack.resolve("tests/__Name__sUiTest.kt").readText()

	val dsl = dslTemplate
		.replace("__name__", "thing$counter")
		.replace("__Name__", "Thing$counter")
	val test = testTemplate
		.replace("__name__", "thing$counter")
		.replace("__Name__", "Thing$counter")

	pack.resolve("dsls/thing$counter/DSL.kt")
		.also { it.parentFile.mkdirs() }
		.writeText(dsl)

	pack.resolve("Thing${counter}sUiTest.kt")
		.also { it.parentFile.mkdirs() }
		.writeText(test)
}
```
