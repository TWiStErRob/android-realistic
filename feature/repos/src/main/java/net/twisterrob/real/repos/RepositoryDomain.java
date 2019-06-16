package net.twisterrob.real.repos;

import android.support.annotation.NonNull;

public class RepositoryDomain {

	public final @NonNull String name;
	public final @NonNull String description;
	public final int startCount;
	public final @NonNull String githubUrl;

	public RepositoryDomain(
			@NonNull String name,
			@NonNull String description,
			int startCount,
			@NonNull String githubUrl
	) {
		this.name = name;
		this.description = description;
		this.startCount = startCount;
		this.githubUrl = githubUrl;
	}
}
