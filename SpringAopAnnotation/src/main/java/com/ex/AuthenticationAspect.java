package com.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuthenticationAspect {

	@Before("execution(* withdraw()) || execution(* deposit())")
	public void authenticate(JoinPoint joinPoint) {
		System.out.println("authentication completed: " +joinPoint.getSignature().getName());
	}

	@AfterReturning(
			pointcut = "execution(* accountholderName())" , 
			returning= "name"
			)
	public void getName(JoinPoint joinPoint, String name) {
		System.out.println("the account holder name is: " +name+ " methodName: "+joinPoint.getSignature().getName());
	}
}
