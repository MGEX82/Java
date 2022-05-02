package Garage;

import Vehicle.*;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	private List<Vehicle> Vehicles = new ArrayList<>();
	private int count = 0;
	public void printVehicles() {
		System.out.println(this.Vehicles);
	}
	public boolean addVehicle(Vehicle Vehicle) { ----=----
		Vehicle.setId(Vehicle.count++);
		return this.Vehicles.add(Vehicle);
	}
	public boolean removeVehicle(Vehicle Vehicle) {
		return this.Vehicles.remove(Vehicle);
	}
	public void getVehicleById(int ID) { ----=----
		for (Vehicle v : this.Vehicles) {
			if (v.getId() == ID) {
			System.out.println(v); }
			else { System.out.println("No such vehicle");
			}
}
	}
	
	public boolean removeVehicleById(int ID) { ----=----
		for (Vehicle v : this.Vehicles) {
			if (v.getId() == ID) {
				return this.removeVehicle(v); }
				else System.out.println("No such vehicle");
			}
		

		return false;
}
	public boolean removeByType(String type) { ----=----
		List<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle v : this.Vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);

			}
		}
	
		return this.Vehicles.removeAll(toRemove); 
	}
		public void empty() { ----=----
			this.Vehicles.clear();
		}
		public float calcBillBad() { ----=----
			float bill = 0.0F;
			for (Vehicle v : this.Vehicles) {
				if (v instanceof Car) {
					bill += 78;
				}
				bill += v.calcBill();
			}
			return bill;
		}
		public float calcBill() { ----=----
			float bill = 0.0F;
			for (Vehicle v : this.Vehicles) {
				bill += v.calcBill();
			}
			return bill;
		}
}