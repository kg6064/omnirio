package com.omniriotest.landingapp.model;

import java.util.List;

public class UserResponse {

	private List<User> users;
	private User user;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserResponse(List<User> users) {
		super();
		this.users = users;
	}

	public UserResponse(User user) {
		super();
		this.user = user;
	}
	
}
