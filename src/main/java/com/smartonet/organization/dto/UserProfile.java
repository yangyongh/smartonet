package com.smartonet.organization.dto;

public class UserProfile {
	private long userId ;
	private String name ; //'用户名称',
	private String password ; //用户密码',
	private int status ; //用户状态，0：未启用，1：已启用',
	private long department ; //所属部门ID',
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getDepartment() {
		return department;
	}
	public void setDepartment(long department) {
		this.department = department;
	}
}
