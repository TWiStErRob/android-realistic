package net.twisterrob.real.repo;

import javax.inject.Inject;

import android.app.Activity;

import androidx.annotation.NonNull;

public class RepoView implements RepoContract.View {

	private final @NonNull Activity activity;

	@Inject
	public RepoView(@NonNull Activity activity) {
		this.activity = activity;
	}

	@Override public void setHeader(@NonNull String repoName) {
		activity.setTitle(repoName);
	}
}
