package autowire_annotation;

 
public class Triangle implements Shape {


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
		
		System.out.println("Triangle points are");
		System.out.println("pointa ("+ getPointA().getX() +","+getPointA().getY()+")");
		System.out.println("pointB ("+ getPointB().getX() +","+getPointB().getY()+")");
		
		System.out.println("pointC ("+ getPointC().getX() +","+getPointC().getY()+")");
		
		
	}

}
