## Goals

## Structure


## Decisions

 * Feature module package names don't include package, because it would be long and noisy  
   (`net.twisterrob.real.feature.main` VS `net.twisterrob.real.main`) 
 * Every module is `'com.android.library'` until I figure out what `.feature` is for  
   (it Lint warns about backup and icon, which I don't want to specify for feature modules)
 * `MainActivity` is its own feature, so that it can be decoupled from `app`  
   (May be premature optimization preparing for instant apps, but still a useful separation.)

## Pain points

Resolving any of these in a nice way is very welcome, please let me know if you know how, even if just half a sentence.

 * Navigator objects need to reference the classes by string names
  * Required to hide feature module implementation details
    (i.e. only contract classes visible to consumers)
  * Proguard-safe, because we're talking about activities which are kept because of AndroidManifest.xml
  * Not refactor-safe, because "find string occurrences" needs to be turned on in IDEA when renaming/repackaging activities
