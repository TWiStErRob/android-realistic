package net.twisterrob.real.app;

import android.content.Context;

import dagger.Dagger;

import net.twisterrob.real.about.AboutActivity;
import net.twisterrob.real.main.MainActivity;

public class Injectors {

	@SuppressWarnings("StaticMethodOnlyUsedInOneClass")
	public static void init(Context context) {
		MainActivity.injector = () -> Dagger.builder(MainBinder.Builder.class)
				.context(context)
				.build();

		AboutActivity.injector = rootView -> Dagger.builder(AboutBinder.Builder.class)
				.context(context)
				.rootView(rootView)
				.build();
	}
}
