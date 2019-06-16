package net.twisterrob.real.test.collaborator.server

import net.twisterrob.real.test.collaborator.Server
import okhttp3.mockwebserver.RecordedRequest
import org.hamcrest.FeatureMatcher
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.equalTo

fun Server.Setup.get(path: String): Matcher<RecordedRequest> =
	allOf(method("GET"), path(path))

fun Server.Setup.post(path: String): Matcher<RecordedRequest> =
	allOf(method("POST"), path(path))

fun Server.Setup.path(path: String): Matcher<RecordedRequest> =
	object : FeatureMatcher<RecordedRequest, String>(
		equalTo(path), "a request with path", "path"
	) {
		override fun featureValueOf(actual: RecordedRequest) = actual.path
	}

private fun Server.Setup.method(method: String): Matcher<RecordedRequest> =
	object : FeatureMatcher<RecordedRequest, String>(
		equalTo(method), "a request with method", "method"
	) {
		override fun featureValueOf(actual: RecordedRequest) = actual.method
	}
