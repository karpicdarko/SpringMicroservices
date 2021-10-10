package com.agile.restaurant.service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.deliveryinfo.DeliveryInfoPostDto;
import com.agile.restaurant.model.DeliveryInfo;
import com.agile.restaurant.repository.DeliveryInfoRepository;
import com.agile.restaurant.service.interfaces.DeliveryInfoService;

@Service
public class DeliveryInfoServiceImpl implements DeliveryInfoService{

	private final DeliveryInfoRepository repository;
	
	public DeliveryInfoServiceImpl(DeliveryInfoRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<DeliveryInfo> findAll() {
		return repository.findAll();
	}

	@Override
	public DeliveryInfo findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No delivery info with specified id"));
	}

	@Override
	public DeliveryInfo save(DeliveryInfoPostDto deliveryInfo) {
		DeliveryInfo forCreate = new DeliveryInfo(deliveryInfo.getState(), deliveryInfo.getIsPickedUp(),deliveryInfo.getTimeOfDelivery());
		return repository.save(forCreate);
	}

	@Override
	public DeliveryInfo update(DeliveryInfoPostDto updated, Long id) {
		DeliveryInfo found = repository.findById(id).orElseThrow(() -> new RuntimeException("No delivery info with specified id"));
		DeliveryInfo forUpdate = new DeliveryInfo(found.getId(), updated.getState(), updated.getIsPickedUp(), updated.getTimeOfDelivery());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
