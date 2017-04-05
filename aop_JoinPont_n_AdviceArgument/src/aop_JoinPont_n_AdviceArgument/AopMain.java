package aop_JoinPont_n_AdviceArgument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_JoinPont_n_AdviceArgument.service.ShapeService;

 
public class AopMain {

	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("spring.xml");   
		ShapeService shape= cxt.getBean("shapeService",ShapeService.class);   //using .class removed the need of type casting the getBean to ShapeService
         shape.getCircle().setName("Pragati");
		System.out.println(shape.getCircle().getName());
	

	}

}
