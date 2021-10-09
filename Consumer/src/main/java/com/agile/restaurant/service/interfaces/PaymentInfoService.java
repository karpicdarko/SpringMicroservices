package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.paymentinfo.PaymentInfoPostDto;
import com.agile.restaurant.model.PaymentInfo;

public interface PaymentInfoService {
	public List<PaymentInfo> findAll();
	public PaymentInfo findById(Long id);
	public PaymentInfo save(PaymentInfoPostDto paymentInfo);
	public PaymentInfo update(PaymentInfoPostDto updated, Long id);
	public void deleteById(Long id);
}
