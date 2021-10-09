package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.RestaurantPostDto;
import com.agile.restaurant.model.Restaurant;
import com.agile.restaurant.repository.RestaurantRepository;
import com.agile.restaurant.service.interfaces.RestaurantService;


@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	private final RestaurantRepository repository;
	
	
	public RestaurantServiceImpl(RestaurantRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Restaurant> findAll() {
		return repository.findAll();
	}

	@Override
	public Restaurant findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No Restaurant with specified id"));
	}

	@Override
	public Restaurant save(RestaurantPostDto restaurant) {
		Restaurant forCreate = new Restaurant(restaurant.getName());
		return repository.save(forCreate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Restaurant update(RestaurantPostDto updated, Long id) {
		Restaurant found = repository.findById(id).orElseThrow(() -> new RuntimeException("No Restaurant with specified id"));
		Restaurant forUpdate = new Restaurant(found.getId(), updated.getName());
		return repository.save(forUpdate);
		
	}
	
}
