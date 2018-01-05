package net.twisterrob.real.about;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

public class AboutNavigator {

	private final @NonNull Context context;

	public AboutNavigator(@NonNull Context context) {
		this.context = context;
	}

	public @NonNull Intent launch() {
		return new Intent().setComponent(new ComponentName(context, "net.twisterrob.real.about.AboutActivity"));
	}
}
