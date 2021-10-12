package com.agile.restaurant.dto.order;

public class OrderPostDto extends OrderDto {
	
	
	private Integer quantity;
	private Long itemId;
	private Long restaurantId;
	private Long consumerId;
	private Long deliveryId;
	private Long delivererId;
	
	
	public Long getItemId() {
		return itemId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public Long getConsumerId() {
		return consumerId;
	}
	public Long getDeliveryId() {
		return deliveryId;
	}
	public Long getDelivererId() {
		return delivererId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}
	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}
	public void setDelivererId(Long delivererId) {
		this.delivererId = delivererId;
	}
	
	

}
