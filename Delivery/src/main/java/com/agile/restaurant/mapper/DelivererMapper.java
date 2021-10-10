package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.deliverer.DelivererViewDto;
import com.agile.restaurant.model.Deliverer;

@Mapper()
public interface DelivererMapper {
	
	DelivererViewDto toViewDto(Deliverer deliverer);
	List<DelivererViewDto> toViewDtos(List<Deliverer> deliverers);

}
