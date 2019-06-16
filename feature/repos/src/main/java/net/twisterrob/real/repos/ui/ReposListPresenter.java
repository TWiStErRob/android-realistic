package net.twisterrob.real.repos.ui;

import java.util.List;

import javax.inject.Inject;

import android.support.annotation.NonNull;

public class ReposListPresenter implements
		ReposListContract.Presenter,
		ReposListContract.ViewPresenter {

	private final @NonNull ReposListContract.View view;
	private final @NonNull ReposListContract.Interactions interactions;

	@Inject
	public ReposListPresenter(
			@NonNull ReposListContract.View view,
			@NonNull ReposListContract.Interactions interactions) {
		this.view = view;
		this.interactions = interactions;
	}

	@Override public void init() {
		view.setPresenter(this);
	}

	@Override public void show(@NonNull List<RepositoryModel> repos) {
		view.bind(repos);
	}

	@Override public void openDetails(@NonNull RepositoryModel repo) {
		interactions.showDetails(repo);
	}

	@Override public void openBrowser(@NonNull RepositoryModel repo) {
		interactions.showBrowser(repo);
	}
}
