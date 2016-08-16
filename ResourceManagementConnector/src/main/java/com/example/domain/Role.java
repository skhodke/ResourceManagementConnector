package com.example.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Role {
	
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer role_id;
	
	@Column(name = "role_type")
	private String role_type;
	
	@Column(name = "role_level")
	private Integer role_level;
	
	@Column(name = "role_status")
	private Integer role_status;
	
	@Column(name = "role_resource_id")
	private Integer role_resource_id;
	
//	@Column(name = "creation_date",nullable = false)
//	private Date creation_date;
//	
//	public Date getCreation_date() {
//		return creation_date;
//	}

	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_resource_id",insertable = false, updatable = false)
	private User users;
	
	public Integer getRole_id() {
		return role_id;
	}

	public String getRole_type() {
		return role_type;
	}

	public Role() {
		super();
		
	}

	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}

	public Integer getRole_level() {
		return role_level;
	}

	public void setRole_level(Integer role_level) {
		this.role_level = role_level;
	}

	public Integer getRole_status() {
		return role_status;
	}

	public void setRole_status(Integer role_status) {
		this.role_status = role_status;
	}

	public Integer getRole_resource_id() {
		return role_resource_id;
	}

	public void setRole_resource_id(Integer role_resource_id) {
		this.role_resource_id = role_resource_id;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}
	
	

}
