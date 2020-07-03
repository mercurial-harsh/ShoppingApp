import java.util.*;
import java.util.Scanner;

import com.lti.shoppingapp.customer.CreditCustomer;
import com.lti.shoppingapp.customer.Customer;
import com.lti.shoppingapp.engine.CustomerEngine;
import com.lti.shoppingapp.util.Bill;
import com.lti.shoppingapp.util.Inventory;
import com.lti.shoppingapp.util.Store;
public class MainApp {
	public static void main(String ar[])throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//creating store for shopping application
		Store st=new Store();
		
		st.createinventory();//Initializing inventory of store common for all customers
		
		int counter=0;
		//initializing customer list and customer engine list
		List<Customer> customer=new ArrayList<Customer>();
		List<CustomerEngine> customerengine=new ArrayList<CustomerEngine>();
		
		int i,cc,addmore;
		do {
			System.out.println("===============================================================");
			System.out.println("welcome your store for shopping today");
			st.displayinventory();
			System.out.println("===============================================================");
			System.out.println(" enter name");
			String name=sc.next();
			System.out.println(" enter mobile");
			int mobile=sc.nextInt();
			System.out.println(" enter city");
			String city=sc.next();
			System.out.println("press 1 if you have credit card");
			cc=sc.nextInt();
			
			if(cc==1) {
				System.out.println("enter credit card details");
				
				customer.add(new CreditCustomer(name,mobile,city,sc.nextInt()));
				
			}
			else {
				customer.add(new Customer(name,mobile,city));
				
			}
			
			Bill b=new Bill(cc==1?(float)5.5:(float)1.5,new Date());
			
			List<Inventory> cart = new ArrayList<Inventory>();
			do {
				
				st.displayinventory();
				System.out.println("......................................................................................");
				System.out.println("Enter product id");
				int prid=sc.nextInt();
				System.out.println("......................................................................................");
				System.out.println("Enter product quantity");
				int quantity=sc.nextInt();
				System.out.println("......................................................................................");
				
				
				//checking if the product is present and in adequate quantity in the store inventory
				if (prid>0 && prid <10) {
				if(st.checkinventory(prid, quantity)==true) {
					st.setInventory(st.getInventory(), prid, quantity);
					cart.add(new Inventory(prid,st.getInventory()[prid].getPrName(),st.getInventory()[prid].getPrice(),quantity));
					
				}else
					System.out.println("cannot happen not enough stock");
				}
				else
					System.out.println(" product not present ");
				
				System.out.println("......................................................................................");
				System.out.println("press only 1 to add more");
				addmore=sc.nextInt();System.out.println("......................................................................................");
			}while(addmore==1);
			
			float totalbill=(float)0.0;
			System.out.println("===============================================================");
			System.out.println("your cart is :");
			System.out.println("===============================================================");
			System.out.println("price"+"\t"+"*"+"\t"+"Quantity");
			for(Inventory cartbilling:cart) {
				cartbilling.toString();
				
				System.out.println(cartbilling.getPrice()+"\t"+"*"+"\t"+cartbilling.getPrStock());
				totalbill=totalbill+ (cartbilling.getPrice()*cartbilling.getPrStock());
			}
			System.out.println("===============================================================");
			System.out.println("your total bill  is:  "+ totalbill);
			System.out.println("......................................................................................");
			b.setDiscount(b.getDiscount()*totalbill/100);
			System.out.println("your total discount  is:  "+b.getDiscount());
			System.out.println("......................................................................................");
			b.setTotalbill(totalbill-b.getDiscount());
			System.out.println("your final bill is:  "+b.getTotalbill());
			System.out.println("......................................................................................");
			
	      
			
			customerengine.add(new CustomerEngine(customer.get(counter),cart,b));
			
		
			
			
			
			
			System.out.println("Thankks for your visit");
			System.out.println("===============================================================");
			System.out.println("press 0 to exit system");
			i=sc.nextInt();if(i!=0) {counter++;}
		}while(i!=0);
		sc.close();
		
		
		System.out.println("                                                                ");
		System.out.println("                                                                ");
		System.out.println("                                                                ");
		System.out.println("                                                                ");
		System.out.println("===============================================================");
		System.out.println("===============================================================");
		
		
		System.out.println("                      Total customers visited                   ");
		for (CustomerEngine ce:customerengine) {
			System.out.println("............");
			ce.toString();
		}
	}
}
