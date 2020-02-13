package org.amin.springpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
		
//		ApplicationContext [is a big brother of BeanFactory] and Property Initialization
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
//		using alias
//		Triangle triangle = (Triangle) applicationContext.getBean("triangle-alias");
//		triangle.draw();
		
		
//		 Injecting Objects
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		
		
		
		
		
	}

}
