package bean_postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	       // for closing the context created comes with AbstractApplicationContext
	 
    Triangle triangle= (Triangle)context.getBean("triangle");
    triangle.draw();

	}

}
