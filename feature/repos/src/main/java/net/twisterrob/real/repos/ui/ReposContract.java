package net.twisterrob.real.repos.ui;

import android.support.annotation.NonNull;

public interface ReposContract {

	interface Presenter {

		void init();
	}

	interface ViewPresenter {

		void search();
	}

	interface View {

		void setPresenter(@NonNull ViewPresenter presenter);

		@NonNull String getUserName();
	}
}
