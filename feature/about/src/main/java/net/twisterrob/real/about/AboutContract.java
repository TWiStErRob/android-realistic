package net.twisterrob.real.about;

import android.content.Context;
import android.support.annotation.NonNull;

public interface AboutContract {

	interface Presenter {

		void bind(Context context);
	}

	interface View {

		void bind(@NonNull AboutModel about);
	}
}
