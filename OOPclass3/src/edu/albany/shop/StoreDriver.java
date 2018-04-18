package edu.albany.shop;

import java.util.ArrayList;

public class StoreDriver {

	public static void main(String[] args) {
		// list of customer transactions
		ArrayList <Transaction> transactions = new ArrayList<>();
		Store store = new Store();
		 
		Cashier cashier = new Cashier("Cassie", "Cashier", store);
		SandwichMaker cook = new SandwichMaker("Chef","Cook", store);
		
		ArrayList<Menu> order1 = new ArrayList<>();
		order1.add(Menu.TURK);
		order1.add(Menu.DRINK);
		order1.add(Menu.FRIES);
		Transaction t1 = new Transaction(new Customer("Bob"), order1);
		cashier.takeOrder(t1);
		cashier.performDuties();
		cook.performDuties();
		
		ArrayList<Menu> order2 = new ArrayList<>();
		order2.add(Menu.HAM);
		order2.add(Menu.DRINK);
		Transaction t2 = new Transaction(new Customer("Alice"), order2);
		cashier.takeOrder(t2);
		cashier.performDuties();
		cook.performDuties();
		
		ArrayList<Menu> order3 = new ArrayList<>();
		order3.add(Menu.FRIES);
		order3.add(Menu.DRINK);
		Transaction t3 = new Transaction(new Customer("Hank"), order3);
		cashier.takeOrder(t3);
		cashier.performDuties();
		cook.performDuties();
		
		ArrayList<Menu> order4 = new ArrayList<>();
		order4.add(Menu.HAM);
		order4.add(Menu.DRINK);
		Transaction t4 = new Transaction(new Customer("Bill"), order4);
		cashier.takeOrder(t4);
		cashier.performDuties();
		cook.performDuties();
		
		cashier.performDuties();
		
		
//		store.setOrderQueue(transactions);

		System.out.println("Store Balance: "+store.getBalance());
//		Create a list of transactions
//		Transactions consist of Customers and Orders
//		Orders are a list of Items that they want
		
//		Create Store
//		Store.runStore(ArrayList<Transactions> orderQueue)
//		In the background, the cashier takes the orders, puts them on the list
//		The cook takes an order from the list, makes the order, notifies the cashier
//		the cashier, once notified, will ask customer for payment, and adjusts the register
		
	}

}
