package jsr_250_annotaions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

 
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
