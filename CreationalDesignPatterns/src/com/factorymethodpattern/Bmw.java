package com.factorymethodpattern;

public class Bmw implements Car {

	@Override
	public void model() {
		System.out.println("BMW X1 \n"
				+ "ARAI Mileage - 19.62 kmpl \n"
				+ "Fuel Type - Diesel \n"
				+ "Engine Displacement(cc) - 1998 \n"
				+ "Max Torque (nm@rpm) - 400nm@1750-2500rpm \n"
				+ "TransmissionType - Automatic \n"
				+ "Max Power (bhp@rpm) - 190bhp@4000rpm \n"
				+ "Seating Capacity - 5 \n"
				+ "Body Type - SUV \n");
	}

}
