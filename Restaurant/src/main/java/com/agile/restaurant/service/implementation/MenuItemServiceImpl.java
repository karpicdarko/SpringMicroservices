package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.menuItem.MenuItemPostDto;
import com.agile.restaurant.model.MenuItem;
import com.agile.restaurant.repository.MenuItemRepository;
import com.agile.restaurant.service.interfaces.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService{

	private final MenuItemRepository repository;
	
	public MenuItemServiceImpl(MenuItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<MenuItem> findAll() {
		return repository.findAll();
	}

	@Override
	public MenuItem findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No Menu item with specified id"));
	}

	@Override
	public MenuItem save(MenuItemPostDto menuItem) {
		MenuItem forCreate = new MenuItem(menuItem.getName(), menuItem.getPrice());
		return repository.save(forCreate);
	}

	@Override
	public MenuItem update(MenuItemPostDto updated, Long id) {
		MenuItem found = repository.findById(id).orElseThrow(() -> new RuntimeException("No Menu item with specified id"));
		MenuItem forUpdate = new MenuItem(found.getId(), updated.getName(), updated.getPrice());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
