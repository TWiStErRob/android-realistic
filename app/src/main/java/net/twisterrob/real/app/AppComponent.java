package net.twisterrob.real.app;

import javax.inject.Singleton;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

import net.twisterrob.real.about.AboutActivity;
import net.twisterrob.real.about.AboutContractModule;
import net.twisterrob.real.about.AboutModule;
import net.twisterrob.real.app.AppComponent.AndroidInjectors;
import net.twisterrob.real.app.AppComponent.AppModule;
import net.twisterrob.real.configuration.AppConfigurator;
import net.twisterrob.real.main.MainActivity;
import net.twisterrob.real.main.MainModule;

@Component(modules = {
		AndroidInjectionModule.class, // [dagger-android]
		AndroidSupportInjectionModule.class, // [dagger-android]
		AppModule.class,
		AndroidInjectors.class
})
@Singleton
public interface AppComponent {

	void inject(App target);

	AppConfigurator provideConfigurator();

	@Component.Builder interface Builder {

		@BindsInstance Builder application(Application instance);

		AppComponent build();
	}

	@Module abstract class AppModule {

		@Provides
		@Singleton
		static AppConfigurator appConfigurator() {
			return new AppConfigurator(new ProdConfiguration());
		}
	}

	@Module interface AndroidInjectors { // [dagger-android]

		@ContributesAndroidInjector(modules = {MainModule.class, AboutContractModule.class})
		MainActivity bindMainActivity();

		@ContributesAndroidInjector(modules = AboutModule.class)
		AboutActivity bindAboutActivity();
	}
}
