package com.mzk.entity;

import java.util.Date;

public class Employees {
	private int id;
	private String lastName;
	private String email;
	private Date birth;
	private Date createTime;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employees(int id, String lastName, String email, Date birth, Date createTime, String dept) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.birth = birth;
		this.createTime = createTime;
		this.dept = dept;
	}
	public Employees() {
		super();
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", lastName=" + lastName + ", email=" + email + ", birth=" + birth
				+ ", createTime=" + createTime + ", dept=" + dept + "]";
	}
	
	
}
