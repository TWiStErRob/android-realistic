package net.twisterrob.real.about;

import javax.inject.Inject;

import android.content.Context;
import android.support.annotation.NonNull;

public class AboutPresenter implements AboutContract.Presenter {

	private final @NonNull AboutContract.View view;
	private final @NonNull AboutModelMapper modelMapper;

	@Inject
	public AboutPresenter(
			@NonNull AboutContract.View view,
			@NonNull AboutModelMapper modelMapper
	) {
		this.view = view;
		this.modelMapper = modelMapper;
	}

	@Override public void bind(Context context) {
		AboutModel about = modelMapper.createAbout(context);
		view.bind(about);
	}
}
