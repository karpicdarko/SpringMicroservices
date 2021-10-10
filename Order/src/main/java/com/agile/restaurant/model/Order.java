package com.agile.restaurant.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String state;

	public Order() {
		super();
	}

	public Order(String state) {
		super();
		this.state = state;
	}

	public Order(Long id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public String getState() {
		return state;
	}

}
