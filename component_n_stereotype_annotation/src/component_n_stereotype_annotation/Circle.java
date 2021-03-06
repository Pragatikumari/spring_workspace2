package component_n_stereotype_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

 @Service
public class Circle implements Shape {
	 private Point center;
		
		@Override
		public void draw() {
			System.out.println("In Circle");
	        System.out.println("circle : center= ("+getCenter().getX()+","+getCenter().getY()+")");

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

		


}
