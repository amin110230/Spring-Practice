package org.amin.springpractice;

public class Triangle {
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
//		System.out.println("Triangle drawn");
		System.out.println(getType() + " Triangle drawn");
	}

}
