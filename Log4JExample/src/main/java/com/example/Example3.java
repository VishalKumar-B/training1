package com.example;

import org.apache.log4j.Logger;

public class Example3 {

	static Logger log = Logger.getLogger(Example3.class.getName());
	
	public static void main(String[] args) {
		System.out.println("start...");
		log.debug("hello this is debug mesage ");
		log.info("this is info message ");
		log.error("this is error message ");
		System.out.println("end...");
	}
}
