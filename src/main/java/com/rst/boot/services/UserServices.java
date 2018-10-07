package com.rst.boot.services;

import java.util.List;

import com.rst.boot.domain.UserDTO;

public interface UserServices {
	
	List<UserDTO> findAllusers();
	
	
	String saveUser(UserDTO Userdata);

}
