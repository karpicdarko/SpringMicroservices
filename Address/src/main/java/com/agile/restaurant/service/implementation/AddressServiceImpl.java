package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.AddressPostDto;
import com.agile.restaurant.model.Address;
import com.agile.restaurant.repository.AddressRepository;
import com.agile.restaurant.service.interfaces.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	private final AddressRepository repository;
	
	
	public AddressServiceImpl(AddressRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Address> findAll() {
		return repository.findAll();
	}

	@Override
	public Address findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No Address with specified id"));
	}

	@Override
	public Address save(AddressPostDto address) {
		Address forCreate = new Address(address.getStreetNumber(), address.getStreet(), address.getCity(), address.getZipCode());
		return repository.save(forCreate);
	}

	@Override
	public Address update(AddressPostDto address, Long id) {
		Address found = repository.findById(id).orElseThrow(() -> new RuntimeException("No Address with specified id"));
		Address forUpdate = new Address(found.getId(), address.getStreetNumber(), address.getStreet(), address.getCity(), address.getZipCode());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}

}
