package com.agile.restaurant.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Deliverer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private Boolean available;

	public Deliverer() {
		super();
	}

	public Deliverer(String firstName, String lastName, Boolean available) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.available = available;
	}

	public Deliverer(Long id, String firstName, String lastName, Boolean available) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.available = available;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Boolean getAvailable() {
		return available;
	}

}
