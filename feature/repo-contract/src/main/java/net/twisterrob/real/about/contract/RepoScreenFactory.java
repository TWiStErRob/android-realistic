package net.twisterrob.real.about.contract;

import android.content.Intent;
import android.support.annotation.NonNull;

public interface RepoScreenFactory {

	@NonNull Intent launch(String name);
}
