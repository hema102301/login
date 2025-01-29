package com.login.model;

public class Login {
	
	private int id;
	private String uname;
	private String password;
	private String email;
	private String phoneNum;
	
	public Login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public Login(String uname, String password, String email, String phoneNum) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", uname=" + uname + ", password=" + password + ", email=" + email
				+ ", phoneNum=" + phoneNum + "]";
	}
	
	

}
