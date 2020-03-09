package org.amin.springpractice.service;

import org.amin.springpractice.model.Circle;
import org.amin.springpractice.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanType) {
		if(beanType.equals("shapeSrevice")) return new ShapeServiceProxy();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triangle")) return new Triangle();
		return null;
	}
}
