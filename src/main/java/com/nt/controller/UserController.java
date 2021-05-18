package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.UserEntity;
import com.nt.service.UserService;

@RestController
public class UserController {
	
	@Autowired(required=true)
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	
	@Autowired(required=true)
	private UserService userService;
	
	@GetMapping("/sec")
	public List<UserEntity> getAllData()
	{
		return this.userService.getAllData();
	}
	
//	@PostMapping("/sec")
//	public String postData(@RequestParam int id,@RequestParam String userName,@RequestParam String userPass )
//	{
//
//		String encode = bCryptPasswordEncoder.encode(userPass);
//		
//		
//	
//	
//		return this.userService.postDataIntDatabase(id,userName,encode);
//	}
//	

}
