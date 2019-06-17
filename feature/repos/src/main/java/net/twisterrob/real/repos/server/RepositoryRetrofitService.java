package net.twisterrob.real.repos.server;

import android.support.annotation.NonNull;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Single;

public interface RepositoryRetrofitService {

	@GET("/users/{username}/repos")
	@NonNull Single<RepositoriesResponseDTO> repositories(
			@Path("username") @NonNull String username
	);
}
