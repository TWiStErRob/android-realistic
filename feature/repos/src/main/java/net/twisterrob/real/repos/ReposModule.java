package net.twisterrob.real.repos;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import net.twisterrob.real.configuration.AppConfigurator;
import net.twisterrob.real.repos.server.RepositoryRetrofitService;
import net.twisterrob.real.repos.ui.ReposActivity;
import net.twisterrob.real.repos.ui.ReposActivityContract;
import net.twisterrob.real.repos.ui.ReposActivityPresenter;
import net.twisterrob.real.repos.ui.ReposContract;
import net.twisterrob.real.repos.ui.ReposListContract;
import net.twisterrob.real.repos.ui.ReposListPresenter;
import net.twisterrob.real.repos.ui.ReposListView;
import net.twisterrob.real.repos.ui.ReposPresenter;
import net.twisterrob.real.repos.ui.ReposView;

@Module
public interface ReposModule {

	@Binds
	Context bindContext(ReposActivity impl);

	@Provides
	static Resources provideResources(Context impl) {
		return impl.getResources();
	}

	@Provides
	static View bindRootView(ReposActivity impl) {
		return impl.root;
	}

	@Binds
	ReposContract.View bindView(ReposView impl);

	@Binds
	ReposListContract.View bindListView(ReposListView impl);

	@Binds
	ReposActivityContract.Presenter provideActivityPresenter(ReposActivityPresenter impl);

	@Provides
	static ReposContract.Presenter providePresenter(ReposPresenter impl) {
		impl.init();
		return impl;
	}

	@Provides
	static ReposListContract.Presenter provideListPresenter(ReposListPresenter impl) {
		impl.init();
		return impl;
	}

	@Binds
	ReposListContract.Interactions provideListInteractions(ReposActivityPresenter impl);

	@Provides
	static Retrofit provideGithubRetrofit(Lazy<OkHttpClient> okHttpClient, AppConfigurator config) {
		return new Retrofit.Builder()
				.baseUrl(config.getConfiguration().getGithubApiUrl())
				.callFactory(request -> okHttpClient.get().newCall(request))
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
				.build();
	}

	@Provides
	static RepositoryRetrofitService provideRetrofit(Retrofit retrofit) {
		return retrofit.create(RepositoryRetrofitService.class);
	}
}
