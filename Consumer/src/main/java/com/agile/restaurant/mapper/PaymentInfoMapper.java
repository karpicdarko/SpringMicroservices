package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agile.restaurant.dto.paymentinfo.PaymentInfoViewDto;
import com.agile.restaurant.model.PaymentInfo;

@Mapper()
public interface PaymentInfoMapper {

	@Mapping(source = "consumer.id", target = "consumerId")
	PaymentInfoViewDto toViewDto(PaymentInfo paymentInfo);
	List<PaymentInfoViewDto> toViewDtos(List<PaymentInfo> paymentInfos);
}
