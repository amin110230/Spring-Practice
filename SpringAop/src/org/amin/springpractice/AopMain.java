package org.amin.springpractice;

import org.amin.springpractice.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);  // takes care about casting
//		System.out.println(shapeService.getCircle().getName());
		// Start Aspect Oriented Programming
//		System.out.println(shapeService.getTriangle().getName()); // return in two calls (one for getTriangle and another is for getName) for wildcard
		
//		shapeService.getCircle().setName("Dummay Name"); // value passed that accessible to advice 
//		System.out.println(shapeService.getCircle().getName());
		
//		shapeService.getTriangle().setName("Dummy Triangle");
		shapeService.getCircle().setName("Dummay Circle");
//		shapeService.getCircle().setNameandReturn("Dummay Circle");
	}

}
