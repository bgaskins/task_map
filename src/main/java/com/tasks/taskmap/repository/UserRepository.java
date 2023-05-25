package com.tasks.taskmap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasks.taskmap.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByUserId(Long userId);


}
