package com.builderdesignpattern;

public class Computer {

	private String hardDisk;
	private String ram;
	private String os;
	private String processor;

	public Computer(String hardDisk, String ram, String os, String processor) {
		super();
		this.hardDisk = hardDisk;
		this.ram = ram;
		this.os = os;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [hardDisk=" + hardDisk + ", ram=" + ram + ", os=" + os + ", processor=" + processor + "]";
	}
}
