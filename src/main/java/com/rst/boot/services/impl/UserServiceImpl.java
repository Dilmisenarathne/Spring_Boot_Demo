package com.rst.boot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;



@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public 	List <UserDTO> findAllusers() {
		
		List <UserDTO> allusers = userRepository.findAll();
		return allusers;
	}

	@Override
	public String saveUser(UserDTO Userdata) {
		// TODO Auto-generated method stub
	userRepository.save(Userdata);
	return "data saved";
	}
	
	

}
