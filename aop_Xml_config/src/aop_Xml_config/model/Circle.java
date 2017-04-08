package aop_Xml_config.model;

 
public class Circle {
	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		 //throw(new RuntimeException());
	}

	
	public String setReturnName(String name) {
		this.name = name;
		System.out.println("setter called");
		//throw(new RuntimeException());
		return "returned name";
	}


}
