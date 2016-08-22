package com.example.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BillingInfo {
	
	@Id
	@Column(name = "billing_info_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billing_info_id;
	
	@Column(name = "BILLING_RATE")
	private String billingRate;
	
	@Column(name = "IS_BILLABLE")
	private Boolean isBillable;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName = "user_id",nullable=false)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id",insertable = false, updatable = false)
	private Project projects;
	
	
	public Integer getBilling_info_id() {
		return billing_info_id;
	}

	@JsonIgnore
	public User getUsers() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public String getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(String billingRate) {
		this.billingRate = billingRate;
	}

	public Boolean getIsBillable() {
		return isBillable;
	}

	public void setIsBillable(Boolean isBillable) {
		this.isBillable = isBillable;
	}
	

}
