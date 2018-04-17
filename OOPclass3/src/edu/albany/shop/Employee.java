package edu.albany.shop;

public abstract class Employee {
	private String name;
	private String title;
	protected Store employer;
	public Employee(String name, String title, Store employer) {
		this.name = name;
		this.title = title;
		this.employer = employer;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Store getEmployer() {
		return employer;
	}
	
	public String toString(){
		return "Employee Name: "+ name+ "\nTitle: "+title+"\n";
	}
	public abstract void performDuties();

	
	
}
