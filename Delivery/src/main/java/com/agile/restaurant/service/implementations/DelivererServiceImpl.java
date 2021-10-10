package com.agile.restaurant.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.deliverer.DelivererPostDto;
import com.agile.restaurant.model.Deliverer;
import com.agile.restaurant.repository.DelivererRepository;
import com.agile.restaurant.service.interfaces.DelivererService;

@Service
public class DelivererServiceImpl implements DelivererService{
	
	private final DelivererRepository repository;
	

	public DelivererServiceImpl(DelivererRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Deliverer> findAll() {
		return repository.findAll();
	}

	@Override
	public Deliverer findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No deliverer with specified id"));
	}

	@Override
	public Deliverer save(DelivererPostDto deliverer) {
		Deliverer forCreate = new Deliverer(deliverer.getFirstName(), deliverer.getLastName(), deliverer.getAvailable());
		return repository.save(forCreate);
	}

	@Override
	public Deliverer update(DelivererPostDto updated, Long id) {
		Deliverer found = repository.findById(id).orElseThrow(() -> new RuntimeException("No deliverer with specified id"));
		Deliverer forUpdate = new Deliverer(found.getId(), updated.getFirstName(), updated.getLastName(), updated.getAvailable());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
