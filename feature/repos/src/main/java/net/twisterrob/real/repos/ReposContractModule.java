package net.twisterrob.real.repos;

import dagger.Binds;
import dagger.Module;

import net.twisterrob.real.about.contract.ReposScreenFactory;

@Module
public interface ReposContractModule {

	@Binds
	ReposScreenFactory screenFactory(ReposScreenFactoryImpl impl);
}
