package com.agile.restaurant.dto.consumer;

public abstract class ConsumerDto {
	
	private String firstName;
	
	private String lastName;
	
	private String userName;

	public ConsumerDto() {
		super();
	}

	public ConsumerDto(String firstName, String lastName, String userName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
