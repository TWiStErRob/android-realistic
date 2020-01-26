package net.twisterrob.real.repos;

import javax.inject.Inject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;

import net.twisterrob.real.about.contract.RepoScreenFactory;

public class ReposNavigator {

	private final @NonNull Context context;
	private final @NonNull RepoScreenFactory repo;

	@Inject
	public ReposNavigator(
			@NonNull Context context,
			@NonNull RepoScreenFactory repo
	) {
		this.context = context;
		this.repo = repo;
	}

	public void gotoRepo(String name) {
		context.startActivity(repo.launch(name));
	}

	public void openExternalBrowser(@NonNull String url) {
		context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
	}
}
