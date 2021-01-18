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
@Table(name = "user2")
public class UsersPOJO {

	@Id
	@Column(name = "uid")
	private int user_id;

	@Column(name = "uname")
	private String user_name;

	@Column(name = "umobile")
	private double user_mobile;

	/*
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(referencedColumnName = "gid") private
	 * Set<GroupsPOJO> groups = new HashSet<GroupsPOJO>();
	 */

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public double getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(double user_mobile) {
		this.user_mobile = user_mobile;
	}

	/*
	 * public Set<GroupsPOJO> getGroups() { return groups; }
	 * 
	 * public void setGroups(Set<GroupsPOJO> groups) { this.groups = groups; }
	 */
}
