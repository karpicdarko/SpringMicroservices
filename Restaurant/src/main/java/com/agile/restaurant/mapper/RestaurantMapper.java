package com.agile.restaurant.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.restaurant.RestaurantViewDto;
import com.agile.restaurant.model.Address;
import com.agile.restaurant.model.MenuItem;
import com.agile.restaurant.model.Restaurant;


@Mapper()
public interface RestaurantMapper {
	
	
	default RestaurantViewDto toViewDto(Restaurant restaurant) {
		RestaurantViewDto viewDto = new RestaurantViewDto();
		viewDto.setId(restaurant.getId());
		viewDto.setName(restaurant.getName());
		List<String> menu = new ArrayList<>();
		List<String> addresses = new ArrayList<>();
		if(restaurant.getMenu() != null) {
			for (MenuItem item : restaurant.getMenu()) {
				menu.add(item.getName());
			}
			for (Address address : restaurant.getAddresses()) {
				addresses.add(address.getStreet() + " " + address.getStreetNumber() + ", " + address.getZipCode()  + " " + address.getCity());
			}
		}
		viewDto.setMenu(menu);
		viewDto.setAddresses(addresses);
		return viewDto;
	}
	List<RestaurantViewDto> toViewDtos(List<Restaurant> restaurants);
}
