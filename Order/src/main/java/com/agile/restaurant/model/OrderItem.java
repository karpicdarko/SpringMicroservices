package com.agile.restaurant.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private Integer quantity;

	public OrderItem() {
		super();
	}

	public OrderItem(Integer quantity) {
		super();
		this.quantity = quantity;
	}

	public OrderItem(Long id, Integer quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	
}
