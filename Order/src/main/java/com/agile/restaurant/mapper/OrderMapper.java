package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agile.restaurant.dto.order.OrderViewDto;
import com.agile.restaurant.model.Order;

@Mapper()
public interface OrderMapper {
	
	@Mapping(source = "menuItem.id", target = "itemId")
	@Mapping(source = "consumer.id", target = "consumerId")
	@Mapping(source = "deliveryInfo.id", target = "deliveryInfoId")
	OrderViewDto toViewDto(Order order);
	List<OrderViewDto> toViewDtos(List<Order> orders);
}
