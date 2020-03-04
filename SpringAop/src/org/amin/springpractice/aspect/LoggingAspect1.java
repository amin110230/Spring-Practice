package org.amin.springpractice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // annotation that converts class to aspect, methods becomes advice 
public class LoggingAspect1 { // not working for class name LoggingAspect
//	Aspect is a class with addition annotations
//	@Before("execution(public String getName())") // i want LoggingAdvice to run before execution of [public String getName()] method  
//	public void LoggingAdvice( ) { // standard aup name
//		System.out.println("Advice run. Get Method called");
//	}
	
//	for specific class method
//	@Before("execution(public String org.amin.springpractice.model.Triangle.getName())")  
//	public void LoggingAdvice2( ) {
//		System.out.println("Advice run. Get Method called in Restrict mode");
//	}
	
	// Wildcard use for any type of any methods that starts with get
	// * get*() is Wildcard for return type and method name
	// * get*(*) is for also any access modifier and one argument or any number of arguments
	// * get*(..) is for it can be zero argument or any number of arguments  
//	@Before("execution(* org.amin.springpractice.model.*.get*())")    // all classes inside the model package then method starts with the get
//	@Before("execution(public * get*())")
	@Before("allGetters()")
	public void LoggingAdvice2() {
		System.out.println("Advice run. Get Method called in WildCard mode");
	}
	
//	 for cross-cutting concern
//	point cut AUP terminology [is * get*()] for secondAdvice()
//	@Before("execution(* get*())") 
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice executed");		
	}
	

//	point cut AUP terminology [is * get*()] for secondAdvice()
	
	@Pointcut("execution(* get*())") // point cut applied to allGetters()
//	i have defined this pointer over here so i don't have to use ["execution(* get*())"] expression everywhere i want an advice to get applied
	public void allGetters() {} // annotated dummy method holds point cut expression
}
