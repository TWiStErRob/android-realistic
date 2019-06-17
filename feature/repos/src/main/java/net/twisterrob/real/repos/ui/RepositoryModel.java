package net.twisterrob.real.repos.ui;

import android.support.annotation.NonNull;

public class RepositoryModel {

	public final @NonNull String name;
	public final @NonNull String description;
	public final @NonNull String stars;
	public final @NonNull String webUrl;

	public RepositoryModel(
			@NonNull String name,
			@NonNull String description,
			@NonNull String stars,
			@NonNull String webUrl
	) {
		this.name = name;
		this.description = description;
		this.stars = stars;
		this.webUrl = webUrl;
	}
}
