
package Main;

import Vehicle.*;

import Garage.*;

import java.util.ArrayList;
import java.util.List;


public class Runner {
	public static void main(String[] args) {
		 int wheels;
		String engine;
		int year;
		String make;
		 String model;
		 String colour;
		 boolean satnav;
		 int count;
		 int ID;
		double price;
		int doors;
		int seats;
		boolean radio;
		String trailer;
		String cab;		
		boolean bed;
		
		
		
		Garage garage = new Garage();
		Vehicle Car = new Car(wheels=4, engine="Solid", year=2010, make="Ford", model="Fivo", colour="Red", doors=4, seats=5, radio=true,  satnav=true, count=1, ID=456, price=20000.00);
		Vehicle Bike = new Motorbike(wheels, engine="Nice", year=2010, make="Honda", model="Sizzle", colour="Red",  satnav=true, count=1, ID=657, price=10000.00);	
		Vehicle Truck = new Lorry(wheels=8, engine="Heavy", year=2010, make="Land Rover", model="Big Man", colour="Black",  satnav=true, count=1, trailer="10ft", cab="1ft", radio=true, bed=true, ID=654, price=30000.00);
	}
	
	garage.printVehicles();

	System.out.println(garage.calcBill());

	garage.removeVehicleById(2);

	garage.printVehicles();

	garage.removeByType("car");

	garage.printVehicles();

}
}
