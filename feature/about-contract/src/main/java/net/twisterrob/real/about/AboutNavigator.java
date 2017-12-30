package net.twisterrob.real.about;

import android.content.*;

public class AboutNavigator {

	private final Context context;

	public AboutNavigator(Context context) {
		this.context = context;
	}

	public Intent launch() {
		return new Intent().setComponent(new ComponentName(context, "net.twisterrob.real.about.AboutActivity"));
	}
}
