package spring_inst_inheritence;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;

 
public class Triangle implements BeanNameAware {
	

	private Point pointA;
	private Point pointB;	
	private Point pointC;
	 
	
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}	
	
	
	
	public void draw(){
		
		System.out.println("point ("+ getPointA().getX() +","+getPointA().getY()+")");
		System.out.println("point ("+ getPointB().getX() +","+getPointB().getY()+")");
		
		System.out.println("point ("+ getPointC().getX() +","+getPointC().getY()+")");
		
		 
	}
	 
	@Override
	public void setBeanName(String beanname) {
		// TODO Auto-generated method stub
		System.out.println("bean name is = "+ beanname );
		
	}	


}
