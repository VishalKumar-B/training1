package com.motivity;

public class Travel implements Journey {

	Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}

	@Override
	public void startJourney() {

		System.out.println("journey started...");
		v.move();
	}

}
