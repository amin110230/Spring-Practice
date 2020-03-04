package org.amin.springpractice.aspect;

import org.amin.springpractice.model.Circle;
import org.aspectj.lang.JoinPoint;
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
	
	@Before("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String arguments has been called. The value is " + name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.amin.springpractice.model.Circle)")
	public void allCircleMethods() {}
	
}
