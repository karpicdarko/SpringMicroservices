package com.agile.restaurant.dto.order;

public class OrderViewDto extends OrderDto{
	
	private Long id;
	
	private Integer quantity;
	
	private Long itemId;

	private Long consumerId;
	
	private Long deliveryInfoId;
	
	private Long delivererId;
	
	public Long getId() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Long getItemId() {
		return itemId;
	}

	public Long getConsumerId() {
		return consumerId;
	}

	public Long getDeliveryInfoId() {
		return deliveryInfoId;
	}

	public Long getDelivererId() {
		return delivererId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}

	public void setDeliveryInfoId(Long deliveryInfoId) {
		this.deliveryInfoId = deliveryInfoId;
	}

	public void setDelivererId(Long delivererId) {
		this.delivererId = delivererId;
	}
	
	
}
