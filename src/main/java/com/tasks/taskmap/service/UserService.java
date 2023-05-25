package com.tasks.taskmap.service;

import com.tasks.taskmap.model.User;

public interface UserService {
	
	//Service declarations for implementation
	
	//Create user 
	User createUser(User user);
	
	//Retrieve User
	User getUserById(Long userId);

	//Update user
	User updateUser(Long userId, User updatedUser);
	
	//Delete user
	User deleteUser(Long userId);


}
