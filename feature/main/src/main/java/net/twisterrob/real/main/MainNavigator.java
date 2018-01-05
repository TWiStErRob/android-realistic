package net.twisterrob.real.main;

import javax.inject.Inject;

import android.content.Context;
import android.support.annotation.NonNull;

import net.twisterrob.real.about.contract.AboutScreenFactory;

public class MainNavigator {

	private final @NonNull Context context;
	private final @NonNull AboutScreenFactory about;

	@Inject
	public MainNavigator(
			@NonNull Context context,
			@NonNull AboutScreenFactory about
	) {
		this.context = context;
		this.about = about;
	}

	public void gotoAbout() {
		context.startActivity(about.launch());
	}
}
