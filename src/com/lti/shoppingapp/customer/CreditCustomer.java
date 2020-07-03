package com.lti.shoppingapp.customer;

public class CreditCustomer extends Customer {
	
	private int ccnumber;

	public int getCcnumber() {
		return ccnumber;
	}

	public void setCcnumber(int ccnumber) {
		this.ccnumber = ccnumber;
	}

	

	public CreditCustomer(String cname, int cmobile, String ccity, int ccnumber) {
		super(cname, cmobile, ccity);
		this.ccnumber = ccnumber;
	}

	@Override
	public String toString() {
		return "CreditCustomer [ccnumber=" + ccnumber + ", " + super.toString() + "]";
	}

}
