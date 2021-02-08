package com.factorymethodpattern;

public class CarFactory {

	public Car getcar(String carcompany) {
		
		if(carcompany==null)
			return null;
		
		if(carcompany.equalsIgnoreCase("Audi"))
			return new Audi();
		
		if(carcompany.equalsIgnoreCase("Bmw"))
			return new Bmw();
		
		if(carcompany.equalsIgnoreCase("Benz"))
			return new Benz();
		
		
		return null;
	}
}
