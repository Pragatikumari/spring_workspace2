package lifecycle_callback;

public class Point {

	
	private int X,Y;

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}


	public void myInit(){
		
		System.out.println("myInit is used for init  point");
		
		
	}
	
public void mycleanup(){
		
		System.out.println("mycleanup is used for destroy point ");
		
		
	}
	
	
}
