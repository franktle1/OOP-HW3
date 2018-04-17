package edu.albany.shop;

import java.util.ArrayList;
import java.util.Queue;

public class Cashier extends Employee{
	private Transaction currentOrder;
	
	public Cashier(String name, String title, Store employer) {
		super(name, title, employer);
		currentOrder = null;
	}
	
	public void performDuties() {
		Queue<Transaction> queue = employer.getQueue();
		ArrayList<>
		collectPay(currentOrder.getTotal());
		sendOrderToQueue(currentOrder, queue);
		checkReadyQueue();
		removeCompletedOrders(null, queue);
		
	}
	
	/**Returns a list of completed orders*/
	private ArrayList<Transaction> checkReadyQueue() {
		System.out.println("Checking for any finished orders from the cook...");
		return null;
		
	}

	private void removeCompletedOrders(Transaction t, Queue<Transaction> queue) {
		System.out.println("Removing order...\n");
	}

	public void takeOrder(Transaction t) {
		System.out.println("What would you like to order?");
		System.out.println(t.toString());
		this.currentOrder = new Transaction(t);
	}
	
	public Transaction getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Transaction currentOrder) {
		this.currentOrder = currentOrder;
	}

	public void sendOrderToQueue(Transaction t, Queue<Transaction> queue) {
		queue.offer(t);
		currentOrder = null;
		System.out.println("Cashier: Transaction entered into Queue.");
		
	}

	public void notifyCook() {
		System.out.println("Cook notified.");
	}

	
	public void collectPay(double d) {
		double newBalance = employer.getBalance() + d;
		employer.setBalance(newBalance);
	}

}

