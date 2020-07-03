package com.lti.shoppingapp.util;

public class Product {
	
	private int prId;
	private String prName;
	private float price;
	public Product(int prId, String prName, float price) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.price = price;
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prId=" + prId + ", prName=" + prName + ", price=" + price + "]";
	}
	
	
	
	

}
