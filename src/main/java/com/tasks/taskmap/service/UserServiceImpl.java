package com.tasks.taskmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks.taskmap.model.Goal;
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
		return userRepository.save(user);
	}
			
	//Retrieve User
	public User getUserById(Long userId) {
		if (userRepository.findById(userId).isPresent()){
			return userRepository.findById(userId).get();
		}
		else {
			return null;
		}
	}

	//Update user
	public User updateUser(Long userId, User updatedUser) {
		if(userRepository.findById(userId).isPresent()) {
			User oldUser= userRepository.findById(userId).get();
			oldUser.setUsername(updatedUser.getUsername());
			oldUser.setPassword(updatedUser.getPassword());
			oldUser.setEmail(updatedUser.getEmail());
	
			return userRepository.save(oldUser);
		}
		else {
			return null;
		}
	}
		
	//Delete user
	public boolean deleteUser(Long userId) {
		if(userRepository.existsById(userId)) {
			userRepository.deleteById(userId);
			return true;
		}
		
		else {
			return false;
		}
	}


}
