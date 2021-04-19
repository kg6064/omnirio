package com.omniriotest.landingapp.model;

public class UserAuth {

	private String username;
	private String password;
	private int userid;
	private String role;
	public UserAuth(String username, String password, int userid, String role) {
		super();
		this.username = username;
		this.password = password;
		this.userid = userid;
		this.role = role;
	}
	public UserAuth() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserAuth [username=" + username + ", password=" + password + ", userid=" + userid + ", role=" + role
				+ "]";
	}
	
	
}
