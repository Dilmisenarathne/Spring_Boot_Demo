 package com.rst.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.services.UserServices;

@RestController
@RequestMapping("/user")
public class User {
	
	
	@Autowired
	private UserServices userServices;

	@GetMapping("/all ")
	public List<UserDTO> allusers() {
		return userServices.findAllusers();
	}
	
	
	@PostMapping("/add")
		public String addUSer(@RequestBody UserDTO Userdata) {
		return userServices.saveUser(Userdata);
			
		}
		
	}


