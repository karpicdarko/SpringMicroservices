package com.agile.restaurant.dto.paymentinfo;

import java.sql.Date;

public abstract class PaymentInfoDto {
	
	private String cardNumber;
	
	private Date expiry;
	
	private String cvv;

	public PaymentInfoDto() {
		super();
	}

	public PaymentInfoDto(String cardNumber, Date expiry, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Date getExpiry() {
		return expiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	

}
