package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.RestaurantPostDto;
import com.agile.restaurant.model.Restaurant;

public interface RestaurantService {
	public List<Restaurant> findAll();
	public Restaurant findById(Long id);
	public Restaurant save(RestaurantPostDto restaurant);
	public Restaurant update(RestaurantPostDto restaurant, Long id);
	public void deleteById(Long id);
}
