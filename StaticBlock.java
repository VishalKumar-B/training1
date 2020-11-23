package com.threads;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Main Block");
	}

	static {
		System.out.println("Static Block");
	}
}
