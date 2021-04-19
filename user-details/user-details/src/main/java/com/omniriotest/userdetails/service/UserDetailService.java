package com.omniriotest.userdetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omniriotest.userdetails.dao.UserDetailRepository;
import com.omniriotest.userdetails.model.UserSelfDetails;

@Service
public class UserDetailService {
	@Autowired
	private UserDetailRepository userRepository;
	
	public List<UserSelfDetails> getAllUserDetails(){
		List<UserSelfDetails> userSelfDetails = new ArrayList<>();
		userRepository.findAll().forEach(item -> userSelfDetails.add(item));
		return userSelfDetails;
	}
	
	public UserSelfDetails getuserDetById(int id) {
		return userRepository.findById(id).get();
	}
	
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	public void update(UserSelfDetails userdet, int userid) {
		userRepository.save(userdet);
	}
}
