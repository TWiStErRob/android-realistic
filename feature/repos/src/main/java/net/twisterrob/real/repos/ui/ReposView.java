package net.twisterrob.real.repos.ui;

import javax.inject.Inject;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import net.twisterrob.real.repos.R2;

public class ReposView implements ReposContract.View {

	private @NonNull ReposContract.ViewPresenter presenter;

	@BindView(R2.id.repos_username)
	EditText userName;

	@Inject
	public ReposView(@NonNull View rootView) {
		ButterKnife.bind(this, rootView);
	}

	@Override public void setPresenter(@NonNull ReposContract.ViewPresenter presenter) {
		this.presenter = presenter;
	}

	@Override public @NonNull String getUserName() {
		return userName.getText().toString();
	}

	@OnClick(R2.id.repos_search)
	void clickSearch() {
		presenter.search();
	}
}
