package com.agile.restaurant.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String streetNumber;
	
	private String street;
	
	private String city;
	
	private String zipCode;

	public Address() {
		super();
	}

	public Address(String streetNumber, String street, String city, String zipCode) {
		super();
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Address(Long id, String streetNumber, String street, String city, String zipCode) {
		super();
		this.id = id;
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Long getId() {
		return id;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}
	
	
	

}

