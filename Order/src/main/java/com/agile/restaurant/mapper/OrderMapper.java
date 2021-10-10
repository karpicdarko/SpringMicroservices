package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.order.OrderViewDto;
import com.agile.restaurant.model.Order;

@Mapper()
public interface OrderMapper {
	
	OrderViewDto toViewDto(Order order);
	List<OrderViewDto> toViewDtos(List<Order> orders);
}
