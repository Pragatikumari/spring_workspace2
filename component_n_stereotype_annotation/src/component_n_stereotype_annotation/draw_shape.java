package component_n_stereotype_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
	       Shape shape1= (Shape)context.getBean("circle");
	       
	       // remove the property tag in circle bean and try . the postprocessor will throw an exception b4 execution and will tell about the reqirmet
	       shape1.draw();

	}

}
