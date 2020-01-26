package net.twisterrob.real.about;

import androidx.annotation.NonNull;

public interface AboutContract {

	interface Presenter {

		void bind();
	}

	interface View {

		void bind(@NonNull AboutModel about);
	}
}
