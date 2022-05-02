package Vehicle;

public abstract class Vehicle {
	protected int wheels; ----=----
	protected String engine; ----=----
	protected int year; ----=----
	protected String make; ----=----
	protected String model; ----=----
	protected String colour; ----=----
	protected boolean satnav; ----=----
	public int count; ----=----
	protected int ID; ----=----
	public double price; ----=----
	
	public Vehicle (int wheels, String engine, int year, String make, String model, String colour, boolean satnav, int count, int ID, double price ) {
		this.wheels = wheels;
		this.engine = engine;
		this.year = year;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.satnav = satnav;
		this.count = count;
		this.ID =  ID;
		this.price = price;
		
}
	public void setId(int ID) {
		this.ID = ID;
	}
	public int getId() {
		return ID;
	}
	public abstract double calcBill();
	}

