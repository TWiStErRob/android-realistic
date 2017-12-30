package net.twisterrob.real.about;

public class AboutPresenter implements AboutContract.Presenter {
	private final AboutContract.View view;

	public AboutPresenter(AboutContract.View view) {
		this.view = view;
	}

	@Override public void bind() {
		AboutModel about = new AboutModelMapper().createAbout(view.getContext());
		view.bind(about);
	}
}
