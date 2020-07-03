package com.lti.shoppingapp.util;

public class DemoUtility {
	public static void main(String args[]) {
		Store st=new Store();
		
		st.createinventory();
		
		st.displayinventory();
		
		if(st.checkinventory(5, 6)==true) {
			st.setInventory(st.getInventory(), 5, 6);
			st.displayinventory();
		}
		else
			System.out.println("cannot happen not enough stock");
		
		if(st.checkinventory(5, 6)==true) {
			st.setInventory(st.getInventory(), 5, 6);
			st.displayinventory();
		}
		else
			System.out.println("cannot happen not enough stock");
		
	}
}
