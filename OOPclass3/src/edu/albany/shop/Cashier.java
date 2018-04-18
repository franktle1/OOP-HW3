package edu.albany.shop;


import java.util.ArrayList;
import java.util.Queue;

public class Cashier extends Employee{
	private Transaction currentOrder;
	
	public Cashier(String name, String title, Store employer) {
		super(name, title, employer);
		currentOrder = null;
	}
	
	@Override
	public void performDuties() {
		Queue<Transaction> queue = employer.getQueue();
		ArrayList<Transaction> readyOrders = employer.getReadyOrders();
		if(currentOrder !=null) {
			collectPay(currentOrder.getTotal());
			sendOrderToQueue(queue);
		}
		
		//this is the problem
		if(readyOrders != null)
			processCompletedOrders(readyOrders);
		
	}
	
//	/**Returns a list of completed orders*/
//	private ArrayList<Transaction> checkReadyQueue() {
//		System.out.println("Checking for any finished orders from the cook...");
//		
//		return null;
//		
//	}

	
	private void processCompletedOrders(ArrayList<Transaction> readyOrders) {
		if(readyOrders.size() == 0)
			return;
		System.out.println("Delivering ready orders...");	
		for(int i = 0; i < readyOrders.size(); i++) {
			
			System.out.println(getName()+", "+getTitle()+": Order for "+ readyOrders.get(i).getCustomer().getName() + " is ready!");
			readyOrders.remove(i);
			System.out.println("Removing order...");
		}
	}

	public void takeOrder(Transaction t) {
		System.out.println(getName()+", "+getTitle()+": What would you like to order?");
		System.out.println(t.toString());
		this.currentOrder = new Transaction(t);
	}
	
	public Transaction getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Transaction currentOrder) {
		this.currentOrder = currentOrder;
	}

	private void sendOrderToQueue(Queue<Transaction> queue) {
		try {
			queue.offer(currentOrder);
			notifyCook();
			currentOrder = null;
			System.out.println(getName()+", "+getTitle()+": Transaction entered into Queue.");
		} catch(NullPointerException e) {
			System.out.println("Problem with entering transaction.");
			e.printStackTrace();
		}
	}

	private void notifyCook() {
		System.out.println(getName()+", "+getTitle()+": Cook notified of order for "
				+ currentOrder
					.getCustomer()
					.getName());
	}
	
	public void collectPay(double d) {
		double newBalance = employer.getBalance() + d;
		employer.setBalance(newBalance);
	}

}

