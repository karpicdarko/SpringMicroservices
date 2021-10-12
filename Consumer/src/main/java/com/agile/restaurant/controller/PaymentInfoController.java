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

import com.agile.restaurant.dto.paymentinfo.PaymentInfoPostDto;
import com.agile.restaurant.dto.paymentinfo.PaymentInfoViewDto;
import com.agile.restaurant.mapper.PaymentInfoMapper;
import com.agile.restaurant.model.PaymentInfo;
import com.agile.restaurant.service.interfaces.PaymentInfoService;

@RestController
@RequestMapping("api/v1/payment-infos")
public class PaymentInfoController {
	
	private final PaymentInfoService service;
	private final PaymentInfoMapper mapper;
	public PaymentInfoController(PaymentInfoService service, PaymentInfoMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}
	
	@GetMapping
	public ResponseEntity<List<PaymentInfoViewDto>> findAll() {
		return ResponseEntity.ok(mapper.toViewDtos(service.findAll()));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<PaymentInfoViewDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.findById(id)));
	}
	
	@PostMapping
	public ResponseEntity<PaymentInfoViewDto> create(@RequestBody PaymentInfoPostDto consumer) {
		PaymentInfo created = service.save(consumer);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
		        .buildAndExpand(created.getId())
		        .toUri();
		return ResponseEntity.created(location).body(mapper.toViewDto(created));
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<PaymentInfoViewDto> update(@RequestBody PaymentInfoPostDto updated, @PathVariable Long id) {
		return ResponseEntity.ok(mapper.toViewDto(service.update(updated, id)));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
