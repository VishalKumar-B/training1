package com.factorymethodpattern;

public class Benz implements Car{

	@Override
	public void model() {
		System.out.println("Mercedes-Benz C-class \n"
				+ "ARAI Mileage - 11.9 kmpl \n"
				+ "Fuel Type - Petrol \n"
				+ "Engine Displacement(cc) - 3982 \n"
				+ "Max Power - (bhp@rpm)476bhp \n"
				+ "Max Torque - (nm@rpm)650Nm \n"
				+ "Seating Capacity - 5 \n"
				+ "Transmission Type - Automatic \n"
				+ "Boot Space(Litres) - 480 \n"
				+ "Fuel Tank Capacity - 66 \n"
				+ "Body Type - Coupe\n"
				+ "");
	}

	
}
