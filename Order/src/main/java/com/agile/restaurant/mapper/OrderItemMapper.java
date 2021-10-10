package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.orderitem.OrderItemViewDto;
import com.agile.restaurant.model.OrderItem;

@Mapper()
public interface OrderItemMapper {
	
	OrderItemViewDto toViewDto(OrderItem orderItem);
	List<OrderItemViewDto> toViewDtos(List<OrderItem> orderItems);

}
