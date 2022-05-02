package Vehicle;

public class Lorry extends Vehicle {
	protected String trailer;
	protected String cab;
	protected boolean radio;
	protected boolean bed;
	
	
	public Lorry(int wheels, String engine, int year, String make, String model, String colour, int doors, int seats, String trailer, String cab, boolean radio, boolean bed, boolean satnav, int count, int ID, double price) {
		super(wheels, engine, year, make, model, colour, satnav, count, ID, price);
		this.wheels = wheels;
		this.engine = engine;
		this.year = year;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.satnav = satnav;
		this.count = count;
		this.trailer = trailer;
		this.cab = cab;
		this.radio = radio;
		this.bed =  bed;
		this.ID = ID;
		this.price = price;
		
		
	

}


	
}
