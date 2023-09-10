package com.gcu.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.UsersDataSevice;
import com.gcu.data.entity.UserEntity;

@Service
public class RegistrationService {
	
	@Autowired
	UsersDataSevice service;
	
	/** 
	 * Creating a user within the UsersDataService
	 * 
	 * @param UserEntity the user were creating
	 * @return UserEntity returning null because we can create the user by the .create command
	 */
	public UserEntity register(UserEntity user) {
		//Add registerModel to database
		service.create(user);
		System.out.println("Successfully registered");
		return null;
	}
}
