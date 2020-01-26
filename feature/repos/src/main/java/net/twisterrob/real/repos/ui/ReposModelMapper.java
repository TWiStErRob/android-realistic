package net.twisterrob.real.repos.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import android.content.res.Resources;

import androidx.annotation.NonNull;

import net.twisterrob.real.repos.R;
import net.twisterrob.real.repos.RepositoryDomain;

public class ReposModelMapper {

	private final @NonNull Resources resources;

	@Inject
	public ReposModelMapper(@NonNull Resources resources) {
		this.resources = resources;
	}

	public List<RepositoryModel> map(List<RepositoryDomain> repos) {
		List<RepositoryModel> result = new ArrayList<>();
		for (RepositoryDomain repo : repos) {
			result.add(map(repo));
		}
		Collections.sort(result, (o1, o2) -> o1.name.compareTo(o2.name));
		return result;
	}

	public @NonNull RepositoryModel map(RepositoryDomain repo) {
		return new RepositoryModel(
				repo.name,
				repo.description,
				resources.getString(R.string.repos_item_stars, repo.startCount),
				repo.githubUrl
		);
	}
}
