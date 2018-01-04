package net.twisterrob.real.about;

import javax.inject.Inject;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.NonNull;

public class AboutDomainMapper {

	@Inject
	public AboutDomainMapper() {}

	public @NonNull AboutDomain map(@NonNull Context context) {
		return new AboutDomain(
				context.getPackageName(),
				context.getString(context.getApplicationInfo().labelRes),
				getVersionName(context),
				context.getResources().getResourceName(context.getApplicationInfo().icon)
		);
	}

	private static @NonNull String getVersionName(@NonNull Context context) {
		try {
			PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
			return pInfo.versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
			return AboutDomain.MISSING_VERSION;
		}
	}
}
