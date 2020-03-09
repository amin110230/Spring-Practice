package org.amin.springpractice.service;

import org.amin.springpractice.aspect.LoggingAspect1;
import org.amin.springpractice.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect1().loggingAdvice();
		return super.getCircle();
	}
}
