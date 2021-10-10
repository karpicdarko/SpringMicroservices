package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoViewDto;
import com.agile.restaurant.model.DeliveryInfo;

@Mapper()
public interface DeliveryInfoMapper {
	
	DeliveryInfoViewDto toViewDto(DeliveryInfo deliveryInfo);
	List<DeliveryInfoViewDto> toViewDtos(List<DeliveryInfo> deliveryInfos);

}
