package net.twisterrob.real.app;

import dagger.Component;

import net.twisterrob.real.about.AboutContractModule;
import net.twisterrob.real.main.MainComponent;
import net.twisterrob.real.main.MainModule;

@Component(modules = {MainModule.class, AboutContractModule.class})
public interface MainBinder extends MainComponent {

	@Component.Builder interface Builder extends MainComponent.Builder<MainBinder, Builder> {

	}
}
