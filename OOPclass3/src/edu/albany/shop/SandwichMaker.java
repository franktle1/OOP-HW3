package edu.albany.shop;

import java.util.ArrayList;
import java.util.Queue;

public class SandwichMaker extends Employee {

	public SandwichMaker(String name, String title, Store employer) {
		super(name, title, employer);
	}

	@Override
	public void performDuties() {
		Queue<Transaction> queue = employer.getQueue();
		ArrayList<Transaction> readyOrders = employer.getReadyOrders();
		Transaction nextOrder = checkQueue(queue);
		
		if(nextOrder !=null) {
			processOrder(nextOrder);
			readyOrders.add(nextOrder);
			notifyCashier(nextOrder);
		}
	}

	private Transaction checkQueue(Queue<Transaction> queue) {
		if(queue.peek() !=null){
			return queue.poll();} 
		else {
			return null;}
	}

	private void processOrder(Transaction nextOrder) {
		System.out.println("\n"+getName()+", "+getTitle()+": Making the order for "+nextOrder.toString());
	}


	private void notifyCashier(Transaction nextOrder) {
		System.out.println("Cook: Order for "+nextOrder.getCustomer().getName()+ " is complete!\n");
	}

	

}
