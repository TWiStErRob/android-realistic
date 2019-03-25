package net.twisterrob.real.about;

import android.content.Context;
import android.view.View;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public interface AboutModule {

	@Binds
	Context bindContext(AboutActivity impl);

	@Provides
	static View bindRootView(AboutActivity impl) {
		return impl.root;
	}

	@Binds
	AboutContract.View bindView(AboutView impl);

	@Binds
	AboutContract.Presenter bindPresenter(AboutPresenter impl);
}
