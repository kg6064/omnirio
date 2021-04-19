package com.omniriotest.landingapp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserService userservice;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("getting user details for user "+username);
		com.omniriotest.landingapp.model.User user = userservice.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("user not found");
		}else {
			return new User(user.getUsername(), user.getPassword(), getAuthorities(user.getRole()));
		}
	}
	
	private Collection<? extends GrantedAuthority> getAuthorities(String role) {	
		 List<GrantedAuthority> authorities = new ArrayList<>();
		 authorities.add(new SimpleGrantedAuthority(role));
		        return authorities;
	}

}
