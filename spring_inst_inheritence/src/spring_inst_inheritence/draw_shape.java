package spring_inst_inheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class draw_shape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	       Triangle triangle= (Triangle)context.getBean("triangle2");
	       triangle.draw();

	
	}

}
