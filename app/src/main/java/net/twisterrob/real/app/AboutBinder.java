package net.twisterrob.real.app;

import dagger.Component;

import net.twisterrob.real.about.AboutComponent;
import net.twisterrob.real.about.AboutModule;

@Component(modules = AboutModule.class)
public interface AboutBinder extends AboutComponent {

	@Component.Builder interface Builder extends AboutComponent.Builder<AboutBinder, Builder> {

	}
}
