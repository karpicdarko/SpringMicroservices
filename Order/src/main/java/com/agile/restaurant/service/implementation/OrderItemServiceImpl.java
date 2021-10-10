package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.orderitem.OrderItemPostDto;
import com.agile.restaurant.model.OrderItem;
import com.agile.restaurant.repository.OrderItemRepository;
import com.agile.restaurant.service.interfaces.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	
	private final OrderItemRepository repository;
	

	public OrderItemServiceImpl(OrderItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	@Override
	public OrderItem findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No order item with specified id"));
	}

	@Override
	public OrderItem save(OrderItemPostDto orderItem) {
		OrderItem forCreate = new OrderItem(orderItem.getQuantity());
		return repository.save(forCreate);
	}

	@Override
	public OrderItem update(OrderItemPostDto updated, Long id) {
		OrderItem found = repository.findById(id).orElseThrow(() -> new RuntimeException("No order item with specified id"));
		OrderItem forUpdate = new OrderItem(found.getId(), updated.getQuantity());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
