package com.example.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class UserStory {
	
	@Id
	@Column(name = "user_stroy_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_story_id;
	
	@Column(name = "user_story_description")
	private String user_story_description;
	
//	@Column(name = "creation_date")
//	private Date creation_date;
	
	@Column(name = "estimated_time")
	private String estimated_time;
	
	@Column(name = "actual_time_spent")
	private String actual_time_spent;
	
	@Column(name = "remaining_time")
	private String remaining_time;
	
	@Column(name = "user_story_status")
	private String user_story_status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id",insertable = false,updatable = false)
	private Project projects;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "task_id",insertable = false,updatable = false)
	private Task tasks;
	
	
	public UserStory() {
		super();
		
	}

	public Integer getUser_story_id() {
		return user_story_id;
	}

	public String getUser_story_description() {
		return user_story_description;
	}

	public void setUser_story_description(String user_story_description) {
		this.user_story_description = user_story_description;
	}

//	public Date getCreation_date() {
//		return creation_date;
//	}

//	public void setCreation_date(Date creation_date) {
//		this.creation_date = creation_date;
//	}

	public String getEstimated_time() {
		return estimated_time;
	}

	public void setEstimated_time(String estimated_time) {
		this.estimated_time = estimated_time;
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

	public String getUser_story_status() {
		return user_story_status;
	}

	public void setUser_story_status(String user_story_status) {
		this.user_story_status = user_story_status;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	
}
