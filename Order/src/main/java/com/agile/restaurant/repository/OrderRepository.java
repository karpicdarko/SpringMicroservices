package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
