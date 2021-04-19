package com.omniriotest.landingapp.service;

import java.util.List;

import com.omniriotest.landingapp.model.User;


public interface UserService {
	User createuser(User user);
	List<User> findAll();
	User findByUsername(String name);
}
