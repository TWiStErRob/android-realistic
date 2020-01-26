package net.twisterrob.real.repos.ui;

import java.util.List;

import androidx.annotation.NonNull;

public interface ReposListContract {

	interface Presenter {

		void init();

		void show(@NonNull List<RepositoryModel> repos);
	}

	interface ViewPresenter {

		void openDetails(@NonNull RepositoryModel repo);

		void openBrowser(@NonNull RepositoryModel repo);
	}

	interface View {

		void setPresenter(@NonNull ViewPresenter presenter);

		void bind(@NonNull List<RepositoryModel> repos);
	}

	interface Interactions {

		void showDetails(@NonNull RepositoryModel repo);

		void showBrowser(@NonNull RepositoryModel repo);
	}
}
