package net.twisterrob.real.about;

import android.support.annotation.NonNull;

public interface AboutContract {

	interface Presenter {

		void bind();
	}

	interface View {

		void bind(@NonNull AboutModel about);
	}
}
