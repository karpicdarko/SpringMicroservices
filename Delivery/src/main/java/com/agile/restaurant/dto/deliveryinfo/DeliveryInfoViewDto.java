package com.agile.restaurant.dto.deliveryinfo;

public class DeliveryInfoViewDto extends DeliveryInfoDto {
	
	private Long id;
	
	private String address;

	public Long getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
