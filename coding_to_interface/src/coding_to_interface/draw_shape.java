package coding_to_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	       shape shape1= (shape)context.getBean("circle");
	       shape1.draw();

	       
	       shape shape2= (shape)context.getBean("triangle");
	       shape2.draw();

	}

}
