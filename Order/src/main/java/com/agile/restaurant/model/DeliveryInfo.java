package com.agile.restaurant.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class DeliveryInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String state;
	
	private Boolean isPickedUp;
	
	private LocalDateTime timeOfDelivery;
	
	@ManyToOne
	private Address address;
	
	@OneToMany(mappedBy = "deliveryInfo")
	private List<Order> orders;

	public DeliveryInfo() {
		super();
	}

	public DeliveryInfo(String state, Boolean isPickedUp, LocalDateTime timeOfDelivery, Address address) {
		super();
		this.state = state;
		this.isPickedUp = isPickedUp;
		this.timeOfDelivery = timeOfDelivery;
		this.address = address;
	}

	public DeliveryInfo(Long id, String state, Boolean isPickedUp, LocalDateTime timeOfDelivery, Address address) {
		super();
		this.id = id;
		this.state = state;
		this.isPickedUp = isPickedUp;
		this.timeOfDelivery = timeOfDelivery;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getState() {
		return state;
	}

	public Boolean getIsPickedUp() {
		return isPickedUp;
	}

	public LocalDateTime getTimeOfDelivery() {
		return timeOfDelivery;
	}

	public Address getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}

}

