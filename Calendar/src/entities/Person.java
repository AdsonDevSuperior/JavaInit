package entities;

public class Person {
	
	private String name;
	private int date;
	private double time;
	
	public Person(String name, int date, double time) {
		this.name = name; 
		this.date = date;		
		this.time = time;		
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
		
	}

