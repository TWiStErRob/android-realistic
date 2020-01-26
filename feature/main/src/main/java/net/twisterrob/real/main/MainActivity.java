package net.twisterrob.real.main;

import javax.inject.Inject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

	@Inject
	MainNavigator navigator;

	@Override public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_activity);
		ButterKnife.bind(this);
		AndroidInjection.inject(this); // [dagger-android]
	}

	@OnClick(R2.id.about_button)
	void onAboutClick() {
		navigator.gotoAbout();
	}

	@OnClick(R2.id.repos_button)
	void onReposClick() {
		navigator.gotoRepos();
	}
}
