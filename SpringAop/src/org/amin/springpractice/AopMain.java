package org.amin.springpractice;

import org.amin.springpractice.service.FactoryService;
import org.amin.springpractice.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);  // takes care about casting
//		System.out.println(shapeService.getCircle().getName());
		// Start Aspect Oriented Programming
//		System.out.println(shapeService.getTriangle().getName()); // return in two calls (one for getTriangle and another is for getName) for wildcard
		
//		shapeService.getCircle().setName("Dummay Name"); // value passed that accessible to advice 
//		System.out.println(shapeService.getCircle().getName());
		
//		shapeService.getTriangle().setName("Dummy Triangle");
//		shapeService.getCircle().setName("Dummay Circle");
//		shapeService.getCircle().setNameandReturn("Dummay Circle");
//		shapeService.getCircle(); // it run only for Loggable annotations
		
//		Instead of use ApplicationContext getBean, we are going to create factory service instance and use that to get a bean
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeSrevice");
		
		shapeService.getCircle(); // to called loggingAdvice(), have to use proxy object
	}

}
