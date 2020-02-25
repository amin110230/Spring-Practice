package org.amin.springpractice;

import javax.annotation.Resource; //JSR-250 Annotations
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Component // Circle class to be a bean as circle
// Stereotype Annotations annotations  says you what role the bean is doing
//@Service // as a service bean
//@Repository // as a data object
//@Controller // as a MVC pattern implemanation for our view
public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
//	Annotation
	@Required
//	Autowired Annotation
//	@Autowired
//	@Qualifier("circleRelated")
//	JSR-250 [Java Specification Request] Standard Annotations
//	@Resource(name="pointC") // JSR-250 Annotations
	@Resource // looks for the bean same name as mumber variable [center] 
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");		
	}
	
	@PostConstruct //JSR-250 Annotations
	public void initializeCircle() {
		// executed after circle bean has been initialized
		System.out.println("Init for Circle");
	}
	
	@PreDestroy //JSR-250 Annotations
	public void destroyCircle() {
		// executed before circle bean has been initialized
		System.out.println("Destroy of Circle");
	}

}
