package net.twisterrob.real.about;

import dagger.Binds;
import dagger.Module;

import net.twisterrob.real.about.contract.AboutScreenFactory;

@Module
public interface AboutContractModule {

	@Binds AboutScreenFactory screenFactory(AboutScreenFactoryImpl impl);
}
