package net.twisterrob.real.repo;

import javax.inject.Inject;

import android.support.annotation.NonNull;

public class RepoPresenter implements RepoContract.Presenter {

	private final @NonNull RepoContract.View view;

	@Inject
	public RepoPresenter(
			@NonNull RepoContract.View view
	) {
		this.view = view;
	}

	@Override public void bind(@NonNull String repoName) {
		view.setHeader(repoName);
	}
}
