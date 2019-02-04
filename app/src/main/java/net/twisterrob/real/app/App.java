package net.twisterrob.real.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.inject.Inject;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

	@Inject
	DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

	@Override protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(this); // [multidex]

		System.out.println("ButterKnife: " + ButterKnifeDetector.butterknifeBuild());
	}

	@Override public void onCreate() {
		super.onCreate();
		DaggerAppComponent.builder()
		                  .application(this)
		                  .build()
		                  .inject(this);
	}

	@Override
	public AndroidInjector<Activity> activityInjector() {
		return dispatchingActivityInjector;
	}
}

class ButterKnifeDetector {

	@SuppressWarnings("StaticMethodOnlyUsedInOneClass")
	static String butterknifeBuild() {
		if (isButterKnifeReal() && isButterKnifeReflect()) {
			return "inconclusive";
		} else if (isButterKnifeReal()) {
			return "compiled";
		} else if (isButterKnifeReflect()) {
			return "reflect";
		} else {
			return "none";
		}
	}

	private static boolean isButterKnifeReal() {
		try {
			Class<?> ButterKnife = Class.forName("butterknife.ButterKnife");
			@SuppressWarnings("unused")
			Field BINDINGS = ButterKnife.getDeclaredField("BINDINGS");
			return true;
		} catch (ClassNotFoundException ignored) {
		} catch (NoSuchFieldException ignored) {
		}
		return false;
	}

	private static boolean isButterKnifeReflect() {
		try {
			Class<?> ButterKnife = Class.forName("butterknife.ButterKnife");
			@SuppressWarnings({"unused", "JavaReflectionMemberAccess"})
			Method trySet = ButterKnife.getDeclaredMethod("trySet", Field.class, Object.class, Object.class);
			return true;
		} catch (ClassNotFoundException ignored) {
		} catch (NoSuchMethodException ignored) {
		}
		return false;
	}
}
