package net.twisterrob.real.about;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

	@Override protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.about_activity);

		AboutView view = new AboutView(findViewById(R.id.about$root));
		AboutPresenter presenter = new AboutPresenter(view);
		presenter.bind();
	}
}
