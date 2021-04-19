package com.omniriotest.landingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.omniriotest.landingapp.model.User;
import com.omniriotest.landingapp.service.UserService;

@SpringBootApplication
public class LandingAppApplication implements CommandLineRunner{
	
	@Autowired
	private UserService uservice;

	public static void main(String[] args) {
		SpringApplication.run(LandingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u = new User(1, "kumar", "admin", 1, "manager");
		User u2 = new User(2, "sam", "user", 2, "user");
		uservice.createuser(u);
		uservice.createuser(u2);
	}

}
