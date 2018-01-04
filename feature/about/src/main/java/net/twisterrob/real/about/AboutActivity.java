package net.twisterrob.real.about;

import javax.inject.Inject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutActivity extends AppCompatActivity {

	@BindView(R2.id.about$root)
	View root;

	@Inject
	AboutContract.Presenter presenter;

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.about_activity);

		ButterKnife.bind(this);
		DaggerAboutComponent
				.builder()
				.context(getApplicationContext())
				.rootView(root)
				.build()
				.inject(this);
		presenter.bind();
	}
}
