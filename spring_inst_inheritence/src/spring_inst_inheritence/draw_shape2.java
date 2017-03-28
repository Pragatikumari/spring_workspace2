package spring_inst_inheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class draw_shape2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
	       Triangle2 triangle= (Triangle2)context.getBean("triangle2");
	       triangle.draw();

	}

}
