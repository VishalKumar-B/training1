package com.motivity;

public class Bus implements Vehicle{

	private String fuel;
	private int speed;
	
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		
		System.out.println("bus is used for journey");
		System.out.println("fuel type " +fuel);
		System.out.println("speed " +speed);
	}

}
