package net.twisterrob.real.about;

import android.support.annotation.NonNull;

import dagger.Module;

@Module
public class AboutDomain {

	public static final String MISSING_VERSION = "<N/A>";

	public final @NonNull String applicationId;
	public final @NonNull String applicationName;
	public final @NonNull String applicationVersionName;
	public final @NonNull String applicationIconRes;

	public AboutDomain(
			@NonNull String applicationId,
			@NonNull String applicationName,
			@NonNull String applicationVersionName,
			@NonNull String applicationIconRes
	) {
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.applicationVersionName = applicationVersionName;
		this.applicationIconRes = applicationIconRes;
	}
}
