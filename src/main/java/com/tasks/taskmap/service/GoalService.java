package com.tasks.taskmap.service;

import com.tasks.taskmap.model.Goal;

public interface GoalService {
	
	//Service declarations for implementation
	
	//Create goal
	Goal createGoal(Goal goal);
	
	//Retrieve goal
	Goal getGoalById(Long goalId);
	
	//Update goal
	Goal updateGoal(Long goalId, Goal updatedGoal);
	
	//Delete goal
	boolean deleteGoal(Long goalId);

}
