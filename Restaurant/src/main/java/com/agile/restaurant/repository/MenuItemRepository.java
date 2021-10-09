package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

}
