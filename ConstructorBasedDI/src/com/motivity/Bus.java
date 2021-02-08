package com.motivity;

import java.util.Map;

public class Bus implements Vehicle{

	private String fuel;
	private int speed;
	private Map<Integer,String> passengerlist;
	
	public Map<Integer, String> getPassengerlist() {
		return passengerlist;
	}

	public void setPassengerlist(Map<Integer, String> passengerlist) {
		this.passengerlist = passengerlist;
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
		
		System.out.println("bus is used for journey");
		System.out.println("fuel type " +fuel);
		System.out.println("speed " +speed);
		System.out.println();
		System.out.println("-----passenger list-----");
		for(Map.Entry<Integer,String> m :passengerlist.entrySet()) {
			System.out.println("seat number: "+m.getKey()+"  "+"passenger name: "+m.getValue());
		}
		
	}

}
