package com.agile.restaurant.dto.menuItem;

public class MenuItemViewDto extends MenuItemDto{
	
	private Long id;
	
	private Long restaurantId;
	
	private String restaurantName;

	public Long getId() {
		return id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	
	
	
}
