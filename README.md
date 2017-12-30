This is an Android project example with real-life tools and problems solved. It strives to demonstrate best practices over over-simplified examples and God-activities / single-gradle build files; let's face it those are useful, but sometimes it's hard to integrate/scale them into a real project. By using `[marker]`s I'll try to link pieces together and document each marker in this `README.md`. Use `grep` or IDEA's *Edit > Find > Find in path...* as a navigation tool to connect the dots.

See the *Glossary* and *FAQ* if something is not clear.

## Goals
 * Mimic real project structure
 * Promote and accumulate best practices, explain benefits
 * Over-document everything in this repo  
   (not necessary to replicate this in any project as this is a documentation repo)
 * Use real libraries, tools, plugins (and a lot of them)
 * Use multiple languages (where possible, to demonstrate it's possible to deal with legacy code)
 * Test everything
 * Minimize project setup for team members
 * Minimize affected area for each modification by using fine-grained modules (also increases knowledge of dependencies, and inability to mis-use dependencies/libraries)
 * Minimize incremental build times

## Structure
 * `.idea` (see `[share-ide]`)
 * `buildSrc` (see `[build-src]` and `[build-src-hack]`)
   * `:class-gen`
   * `:class-gen-tasks`
 * `gradle`
 * `:core`
 * `:feature`
   * `:f:about`
   * `:f:about-contract`
   * `:f:base`
   * `:f:main`
 * `:app`

## Setup

Everything is latest stable, no preview versions, unless absolutely gives a benefit.

 * Developed on Android Studio 3.0.1 and Gradle 4.2.1 (`gradle-wrapper.properties`)
 * SDK, language, tooling, plugin, library, etc. versions, see `gradle.properties`

## Decisions

 * Feature module package names don't include package, because it would be long and noisy  
   (`net.twisterrob.real.feature.main` VS `net.twisterrob.real.main`) 
 * Every module is `'com.android.library'` until I figure out what `.feature` is for  
   (it Lint warns about backup and icon, which I don't want to specify for feature modules)
 * `MainActivity` is its own feature, so that it can be decoupled from `app`  
   (May be premature optimization preparing for instant apps, but still a useful separation.)

## Opinionated decisions

 * In all Groovy (Gradle) files I use 'single' for hard-coded values and "GString" for interpolation.  
   This means that while reading Groovy code it's easy to see if my eye should look for `${}`
 * `VERSION_FOO` in `gradle.properties`  
   TODO "IntelliJ IDEA doesn't help either way"

## Pain points

Resolving any of these in a nice way is very welcome!  
**Please let me know, if you know how; even if just half a sentence!**

 * Navigator objects need to reference the classes by string names
   * Required to hide feature module implementation details
    (i.e. only contract classes visible to consumers)
   * Proguard-safe, because we're talking about activities which are kept because of AndroidManifest.xml
   * Not refactor-safe, because "find string occurrences" needs to be turned on in IDEA when renaming/repackaging activities
 * *Make Project* (hammer on toolbar) triggers `buildSrc` submodules by accident, failing to compile with message:
    > Information: `Gradle tasks [:app:assembleDebug, :class-gen:assemble, :class-gen-tasks:assemble]`  
    > Error:
    > ```
    > FAILURE: Build failed with an exception.
    >
    > * What went wrong:
    > Project 'class-gen' not found in root project 'real'.
    > ```
    `[build-src-hack]` https://issuetracker.google.com/issues/71422483
    To work around this error I included the `buildSrc` modules in the `rootProject`'s `settings.gradle` and relocated their source code. This lets AS run the `*:assemble` task to its heart content, it should be always `UP-TO-DATE` after first build, because it rarely changes.

## Aspect References
 * `[multidex]` https://developer.android.com/studio/build/multidex.html  
   Enable to use more than the dreaded 65536 method references.
 * `[big-gen]` generate some big classes to go over the dex limit fast, see also `[build-src]` on how this is achieved.
 * `[share-ide]`
   Sharing some, but not all `.idea` files is really useful in teams and open-source projects.
   * **It helps maintain the team standard** by catching issues early. For example: consider the cost of discovering and fixing an IDEA Inspection warning in the editor vs. a CI build failure after commit.
   * **It minimizes set-up time**: most things are in Gradle configuration already, but that's mostly for how to produce a binary from sources. To help describing how to produce sources from nothing we need to share Code style, Inspections, Lint, Pre-commit actions (auto-format, organize imports, etc.), Run configurations. I've seen companies having long documents detailing how to import all these one-by-one from Wiki-attachments, a better way is obvious: version control them with code.
   * All this is achieved by [clever `.gitignore` rules](https://stackoverflow.com/a/5534865/253468)
     * Since the files are version controlled any deviation from the standard is obvious, because they show up in GIT's staging area.
     * New files to "un-ignored" folders need to be added forcefully:

         > *`.idea/fileTemplates/includes $`* `git add "File Header.java"`  
         The following paths are ignored by one of your .gitignore files:  
         .idea/fileTemplates/includes/File Header.java  
         Use -f if you really want to add them.

       This is actually useful, so it's hard to accidentally commit local configuration.
   * *This approach has been stress-tested with a team of 15 Android developers using Android Studio [2.2-3.0.1] on Windows and different Mac machines.*
 * `[build-src]` https://docs.gradle.org/4.2.1/userguide/organizing_build_logic.html#sec%3Abuild_sources
   * To enable developing `buildSrc` in IDEA, import `buildSrc/build.gradle` as a separate standalone project.
     Developing as a standalone project enables more control, and faster iteration. Running JUnit tests are tricky when not editing buildSrc as a standalone project, so it's suggested to import it in a separate window.
     IDEA supports developing inline (as a module) as well, but build errors may be hard to figure out since any Gradle task executed from the IDE will need to build `buildSrc` first: chicken and egg. See also `[build-src-hack]`.
    

## Glossary
 * **Android**: a mobile platform building applications for smartphones
 * **Gradle**: a build system that helps combining multiple projects (modules) into a single build flow.
 * **Android Gradle Plugin** (**AGP**): a Gradle plugin that sets up project conventions for Android development and handles to heavy lifting of communicating with the Android SDK.
 * **Android Studio** (**AS**): an IDE by Google based on IntelliJ IDEA Community, specifically tailored for Android development.
 * IntellIJ **IDEA**: an IDE platform by JetBrains for polyglot software engineering. *I'll refer to IDEA in most places instead of AS to demonstrate that it's true if someone is using raw IntelliJ IDEA Community/Ultimate as their IDE.*
 * **module**: a gradle subproject used to hold a bit of functionality in the project. Self-contained: built, packaged, tested individually.
