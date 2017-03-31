package coding_to_interface;

public class Circle implements shape {
   private Point center;
	
	@Override
	public void draw() {
         System.out.println("circle : center= ("+getCenter().getX()+","+getCenter().getY()+")");

	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
