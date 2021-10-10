package com.agile.restaurant.utils;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agile.restaurant.model.Address;

@Service
public class AddressRestTemplate {
	
	private final RestTemplate restTemplate = new RestTemplate();
	private final String URL = "http://localhost:8081/api/v1/addresses";
	
	public Address getAddressById(Long id) {
        return restTemplate.getForObject(URL + "/" + id, Address.class);
    }
}
