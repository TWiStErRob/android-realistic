package net.twisterrob.real.app.repos

object RepoEndpoints {
	fun repos(userName: String) =
		"/users/$userName/repos"
}
