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

import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoPostDto;
import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoViewDto;
import com.agile.restaurant.mapper.DeliveryInfoMapper;
import com.agile.restaurant.model.DeliveryInfo;
import com.agile.restaurant.service.interfaces.DeliveryInfoService;

@RestController
@RequestMapping("api/v1/delivery-infos")
public class DeliveryInfoController {
	
	private final DeliveryInfoService service;
	private final DeliveryInfoMapper mapper;
	public DeliveryInfoController(DeliveryInfoService service, DeliveryInfoMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<DeliveryInfoViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DeliveryInfoViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<DeliveryInfoViewDto> create(@RequestBody DeliveryInfoPostDto deliveryInfo) {
		DeliveryInfo created = service.save(deliveryInfo);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<DeliveryInfoViewDto> update(@RequestBody DeliveryInfoPostDto updated, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(updated, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
