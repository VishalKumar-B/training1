package com.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@After("execution(* withdraw()) || execution(* deposit())")
	public void logging(JoinPoint joinPoint) {
		System.out.println("Logging aspect: " +joinPoint.getSignature().getName());
	}

}
