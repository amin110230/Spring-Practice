package org.amin.springpractice;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
//	private String type;
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//
//	public Triangle(String type) {
//		this.type = type;
//	}
//	
//	public Triangle(int height) {
//		this.height = height;
//	}
//
//	public Triangle(String type, int height) {
//		this.type = type;
//		this.height = height;
//	}
//
//	public String getType() {
//		return type;
//	}
//	
////	public void setType(String type) {
////		this.type = type;
////	}
//	
//	public void draw() {
////		System.out.println("Triangle drawn");
////		System.out.println(getType() + " Triangle drawn");
//		System.out.println(getType() + " Triangle drawn of height " + getHeight());
//	}
	
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
//	
//	public Point getPointA() {
//		return pointA;
//	}
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//	public Point getPointC() {
//		return pointC;
//	}
//
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
//
//	public void draw() {
//		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
//		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
//		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
//	}

//	Initializing Collections
//	private List<Point> points;
//
//	public List<Point> getPoints() {
//		return points;
//	}
//
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}
//	
//	public void draw() {
//		for (Point point : points) {
//			System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
//		}
//	}
	
//	Bean Autowiring
	private Point pointA;
	private Point pointB;
	private Point pointC;
//	Using ApplicationContextAware
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}

//	Using ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name : " + beanName);
		
	}
	
}
