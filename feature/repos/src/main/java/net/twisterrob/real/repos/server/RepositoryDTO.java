package net.twisterrob.real.repos.server;

import com.google.gson.annotations.SerializedName;

public class RepositoryDTO {

	@SerializedName("name")
	public String name;

	@SerializedName("description")
	public String description;

	@SerializedName("stargazers_count")
	public int stargazersCount;

	@SerializedName("full_name")
	public String fullName;
}
