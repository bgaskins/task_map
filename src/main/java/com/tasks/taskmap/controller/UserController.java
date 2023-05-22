package com.tasks.taskmap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasks.taskmap.model.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	//GET request to retrieve user ID
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		
	}
	//POST request to create new user 
	@GetMapping("/")
	public User createUser(@RequestBody User user) {
		
	}
	//PUT request to update user
	@GetMapping("/{userId}")
	public User updateUser(@PathVariable("userId") Long userId, @RequestBody User user) {
		
	}
	//DELETE request to update user
	@GetMapping("/{userId}")
	public User deleteUser(@PathVariable("userId") Long userId) {
			
	}
}
