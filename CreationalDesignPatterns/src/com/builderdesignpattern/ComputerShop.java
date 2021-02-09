package com.builderdesignpattern;

public class ComputerShop {

	public static void main(String[] args) {
		
		//we need to pass all the parameters inside the constructor
		//if you don't want to pass a parameter then we will go for a builder pattern
		/*
		 * Computer c = new Computer("1TB","4GB","Windows","intel i5");
		 * System.out.println(c);
		 */
		
		Computer c = new ComputerBuilder().setOs("windows").setRam("4GB").getComputer();
		System.out.println(c);
		
		//if you are not specifying the values it will take the default values
	}
}
