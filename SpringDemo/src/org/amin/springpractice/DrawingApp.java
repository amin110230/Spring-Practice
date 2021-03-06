package org.amin.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
//		triangle.draw();
		
//		Writing Code Using the Bean Factory
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle =  (Triangle) factory.getBean("triangle");
//		triangle.draw();
		
//		ApplicationContext [is a big brother of BeanFactory] and Property Initialization, xml will in class path [src]
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
//		using alias
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle-alias");
//		triangle.draw();
		
		
//		 Injecting Objects
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
//		triangle.draw();
		
//		 Bean Scopes
//		Singleton => Only once per Spring container
//		Prototype => New bean created with every request or reference
		
//		Web-aware Context Bean Scopes
//		request => New bean per servlet request
//		Session => New bean per session
//		Global Session => New bean per global HTTP session (portlet context)
		
		

//		Bean Definition Inheritance
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
//		triangle.draw();
		
//		Lifecycle Callbacks
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		applicationContext.registerShutdownHook();
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
//		triangle.draw();
		
//		Coding To Interfaces
//		Circle circle = (Circle) applicationContext.getBean("circle");
//		circle.draw();
		Shape shape = (Shape) applicationContext.getBean("circle");
		shape.draw();
//		System.out.println(applicationContext.getMessage("greeting", null, "Default Greeting", null));
//		Event Handling consist 3 core components
//		1. Event Publisher [the entity who publishes the event]
//		2. Event Listener [the entity who listens to the event]
//		3. The Event itself [the Class contains information about event] 
		
		
	}

}
