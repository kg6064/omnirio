package com.omniriotest.landingapp.model;

public class CreateAuthRequest {

	private String username;
	private String password;
	private int uderid;
	private String role;
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
	public int getUderid() {
		return uderid;
	}
	public void setUderid(int uderid) {
		this.uderid = uderid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public CreateAuthRequest(String username, String password, int uderid, String role) {
		super();
		this.username = username;
		this.password = password;
		this.uderid = uderid;
		this.role = role;
	}
}
