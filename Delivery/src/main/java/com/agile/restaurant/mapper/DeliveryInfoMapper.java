package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoViewDto;
import com.agile.restaurant.model.DeliveryInfo;

@Mapper()
public interface DeliveryInfoMapper {
	
	default DeliveryInfoViewDto toViewDto(DeliveryInfo deliveryInfo) {
		DeliveryInfoViewDto viewDto = new DeliveryInfoViewDto();
		viewDto.setId(deliveryInfo.getId());
		viewDto.setIsPickedUp(deliveryInfo.getIsPickedUp());
		viewDto.setState(deliveryInfo.getState());
		viewDto.setTimeOfDelivery(deliveryInfo.getTimeOfDelivery());
		viewDto.setAddress(deliveryInfo.getAddress().getStreet() + " " + deliveryInfo.getAddress().getStreetNumber() + ", " + deliveryInfo.getAddress().getZipCode() + " " + deliveryInfo.getAddress().getCity());
		return viewDto;
	}
	List<DeliveryInfoViewDto> toViewDtos(List<DeliveryInfo> deliveryInfos);

}
