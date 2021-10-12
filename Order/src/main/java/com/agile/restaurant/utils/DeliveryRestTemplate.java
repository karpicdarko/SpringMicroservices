package com.agile.restaurant.utils;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agile.restaurant.model.Deliverer;
import com.agile.restaurant.model.DeliveryInfo;

@Service
public class DeliveryRestTemplate {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String DELIVERER_URL = "http://localhost:8083/api/v1/deliverer";
	private final String DELIVERY_INFO_URL = "http://localhost:8083/api/v1/delivery-infos";
	
	public Deliverer getDelivererById(Long id) {
        return restTemplate.getForObject(DELIVERER_URL + "/" + id, Deliverer.class);
    }
	
	public DeliveryInfo getDeliveryInfoById(Long id) {
        return restTemplate.getForObject(DELIVERY_INFO_URL + "/" + id, DeliveryInfo.class);
    }
}
