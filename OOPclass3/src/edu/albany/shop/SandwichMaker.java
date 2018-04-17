package edu.albany.shop;

public class SandwichMaker extends Employee {

	public SandwichMaker(String name, String title, Store employer) {
		super(name, title, employer);
	}

	@Override
	public void performDuties() {
		checkQueue();
		makeOrder();
		sendOrderToReadyList();
		notifyCashier();
	}

	private void checkQueue() {
		// TODO Auto-generated method stub
		
	}

	private void makeOrder() {
		// TODO Auto-generated method stub
		
	}

	private void sendOrderToReadyList() {
		// TODO Auto-generated method stub
		
	}

	private void notifyCashier() {
		// TODO Auto-generated method stub
		
	}

	

}
