package org.amin.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
//	Annotation
	@Required
//	Autowired Annotation
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getX() + ")");		
	}

}
