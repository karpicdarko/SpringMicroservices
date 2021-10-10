package com.agile.restaurant.dto.menuItem;

public class MenuItemPostDto extends MenuItemDto{
	
	private Long restaurantId;

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	

}
