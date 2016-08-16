package com.example.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class ResourceAllocation {

	@Id
	@Column(name = "resource_allocation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resource_allocation_id;
	
//	@Column(name = "creation_date",nullable = false)
//	private Date creation_date;

	public ResourceAllocation() {
		super();
		
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",insertable = false, updatable = false)
	private User users;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "task_id",insertable = false, updatable = false)
	private Task tasks;

	public Integer getResource_allocation_id() {
		return resource_allocation_id;
	}

//	public Date getCreation_date() {
//		return creation_date;
//	}

//	public void setCreation_date(Date creation_date) {
//		this.creation_date = creation_date;
//	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Task getTasks() {
		return tasks;
	}

	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}
		
}
