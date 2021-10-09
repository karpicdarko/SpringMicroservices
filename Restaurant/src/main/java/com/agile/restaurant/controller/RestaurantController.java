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

import com.agile.restaurant.dto.RestaurantPostDto;
import com.agile.restaurant.dto.RestaurantViewDto;
import com.agile.restaurant.mapper.RestaurantMapper;
import com.agile.restaurant.model.Restaurant;
import com.agile.restaurant.service.interfaces.RestaurantService;

@RestController
@RequestMapping("api/v1/restaurants")
public class RestaurantController {
	
	private final RestaurantService service;
	private final RestaurantMapper mapper;

	public RestaurantController(RestaurantService service, RestaurantMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<RestaurantViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<RestaurantViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<RestaurantViewDto> create(@RequestBody RestaurantPostDto restaurant) {
		Restaurant created = service.save(restaurant);
		System.out.println("Ovo je created rest " + created.getName());
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		System.out.println("Ovo je mappiran " + mapper.toViewDto(created).getName());
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<RestaurantViewDto> update(@RequestBody RestaurantPostDto restaurant, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(restaurant, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
