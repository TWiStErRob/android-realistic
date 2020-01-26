package net.twisterrob.real.about;

import java.util.Locale;

import javax.inject.Inject;

import androidx.annotation.NonNull;

public class AboutModelMapper {

	private final @NonNull Graphics graphics;

	@Inject
	public AboutModelMapper(@NonNull Graphics graphics) {this.graphics = graphics;}

	public AboutModel createAbout(AboutDomain about) {
		return new AboutModel(
				getVersionName(about),
				about.applicationId,
				graphics.getDrawableId(about.applicationIconRes)
		);
	}

	private @NonNull String getVersionName(@NonNull AboutDomain about) {
		if (AboutDomain.MISSING_VERSION.equals(about.applicationVersionName)) {
			return about.applicationName;
		} else {
			return String.format(Locale.ROOT, "%s %s", about.applicationName, about.applicationVersionName);
		}
	}
}
