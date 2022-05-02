package Vehicle;

public class Car extends Vehicle {
	private int doors;
	private int seats;
	private boolean radio;
	
	

	public Car(int wheels, String engine, int year, String make, String model, String colour, int doors, int seats, boolean radio, boolean satnav, int count, int ID, double price) {
		super(wheels, engine, year, make, model, colour, satnav, count, ID, price);
		this.wheels = wheels;
		this.engine = engine;
		this.year = year;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.doors = doors;
		this.seats = seats;
		this.radio = radio;
		this.satnav = satnav;
		this.count = count;
		this.ID = ID;
		this.price = price;
		
		
		// TODO Auto-generated constructor stub
	}
	

}
