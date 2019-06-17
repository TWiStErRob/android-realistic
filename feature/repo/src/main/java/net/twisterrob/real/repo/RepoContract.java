package net.twisterrob.real.repo;

import android.support.annotation.NonNull;

public interface RepoContract {

	interface Presenter {

		void bind(@NonNull String repoName);
	}

	interface View {

		void setHeader(@NonNull String repoName);
	}
}
