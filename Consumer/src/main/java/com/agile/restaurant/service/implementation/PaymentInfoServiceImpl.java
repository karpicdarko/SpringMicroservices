package com.agile.restaurant.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agile.restaurant.dto.paymentinfo.PaymentInfoPostDto;
import com.agile.restaurant.model.Consumer;
import com.agile.restaurant.model.PaymentInfo;
import com.agile.restaurant.repository.PaymentInfoRepository;
import com.agile.restaurant.service.interfaces.ConsumerService;
import com.agile.restaurant.service.interfaces.PaymentInfoService;

@Service
public class PaymentInfoServiceImpl implements PaymentInfoService {

	private final PaymentInfoRepository repository;
	private final ConsumerService consumerService;
	
	public PaymentInfoServiceImpl(PaymentInfoRepository repository, ConsumerService consumerService) {
		super();
		this.repository = repository;
		this.consumerService = consumerService;
	}

	@Override
	public List<PaymentInfo> findAll() {
		return repository.findAll();
	}

	@Override
	public PaymentInfo findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("No payment info with specified id."));
	}

	@Override
	public PaymentInfo save(PaymentInfoPostDto paymentInfo) {
		Consumer consumer = consumerService.findById(paymentInfo.getConsumerId());
		System.out.println("Ovo je consumer" + consumer.getFirstName());
		PaymentInfo forCreate = new PaymentInfo(paymentInfo.getCardNumber(), paymentInfo.getExpiry(), paymentInfo.getCvv(), consumer);
		return repository.save(forCreate);
	}

	@Override
	public PaymentInfo update(PaymentInfoPostDto updated, Long id) {
		PaymentInfo found = repository.findById(id).orElseThrow(() -> new RuntimeException("No payment info with specified id."));
		PaymentInfo forUpdate = new PaymentInfo(found.getId(), updated.getCardNumber(), updated.getExpiry(), updated.getCvv(), found.getConsumer());
		return repository.save(forUpdate);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}
	
	

}
