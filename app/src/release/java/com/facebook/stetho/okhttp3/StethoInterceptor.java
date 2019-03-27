package com.facebook.stetho.okhttp3;

import java.io.IOException;

import android.support.annotation.NonNull;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * No-op implementation for release builds.
 */
public class StethoInterceptor implements Interceptor { // [stetho]

	@Override public @NonNull Response intercept(@NonNull Chain chain) throws IOException {
		return chain.proceed(chain.request());
	}
}
