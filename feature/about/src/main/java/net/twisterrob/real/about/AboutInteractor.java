package net.twisterrob.real.about;

import javax.inject.Inject;

import android.content.Context;
import android.support.annotation.NonNull;

public class AboutInteractor {

	private final @NonNull Context context;
	private final @NonNull AboutDomainMapper mapper;

	@Inject
	public AboutInteractor(
			@NonNull Context context,
			@NonNull AboutDomainMapper mapper
	) {
		this.context = context;
		this.mapper = mapper;
	}

	public @NonNull AboutDomain create() {
		return mapper.map(context);
	}
}
