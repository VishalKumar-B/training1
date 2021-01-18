package com.motivity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "group2")
public class GroupsPOJO {

	@Id
	@Column(name = "gid")
	private int group_id;
	
	@Column(name = "gname")
	private String group_name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "uid")
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
