package com.omniriotest.userdetails.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
	
//	@Autowired
//	private MyUserDetailsService myUserDetailsService;
//	
//	@Autowired
//	private JWTRequestFilter jwtfilter;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) {
//		try {
//			auth.userDetailsService(myUserDetailsService);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Override
	protected void configure(HttpSecurity httpSec) throws Exception{
		httpSec.csrf().disable().authorizeRequests().antMatchers("/users").permitAll()
		.anyRequest().authenticated().and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
