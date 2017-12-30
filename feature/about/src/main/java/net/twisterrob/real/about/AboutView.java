package net.twisterrob.real.about;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.*;

public class AboutView implements AboutContract.View {
	TextView text;
	TextView version;
	ImageView icon;

	public AboutView(@NonNull View root) {
		text = root.findViewById(R.id.about$name);
		version = root.findViewById(R.id.about$version);
		icon = root.findViewById(R.id.about$icon);
	}

	@Override public void bind(@NonNull AboutModel about) {
		text.setText(about.appName);
		version.setText(about.appVersion);
		icon.setImageResource(about.appIcon);
	}

	@Override public Context getContext() {
		return text.getContext();
	}
}
