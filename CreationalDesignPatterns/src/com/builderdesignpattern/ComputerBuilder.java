package com.builderdesignpattern;

public class ComputerBuilder {

	private String hardDisk;
	private String ram;
	private String os;
	private String processor;

	// every setter returns the object of computer builder
	public ComputerBuilder setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
		return this; //to return the object of type computer builder
	}

	public ComputerBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public ComputerBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	
	//this method is to give the computer object
	public Computer getComputer() {
		return new Computer(hardDisk, ram, os, processor);
	}
}
