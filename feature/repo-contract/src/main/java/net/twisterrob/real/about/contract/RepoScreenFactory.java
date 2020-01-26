package net.twisterrob.real.about.contract;

import android.content.Intent;

import androidx.annotation.NonNull;

public interface RepoScreenFactory {

	@NonNull Intent launch(String name);
}
