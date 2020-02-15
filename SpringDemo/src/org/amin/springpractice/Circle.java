package org.amin.springpractice;

public class Circle implements Shape {
	
	private Point center;
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getX() + ")");		
	}

}
