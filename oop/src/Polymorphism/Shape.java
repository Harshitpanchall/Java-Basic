package Polymorphism;

public class Shape {
	private String color;
	private int withborder;
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public int getWithborder() {
		return withborder;
		
	}
	
	public void setWithborder(int withborder) {
		this.withborder = withborder;
		
	}
	
	public double area() {
		return 0.0;
		
	}
	
	public static Shape getShape(int i) {
		if(i == 0) {
			return new Circle();
		}
		
		if(i == 1) {
			return new Rectangle();
			
		}
		return null;
		
		}
	}


