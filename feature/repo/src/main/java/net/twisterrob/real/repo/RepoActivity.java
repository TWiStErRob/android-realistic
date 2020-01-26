package net.twisterrob.real.repo;

import javax.inject.Inject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class RepoActivity extends AppCompatActivity {

	public static final String EXTRA_REPO_NAME = "repo_name";

	@Inject
	RepoContract.Presenter presenter;

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.repo_activity);

		ButterKnife.bind(this);
		AndroidInjection.inject(this);

		presenter.bind(getIntent().getStringExtra(EXTRA_REPO_NAME));
	}
}
