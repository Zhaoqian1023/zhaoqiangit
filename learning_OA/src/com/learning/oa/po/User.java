package com.learning.oa.po;

import java.util.Set;



public class User {
	private Long id;
	private String loginName;
	private String name;
	private int gender;
	private String phone;
	private String email;
	private String password;
	private String remark;
	private Department department;
	private Set<Role> roles;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String loginName, String name, int gender,
			String phone, String email, String password, String remark,
			Department department, Set<Role> roles) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.remark = remark;
		this.department = department;
		this.roles = roles;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLoginName() {
		return loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGender() {
		return gender;
	}


	public void setGender(int gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
