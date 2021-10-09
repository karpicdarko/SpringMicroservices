package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long>{

}
