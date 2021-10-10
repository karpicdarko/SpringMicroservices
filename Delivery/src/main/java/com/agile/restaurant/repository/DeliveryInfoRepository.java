package com.agile.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agile.restaurant.model.DeliveryInfo;

public interface DeliveryInfoRepository extends JpaRepository<DeliveryInfo, Long>{

}
