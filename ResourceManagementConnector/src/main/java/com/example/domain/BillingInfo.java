package com.example.domain;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.*;

@Entity
public class BillingInfo {
	
	@Id
	@Column(name = "billing_info_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billing_info_id;
	
	@Column(name = "billing_blob")
	private Blob billing_blob;
	
//	@Column(name = "creation_date")
//	private Date creation_date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private User users;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id",insertable = false, updatable = false)
	private Project projects;
	
	
	public Integer getBilling_info_id() {
		return billing_info_id;
	}

	public Blob getBilling_blob() {
		return billing_blob;
	}

	public void setBilling_blob(Blob billing_blob) {
		this.billing_blob = billing_blob;
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

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}
	

}
