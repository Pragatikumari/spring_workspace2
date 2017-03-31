package autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	       Shape shape1= (Shape)context.getBean("circle");
	       
	       // remove the property tag in circle bean and try . the postprocessor will throw an exception b4 execution and will tell about the reqirmet
	       shape1.draw();

	       
	      // Shape shape2= (Shape)context.getBean("triangle");
	       //shape2.draw();
	}

}
