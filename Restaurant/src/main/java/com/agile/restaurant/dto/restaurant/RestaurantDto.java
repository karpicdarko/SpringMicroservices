package com.agile.restaurant.dto.restaurant;

public abstract class RestaurantDto {
	private String name;

	public RestaurantDto() {
		super();
	}

	public RestaurantDto(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
