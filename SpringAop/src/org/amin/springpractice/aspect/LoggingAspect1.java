package org.amin.springpractice.aspect;

import org.amin.springpractice.model.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // annotation that converts class to aspect, methods becomes advice 
public class LoggingAspect1 { // not working for class name LoggingAspect
//	Aspect is a class with addition annotations
//	@Before("execution(public String getName())") // i want LoggingAdvice to run before execution of [public String getName()] method  
//	public void LoggingAdvice( ) { // standard AOP name
//		System.out.println("Advice run. Get Method called");
//	}
	
//	execution means methods
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
//	@Before("allGetters()")
//	@Before("allGetters() && allCircleMethods()")
//	public void LoggingAdvice2() {
//		System.out.println("Advice run. Get Method called");
//	}
	
//	 for cross-cutting concern
//	point cut AOP terminology [is * get*()] for secondAdvice()
//	@Before("execution(* get*())") 
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("Second Advice executed");		
//	}
	

//	point cut AOP terminology [is * get*()] for secondAdvice()
	
//	@Pointcut("execution(* get*())") // point cut applied to allGetters()
//	i have defined this pointer over here so i don't have to use ["execution(* get*())"] expression everywhere i want an advice to get applied
//	public void allGetters() {} // annotated dummy method holds point cut expression
	
//	@Pointcut("execution(* org.amin.springpractice.model.Circle.*(..))")
//	within means methods
//	@Pointcut("within(org.amin.springpractice.model.Circle)") //all methods of with in class
//	@Pointcut("within(org.amin.springpractice.model.*)") //all methods of with in all classes of model package
//	@Pointcut("within(org.amin.springpractice.model..*)") //all methods of with in all classes of model package and its sub packages
//	public void allCircleMethods() {}
	
//	args takes arguments as class, interface
//	@Pointcut(args())
	

	@Before("allCircleMethods()")
//	JoinPoint hold info about the method actually triggered
//	JoinPoint means all the places in your code where you can apply advice
//	In Spring JoinPoint = method, In AspectJ JoinPoint = method, variable 
	public void LoggingAdvice2(JoinPoint joinPoint) {
//		System.out.println("Advice run. Get Method called");
//		System.out.println(joinPoint.toString());
//		System.out.println(joinPoint.getTarget()); // joinPoint.getTarget() return object
//		Circle circle = (Circle) joinPoint.getTarget();
	}	
	
//	@Before("args(String)")
//	public void stringArgumentMethods() {
//		System.out.println("A method that takes String arguments has been called");
//	}
	
//	@Before("args(name)") // the argument that passed the target method, the same argument needs to passed to the advice [as name]
//	public void stringArgumentMethods(String name) {
//		System.out.println("A method that takes String arguments has been called. The value is " + name);
//	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.amin.springpractice.model.Circle)")
	public void allCircleMethods() {}
	
//	@After("args(name)") // the argument that passed the target method, the same argument needs to passed to the advice [as name]
//	public void stringArgumentMethods(String name) {
//		// it runs when target method [setName(name)] execute successfully or not
//		System.out.println("A method that takes String arguments has been called. The value is " + name);
//	}
	
//	@AfterReturning("args(name)") // the argument that passed the target method, the same argument needs to passed to the advice [as name]
//	public void stringArgumentMethods(String name) {
//		// it runs when target method [setName(name)] execute successfully [there is no exception occured]
//		System.out.println("A method that takes String arguments has been called. The value is " + name);
//	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString") // the argument that passed the target method, the same argument needs to passed to the advice [as name]
	public void stringArgumentMethods(String name, String returnString) {
		// telling to spring the input type and output type, passing arguments to advice
		System.out.println("A method that takes String arguments has been called. The value is " + name + " The output value is " + returnString);
	}
	
//	if i want an advice method to get executed on an exception
//	if any exception thrown in target method
//	@AfterThrowing("args(name)")
//	public void exceptionAdvice(String name) {
//		System.out.println("An exception has been thrown");
//	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
//	public void exceptionAdvice(String name, RuntimeException ex) {
//		// telling to spring this @AfterThrowing to catch all methods that matches the pointcut expression and then they are throwing a runtime exception [catches only runtime exception]
//		System.out.println("An exception has been thrown " + ex);
//	}
	public void exceptionAdvice(String name, Exception ex) {
		// telling to spring this @AfterThrowing to catch all methods that matches the pointcut expression and then they are throwing an exception
		System.out.println("An exception has been thrown " + ex);
	}
}
