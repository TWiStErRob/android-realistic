package net.twisterrob.real.repos;

import javax.inject.Inject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import net.twisterrob.real.about.contract.ReposScreenFactory;
import net.twisterrob.real.repos.ui.ReposActivity;

public class ReposScreenFactoryImpl implements ReposScreenFactory {

	private final @NonNull Context context;

	@Inject
	public ReposScreenFactoryImpl(@NonNull Context context) {
		this.context = context;
	}

	@Override public @NonNull Intent launch() {
		return new Intent(context, ReposActivity.class);
	}
}
