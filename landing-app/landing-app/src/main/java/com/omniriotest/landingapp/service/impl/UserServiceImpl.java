package com.omniriotest.landingapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omniriotest.landingapp.dao.UserRepository;
import com.omniriotest.landingapp.model.User;
import com.omniriotest.landingapp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createuser(User user) {
		return userRepository.save(user);
	}
	
	@Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

	@Override
	public User findByUsername(String name) {
		return userRepository.findByUsername(name);
	}

}
