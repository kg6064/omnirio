package com.omniriotest.landingapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.omniriotest.landingapp.model.UserAuth;

@Repository
public class AuthUserDAO {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	public UserAuth getUserByName(String username) {
		System.out.println("Searching user by user name "+ username);
		String sql = "select * from auth2";
		jdbctemplate.execute(sql);
		return null;
	}
}
