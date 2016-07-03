package com.smartonet.organization.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	private long userId ;
	private String name ; //'用户名称',
	private String password ; //用户密码',
	private long phone ; //用户手机号',
	private String email ; //用户邮箱地址',
	private String firstName ; //显示的用户名字',
	private String middleName ; //显示的中间名字',
	private String lastName ; //显示的姓',
	private int sex ; //性别， 0：未设置；1：男士；2：女士',
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date registrationTime ; //创建时间',
	private int title ; //职务',
	private int status ; //用户状态，0：未启用，1：已启用',
	private Department department ; //所属部门ID',
	
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
