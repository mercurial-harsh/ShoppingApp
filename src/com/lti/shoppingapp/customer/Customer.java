package com.lti.shoppingapp.customer;

public class Customer implements GenericCustomer{
	
	private String cname;
	private int cmobile;
	private String ccity;
	
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCmobile() {
		return cmobile;
	}
	public void setCmobile(int cmobile) {
		this.cmobile = cmobile;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public Customer(String cname, int cmobile, String ccity) {
		super();
		this.cname = cname;
		this.cmobile = cmobile;
		this.ccity = ccity;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cmobile=" + cmobile + ", ccity=" + ccity + "]";
	}
	

}
