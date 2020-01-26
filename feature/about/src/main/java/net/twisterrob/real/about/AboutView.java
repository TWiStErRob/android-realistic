package net.twisterrob.real.about;

import javax.inject.Inject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutView implements AboutContract.View {

	@BindView(R2.id.about_name)
	TextView text;
	@BindView(R2.id.about_version)
	TextView version;
	@BindView(R2.id.about_icon)
	ImageView icon;

	@Inject
	public AboutView(@NonNull View root) {
		ButterKnife.bind(this, root);
	}

	@Override public void bind(@NonNull AboutModel about) {
		text.setText(about.appName);
		version.setText(about.appVersion);
		icon.setImageResource(about.appIcon);
	}
}
