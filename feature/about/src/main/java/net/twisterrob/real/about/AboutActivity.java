package net.twisterrob.real.about;

import javax.inject.Inject;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class AboutActivity extends AppCompatActivity {

	@BindView(R2.id.about_root)
	View root;

	@Inject
	AboutContract.Presenter presenter;

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.about_activity);

		ButterKnife.bind(this);
		AndroidInjection.inject(this);

		presenter.bind();
	}
}
