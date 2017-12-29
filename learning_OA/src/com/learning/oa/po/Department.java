package com.learning.oa.po;

import java.util.HashSet;
import java.util.Set;




public class Department {
	private Long id;
	private String name;
	private String description;
	private Department parent;
	private Set<Department> childrens = new HashSet<Department>();
	private Set<User> users = new HashSet<User>();
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long id, String name, String description,
			Department parent, Set<Department> childrens, Set<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.parent = parent;
		this.childrens = childrens;
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
	public Department getParent() {
		return parent;
	}
	public void setParent(Department parent) {
		this.parent = parent;
	}
	public Set<Department> getChildrens() {
		return childrens;
	}
	public void setChildrens(Set<Department> childrens) {
		this.childrens = childrens;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
