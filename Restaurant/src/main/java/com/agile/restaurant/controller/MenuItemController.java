package com.agile.restaurant.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.agile.restaurant.dto.menuItem.MenuItemPostDto;
import com.agile.restaurant.dto.menuItem.MenuItemViewDto;
import com.agile.restaurant.mapper.MenuItemMapper;
import com.agile.restaurant.model.MenuItem;
import com.agile.restaurant.service.interfaces.MenuItemService;

@RestController
@RequestMapping("/api/v1/menu-items")
public class MenuItemController {
	
	private final MenuItemService service;
	private final MenuItemMapper mapper;
	public MenuItemController(MenuItemService service, MenuItemMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<MenuItemViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<MenuItemViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<MenuItemViewDto> create(@RequestBody MenuItemPostDto menuItem) {
		MenuItem created = service.save(menuItem);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<MenuItemViewDto> update(@RequestBody MenuItemPostDto updated, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(updated, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

	
	

}
