package com.example.domain;

import javax.persistence.*;

@Entity
public class UserPermission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_permission_id")
	private Integer user_permission_id;
	
	@Column(name = "user_email_id",unique = true)
	private String user_email_id;
	
	@Column(name = "access_status")
	private Integer access_status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_email_id", insertable = false, updatable = false)
	private User users;	
	
	public UserPermission() {
		super();
		
	}

	public Integer getUser_permission_id() {
		return user_permission_id;
	}

	public String getUser_email_id() {
		return user_email_id;
	}

	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}

	public Integer getAccess_status() {
		return access_status;
	}

	public void setAccess_status(Integer access_status) {
		this.access_status = access_status;
	}
	

	
	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}
}
