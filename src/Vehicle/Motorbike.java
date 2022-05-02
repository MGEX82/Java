package Vehicle;

public class Motorbike extends Vehicle {
	public Motorbike(int wheels, String engine, int year, String make, String model, String colour, boolean satnav, int count, int ID, double price) {
		super(wheels, engine, year, make, model, colour, satnav, count, ID, price);
		this.wheels = wheels;
		this.engine = engine;
		this.year = year;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.satnav = satnav;
		this.count = count;
		this.ID = ID;
		this.price = price;
	}
		public void wheels_define () {
			wheels = 2;
		}

}

