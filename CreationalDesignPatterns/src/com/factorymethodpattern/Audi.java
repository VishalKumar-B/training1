package com.factorymethodpattern;

public class Audi implements Car {

	
	
	@Override
	public void model() {
		System.out.println("Audi A3 \n"
				+ "ARAI Mileage - 19.2 kmpl \n"
				+ "Fuel Type - Petrol \n"
				+ "Max Power (bhp@rpm) - 150bhp@5000-6000rpm \n"
				+ "Seating Capacity - 4 \n"
				+ "City Mileage - 13.1 kmpl \n"
				+ "Engine Displacement (cc) - 1395 \n"
				+ "Max Torque (nm@rpm) - 250Nm@1500-3500rpm \n"
				+ "TransmissionType - Automatic");
	}

}
