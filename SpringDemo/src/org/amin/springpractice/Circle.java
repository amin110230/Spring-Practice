package org.amin.springpractice;

//import javax.annotation.Resource;
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
//	@Resource(name="pointC") // not working
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getX() + ")");		
	}
	
//	@PostConstruct // not working
	public void initializeCircle() {
		// executed after circle bean has been initialized
		System.out.println("Init for Circle");
	}
	
//	@PreDestroy // not working
	public void destroyCircle() {
		// executed before circle bean has been initialized
		System.out.println("Destroy of Circle");
	}

}
