package com.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object o = context.getBean("account");
		UnionBank ub = (UnionBank) o;
		ub.withdraw();
		ub.deposit();
		ub.accountholderName();
	}
}
