package com.agile.restaurant.dto.restaurant;

import java.util.List;

public class RestaurantViewDto extends RestaurantDto {
	
	private Long id;
	
	private List<String> menu;
	
	private List<String> addresses;
	
	public Long getId() {
		return id;
	}
	
	
	public List<String> getMenu() {
		return menu;
	}


	public List<String> getAddresses() {
		return addresses;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	
	

}
	