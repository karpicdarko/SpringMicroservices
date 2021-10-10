package com.agile.restaurant.dto.restaurant;

import java.util.List;

public class RestaurantPostDto extends RestaurantDto{
	
	private List<Long> addresses;
	
	public List<Long> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Long> addresses) {
		this.addresses = addresses;
	}
	

}
