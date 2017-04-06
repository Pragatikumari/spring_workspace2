package aop_After_AdviceArgument.model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter called");
		throw(new RuntimeException());
	}


}
