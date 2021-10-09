package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.menuItem.MenuItemPostDto;
import com.agile.restaurant.model.MenuItem;


public interface MenuItemService {
	public List<MenuItem> findAll();
	public MenuItem findById(Long id);
	public MenuItem save( MenuItemPostDto menuItem);
	public MenuItem update(MenuItemPostDto updated, Long id);
	public void deleteById(Long id);
}
