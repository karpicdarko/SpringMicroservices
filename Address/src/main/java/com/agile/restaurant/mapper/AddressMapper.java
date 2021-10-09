package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.AddressViewDto;
import com.agile.restaurant.model.Address;

@Mapper()
public interface AddressMapper {
	
	AddressViewDto toViewDto(Address address);
	List<AddressViewDto> toViewDtos(List<Address> addresses);

}
