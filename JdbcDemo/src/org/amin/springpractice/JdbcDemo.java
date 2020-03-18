package org.amin.springpractice;

import org.amin.springpractice.dao.JdbcDaoImpl;
import org.amin.springpractice.model.Circle;

public class JdbcDemo {
	public static void main(String[] args) {
		Circle circle = new JdbcDaoImpl().getCircle(1);
		System.out.println(circle.getName());
	}
}
