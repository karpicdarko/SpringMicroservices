package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
