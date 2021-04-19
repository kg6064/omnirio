package com.omniriotest.landingapp.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.omniriotest.landingapp.model.AuthenticationRequest;
import com.omniriotest.landingapp.model.AuthenticationResponse;
import com.omniriotest.landingapp.model.CreateAuthRequest;
import com.omniriotest.landingapp.model.TokenDetails;
import com.omniriotest.landingapp.service.MyUserDetailsService;
import com.omniriotest.landingapp.service.UserService;
import com.omniriotest.landingapp.util.JwtUtil;

@RestController

public class LandingAppController {
	
	@Autowired
	AuthenticationManager authenticationmanager;
	
	@Autowired
	MyUserDetailsService myuserdetailsService;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateUser(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try {
			authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));

		}catch(BadCredentialsException exp) {
			throw new Exception("Incorrect credentials!");
		}
		
		final UserDetails userdetails = myuserdetailsService.loadUserByUsername(authenticationRequest.getUsername());
		final String token = jwtUtil.generateToken(userdetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(token));
	}
	
	@GetMapping("/verifytoken{token}")
	public ResponseEntity<?> tokenDetails(@RequestParam String token){
		if(token!= null && !token.isEmpty()) {
			String u = jwtUtil.extractUsername(token);
			UserDetails ud = myuserdetailsService.loadUserByUsername(u);
			TokenDetails td = new TokenDetails(token, u, ud.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(",")));
			return ResponseEntity.ok(td);
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@PostMapping("/createAuthDetails")
	public ResponseEntity<?> addUserAuthDetails(@RequestBody CreateAuthRequest createAuthDetails){
		if(!createAuthDetails.getUsername().isEmpty() && !createAuthDetails.getPassword().isBlank() 
				&& (createAuthDetails.getRole().equals("user")||createAuthDetails.getRole().equals("manager"))) {
			com.omniriotest.landingapp.model.User u = new com.omniriotest.landingapp.model.User();
			u.setUsername(createAuthDetails.getUsername());
			u.setPassword(createAuthDetails.getPassword());
			u.setUserid(createAuthDetails.getUderid());
			u.setRole(createAuthDetails.getRole());
			userservice.createuser(u);
			return ResponseEntity.ok("User Created Successfully");
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
}
