package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.consumer.ConsumerPostDto;
import com.agile.restaurant.dto.consumer.ConsumerUpdateDto;
import com.agile.restaurant.model.Consumer;
import com.agile.restaurant.repository.ConsumerRepository;
import com.agile.restaurant.service.interfaces.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{

	private final ConsumerRepository repository;
	
	public ConsumerServiceImpl(ConsumerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Consumer> findAll() {
		return repository.findAll();
	}

	@Override
	public Consumer findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No conumer with specified id."));
	}

	@Override
	public Consumer save(ConsumerPostDto consumer) {
		Consumer forCreate = new Consumer(consumer.getFirstName(), consumer.getLastName(), consumer.getUserName(), consumer.getPassword());
		return repository.save(forCreate);
	}

	@Override
	public Consumer update(ConsumerUpdateDto updated, Long id) {
		Consumer found = repository.findById(id).orElseThrow(() -> new RuntimeException("No conumer with specified id."));
		Consumer forUpdate = new Consumer(found.getId(), updated.getFirstName(), updated.getLastName(), updated.getUserName(), found.getPassword());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
