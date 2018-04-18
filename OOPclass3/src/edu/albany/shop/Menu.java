package edu.albany.shop;

public enum Menu {
	/**"Ham Sandwich", 5.00, s3*/
	HAM("Ham Sandwich", 5.00, 3),
	/**"Turkey Sandwich", 4.50, 3*/
	TURK("Turkey Sandwich", 4.50, 3),
	/**Grilled Cheese", 2.00, 1*/
	CHEESE("Grilled Cheese", 2.00, 5),
	/**Fries", 1.00, 1*/
	FRIES("Fries", 1.00, 1),
	/**"Drink", 1.00, 5*/
	DRINK("Drink", 1.00, 1);
	private final String name;
	private final double price;
	private final int priority;
	Menu(String name, double price, int priority){
		this.name = name;
		this.price = price;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getPriority() {
		return priority;
	}
	
	
	
}
