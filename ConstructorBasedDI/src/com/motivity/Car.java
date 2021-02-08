package com.motivity;

import java.util.Set;

public class Car implements Vehicle{

	private String fuel;
	private int speed;
	private Set<String> features;
	
	public Set<String> getFeatures() {
		return features;
	}

	public void setFeatures(Set<String> features) {
		this.features = features;
	}

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
		
		System.out.println("car is used for journey");
		System.out.println("fuel type " +fuel);
		System.out.println("speed " +speed);
		System.out.println();
		System.out.println("features of car:");
		for(String s : features) {
			System.out.println(s);
		}
	}

}
