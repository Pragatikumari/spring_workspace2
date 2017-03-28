package spring_inst_inheritence;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle2 implements BeanNameAware {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
public void draw(){
		
	  for(Point point: points)
	  {
		System.out.println("point ("+ point.getX() +","+point.getY()+")");
 		
	  } 
	}

@Override
public void setBeanName(String beanname) {
	// TODO Auto-generated method stub
	System.out.println("class name= "+beanname);
	
}
	
}
