package net.twisterrob.real.repo;

import android.app.Activity;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public interface RepoModule {

	@Binds
	Context bindContext(RepoActivity impl);

	@Binds
	Activity bindActivity(RepoActivity impl);

	@Binds
	RepoContract.View bindView(RepoView impl);

	@Binds
	RepoContract.Presenter bindPresenter(RepoPresenter impl);
}
