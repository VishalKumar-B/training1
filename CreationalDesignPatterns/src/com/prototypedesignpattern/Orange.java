package com.prototypedesignpattern;

public class Orange extends Color{

	public Orange() {
		this.colorName="orange";
	}
	
	@Override
	void colorCode() {
		System.out.println("color: orange");
		System.out.println("#RRGGBB (Hex Code): #FFA500");
		System.out.println("R,G,B (Decimal code): 255,165,0");
	}
}
