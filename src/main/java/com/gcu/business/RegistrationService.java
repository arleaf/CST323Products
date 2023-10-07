package com.gcu.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.UsersDataSevice;
import com.gcu.data.entity.UserEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class RegistrationService {
	
	@Autowired
	UsersDataSevice service;
	private static final Logger logger = LoggerFactory.getLogger(RegistrationService.class);

	/** 
	 * Creating a user within the UsersDataService
	 * 
	 * @param UserEntity the user were creating
	 * @return UserEntity returning null because we can create the user by the .create command
	 */
	public UserEntity register(UserEntity user) {
		logger.info("Entering RegistrationService.register()");
		//Add registerModel to database
		service.create(user);
		System.out.println("Successfully registered");
		return null;
	}
}
