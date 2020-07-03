package com.lti.shoppingapp.util;

public class Store {
	private Inventory[] inventory;
	
	public Inventory[] getInventory() {
		return inventory;
	}
	
	public void setInventory(Inventory[] inventory,int index,int updateStock ) {
		this.inventory = inventory;
		this.inventory[index].setPrStock(updateStock);
	}

	public void createinventory() {
		inventory=new Inventory[10];
		for (int i=0;i<10;i++) {
			inventory[i]=new Inventory(i,("o"+i+"00"+"Bread"),(float) 10.02*i,10);
		}
	}
	
	public boolean checkinventory(int index,int updateStock) {
		 if (this.inventory[index].getPrStock()-updateStock >=0)
			 return true;
		 else 
			 return false;
	}
	
	public void displayinventory() {
		System.out.println("===============================================================");
		for (int i=0;i<10;i++) {
			System.out.println(inventory[i].toString());
		}
		System.out.println("===============================================================");
	}
	
	public String getProductName(int index) {
	
		return 	this.inventory[index].getPrName();
	}
	
	public float getProductPrice(int index) {
		
		return 	this.inventory[index].getPrice();
	}
	
}
