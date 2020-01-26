package net.twisterrob.real.main;

import javax.inject.Inject;

import android.content.Context;

import androidx.annotation.NonNull;

import net.twisterrob.real.about.contract.AboutScreenFactory;
import net.twisterrob.real.about.contract.ReposScreenFactory;

public class MainNavigator {

	private final @NonNull Context context;
	private final @NonNull AboutScreenFactory about;
	private final @NonNull ReposScreenFactory repos;

	@Inject
	public MainNavigator(
			@NonNull Context context,
			@NonNull AboutScreenFactory about,
			@NonNull ReposScreenFactory repos
	) {
		this.context = context;
		this.about = about;
		this.repos = repos;
	}

	public void gotoAbout() {
		context.startActivity(about.launch());
	}

	public void gotoRepos() {
		context.startActivity(repos.launch());
	}
}
