package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.order.OrderPostDto;
import com.agile.restaurant.model.Consumer;
import com.agile.restaurant.model.Deliverer;
import com.agile.restaurant.model.DeliveryInfo;
import com.agile.restaurant.model.MenuItem;
import com.agile.restaurant.model.Order;
import com.agile.restaurant.repository.OrderRepository;
import com.agile.restaurant.service.interfaces.OrderService;
import com.agile.restaurant.utils.ConsumerRestTemplate;
import com.agile.restaurant.utils.DeliveryRestTemplate;
import com.agile.restaurant.utils.RestaurantRestTemplate;

@Service
public class OrderServiceImpl implements OrderService{
	
	private final OrderRepository repository;
	private final ConsumerRestTemplate consumerRestTemplate;
	private final DeliveryRestTemplate deliveryRestTemplate;
	private final RestaurantRestTemplate restaurantRestTemplate;
	
	

	public OrderServiceImpl(OrderRepository repository, ConsumerRestTemplate consumerRestTemplate,
			DeliveryRestTemplate deliveryRestTemplate, RestaurantRestTemplate restaurantRestTemplate) {
		super();
		this.repository = repository;
		this.consumerRestTemplate = consumerRestTemplate;
		this.deliveryRestTemplate = deliveryRestTemplate;
		this.restaurantRestTemplate = restaurantRestTemplate;
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
		MenuItem menuItem = restaurantRestTemplate.getMenuItemById(order.getItemId());
		Consumer consumer = consumerRestTemplate.getConsumerById(order.getConsumerId());
		DeliveryInfo deliveryInfo = deliveryRestTemplate.getDeliveryInfoById(order.getDeliveryId());
		Deliverer deliverer = deliveryRestTemplate.getDelivererById(order.getDelivererId());
		Order forCreate = new Order(order.getState(), order.getQuantity(), menuItem, consumer, deliveryInfo, deliverer);
		return repository.save(forCreate);
	}

	@Override
	public Order update(OrderPostDto updated, Long id) {
		Order found = repository.findById(id).orElseThrow(() -> new RuntimeException("No order with specified id"));
		Order forUpdate = new Order(found.getId(), updated.getState(), found.getQuantity(), found.getMenuItem(), found.getConsumer(), found.getDeliveryInfo(), found.getDeliverer());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
