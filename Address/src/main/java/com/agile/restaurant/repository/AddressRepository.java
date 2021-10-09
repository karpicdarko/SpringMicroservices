package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
