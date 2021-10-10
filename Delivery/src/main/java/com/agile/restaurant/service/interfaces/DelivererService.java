package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.deliverer.DelivererPostDto;
import com.agile.restaurant.model.Deliverer;



public interface DelivererService {
	public List<Deliverer> findAll();
	public Deliverer findById(Long id);
	public Deliverer save(DelivererPostDto deliverer);
	public Deliverer update(DelivererPostDto updated, Long id);
	public void deleteById(Long id);
}
