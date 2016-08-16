package com.example.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Task {
	
	@Id
	@Column(name = "task_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer task_id;
	
	@Column(name = "task_description")
	private String task_description;
	
//	@Column(name = "creation_date",nullable = false)
//	private Date creation_date;
	
	@Column(name = "assigned_time")
	private String assigned_time;
	
	@Column(name = "actual_time_spent")
	private String actual_time_spent;
	
	@Column(name = "remaining_time")
	private String remaining_time;
	
	@Column(name = "task_status")
	private String task_status;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tasks", fetch = FetchType.LAZY)
	//private Set<UserStory> user_stories;
	private List<UserStory> user_stories;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tasks", fetch = FetchType.LAZY)
	//private Set<ResourceAllocation> resourceallocations;
	private List<ResourceAllocation> resourceallocations;
	
	public Integer getTask_id() {
		return task_id;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

//	public Date getCreation_date() {
//		return creation_date;
//	}

//	public void setCreation_date(Date creation_date) {
//		this.creation_date = creation_date;
//	}

	public String getAssigned_time() {
		return assigned_time;
	}

	public void setAssigned_time(String assigned_time) {
		this.assigned_time = assigned_time;
	}

	public String getActual_time_spent() {
		return actual_time_spent;
	}

	public void setActual_time_spent(String actual_time_spent) {
		this.actual_time_spent = actual_time_spent;
	}

	public String getRemaining_time() {
		return remaining_time;
	}

	public void setRemaining_time(String remaining_time) {
		this.remaining_time = remaining_time;
	}

	public String getTask_status() {
		return task_status;
	}

	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}

	public Task() {
		super();
		
	}

	public List<UserStory> getUser_stories() {
		return user_stories;
	}

	public void setUser_stories(List<UserStory> user_stories) {
		this.user_stories = user_stories;
	}

	public List<ResourceAllocation> getResourceallocations() {
		return resourceallocations;
	}

	public void setResourceallocations(List<ResourceAllocation> resourceallocations) {
		this.resourceallocations = resourceallocations;
	}

	
	
	

}
