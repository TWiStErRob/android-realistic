package net.twisterrob.real.about;

import javax.inject.Inject;

import androidx.annotation.NonNull;

public class AboutPresenter implements AboutContract.Presenter {

	private final @NonNull AboutContract.View view;
	private final @NonNull AboutInteractor interactor;
	private final @NonNull AboutModelMapper modelMapper;

	@Inject
	public AboutPresenter(
			@NonNull AboutContract.View view,
			@NonNull AboutInteractor interactor,
			@NonNull AboutModelMapper modelMapper
	) {
		this.view = view;
		this.interactor = interactor;
		this.modelMapper = modelMapper;
	}

	@Override public void bind() {
		AboutModel about = modelMapper.createAbout(interactor.create());
		view.bind(about);
	}
}
