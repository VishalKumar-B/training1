package com.prototypedesignpattern;

public class MainLogic {

	public static void main(String[] args) {
		
		Color c1 = ColorStorage.getColor("blue");
		c1.colorCode();
		
		Color c2 = ColorStorage.getColor("orange");
		c2.colorCode();
	}
}
