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

import com.agile.restaurant.dto.consumer.ConsumerPostDto;
import com.agile.restaurant.dto.consumer.ConsumerUpdateDto;
import com.agile.restaurant.dto.consumer.ConsumerViewDto;
import com.agile.restaurant.mapper.ConsumerMapper;
import com.agile.restaurant.model.Consumer;
import com.agile.restaurant.service.interfaces.ConsumerService;

@RestController
@RequestMapping("api/v1/consumers")
public class ConsumerController {
	
	private final ConsumerService service;
	private final ConsumerMapper mapper;
	
	public ConsumerController(ConsumerService service, ConsumerMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<ConsumerViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ConsumerViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<ConsumerViewDto> create(@RequestBody ConsumerPostDto consumer) {
		Consumer created = service.save(consumer);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<ConsumerViewDto> update(@RequestBody ConsumerUpdateDto updated, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(updated, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
