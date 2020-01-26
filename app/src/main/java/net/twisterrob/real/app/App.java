package net.twisterrob.real.app;

import javax.inject.Inject;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

import androidx.annotation.NonNull;
import androidx.multidex.MultiDex;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {

	@Inject
	DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

	@Inject
	AppComponent appComponent;

	@Override protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(this); // [multidex]
	}

	@Override public void onCreate() {
		super.onCreate();
		Stetho.initializeWithDefaults(this); // [stetho]
		createAppComponent().inject(this);
	}

	protected @NonNull AppComponent createAppComponent() {
		return DaggerAppComponent.builder()
		                         .application(this)
		                         .build();
	}

	public @NonNull AppComponent getAppComponent() {
		return appComponent;
	}

	@Override
	public AndroidInjector<Object> androidInjector() { // [dagger-android]
		return dispatchingAndroidInjector;
	}
}
