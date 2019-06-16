package net.twisterrob.real.repos.ui;

import javax.inject.Inject;
import javax.inject.Provider;

import android.support.annotation.NonNull;
import android.util.Log;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import net.twisterrob.real.repos.server.ReposInteractor;

public class ReposPresenter implements
		ReposContract.Presenter,
		ReposContract.ViewPresenter {

	private final @NonNull ReposContract.View view;
	private final @NonNull ReposListContract.Presenter listPresenter;
	private final @NonNull Provider<ReposInteractor> interactor;
	private final @NonNull ReposModelMapper modelMapper;

	@Inject
	public ReposPresenter(
			@NonNull ReposContract.View view,
			@NonNull ReposListContract.Presenter listPresenter,
			@NonNull Provider<ReposInteractor> interactor,
			@NonNull ReposModelMapper modelMapper) {
		this.view = view;
		this.listPresenter = listPresenter;
		this.interactor = interactor;
		this.modelMapper = modelMapper;
	}

	@Override public void init() {
		view.setPresenter(this);
	}

	@Override public void search() {
		search(view.getUserName());
	}

	private void search(String userName) {
		interactor
				.get()
				.list(userName)
				.map(modelMapper::map)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(
						listPresenter::show,
						(ex) -> Log.e("ReposPresenter", "Failed to load repositories", ex)
				);
	}
}
