package org.amin.springpractice;

import javax.annotation.Resource; //JSR-250 Annotations
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

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
