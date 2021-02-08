package com.si;

import java.util.List;

public class First {

	List<String> vehicles;

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void show() {
		for(String s: vehicles) {
			System.out.println(s);
		}
	}
}
