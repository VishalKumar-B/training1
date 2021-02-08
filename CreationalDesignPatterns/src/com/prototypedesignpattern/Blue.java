package com.prototypedesignpattern;

public class Blue extends Color{

	public Blue() {
		this.colorName = "blue";
	}
	
	@Override
	void colorCode() {
		System.out.println("color: blue");
		System.out.println("#RRGGBB (Hex Code): #0000CD");
		System.out.println("R,G,B (Decimal code): 0,0,205");
	}

}
