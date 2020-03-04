package org.amin.springpractice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // annotation that converts class to aspect, methods becomes advice 
public class LoggingAspect1 { // not working for class name LoggingAspect
//	Aspect is a class with addition annotations
	@Before("execution(public String getName())") // i want LoggingAdvice to run before execution of [public String getName()] method  
	public void LoggingAdvice( ) { // standard aup name
		System.out.println("Advice run. Get Method called");
	}
}
