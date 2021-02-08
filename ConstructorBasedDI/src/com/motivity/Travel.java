package com.motivity;

public class Travel implements Journey {

	private Vehicle v;

	public Travel(Vehicle v) {
		super();
		this.v = v;
	}



	@Override
	public void startJourney() {

		System.out.println("journey started...");
		v.move();
	}

}
