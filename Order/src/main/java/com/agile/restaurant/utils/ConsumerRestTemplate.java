package com.agile.restaurant.utils;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agile.restaurant.model.Consumer;

@Service
public class ConsumerRestTemplate {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String URL = "http://localhost:8082/api/v1/consumers";
	
	public Consumer getConsumerById(Long id) {
        return restTemplate.getForObject(URL + "/" + id, Consumer.class);
    }
}
