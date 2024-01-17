package com.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.UserInfo;
import com.librarymanagement.repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	public LoginRepo repo;
	
	public ResponseEntity<String> Register(UserInfo user)
	{
	
		if(repo.findByEmail(user.getEmail()) != null)
		{
			
			return ResponseEntity.badRequest().body("email already existed");
			
		
			
		}
		else
		{
		
			repo.save(user);
			
			return ResponseEntity.ok("registration success");	
			
		}
		
	}
	
	
	
	public ResponseEntity<String> login(UserInfo user)
	{
		UserInfo tempInfo = repo.findByEmail(user.email);
		if(tempInfo != null && tempInfo.getPassword().equals(user.getPassword()) && tempInfo.getRole().equals("user") )
		{
			return ResponseEntity.ok("login success");	
		}
		else
		{
			return ResponseEntity.badRequest().body("username or password is wrong");		
		}
		
	}
	

	
	
	public ResponseEntity<String> adminlogin(UserInfo user)
	{
		UserInfo tempInfo = repo.findByEmail(user.email);
		System.out.print(tempInfo.getRole().equals("admin"));
		if(tempInfo != null && tempInfo.getPassword().equals(user.getPassword()) && tempInfo.getRole().equals("admin") )
		{
			return ResponseEntity.ok("admin login success");	
		}
		else
		{
			return ResponseEntity.badRequest().body("username or of admin is wrong");		
		}
		
	}
	
	
	
	
	
	
	
}
