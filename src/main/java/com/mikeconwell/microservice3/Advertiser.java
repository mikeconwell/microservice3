package com.mikeconwell.microservice3;

import javax.persistence.Entity;

@Entity
public class Advertiser extends BaseEntity {
	private String name;         // varchar(512) in database
	private String contact;      // varchar(255) in database 
	private Float credit_limit;  // decimal in database

	protected Advertiser() {
		super();
	}

	public Advertiser(String name, String contact, Float credit_limit) {
		this();
		this.name = name;
		this.contact = contact;
		this.credit_limit = credit_limit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Float getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(Float credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	
	
}
