package com.tasks.taskmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks.taskmap.model.User;
import com.tasks.taskmap.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//Create user
	public User createUser(User user) {

		
	}
			
	//Retrieve User
	public User getUserById(Long userId) {

		
	}

	//Update user
	public User updateUser(User user) {

		
	}
		
	//Delete user
	public User deleteUser(Long userId) {
		

		
	}

	

}
