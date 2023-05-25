package com.tasks.taskmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasks.taskmap.model.User;
import com.tasks.taskmap.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	//GET request to retrieve user ID
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}
	//POST request to create new user
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user) {
	    try {
	        User createdUser = userService.createUser(user);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}
		
	//PUT request to update user
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable("userId") Long userId, @RequestBody User user) {
		User userData = userService.updateUser(userId, user);			
			if (userData != null) {
				return new ResponseEntity<>(userData,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	}
	
	
	//DELETE request to delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable("userId") Long userId) {
		boolean result = userService.deleteUser(userId);
			if(result) {
				return new ResponseEntity<String>("User deleted",HttpStatus.OK);
				} else { 
					return new ResponseEntity<String>("User does not exist", HttpStatus.NOT_FOUND);
				}
		  }
}
