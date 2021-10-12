package com.agile.restaurant.dto.paymentinfo;

public class PaymentInfoViewDto extends PaymentInfoDto {
	
	private Long id;
	
	private Long consumerId;

	public Long getId() {
		return id;
	}

	public Long getConsumerId() {
		return consumerId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}
	
	
	

}
