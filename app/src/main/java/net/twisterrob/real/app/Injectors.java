package net.twisterrob.real.app;

import android.content.Context;

import net.twisterrob.real.about.AboutActivity;
import net.twisterrob.real.main.MainActivity;

public class Injectors {

	@SuppressWarnings("StaticMethodOnlyUsedInOneClass")
	public static void init(Context context) {
		MainActivity.injector = () -> DaggerMainBinder
				.builder()
				.context(context)
				.build();

		AboutActivity.injector = rootView -> DaggerAboutBinder
				.builder()
				.context(context)
				.rootView(rootView)
				.build();
	}
}
