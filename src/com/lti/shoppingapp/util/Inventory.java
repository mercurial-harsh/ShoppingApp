package com.lti.shoppingapp.util;

public class Inventory extends Product {

	
	//private members
//	private Product product;
	private int  prStock;
//	public Product getProduct() {
//		return product;
//	}
//	public void setProduct(Product product) {
//		this.product = product;
//	}
	public int getPrStock() {
		return prStock;
	}
	public void setPrStock(int prStock) {
		this.prStock = this.prStock-prStock;
	}
	public Inventory(int prId, String prName, float price, int prStock) {
		super(prId, prName, price);
//		this.product = new Product(prId, prName, price);
		this.prStock = prStock;
	}
	@Override
	public String toString() {
		return "Inventory [prStock=" + prStock + ", " + super.toString() + "]";
	}
	
	
}
