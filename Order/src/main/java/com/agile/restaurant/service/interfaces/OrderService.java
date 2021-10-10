package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.order.OrderPostDto;
import com.agile.restaurant.model.Order;

public interface OrderService {
	public List<Order> findAll();
	public Order findById(Long id);
	public Order save(OrderPostDto order);
	public Order update(OrderPostDto updated, Long id);
	public void deleteById(Long id);
}
