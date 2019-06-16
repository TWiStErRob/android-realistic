package net.twisterrob.real.repo;

import javax.inject.Inject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import net.twisterrob.real.about.contract.RepoScreenFactory;

public class RepoScreenFactoryImpl implements RepoScreenFactory {

	private final @NonNull Context context;

	@Inject
	public RepoScreenFactoryImpl(@NonNull Context context) {
		this.context = context;
	}

	@Override public @NonNull Intent launch(String name) {
		return new Intent(context, RepoActivity.class)
				.putExtra(RepoActivity.EXTRA_REPO_NAME, name);
	}
}
