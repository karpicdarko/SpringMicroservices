package com.agile.restaurant.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PaymentInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String cardNumber;
	
	private Date expiry;
	
	private String cvv;

	public PaymentInfo() {
		super();
	}

	public PaymentInfo(String cardNumber, Date expiry, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
	}

	public PaymentInfo(Long id, String cardNumber, Date expiry, String cvv) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
	}

	public Long getId() {
		return id;
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
	
	

}
