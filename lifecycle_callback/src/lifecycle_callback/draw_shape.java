package lifecycle_callback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		       // for closing the context created comes with AbstractApplicationContext
		context.registerShutdownHook();
		
	       Triangle triangle= (Triangle)context.getBean("triangle");
	       triangle.draw();

	}

}
