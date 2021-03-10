package com.ex;

import org.springframework.stereotype.Component;

@Component
public class Account implements UnionBank {

	public void withdraw() {
		System.out.println("withdraw logic");
	}

	public void deposit() {
		System.out.println("deposit logic");
	}

	public String accountholderName() {
		return "vishal";
	}

}
