package com.mikeconwell.microservice3;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private final Long id;

	public BaseEntity() {
		id = null;
	}

}
