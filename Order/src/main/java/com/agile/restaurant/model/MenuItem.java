package com.agile.restaurant.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MenuItem implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private float price;
	
	@ManyToOne
	private Restaurant restaurant;
	
	@OneToMany(mappedBy = "menuItem")
	private List<Order> orders;

	public MenuItem() {
		super();
	}

	public MenuItem(String name, float price, Restaurant restaurant) {
		super();
		this.name = name;
		this.price = price;
		this.restaurant = restaurant;
	}

	public MenuItem(Long id, String name, float price, Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.restaurant = restaurant;
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public List<Order> getOrders() {
		return orders;
	}

	
}

