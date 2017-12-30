package net.twisterrob.real.about;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;

public class AboutActivity extends AppCompatActivity {

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.about_activity);

		TextView text = findViewById(R.id.about$name);
		TextView version = findViewById(R.id.about$version);
		ImageView icon = findViewById(R.id.about$icon);

		// TODO explain this VS moving resources to base
		text.setText(getApplicationInfo().labelRes);
		version.setText(getVersionName(this));
		icon.setImageResource(getApplicationInfo().icon);
	}

	private static CharSequence getVersionName(Context context) {
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
