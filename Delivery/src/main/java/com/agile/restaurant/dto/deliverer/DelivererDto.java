package com.agile.restaurant.dto.deliverer;

public abstract class DelivererDto {
	
	private String firstName;
	
	private String lastName;
	
	private Boolean available;

	public DelivererDto() {
		super();
	}

	public DelivererDto(String firstName, String lastName, Boolean available) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.available = available;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
	
}
