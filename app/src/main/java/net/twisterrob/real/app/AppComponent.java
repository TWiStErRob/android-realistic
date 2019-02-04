package net.twisterrob.real.app;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

import net.twisterrob.real.about.AboutActivity;
import net.twisterrob.real.about.AboutContractModule;
import net.twisterrob.real.about.AboutModule;
import net.twisterrob.real.app.AppComponent.AndroidInjectors;
import net.twisterrob.real.main.MainActivity;
import net.twisterrob.real.main.MainModule;

@Component(modules = {
		AndroidInjectionModule.class,
		AndroidSupportInjectionModule.class,
		AndroidInjectors.class
})
public interface AppComponent {

	void inject(App target);

	@Component.Builder interface Builder {

		@BindsInstance Builder application(Application instance);

		AppComponent build();
	}

	@Module interface AndroidInjectors {

		@ContributesAndroidInjector(modules = {MainModule.class, AboutContractModule.class})
		MainActivity bindMainActivity();

		@ContributesAndroidInjector(modules = AboutModule.class)
		AboutActivity bindAboutActivity();
	}
}
