package com.agile.restaurant.dto.menuItem;

public abstract class MenuItemDto {
	
	private String name;
	
	private float price;

	public MenuItemDto() {
		super();
	}

	public MenuItemDto(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
