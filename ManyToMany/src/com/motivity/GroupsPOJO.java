package com.motivity;

import java.util.HashSet;
import java.util.Set;

public class GroupsPOJO {

	private int group_id;
	private String group_name;

	private Set<UsersPOJO> users = new HashSet<UsersPOJO>();

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public Set<UsersPOJO> getUsers() {
		return users;
	}

	public void setUsers(Set<UsersPOJO> users) {
		this.users = users;
	}
}
