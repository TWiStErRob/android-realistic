package net.twisterrob.real.about;

import javax.inject.Inject;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public class AboutModelMapper {

	@Inject
	public AboutModelMapper() {}

	public AboutModel createAbout(Context context) {
		return new AboutModel(
				context.getString(context.getApplicationInfo().labelRes),
				getVersionName(context),
				context.getApplicationInfo().icon
		);
	}

	private static String getVersionName(Context context) {
		String applicationId = context.getPackageName();
		try {
			PackageInfo pInfo = context.getPackageManager().getPackageInfo(applicationId, 0);
			return applicationId + ":" + pInfo.versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
			return applicationId;
		}
	}
}
