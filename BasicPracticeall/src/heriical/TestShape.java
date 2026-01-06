package heriical;

import java.util.Date;

public class TestShape {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		Circle c = new Circle();
		c.setColor("red");
		c.setWidth(23);
		c.setRadius(24);
		
		System.out.println("color : " + c.getColor());
		System.out.println("Width : " + c.getWidth());
		System.out.println("Radius : " + c.getRadius());
		c.area();
		
		System.out.println(".........................................................");
		
		Rectangle r = new Rectangle();
		
		r.setLength(25);
		r.setBase(45);
		
		
		System.out.println("length : " + r.getLength());
		System.out.println("Base : " + r.getBase());
		r.area();
		
		
		
	}
	

}
