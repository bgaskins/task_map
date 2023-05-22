package com.tasks.taskmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks.taskmap.model.Goal;
import com.tasks.taskmap.repository.GoalRepository;

@Service
public class GoalServiceImpl {
	
private GoalRepository goalRepository;
	
	@Autowired
	public GoalServiceImpl(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;
	}

	//Create goal
	public Goal createGoal(Goal goal) {

		
	}
			
	//Retrieve goal
	public Goal getGoalById(Long goalId) {

		
	}

	//Update goal
	public Goal updateGoal(Goal goal) {

		
	}
		
	//Delete goal
	public Goal deleteGoal(Long goalId) {
		

		
	}
}
