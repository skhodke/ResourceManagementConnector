package com.example.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;



@Entity
public class Project {
	
	@Id
	@Column(name = "project_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer project_id;
	
	@Column(name = "project_name")
	private String project_name;
	
//	@Column(name = "creation_date")
//	private Date creation_date;
//	
	@Column(name = "project_timeline")
	private Integer project_timeline;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projects", fetch = FetchType.LAZY)
	//private Set<BillingInfo> billinginfos;
	private List<BillingInfo> billinginfos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "projects", fetch = FetchType.LAZY)
	//private Set<UserStory> userstories;
	private List<UserStory> userstories;
	
	public Integer getProject_id() {
		return project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

//	public Date getCreation_date() {
//		return creation_date;
//	}

//	public void setCreation_date(Date creation_date) {
//		this.creation_date = creation_date;
//	}

	public Integer getProject_timeline() {
		return project_timeline;
	}

	public void setProject_timeline(Integer project_timeline) {
		this.project_timeline = project_timeline;
	}

	public Project() {
		super();
		
	}

	public List<BillingInfo> getBillinginfos() {
		return billinginfos;
	}

	public void setBillinginfos(List<BillingInfo> billinginfos) {
		this.billinginfos = billinginfos;
	}

	public List<UserStory> getUserstories() {
		return userstories;
	}

	public void setUserstories(List<UserStory> userstories) {
		this.userstories = userstories;
	}
}
