package com.agile.restaurant.service.interfaces;

import java.util.List;

import com.agile.restaurant.dto.consumer.ConsumerPostDto;
import com.agile.restaurant.dto.consumer.ConsumerUpdateDto;
import com.agile.restaurant.model.Consumer;

public interface ConsumerService {
	public List<Consumer> findAll();
	public Consumer findById(Long id);
	public Consumer save(ConsumerPostDto consumer);
	public Consumer update(ConsumerUpdateDto updated, Long id);
	public void deleteById(Long id);
}
