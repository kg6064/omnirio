package com.omniriotest.landingapp.model;

public class TokenDetails {

	private String token;
	private String username;
	private String role;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public TokenDetails(String token, String username, String role) {
		super();
		this.token = token;
		this.username = username;
		this.role = role;
	}
	public TokenDetails() {
		super();
	}
	
	
}
