package com.tasks.taskmap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasks.taskmap.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
