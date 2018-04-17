package edu.albany.shop;

import java.util.ArrayList;

public class Transaction {
	private Customer customer;
	private ArrayList<Menu> order;
	private boolean completed;
	//Copy constructor
	public Transaction(Transaction t) {
		this.customer = new Customer(t.getCustomer().getName());
		this.order = makeNewOrder(t.order);
		this.completed = t.getStatus();
	}
	public Transaction(Customer c, ArrayList<Menu> o) {
		customer = new Customer(c.getName());
		order = makeNewOrder(o);
		completed = false;
	}
	/**Copy Constructor helper
	 * @param orders: an list of Menu items associated with the customer*/
	private ArrayList<Menu> makeNewOrder(ArrayList<Menu> orders) {
		ArrayList<Menu> newOrder = new ArrayList<Menu>();
		for(Menu item: orders) {
			newOrder.add(item);
		}
		return newOrder;
	}
	
	//**Returns the total cost of customer order*/
	public double getTotal() {
		double sum = 0.0;
		for(Menu item: order)
			sum += item.getPrice();
		return sum;
	}
	
	public boolean getStatus() {
		return completed;
	}
	
	public void setStatus(boolean b) {
		completed = b;
	}
	
	public String toString() {
		String receipt = "";
		receipt += customer.getName() +"###  ";
		for(Menu item: order)
			receipt += item.getName()+", ";
		receipt += "Total: $" + getTotal()+"  ###";
		return receipt;
	}
	public Customer getCustomer() {
		return customer;
	}
}
