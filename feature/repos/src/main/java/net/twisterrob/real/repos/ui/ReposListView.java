package net.twisterrob.real.repos.ui;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import net.twisterrob.real.repos.R;
import net.twisterrob.real.repos.R2;

public class ReposListView implements ReposListContract.View {

	@BindView(R2.id.repos_list)
	RecyclerView list;

	private final @NonNull ReposAdapter adapter;

	private @NonNull ReposListContract.ViewPresenter presenter;

	@Inject
	public ReposListView(@NonNull View root) {
		ButterKnife.bind(this, root);
		adapter = new ReposAdapter();
		list.setAdapter(adapter);
	}

	@Override public void setPresenter(@NonNull ReposListContract.ViewPresenter presenter) {
		this.presenter = presenter;
	}

	@Override public void bind(@NonNull List<RepositoryModel> repos) {
		adapter.setRepos(repos);
	}

	class ReposAdapter extends RecyclerView.Adapter<RepoViewHolder> {

		private @NonNull List<RepositoryModel> repos = Collections.emptyList();

		@Override public @NonNull RepoViewHolder onCreateViewHolder(@NonNull ViewGroup group, int position) {
			LayoutInflater inflater = LayoutInflater.from(group.getContext());
			View view = inflater.inflate(R.layout.repos_item, group, false);
			return new RepoViewHolder(view);
		}

		@Override public void onBindViewHolder(@NonNull RepoViewHolder holder, int position) {
			holder.bind(repos.get(position));
		}

		@Override public int getItemCount() {
			return repos.size();
		}

		public void setRepos(List<RepositoryModel> repos) {
			this.repos = repos;
			notifyDataSetChanged();
		}
	}

	class RepoViewHolder extends RecyclerView.ViewHolder {

		@BindView(R2.id.repo_name)
		TextView name;

		@BindView(R2.id.repo_description)
		TextView description;

		@BindView(R2.id.repo_stars)
		TextView stars;

		private @NonNull RepositoryModel model;

		public RepoViewHolder(@NonNull View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
		}

		public void bind(@NonNull RepositoryModel model) {
			this.model = model;
			name.setText(model.name);
			description.setText(model.description);
			stars.setText(model.stars);
		}

		@OnClick(R2.id.repo_item_root)
		public void itemClick() {
			presenter.openDetails(model);
		}

		@OnClick(R2.id.repo_view)
		public void viewClick() {
			presenter.openBrowser(model);
		}
	}
}
