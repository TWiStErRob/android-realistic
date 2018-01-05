package net.twisterrob.real.main;

import javax.inject.Inject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

	public static Injector injector;

	@Inject
	MainNavigator navigator;

	@Override public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_activity);
		ButterKnife.bind(this);
		injector.createComponent().inject(this);
	}

	@OnClick(R2.id.about_button)
	void onAboutClick() {
		navigator.gotoAbout();
	}

	public interface Injector {

		@NonNull MainComponent createComponent();
	}
}
