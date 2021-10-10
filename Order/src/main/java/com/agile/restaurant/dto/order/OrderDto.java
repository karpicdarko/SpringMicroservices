package com.agile.restaurant.dto.order;

public abstract class OrderDto {
	
	private String state;

	public OrderDto() {
		super();
	}

	public OrderDto(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
