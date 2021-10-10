package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.order.OrderPostDto;
import com.agile.restaurant.model.Order;
import com.agile.restaurant.repository.OrderRepository;
import com.agile.restaurant.service.interfaces.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	private final OrderRepository repository;

	public OrderServiceImpl(OrderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}

	@Override
	public Order findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No order with specified id"));
	}

	@Override
	public Order save(OrderPostDto order) {
		Order forCreate = new Order(order.getState());
		return repository.save(forCreate);
	}

	@Override
	public Order update(OrderPostDto updated, Long id) {
		Order found = repository.findById(id).orElseThrow(() -> new RuntimeException("No order with specified id"));
		Order forUpdate = new Order(found.getId(), updated.getState());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
