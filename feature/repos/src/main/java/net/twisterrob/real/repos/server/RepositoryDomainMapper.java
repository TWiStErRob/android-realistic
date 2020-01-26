package net.twisterrob.real.repos.server;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;

import net.twisterrob.real.repos.RepositoryDomain;

public class RepositoryDomainMapper {

	private static final String PUBLIC_GITHUB_URL = "https://github.com/";

	@Inject
	public RepositoryDomainMapper() {}

	public @NonNull RepositoryDomain map(@NonNull RepositoryDTO repo) {
		return new RepositoryDomain(
				repo.name,
				repo.description,
				repo.stargazersCount,
				PUBLIC_GITHUB_URL + repo.fullName
		);
	}

	public @NonNull List<RepositoryDomain> map(@NonNull List<RepositoryDTO> repos) {
		List<RepositoryDomain> results = new ArrayList<>();
		for (RepositoryDTO repo : repos) {
			results.add(map(repo));
		}
		return results;
	}
}
