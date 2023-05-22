package com.tasks.taskmap.service;

import com.tasks.taskmap.model.User;

public interface UserService {
	
	//Create user
	User createUser(User user);
		
	//Retrieve User
	User getUserById(Long userId);

	//Update user
	User updateUser(User user);
	
	//Delete user
	User deleteUser(Long userId) ;


}
