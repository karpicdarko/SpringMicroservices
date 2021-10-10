package com.agile.restaurant.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Restaurant implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "restaurant")
	private List<MenuItem> menu; 
	
	@ManyToMany
	@JoinTable(
			name = "restaurant_address", 
			joinColumns = @JoinColumn(name = "restaurant_id"), 
			inverseJoinColumns = @JoinColumn(name = "address_id")
			)
	private List<Address> addresses;

	public Restaurant() {
		super();
	}
	
	public Restaurant(String name, List<Address> addresses) {
		super();
		this.name = name;
		this.addresses = addresses;
	}

	public Restaurant(Long id, String name, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<MenuItem> getMenu() {
		return menu;
	}

	public List<Address> getAddresses() {
		return addresses;
	}
	
}
