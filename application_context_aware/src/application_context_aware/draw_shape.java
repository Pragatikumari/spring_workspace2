package application_context_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class draw_shape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	       Triangle triangle= (Triangle)context.getBean(Triangle.class);
	       triangle.draw();

	}

}
