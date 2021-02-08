package com.singletondesignpattern;

public class SingleObjectLazyInitialization {

	private static SingleObjectLazyInitialization obj;

	private SingleObjectLazyInitialization() {
	}

	public static SingleObjectLazyInitialization getObject() {
		if (obj == null) {
			synchronized (SingleObjectLazyInitialization.class) {
				if (obj == null) {
					obj = new SingleObjectLazyInitialization();
				}
			}
		}
		return obj;
	}
	
	public void display() {
		System.out.println("object created successfully");
	}
}
