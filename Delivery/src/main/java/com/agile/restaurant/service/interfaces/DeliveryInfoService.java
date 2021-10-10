package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoPostDto;
import com.agile.restaurant.model.DeliveryInfo;

public interface DeliveryInfoService {
	public List<DeliveryInfo> findAll();
	public DeliveryInfo findById(Long id);
	public DeliveryInfo save(DeliveryInfoPostDto deliveryInfo);
	public DeliveryInfo update(DeliveryInfoPostDto updated, Long id);
	public void deleteById(Long id);
}
