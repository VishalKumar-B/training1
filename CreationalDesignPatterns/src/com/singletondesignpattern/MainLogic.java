package com.singletondesignpattern;

public class MainLogic {

	public static void main(String[] args) {

		// Early Instantiation: creation of instance at load time.
		SingleObject so = SingleObject.getObject();
		so.display();

		// Lazy Instantiation: creation of instance when required.
		SingleObjectLazyInitialization soli = SingleObjectLazyInitialization.getObject();
		soli.display();
	}
}
