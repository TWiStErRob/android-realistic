package net.twisterrob.real.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import net.twisterrob.real.about.AboutNavigator;

public class MainActivity extends AppCompatActivity {
	@Override public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_activity);

		findViewById(R.id.about_button)
				.setOnClickListener((v) -> startActivity(new AboutNavigator(this).launch()));
	}
}
