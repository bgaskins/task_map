package com.tasks.taskmap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tasks.taskmap.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByUserId(Long userId);
	
	@Query(value = "INSERT INTO users (username, password, email) VALUES (?,?,?)", nativeQuery = true)
	public Optional<User> createUser(@Param("goal_id") Long userId,
			@Param("username") String username,
			@Param("password") String password,
			@Param("email") String email
			);
	
	@Query(value = "UPDATE users SET username=?, password=?, email=? WHERE user_id = :userId", nativeQuery = true)
	public Optional<User> updateUser(@Param("userId") Long userId);
	
	@Query(value = "DELETE FROM users WHERE user_id = :goalId", nativeQuery = true)
	public Optional<User> deleteUser(@Param("userId") Long userId);


}
