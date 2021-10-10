package com.agile.restaurant.dto.orderitem;

public abstract class OrderItemDto {
	
	private Integer quantity;

	public OrderItemDto() {
		super();
	}

	public OrderItemDto(Integer quantity) {
		super();
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
