package com.example.domain;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "contract_id")
	private Integer contract_id;

	@Column(name = "contract_text")
	private Blob contract_text;
	
	@Column(name = "contract_resource_id")
	private Integer contract_resource_id;
	
//	@Column(name = "creation_date",nullable = false)
//	private Date creationDate;
	
	@Column(name = "sows_contracttime_blob")
	private Blob sows_contracttime_blob;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contract_resource_id", insertable = false, updatable = false)
	private User users;	

	public Integer getContract_id() {
		return contract_id;
	}

	public Blob getContract_text() {
		return contract_text;
	}

	public void setContract_text(Blob contract_text) {
		this.contract_text = contract_text;
	}

	public Integer getContract_resource_id() {
		return contract_resource_id;
	}

	public void setContract_resource_id(Integer contract_resource_id) {
		this.contract_resource_id = contract_resource_id;
	}

//	public Date getCreationDate() {
//		return creationDate;
//	}

//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}

	public Blob getSows_contracttime_blob() {
		return sows_contracttime_blob;
	}

	public void setSows_contracttime_blob(Blob sows_contracttime_blob) {
		this.sows_contracttime_blob = sows_contracttime_blob;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Contract() {
		super();
	}	
	
}
