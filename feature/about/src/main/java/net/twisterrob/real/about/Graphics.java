package net.twisterrob.real.about;

import java.util.Locale;

import javax.inject.Inject;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class Graphics {

	private final @NonNull Context context;

	@Inject
	public Graphics(@NonNull Context context) {
		this.context = context;
	}

	public @NonNull Drawable getDrawable(@DrawableRes int drawableResourceId) {
		Drawable drawable = ContextCompat.getDrawable(context, drawableResourceId);
		if (drawable == null) {
			String name;
			try {
				name = context.getResources().getResourceName(drawableResourceId);
			} catch (Resources.NotFoundException ex) {
				name = "(missing name)";
			}
			throw new NotFoundException(String.format(Locale.ROOT,
					"Drawable %s with resource ID #0x%08x",
					name, drawableResourceId));
		}
		return drawable;
	}

	public @DrawableRes int getDrawableId(@NonNull String drawableResourceId) {
		int drawable = context.getResources().getIdentifier(
				drawableResourceId, "drawable", context.getPackageName());

		if (drawable == 0) {
			throw new NotFoundException(String.format(Locale.ROOT,
					"Drawable with resource name %s not found in %s",
					drawableResourceId, context.getPackageName()));
		}
		return drawable;
	}

	public @NonNull Drawable getDrawable(@NonNull String drawableResourceId) {
		return getDrawable(getDrawableId(drawableResourceId));
	}

	// TODO color, anim, animator
}
