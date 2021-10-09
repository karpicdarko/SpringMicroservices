package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.AddressPostDto;
import com.agile.restaurant.model.Address;

public interface AddressService {
	public List<Address> findAll();
	public Address findById(Long id);
	public Address save(AddressPostDto address);
	public Address update(AddressPostDto address, Long id);
	public void deleteById(Long id);
}
