package com.agile.restaurant.dto.deliveryinfo;

import java.time.LocalDateTime;

public abstract class DeliveryInfoDto {
	
	private String state;
	
	private Boolean isPickedUp;
	
	private LocalDateTime timeOfDelivery;

	public DeliveryInfoDto() {
		super();
	}

	public DeliveryInfoDto(String state, Boolean isPickedUp, LocalDateTime timeOfDelivery) {
		super();
		this.state = state;
		this.isPickedUp = isPickedUp;
		this.timeOfDelivery = timeOfDelivery;
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

	public void setState(String state) {
		this.state = state;
	}

	public void setIsPickedUp(Boolean isPickedUp) {
		this.isPickedUp = isPickedUp;
	}

	public void setTimeOfDelivery(LocalDateTime timeOfDelivery) {
		this.timeOfDelivery = timeOfDelivery;
	}
	
	
}
