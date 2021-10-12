package com.agile.restaurant.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String state;
	
	private Integer quantity;
	
	@ManyToOne
	private MenuItem menuItem;
	
	@ManyToOne
	private Consumer consumer;
	
	@ManyToOne
	private DeliveryInfo deliveryInfo;
	
	@ManyToOne
	private Deliverer deliverer;
	
	public Order() {
		super();
	}
	
	public Order(String state, Integer quantity, MenuItem menuItem, Consumer consumer, DeliveryInfo deliveryInfo, Deliverer deliverer) {
		super();
		this.state = state;
		this.quantity = quantity;
		this.menuItem = menuItem;
		this.consumer = consumer;
		this.deliveryInfo = deliveryInfo;
		this.deliverer = deliverer;
	}

	public Order(Long id, String state, Integer quantity, MenuItem menuItem, Consumer consumer, DeliveryInfo deliveryInfo, Deliverer deliverer) {
		super();
		this.id = id;
		this.state = state;
		this.quantity = quantity;
		this.menuItem = menuItem;
		this.consumer = consumer;
		this.deliveryInfo = deliveryInfo;
		this.deliverer = deliverer;
	}

	public Long getId() {
		return id;
	}

	public String getState() {
		return state;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public Deliverer getDeliverer() {
		return deliverer;
	}
	
	
}
