package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.orderitem.OrderItemPostDto;
import com.agile.restaurant.model.OrderItem;

public interface OrderItemService {
	public List<OrderItem> findAll();
	public OrderItem findById(Long id);
	public OrderItem save(OrderItemPostDto orderItem);
	public OrderItem update(OrderItemPostDto updated, Long id);
	public void deleteById(Long id);

}
