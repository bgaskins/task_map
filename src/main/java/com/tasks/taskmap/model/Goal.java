package com.tasks.taskmap.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "goals")
@Data
public class Goal {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="goal_id")
	private Long goalId;

	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
	
	@Column(name="destination_city")
	private String destinationCity;
	
	@Column(name="target_distance")
	private String targetDistance;
	
	@Column(name="timeframe")
	private int timeframe;
	
	@Column(name="created_at")
	@CreationTimestamp
	private Date createdAt;
	
	@Column(name="updated_at")
	@UpdateTimestamp
	private Date updatedAt;

	

	
}
