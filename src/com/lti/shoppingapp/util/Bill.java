package com.lti.shoppingapp.util;
import java.util.*;
public class Bill {
	private float totalbill;
	private float discount;
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Bill(float discount, Date date) {
		super();
		this.discount = discount;
		this.date = date;
	}
	public float getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(float totalbill) {
		this.totalbill = totalbill;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Bill [totalbill=" + totalbill + ", discount=" + discount + "]";
	}
	
}
