package com.agile.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class MenuItem {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private float price;

	public MenuItem() {
		super();
	}

	public MenuItem(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public MenuItem(Long id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
	
	
}
