package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.consumer.ConsumerViewDto;
import com.agile.restaurant.model.Consumer;

@Mapper
public interface ConsumerMapper {
	
	ConsumerViewDto toViewDto(Consumer consumer);
	List<ConsumerViewDto> toViewDtos(List<Consumer> consumers);
}
