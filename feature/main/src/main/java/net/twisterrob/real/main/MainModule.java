package net.twisterrob.real.main;

import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public interface MainModule {

	@Binds
	Context bindContext(MainActivity impl);
}
