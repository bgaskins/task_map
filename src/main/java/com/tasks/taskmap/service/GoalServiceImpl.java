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
		return goalRepository.save(goal);
	}
			
	//Retrieve goal
	public Goal getGoalById(Long goalId) {
		if (goalRepository.findById(goalId).isPresent()){
			return goalRepository.findById(goalId).get();
		}
		else {
			return null;
		}
	}

	//Update goal
	public Goal updateGoal(Long goalId, Goal updatedGoal) {
		if(goalRepository.findById(goalId).isPresent()) {
			Goal oldGoal= goalRepository.findById(goalId).get();
			oldGoal.setDestinationCity(updatedGoal.getDestinationCity());
			oldGoal.setTargetDistance(updatedGoal.getTargetDistance());
			oldGoal.setTimeframe(updatedGoal.getTimeframe());
	
			return goalRepository.save(oldGoal);
		}
		else {
			return null;
		}
	}
		
	//Delete goal
	public boolean deleteGoal(Long goalId) {
		if(goalRepository.existsById(goalId)) {
			goalRepository.deleteById(goalId);
			return true;
		}
		
		else {
			return false;
		}
	}
}
