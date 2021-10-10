package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
