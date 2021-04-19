package com.omniriotest.userdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omniriotest.userdetails.model.UserSelfDetails;
import com.omniriotest.userdetails.service.UserDetailService;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailService userService;
	
	@GetMapping("/users")
	private ResponseEntity<?> getAllUsers(){
		List<UserSelfDetails> users =  userService.getAllUserDetails();
		return ResponseEntity.ok(users);
	}
}
