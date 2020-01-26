package net.twisterrob.real.repos.ui;

import javax.inject.Inject;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

import net.twisterrob.real.repos.R;
import net.twisterrob.real.repos.R2;

public class ReposActivity extends AppCompatActivity implements ReposActivityContract.View {

	@BindView(R2.id.repos_root)
	public View root;

	/**
	 * Force creation of MVP objects.
	 */
	@Inject
	ReposContract.Presenter presenter;

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.repos_activity);

		ButterKnife.bind(this);
		AndroidInjection.inject(this);
	}
}
