package aop_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_demo.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("spring.xml");   
		ShapeService shape= cxt.getBean("shapeService",ShapeService.class);   //using .class removed the need of type casting the getBean to ShapeService
         
		System.out.println(shape.getCircle().getName());
	
	}

}
