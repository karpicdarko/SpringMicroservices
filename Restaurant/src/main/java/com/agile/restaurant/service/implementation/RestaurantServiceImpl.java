package com.agile.restaurant.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.restaurant.RestaurantPostDto;
import com.agile.restaurant.model.Address;
import com.agile.restaurant.model.Restaurant;
import com.agile.restaurant.repository.RestaurantRepository;
import com.agile.restaurant.service.interfaces.RestaurantService;
import com.agile.restaurant.utils.AddressRestTemplate;


@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	private final RestaurantRepository repository;
	private final AddressRestTemplate addressRestTemplate;
	
	
	public RestaurantServiceImpl(RestaurantRepository repository, AddressRestTemplate addressRestTemplate) {
		super();
		this.repository = repository;
		this.addressRestTemplate = addressRestTemplate;
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
		List<Address> addresses = new ArrayList<>();
		for (Long id : restaurant.getAddresses()) {
			addresses.add(addressRestTemplate.getAddressById(id));
		}
		Restaurant forCreate = new Restaurant(restaurant.getName(), addresses);
		return repository.save(forCreate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Restaurant update(RestaurantPostDto updated, Long id) {
		Restaurant found = repository.findById(id).orElseThrow(() -> new RuntimeException("No Restaurant with specified id"));
		Restaurant forUpdate = new Restaurant(found.getId(), updated.getName(), found.getAddresses());
		return repository.save(forUpdate);
		
	}
	
}
