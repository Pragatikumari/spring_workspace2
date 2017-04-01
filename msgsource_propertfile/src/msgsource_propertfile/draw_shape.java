package msgsource_propertfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class draw_shape {

	public static void main(String[] args) {
		 
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Shape shape= (Shape)context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting",null,"default message",null));

	}

}
