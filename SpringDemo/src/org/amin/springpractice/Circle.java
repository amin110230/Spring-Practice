package org.amin.springpractice;

import javax.annotation.Resource; //JSR-250 Annotations
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
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
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	// in order to publish
	private ApplicationEventPublisher publisher; // to handle getter setter we have to implement ApplicationEventPublisherAware Interface
	
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
//		System.out.println("Drawing Circle");
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Greeting", null));
//		internationalization for Message Source
//		explore how can use locale argument 
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Greeting", null));
//		System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
		// from MessageSource : access message source in all our bean to need member variable messageSource and 
		// do dependency injection by type using auto wire and spring.xml we would have define the message source
		// and given it a property file name to pick up and give us text as we set the key in property file
//		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
//		Publishing the event of DrawEvent [in order to publish we need a publisher as ApplicationEventPublisher Interface]
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;		
	}

}
