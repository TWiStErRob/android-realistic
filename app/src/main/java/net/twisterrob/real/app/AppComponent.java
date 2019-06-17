package net.twisterrob.real.app;

import javax.inject.Singleton;

import android.app.Application;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import okhttp3.OkHttpClient;

import net.twisterrob.real.about.AboutActivity;
import net.twisterrob.real.about.AboutContractModule;
import net.twisterrob.real.about.AboutModule;
import net.twisterrob.real.app.AppComponent.AndroidInjectors;
import net.twisterrob.real.app.AppComponent.AppModule;
import net.twisterrob.real.configuration.AppConfigurator;
import net.twisterrob.real.main.MainActivity;
import net.twisterrob.real.main.MainModule;
import net.twisterrob.real.repo.RepoActivity;
import net.twisterrob.real.repo.RepoContractModule;
import net.twisterrob.real.repo.RepoModule;
import net.twisterrob.real.repos.ReposContractModule;
import net.twisterrob.real.repos.ReposModule;
import net.twisterrob.real.repos.ui.ReposActivity;

@Component(modules = {
		AndroidInjectionModule.class, // [dagger-android]
		AndroidSupportInjectionModule.class, // [dagger-android]
		AppModule.class,
		AndroidInjectors.class
})
@Singleton
public interface AppComponent {

	void inject(App target);

	OkHttpClient provideOkHttpClient();

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

		@Provides
		@Singleton
		static OkHttpClient httpClient() {
			// TODO background OkHttp trick
			//if (Looper.getMainLooper() == Looper.myLooper()) {
			//	throw new IllegalStateException("Initializing OkHttpClient on main thread, use Lazy<OkHttpClient>.");
			//}
			return new OkHttpClient.Builder()
					.addNetworkInterceptor(new StethoInterceptor()) // [stetho]
					.build();
		}
	}

	@Module interface AndroidInjectors { // [dagger-android]

		@ContributesAndroidInjector(modules = {MainModule.class, AboutContractModule.class, ReposContractModule.class})
		MainActivity bindMainActivity();

		@ContributesAndroidInjector(modules = AboutModule.class)
		AboutActivity bindAboutActivity();

		@ContributesAndroidInjector(modules = {ReposModule.class, RepoContractModule.class})
		ReposActivity bindReposActivity();

		@ContributesAndroidInjector(modules = RepoModule.class)
		RepoActivity bindRepoActivity();
	}
}
