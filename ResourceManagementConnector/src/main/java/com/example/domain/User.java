package com.example.domain;


import java.util.*;

import javax.persistence.*;

import org.springframework.data.domain.Persistable;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity 
public class User implements Persistable<Integer> {

	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "user_id")
	private Integer user_id;
	
	@Column(name = "user_email_id",unique = true)
	private String emailId;
	
	@Column(name="password",unique = true)
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name="access_level")
	private Integer accessLevel;
		
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "user_expertise_level")
	private String expertiseLevel;
	
	@Column(name = "user_skill_set")
	private String skillSet;
	
	@Column(name = "user_location")
	private String location;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<BillingInfo> billinginfos;
	
	/*
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user",fetch = FetchType.LAZY)
	private List<UserPermission> userPermissions;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "users",fetch = FetchType.LAZY)
	private List<Contract> contracts;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user", fetch = FetchType.LAZY)
	private List<Role> roles;*/
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users", fetch = FetchType.LAZY)
	private List<ResourceAllocation> resourceallocation;*/
	
	public User() {
		super();
	}

	public User(String emailId, String password, String firstName, String lastName, Integer accessLevel, Date startDate, String company, String expertiseLevel, String skillSet, String location) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accessLevel = accessLevel;
		this.company = company;
		this.startDate = startDate;
		this.location = location;
		this.expertiseLevel = expertiseLevel;
		this.skillSet = skillSet;
		
	}

	public Integer getId() {
		return user_id;
	}

	public void setId(Integer id) {
		user_id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getCompany() {
		return company;
	}

	public void setCompnay(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getExpertiseLevel() {
		return expertiseLevel;
	}

	public void setExpertiseLevel(String expertiseLevel) {
		this.expertiseLevel = expertiseLevel;
	}
	
	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
/*	
	public List<Contract>  getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts =contracts;
	}
	
	public List<UserPermission>  getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}
	
	public List<Role> getRoles() {
		return  roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	*/
	public List<BillingInfo> getBillingInfos() {
		return  billinginfos;
	}

	public void setBillingInfos(BillingInfo billinginfo) {
		if(billinginfos == null)
			billinginfos = new ArrayList<BillingInfo>();
		billinginfo.setUser(this);
		billinginfos.add(billinginfo);
	}
		
	
	@Override
	public String toString() {
		return "User [Id=" + user_id + ", emailId=" + emailId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", accessLevel=" + accessLevel + ""
				+  "]";
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
