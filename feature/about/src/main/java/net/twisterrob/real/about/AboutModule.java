package net.twisterrob.real.about;

import dagger.Binds;
import dagger.Module;

@Module
public interface AboutModule {

	@Binds
	AboutContract.View bindView(AboutView impl);

	@Binds
	AboutContract.Presenter bindPresenter(AboutPresenter impl);
}
