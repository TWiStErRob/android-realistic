package net.twisterrob.real.main;

import android.content.Context;
import android.support.annotation.NonNull;

import dagger.BindsInstance;

public interface MainComponent {

	void inject(MainActivity activity);

	interface Builder<COMPONENT extends MainComponent, BUILDER extends Builder<COMPONENT, BUILDER>> {

		@BindsInstance
		BUILDER context(@NonNull Context context);

		COMPONENT build();
	}
}
