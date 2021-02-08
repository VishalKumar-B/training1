package com.singletondesignpattern;

public class SingleObject {

	private static SingleObject obj = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getObject() {
		return obj;
	}
	
	public void display() {
		System.out.println("object created successfully");
	}
}
