package com.tasks.taskmap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasks.taskmap.model.Goal;

@RestController
@RequestMapping("api/goals")
public class GoalController {

		
		//GET request to retrieve goal ID
		@GetMapping("/{goalId}")
		public Goal getGoalById(@PathVariable("goalId") Long goalId) {
			
		}
		//POST request to create new goal
		@GetMapping("/")
		public Goal createGoal(@RequestBody Goal goal) {
			
		}
		//PUT request to update goal
		@GetMapping("/{goalId}")
		public Goal updateGoal(@PathVariable("goalId") Long goalId, @RequestBody Goal goal) {
			
		}
		//DELETE request to delete goal
		@GetMapping("/{goalId}")
		public Goal deleteGoal(@PathVariable("goalId") Long goalId) {
				
		}
}
