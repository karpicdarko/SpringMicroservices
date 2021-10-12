package com.agile.restaurant.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class PaymentInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String cardNumber;
	
	private Date expiry;
	
	private String cvv;
	
	@ManyToOne
	private Consumer consumer;

	public PaymentInfo() {
		super();
	}

	public PaymentInfo(String cardNumber, Date expiry, String cvv, Consumer consumer) {
		super();
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
		this.consumer = consumer;
	}

	

	public PaymentInfo(Long id, String cardNumber, Date expiry, String cvv, Consumer consumer) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
		this.consumer = consumer;
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

	public Consumer getConsumer() {
		return consumer;
	}
	
	

}
