package net.twisterrob.real.about;

import android.content.Context;
import android.view.View;

import dagger.BindsInstance;

public interface AboutComponent {

	void inject(AboutActivity target);

	interface Builder<COMPONENT extends AboutComponent, BUILDER extends Builder<COMPONENT, BUILDER>> {

		@BindsInstance
		BUILDER context(Context context);

		@BindsInstance
		BUILDER rootView(View root);

		COMPONENT build();
	}
}
