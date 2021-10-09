package com.agile.restaurant.dto;

public abstract class AddressDto {
	
	private String streetNumber;
	
	private String street;
	
	private String city;
	
	private String zipCode;

	public AddressDto() {
		super();
	}

	public AddressDto(String streetNumber, String street, String city, String zipCode) {
		super();
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
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

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

}
