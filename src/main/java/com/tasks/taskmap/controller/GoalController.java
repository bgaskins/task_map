package com.tasks.taskmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasks.taskmap.model.Goal;
import com.tasks.taskmap.service.GoalService;

@RestController
@RequestMapping("/api/goals")
public class GoalController{
	
	@Autowired
	private GoalService goalService;

		
		//GET request to retrieve goal ID
		@GetMapping("/{goalId}")
		public Goal getGoalById(@PathVariable("goalId") Long goalId) {
			return goalService.getGoalById(goalId);
		}
		

		//POST request to create new goal
		@PostMapping("/")
		public ResponseEntity<Goal> createGoal(@RequestBody Goal goal) {
		    try {
		        Goal createdGoal = goalService.createGoal(goal);
		        return ResponseEntity.status(HttpStatus.CREATED).body(createdGoal);
		    } catch (Exception e) {
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		    }
		}
			
		//PUT request to update goal
		@PutMapping("/{goalId}")
		public ResponseEntity<Goal> updateGoal(@PathVariable("goalId") Long goalId, @RequestBody Goal goal) {
				Goal goalData = goalService.updateGoal(goalId, goal);			
					if (goalData != null) {
						return new ResponseEntity<>(goalData,HttpStatus.OK);
					} else {
						return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			  }
		}
		
		
		//DELETE request to delete goal
		@DeleteMapping("/{goalId}")
		public ResponseEntity<String> deleteGoal(@PathVariable("goalId") Long goalId) {
				  boolean result = goalService.deleteGoal(goalId);
					if(result) {
						return new ResponseEntity<String>("Goal deleted",HttpStatus.OK);
					}else { 
						return new ResponseEntity<String>("Goal does not exist", HttpStatus.NOT_FOUND);
					}
			  }
				
		}
