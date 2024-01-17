package com.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.model.UserInfo;
import com.librarymanagement.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	public LoginService service;
	
	@PostMapping("/registerUser")
	public ResponseEntity<String> registration(@RequestBody UserInfo user)
	{
		
		
	return	service.Register( user );
		
		
	}
	
	
	
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserInfo user)
	{
		return service.login(user);
	}
	
   
	
	@PostMapping("/adminlogin")
	public ResponseEntity<String > adminlogin(@RequestBody UserInfo user)
	{
		return service.adminlogin(user);
	}

	
	
}
