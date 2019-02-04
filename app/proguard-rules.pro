-keepclassmembernames class butterknife.ButterKnife { java.util.Map BINDINGS; }

-keepattributes SourceFile,LineNumberTable
#-dontoptimize
#-dontshrink
#-dontobfuscate

#-whyareyoukeeping interface net.twisterrob.real.app.MainBinder
#-whyareyoukeeping public class net.twisterrob.real.app.DaggerMainBinder

# Keep annotation to be able to match it below
-keep class dagger.Component
# Keep the names of the Component interfaces so we can prefix them with "Dagger"
-keepnames @dagger.Component interface **
# Keep the names of the generated Component implementations so the prefixed lookup succeeds
-keepnames class ** implements @dagger.Component **
# Keep the builder() method in the generated Component to reflectively call it
-keepclassmembers class ** implements @dagger.Component ** {
	public static ** builder();
}
# Keep the builder() method in the generated Component to reflectively call it
-keepclassmembers class ** implements @dagger.Component ** {
	public static <2> create();
}
