package aop_Xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_Xml_config.service.ShapeService;

 
public class AopMain {

	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("spring.xml");   
		ShapeService shape= cxt.getBean("shapeService",ShapeService.class);   //using .class removed the need of type casting the getBean to ShapeService
       //  shape.getCircle();
		System.out.println(shape.getCircle().getName());
	}

}
