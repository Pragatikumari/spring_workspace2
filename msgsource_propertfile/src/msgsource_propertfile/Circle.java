package msgsource_propertfile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

 
 
public class Circle  implements Shape{

	 private Point center;
	 
	 @Autowired
	 private MessageSource messageSource;
		
		@Override
		public void draw() {
			//System.out.println("In Circle");
			System.out.println(messageSource.getMessage("circle.draw",null,"default message for circle.draw",null));
			System.out.println(messageSource.getMessage("circle.point",new Object[] {getCenter().getX(), getCenter().getY() },"default message for circle.point",null));

	        System.out.println("circle : center= ("+getCenter().getX()+","+getCenter().getY()+")");
			System.out.println(messageSource.getMessage("greeting",null,"default message",null));


		}

		public Point getCenter() {
			return center;
		}

		@Resource(name="pointC")
		public void setCenter(Point center) {
			this.center = center;
		}
		
		@PostConstruct
		public void myInit()
		{
			System.out.println("in Circlr INIT");
			
		}

    @PreDestroy
		public void mydetroy()
		{
			System.out.println("in Circlr destroy");
			
		}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	

}
