package com.agile.restaurant.dto.deliveryinfo;

public class DeliveryInfoViewDto extends DeliveryInfoDto {
	
	private Long id;
	
	private Long addressId;

	public Long getId() {
		return id;
	}

	public Long getAddressId() {
		return addressId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setAddressId(Long id) {
		this.addressId = id;
	}
	
	
	
}
