package com.omniriotest.userdetails;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserDetailsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
