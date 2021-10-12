package com.agile.restaurant.utils;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.agile.restaurant.model.MenuItem;
import com.agile.restaurant.model.Restaurant;

@Service
public class RestaurantRestTemplate {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String RESTAURANT_URL = "http://localhost:8080/api/v1/restaurants";
	private final String MENU_ITEM_URL = "http://localhost:8080/api/v1/menu-items";
	
	public Restaurant getRestaurantById(Long id) {
        return restTemplate.getForObject(RESTAURANT_URL + "/" + id, Restaurant.class);
    }
	
	public MenuItem getMenuItemById(Long id) {
        return restTemplate.getForObject(MENU_ITEM_URL + "/" + id, MenuItem.class);
    }

}
