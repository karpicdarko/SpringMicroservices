package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.restaurant.RestaurantViewDto;
import com.agile.restaurant.model.Restaurant;

@Mapper()
public interface RestaurantMapper {
	
	RestaurantViewDto toViewDto(Restaurant restaurant);
	List<RestaurantViewDto> toViewDtos(List<Restaurant> restaurants);
}
