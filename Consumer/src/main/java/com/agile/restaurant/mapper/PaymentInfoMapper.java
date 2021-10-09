package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.paymentinfo.PaymentInfoViewDto;
import com.agile.restaurant.model.PaymentInfo;

@Mapper()
public interface PaymentInfoMapper {

	PaymentInfoViewDto toViewDto(PaymentInfo paymentInfo);
	List<PaymentInfoViewDto> toViewDtos(List<PaymentInfo> paymentInfos);
}
