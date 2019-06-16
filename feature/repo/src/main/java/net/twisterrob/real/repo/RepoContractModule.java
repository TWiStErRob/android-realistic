package net.twisterrob.real.repo;

import dagger.Binds;
import dagger.Module;

import net.twisterrob.real.about.contract.RepoScreenFactory;

@Module
public interface RepoContractModule {

	@Binds
	RepoScreenFactory screenFactory(RepoScreenFactoryImpl impl);
}
