package com.example.domain;


import java.util.*;

import javax.persistence.*;

@Entity 
public class User {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "user_id",nullable = false)
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
	
//	@Column(name = "creation_date",nullable = false)
//	private Date creationDate;
	
//	@Column(name = "last_update",nullable = false)
//	private Date lastUpdate;
//	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "users",fetch = FetchType.LAZY)
	//private Set<UserPermission> userPermissions;
	private List<UserPermission> userPermissions;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "users",fetch = FetchType.LAZY)
	//private Set<Contract> contracts;
	private List<Contract> contracts;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "users", fetch = FetchType.LAZY)
	//private Set<Role> roles;
	private List<Role> roles;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users", fetch = FetchType.LAZY)
	//private Set<BillingInfo> billinginfos;
	private List<BillingInfo> billinginfos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users", fetch = FetchType.LAZY)
	//private Set<ResourceAllocation> resourceallocation;
	private List<ResourceAllocation> resourceallocation;
	
	public User() {
		super();
		
	}

	public User(Integer id, String emailId, String password, String firstName, String lastName, Integer accessLevel,
			Date creationDate, Date lastUpdate) {
		super();
		user_id = id;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accessLevel = accessLevel;
		//this.creationDate = creationDate;
		//this.lastUpdate = lastUpdate;
	}

	public Integer getId() {
		return user_id;
	}

//	public void setId(Integer id) {
//		Id = id;
//	}

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

//	public Date getCreationDate() {
//		return creationDate;
//	}

//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}

//	public Date getLastUpdate() {
//		return lastUpdate;
//	}
//
//	public void setLastUpdate(Date lastUpdate) {
//		this.lastUpdate = lastUpdate;
//	}

	@Override
	public String toString() {
		return "User [Id=" + user_id + ", emailId=" + emailId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", accessLevel=" + accessLevel + ""
				+  "]";
	}

	public List<UserPermission> getUserPermissions() {
		return userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<BillingInfo> getBillinginfos() {
		return billinginfos;
	}

	public void setBillinginfos(List<BillingInfo> billinginfos) {
		this.billinginfos = billinginfos;
	}

	public List<ResourceAllocation> getResourceallocation() {
		return resourceallocation;
	}

	public void setResourceallocation(List<ResourceAllocation> resourceallocation) {
		this.resourceallocation = resourceallocation;
	}

	
}
