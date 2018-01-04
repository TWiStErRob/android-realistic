package net.twisterrob.real.about;

import android.content.Context;
import android.view.View;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AboutModule.class)
public interface AboutComponent {

	void inject(AboutActivity target);

	@Component.Builder 
	interface Builder {

		@BindsInstance
		Builder context(Context context);

		@BindsInstance
		Builder rootView(View root);

		AboutComponent build();
	}
}
