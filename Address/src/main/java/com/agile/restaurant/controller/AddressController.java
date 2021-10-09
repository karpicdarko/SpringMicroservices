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

import com.agile.restaurant.dto.AddressPostDto;
import com.agile.restaurant.dto.AddressViewDto;
import com.agile.restaurant.mapper.AddressMapper;
import com.agile.restaurant.model.Address;
import com.agile.restaurant.service.interfaces.AddressService;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {
	
	private final AddressService service;
	private final AddressMapper mapper;

	public AddressController(AddressService service, AddressMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<AddressViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<AddressViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<AddressViewDto> create(@RequestBody AddressPostDto address) {
		Address created = service.save(address);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<AddressViewDto> update(@RequestBody AddressPostDto address, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(address, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	

}
