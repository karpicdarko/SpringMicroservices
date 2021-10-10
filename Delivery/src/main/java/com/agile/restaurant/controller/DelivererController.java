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

import com.agile.restaurant.dto.deliverer.DelivererPostDto;
import com.agile.restaurant.dto.deliverer.DelivererViewDto;
import com.agile.restaurant.mapper.DelivererMapper;
import com.agile.restaurant.model.Deliverer;
import com.agile.restaurant.service.interfaces.DelivererService;

@RestController
@RequestMapping("api/v1/deliverers")
public class DelivererController {
	
	private final DelivererService service;
	private final DelivererMapper mapper;
	public DelivererController(DelivererService service, DelivererMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<DelivererViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DelivererViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<DelivererViewDto> create(@RequestBody DelivererPostDto deliverer) {
		Deliverer created = service.save(deliverer);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<DelivererViewDto> update(@RequestBody DelivererPostDto updated, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(updated, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
