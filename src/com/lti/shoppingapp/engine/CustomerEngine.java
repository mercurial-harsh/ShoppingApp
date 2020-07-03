package com.lti.shoppingapp.engine;
import com.lti.shoppingapp.util.*;

import java.util.List;

import com.lti.shoppingapp.customer.*;
public class CustomerEngine {
    private List<Inventory> cart;
    private Bill bill;
    private Customer customer;
	public void getCart() {
		for (Inventory ct:cart) {
			System.out.println(ct);
		}
	}
	public CustomerEngine(Customer customer, List<Inventory> cart, Bill bill) {
		super();
		this.cart = cart;
		this.customer = customer;
		this.bill = bill;
	}
	public void setCart(List<Inventory> cart) {
		this.cart = cart;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		System.out.println(getCustomer().toString());
		getCart();
		getBill().toString();
		return "displayed";
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
