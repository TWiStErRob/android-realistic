package net.twisterrob.real.repos.ui;

import javax.inject.Inject;

import android.support.annotation.NonNull;

import net.twisterrob.real.repos.ReposNavigator;

public class ReposActivityPresenter implements
		ReposActivityContract.Presenter,
		ReposListContract.Interactions {

	private final @NonNull ReposNavigator navigator;

	@Inject
	public ReposActivityPresenter(
			@NonNull ReposNavigator navigator) {
		this.navigator = navigator;
	}

	@Override public void showDetails(@NonNull RepositoryModel repo) {
		navigator.gotoRepo(repo.name);
	}

	@Override public void showBrowser(@NonNull RepositoryModel repo) {
		navigator.openExternalBrowser(repo.webUrl);
	}
}
