package com.learning.oa.po;

import java.util.HashSet;
import java.util.Set;




public class Role {
	private Long id;
	private String name;
	private String description;
	private Set<User> users = new HashSet<User>();
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Long id, String name, String description, Set<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
