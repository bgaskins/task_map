package com.tasks.taskmap.service;

import com.tasks.taskmap.model.Goal;

public interface GoalService {
	
	
	//Create goal
	Goal createGoal(Goal goal);
	
	//Retrieve goal
	Goal getGoalById(Long goalId);
	
	//Update goal
	Goal updateGoal(Goal updatedGoal);
	
	//Delete goal
	Goal deleteGoal(Long goalId);

}
