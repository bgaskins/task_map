package com.tasks.taskmap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tasks.taskmap.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long>{
	
	Optional<Goal> findById(Long goalId);
	
	@Query(value = "SELECT * FROM goals", nativeQuery = true)
	public Optional<Goal> getAllGoals();
	
	@Query(value = "INSERT INTO goals (goal_id, goal_id, goal_title, destination_city, target_distance, timeframe) VALUES (?,?,?,?,?,?)", nativeQuery = true)
	public Optional<Goal> createGoal(@Param("goal_id") Long goalId,
			@Param("goal_title") String goalTitle,
			@Param("destination_city") String destinationCity,
			@Param("target_distance") String targetDistance,
			@Param("timeframe") String timeframe
			);
	
	@Query(value = "UPDATE goals SET goal_title=?, destination_city=?, target_distance=?, timeframe=? WHERE id= :id", nativeQuery = true)
	public Optional<Goal> updateGoal(@Param("id") Long id);
	
	@Query(value = "DELETE FROM goals WHERE goal_id = :goalId", nativeQuery = true)
	public Optional<Goal> deleteGoal(@Param("goalId") Long goalId);
}


