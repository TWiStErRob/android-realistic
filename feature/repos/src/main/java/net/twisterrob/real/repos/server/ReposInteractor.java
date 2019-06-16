package net.twisterrob.real.repos.server;

import java.util.List;

import javax.inject.Inject;

import android.support.annotation.NonNull;

import rx.Single;

import net.twisterrob.real.repos.RepositoryDomain;

public class ReposInteractor {

	private final @NonNull RepositoryRetrofitService service;
	private final @NonNull RepositoryDomainMapper mapper;

	@Inject
	public ReposInteractor(
			@NonNull RepositoryRetrofitService service,
			@NonNull RepositoryDomainMapper mapper
	) {
		this.service = service;
		this.mapper = mapper;
	}

	public @NonNull Single<List<RepositoryDomain>> list(@NonNull String userName) {
		return service
				.repositories(userName)
				.map(mapper::map)
				;
	}
}
