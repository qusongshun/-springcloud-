package com.spring.microservice.pojo;

public class OrderDetail {
	private String orderId ;			// 订单id
	private Item item ;				// 商品
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public OrderDetail(String orderId, Item item) {
		super();
		this.orderId = orderId;
		this.item = item;
	}
	public OrderDetail() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetail [orderId=" + orderId + ", item=" + item + "]";
	}
	
	
	

}
