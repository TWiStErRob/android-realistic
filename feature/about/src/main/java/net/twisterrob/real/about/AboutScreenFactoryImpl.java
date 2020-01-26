package net.twisterrob.real.about;

import javax.inject.Inject;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import net.twisterrob.real.about.contract.AboutScreenFactory;

public class AboutScreenFactoryImpl implements AboutScreenFactory {

	private final @NonNull Context context;

	@Inject
	public AboutScreenFactoryImpl(@NonNull Context context) {
		this.context = context;
	}

	@Override public @NonNull Intent launch() {
		return new Intent(context, AboutActivity.class)
				.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	}
}
