package com.mikeconwell.microservice3;

public class Advertiser {
	
	private long id;
	private String name;         // varchar(512) in database
	private String contact;      // varchar(255) in database 
	private Float credit_limit;  // decimal in database

	public Advertiser(long id, String name, String contact, Float credit_limit) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.credit_limit = credit_limit;
	}
	
	public long advertiserAdd(String name, String contact, Float credit_limit) {
		this.name = name;
		this.contact = contact;
		this.credit_limit = credit_limit;
		
		long advertiser_id = 0; 
		
		
		//TODO SQL Call to test if advertiser.name already exists, 
		//TODO if not add record
		//TODO if advertiser.name already exists, return error
		
		return advertiser_id;
	}
	
	

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public Float getCredit_limit() {
		return credit_limit;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setCredit_limit(Float credit_limit) {
		this.credit_limit = credit_limit;
	}

	
	
	
}
