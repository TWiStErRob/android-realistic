package net.twisterrob.real.about;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

public class AboutModel {

	public final @NonNull String appName;
	public final @NonNull String appVersion;
	public final @DrawableRes int appIcon;

	public AboutModel(
			@NonNull String appName,
			@NonNull String appVersion,
			@DrawableRes int appIcon
	) {
		this.appName = appName;
		this.appVersion = appVersion;
		this.appIcon = appIcon;
	}
}
