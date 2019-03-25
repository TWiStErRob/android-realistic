package net.twisterrob.real.app;

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
	}

	@Override public void onCreate() {
		super.onCreate();
		DaggerAppComponent.builder()
		                  .application(this)
		                  .build()
		                  .inject(this);
	}

	@Override
	public AndroidInjector<Activity> activityInjector() { // [dagger-android]
		return dispatchingActivityInjector;
	}
}
