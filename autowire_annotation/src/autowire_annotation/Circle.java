package autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
 
 
public class Circle implements Shape{
	
	
	  private Point center;
		
		@Override
		public void draw() {
			System.out.println("In Circle");
	        System.out.println("circle : center= ("+getCenter().getX()+","+getCenter().getY()+")");

		}

		public Point getCenter() {
			return center;
		}

		@Autowired
		public void setCenter(Point center) {
			this.center = center;
		}


}
