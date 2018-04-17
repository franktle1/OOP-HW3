package edu.albany.shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Store{

	private  double storeBalance;
	private  String name;
	private  Queue <Transaction> orderQueue;
	private ArrayList<Transaction> readyOrders;

	public Store() {
		name = "Pop's Sandwich Shoppe";
		storeBalance = 1000.00;
		orderQueue = new LinkedList<Transaction>();
	}
	
	public ArrayList<Transaction> getReadyOrders() {
		return readyOrders;
	}
	
	public Queue <Transaction> getQueue(){
		return orderQueue;
	}
	
	public double getBalance() {
		return storeBalance;
	}
	
	public void setBalance(double d) {
		storeBalance = d;
	}
//	public void setOrderQueue(ArrayList<Transaction> queue) {
//		for(Transaction order: queue) {
//			orderQueue.add(new Transaction(order));
//		}
//	}
	
	public void printQueue() {
		orderQueue.stream().forEach(e->System.out.println(e));
		System.out.println("Transaction Count = "+ orderQueue.size());
	}
	

}
